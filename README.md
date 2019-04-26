# WebServices-Assignment1

## Running URLshortener in Docker
```
cd rest/server
sudo docker build -t webservices_urlshortener .
sudo docker run --name urlshortener -d -t -p 8080:8080 webservices_urlshortener
```
or
```
sudo docker pull berhart/webservices_assignment3:webservices_urlshortener
sudo docker run --name urlshortener -d -t -p 8080:8080 berhart/webservices_assignment3:webservices_urlshortener
```

