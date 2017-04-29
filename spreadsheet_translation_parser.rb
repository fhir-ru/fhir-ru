# Запуск через обычный терминал cmd из корня fhir-svn: 
# ruby spreadsheet_translation_parser.rb source destination

# -*- coding: utf-8 -*-
require 'colorize' # использовалось для отладки

pattern = Regexp.new('\s+<Cell.*><Data ss:Type="String">(.+[а-яА-Я]+.+)<!--\s+(.+)\s+--><\/Data>')

# Источник - файл с ру переводом, откуда брать перевод
# В источнике надо заменить в notepad++ "([а-яА-Я]+.+)<!--\s\r\n" на "$1<!-- " (без кавычек)

# ARGF - это содержимое файла, название которого передано в качестве входного аргумента в командной строке
# ARGV - массив всех входных аргументов

# relative to source folder path
source = ARGV[0]
destination = ARGV[1]


  puts "\n*** Parsing file #{source}"
	
	# read into string	
	str2 = IO.read("source.ru/#{destination}", :encoding => 'utf-8')
  dic = Hash.new
  
  File.foreach("source.ru-RU/#{source}", :encoding => 'utf-8') do |line| 
		if line =~ pattern
			ru = $1
			en_old = $2 # en version from old file
      dic[en_old] = ru.encode('utf-8')
   end
	end
  
  # puts dic.values
  
  dic.each do |key, value|
    patterns = []
    len15 = (key.size * 0.15).to_i # 15% строки-ключа
    full = Regexp.new('<Data ss:Type="String">(' + Regexp.quote(key) + ')<\/Data>', Regexp::IGNORECASE) # точное соответствие - группа 1    
    partial = Regexp.new('<Data ss:Type="String">(.*)(' + Regexp.quote(key) + ')(.*)<\/Data>', Regexp::IGNORECASE) # частичное вхождение
    if key.size > 15
      patterns << Regexp.new('<Data ss:Type="String">(' + Regexp.quote(key[0, 15]) + '.*)<\/Data>', Regexp::IGNORECASE) # первые 15 символов, проверка на кол-во символов в англ и ру версиях, если расхождение незначительное, то автозамена
      patterns << Regexp.new('<Data ss:Type="String">(' + Regexp.quote(key[0, len15 * 2]) + '.*)<\/Data>', Regexp::IGNORECASE) # 0-15%
      patterns << Regexp.new('<Data ss:Type="String">(' + Regexp.quote(key[len15, len15 * 2]) + '.*)<\/Data>', Regexp::IGNORECASE) # 15-30%    
      patterns << Regexp.new('<Data ss:Type="String">(' + Regexp.quote(key[len15 * 2, len15 * 3]) + '.*)<\/Data>', Regexp::IGNORECASE) # 30-45%
      patterns << Regexp.new('<Data ss:Type="String">(' + Regexp.quote(key[len15 * 3, len15 * 4]) + '.*)<\/Data>', Regexp::IGNORECASE) # 45-60%
      patterns << Regexp.new('<Data ss:Type="String">(' + Regexp.quote(key[len15 * 4, len15 * 5]) + '.*)<\/Data>', Regexp::IGNORECASE) # 60-75%
      patterns << Regexp.new('<Data ss:Type="String">(' + Regexp.quote(key[len15 * 5, len15 * 6]) + '.*)<\/Data>', Regexp::IGNORECASE) # 75-90%
      patterns << Regexp.new('<Data ss:Type="String">(' + Regexp.quote(key[len15 * 6, key.size]) + '.*)<\/Data>', Regexp::IGNORECASE) # 90-100%
    end
    s1 = key.downcase
    puts "Looking for " + s1
    words = s1.scan(/\w+/) # массив слов ключа
    if (words.size < 2) and ((s1 == "identifier") || (s1 == "where") || (s1 == "patient") || (s1 == "period") || (s1 =~ [a-z]+) || (s1 =~ /\w+\.\w+/) || (s1 =~ /\w+\.\w+.\w+/) || (s1 =~ /\w+\.\w+.\w+.\w+/)) # если ключ из 1 слова, то... надо проверить, что это не слово Identifier или что-то вроде этого - т.е. тип данных, путь к элементу или search parameter с маленькой буквы
      
    else
      # если нашли точное соответствие, то замена    
      if found_match = /#{full}/.match(str2)
        en_new_pattern = Regexp.escape($1)     
        full_ru_en_new = '>' + value + "<!-- " + $1 + " -->" + '<'
        str2.gsub!(/>#{en_new_pattern}</, full_ru_en_new)
        puts "Found and replaced full match".green   
        # иначе ищем частичное вхождение
      else
        if found_match = /#{partial}/.match(str2)
        # если строка, куда входит ключ, не содержит комментария, тогда переведём только вхождение
        en_new2 = $1+$2+$3
        en_new_pattern = Regexp.escape(en_new2)
        part1 = $1
        part2 = $2
        part3 = $3 
        full_ru_en_new = '>' + part1 + value + "<!-- " + part2 + " -->" + (part3 == '.' ? '' : $3) + '<'
          unless en_new2.include? "<!--"
            str2.gsub!(/>#{en_new_pattern}</, full_ru_en_new)
          end
        else
          # иначе ищем совпадение
          flag = false        
          patterns.each do |pat| # для всех комбинаций части ключа
            break if flag
            str2.scan(/#{pat}/) do |x| # для всех результатов совпадения
              en_new = x[0]
              unless en_new.include? "<!--"
                s2 = en_new.downcase # найденная строка-гипотеза
                counter = 0
                words.each do |word|
                  if s2.include?(word)
                      counter = counter + 1
                  end
                end
                identity = 1.0 * counter/(words.size) * 100            
                diff = en_new.size - key.size  
                if identity > 85 
                  if diff.abs < (key.size * 0.15) 
                    # заменяем строку полностью
                    en_new_pattern = Regexp.escape(en_new) 
                    full_ru_en_new = '>' + value + "<!-- " + en_new + " -->" + '<'
                    str2.gsub!(/>#{en_new_pattern}</, full_ru_en_new)
                    puts "replaced".green
                    # puts key
                    # puts en_new
                    # puts value  
                    # puts "diff = #{diff}"
                    # puts "identity = #{identity}%"                  
                  else
                    puts "There is partial match".yellow
                    # puts "There is partial match"
                    puts key
                    puts en_new
                    puts value
                    puts "----------------------------"
                  end
                  flag = true
                  break
                end          
            end
          end          
        end
        unless flag
            puts "NOT FOUND---------------------------------------------------"
            puts "NOT FOUND---------------------------------------------------".red
            puts key
            puts value  
          end
        end
      end
    end

  result = File.open("source.ru/#{destination}", "w", :encoding => 'utf-8')
	result.puts str2
	result.close
end	