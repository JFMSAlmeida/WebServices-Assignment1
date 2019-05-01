# URLshortener using REST 
## Pre requisites

- [Maven 3.5.2](https://maven.apache.org/download.cgi)
- [JDK/JRE 1.8.0_191](https://www.oracle.com/technetwork/java/javase/8u191-relnotes-5032181.html)

## To Build, Package, and Deploy the REST service Using Maven
1. In a terminal window, go to: ``` /URLshortener/server ```
2. Enter the following command:``` mvn clean spring-boot:run```

## To Run a Simple Rest Application Client Using Maven
1. In a terminal window, go to:
``` /URLshortener/client ```
2. Enter the following command:``` mvn clean compile exec:java```

## References
[SpringBoot Rest Tutorial](https://spring.io/guides/gs/rest-service/)

## Running URLshortener in Docker
```
cd /server
sudo docker build -t webservices_urlshortener .
sudo docker run --name urlshortener -d -t -p 8080:8080 webservices_urlshortener
```
or
```
sudo docker pull berhart/webservices_assignment3:webservices_urlshortener
sudo docker run --name urlshortener -d -t -p 8080:8080 berhart/webservices_assignment3:webservices_urlshortener
```

