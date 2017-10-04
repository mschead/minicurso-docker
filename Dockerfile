FROM ubuntu:latest
MAINTAINER wssmarcos@gmail.com

RUN apt-get update
RUN apt-get install software-properties-common -y
RUN add-apt-repository ppa:webupd8team/java
RUN apt-get update
RUN echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true | /usr/bin/debconf-set-selections
RUN apt-get install oracle-java8-installer -y
RUN apt-get install maven -y

RUN mkdir /app
WORKDIR /app

COPY . ./
RUN mvn clean install

EXPOSE 8080
CMD java -jar ./target/docker-demo-0.0.1-SNAPSHOT.jar
