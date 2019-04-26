# WSDL/SOAP Calculator Web service using a Bottom-Up approach 
## Pre requisites

- [Maven 3.5.2](https://maven.apache.org/download.cgi)
- [JDK/JRE 1.8.0_191](https://www.oracle.com/technetwork/java/javase/8u191-relnotes-5032181.html)
- [GlassFish 5](https://javaee.github.io/glassfish/download)

## To Build, Package, and Deploy the JAX-WS Service Using Maven
1. Make sure that GlassFish Server has been started:
    1. Download GlassFish
    2. Go to the ```/home/user``` directory and extract it using e.g. the command ```unzip glassfish-5.0.zip```
    3. Start the server by executing the command ```glassfish5/bin/asadmin start-domain``` 
2. In a terminal window, go to:
``` CalculatorWS/jaxws/helloservice-war/ ```
3. Enter the following command:``` mvn install```

## To Run a Simple JAX-WS Application Client Using Maven
1. In a terminal window, go to:
``` CalculatorWS/jaxws/hello-appclient/ ```
2. Enter the following command:``` mvn install```

## References
[Java EE tutorial example](https://docs.oracle.com/javaee/7/tutorial/jaxws001.htm#BNAYN)
