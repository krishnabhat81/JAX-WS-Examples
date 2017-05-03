package com.jaxws.main;

import com.jaxws.rpcstyle.HelloWorldImpl;
import com.jaxws.ws.impl.ProductWSImpl;

import javax.xml.ws.Endpoint;

/**
 * Created by krishna1bhat on 5/2/17.
 */
public class Main {
    public static void main(String[] args) throws Exception{
        try {
            //hello ws
            Endpoint.publish("http://localhost:8090/ws/hello", new HelloWorldImpl());
            //Product ws
            Endpoint.publish("http://localhost:8090/ws/product", new ProductWSImpl());
            System.out.println("Product ws done");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
