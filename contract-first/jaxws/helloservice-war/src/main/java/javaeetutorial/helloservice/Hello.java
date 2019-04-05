/**
 * Copyright (c) 2014 Oracle and/or its affiliates. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with the terms of the License at:
 * https://github.com/javaee/tutorial-examples/LICENSE.txt
 */
package javaeetutorial.helloservice;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService(endpointInterface = "javaeetutorial.helloservice.HelloPortType",
 wsdlLocation = "HelloService.wsdl",
 name ="HelloService",
 portName = "HelloPort",
 targetNamespace="http://helloservice.javaeetutorial/",
 serviceName = "HelloService"
 )
public class Hello implements HelloPortType {

    private final String message = "Hello, ";

    public Hello() {
    }

    @Override
    public String sayHello(String name) {
        return message + name + ".";
    }

    @Override
    public String add(double i, double j) {
        double add = i + j;
        return i + " + " + j + " = " + add;
    }

    @Override
    public String sub(double i, double j) {
        double sub = i - j;
        return i + " - " + j + " = " + sub;
    }

    @Override
    public String mul(double i, double j) {
        double mul = i * j;
        return i + " x " + j + " = " + mul;
    }

    @Override
    public String div(double i, double j) {
        if (j == 0){
            return "divisor can't be 0";
        }
        double div = i / j;
        return i + " / " + j + " = " + div;
    }
}