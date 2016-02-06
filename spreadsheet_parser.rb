# Запуск через обычный терминал cmd из корня fhir-svn, где лежит файл files-to-parse.txt: 
# ruby spreadsheet_parser.rb files-to-parse.txt

# Только для spreadsheet.xml-файлов и .xml-файлов с записями вида <Cell ss:StyleID="s88"><Data ss:Type="String">

# require 'colorize' использовалось для отладки

pattern = Regexp.new('\s+<Cell ss:StyleID="s\d+">(<Data ss:Type="String">[а-яА-Я]+.+<!--\s+)(.+)(\s+--><\/Data>)')

# Папка с ру переводом, откуда брать перевод, должна называться source.ru-RU
# In source.ru-RU надо заменить в notepad++ "([а-яА-Я]+.+)<!--\s\r\n" на "$1<!-- " (без кавычек)
# Результат кладется в папку source.ru
# в source.ru  должны лежать англ. версии .xml-файлов

# ARGF - это содержимое файла, название которого передано в качестве входного аргумента в командной строке
# ARGV - массив всех входных аргументов
ARGF.each do |file|
	puts "Parsing file #{file.chomp!}"
	
	# read into string	
	str2 = IO.read("source.ru/#{file}", :encoding => 'utf-8')

	File.foreach("source.ru-RU/#{file}", :encoding => 'utf-8')	 do |line| 
		if line =~ pattern
			full_ru_en = $1 + $2 + $3
			en ='<Data ss:Type="String">' + $2 + '</Data>'
			if str2.include? en
				str2.sub!(en, full_ru_en)
        # puts "Found and replaced" #.green
			else
				puts "Didn't find #{full_ru_en}" #.yellow
			end
			
		end
	end

	result = File.open("source.ru/#{file}", "w", :encoding => 'utf-8')
	result.puts str2
	result.close	

end	