FROM ubuntu:14.04

MAINTAINER Maksym Bodnarchuk <bodnarchuk@gmail.com>

ENV REFRESHED_AT 2014-09-18

ENV DEBIAN_FRONTEND noninteractive

RUN sed 's/main$/main universe/' -i /etc/apt/sources.list
RUN apt-get update && apt-get install -y software-properties-common python-software-properties
RUN add-apt-repository ppa:webupd8team/java -y

RUN apt-get update
RUN echo oracle-java7-installer shared/accepted-oracle-license-v1-1 select true | /usr/bin/debconf-set-selections

RUN apt-get install -y oracle-java7-installer ant nginx

ADD ./ fhir-svn

WORKDIR fhir-svn

RUN cp  -R source.ru/* source

ENV JAVA_TOOL_OPTIONS -Dfile.encoding=UTF8

RUN ./build.sh

COPY nginx.conf /etc/nginx/sites-available/default

RUN echo "daemon off;" >> /etc/nginx/nginx.conf

EXPOSE 80

CMD sudo service nginx restart