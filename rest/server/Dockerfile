FROM java:8
EXPOSE 8080
ADD /target/URLshortener-service-0.1.0.jar URLshortener.jar
ENTRYPOINT ["java", "-jar", "URLshortener.jar"]


#RUN apt-get update
#RUN apt-get install -y software-properties-common
#CMD ["-DFOREGROUND"]