package com.jaxws.rpcstyle;

import javax.xml.ws.Endpoint;

/**
 * Created by krishna1bhat on 5/2/17.
 */
//Endpoint publisher
//Run this file, run as java application and
//use following url on browser
//http://localhost:8090/ws/hello?wsdl

public class HelloWorldPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8090/ws/hello", new HelloWorldImpl());
        System.out.println("Done");
    }
}
