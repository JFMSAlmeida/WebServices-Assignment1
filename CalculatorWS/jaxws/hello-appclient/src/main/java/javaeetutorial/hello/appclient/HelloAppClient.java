/**
 * Copyright (c) 2014 Oracle and/or its affiliates. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * https://github.com/javaee/tutorial-examples/LICENSE.txt
 */
package javaeetutorial.hello.appclient;

import javaeetutorial.helloservice.endpoint.HelloService;
import javax.xml.ws.WebServiceRef;

public class HelloAppClient {
    @WebServiceRef(wsdlLocation = 
      "http://localhost:8080/helloservice/HelloService?WSDL")
    private static HelloService service;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(mul(3, 2));
        System.out.println(sub(1, 1));
        System.out.println(div(0, 1));
        System.out.println(div(1, 0));
    }

    private static String add(double i, double j) {
        javaeetutorial.helloservice.endpoint.Hello port = service.getHelloPort();
        return port.add(i, j);
    }
    private static String sub(double i, double j) {
        javaeetutorial.helloservice.endpoint.Hello port = service.getHelloPort();
        return port.sub(i, j);
    }
    private static String mul(double i, double j) {
        javaeetutorial.helloservice.endpoint.Hello port = service.getHelloPort();
        return port.mul(i, j);
    }
    private static String div(double i, double j) {
        javaeetutorial.helloservice.endpoint.Hello port = service.getHelloPort();
        return port.div(i, j);
    }

}
