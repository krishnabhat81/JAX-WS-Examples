package com.jaxws.rpcstyle;

import javax.jws.WebService;

/**
 * Created by krishna1bhat on 5/2/17.
 */

@WebService(endpointInterface = "com.jaxws.rpcstyle.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String getHelloWorldAsString(String name) {
        return "Hello World JAX-WS " + name;
    }
}
