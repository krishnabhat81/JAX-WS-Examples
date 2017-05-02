package com.jaxws.rpcstyle;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

/**
 * Created by krishna1bhat on 5/2/17.
 */
public class HelloWorldClient {
    public static void main(String[] args) throws Exception{
        URL url = new URL("http://localhost:8090/ws/hello?wsdl");

        //1st argument service URI, refer to wsdl document above
        //2nd argument is service name, refer to wsdl document above

        QName qName = new QName("http://rpcstyle.jaxws.com/", "HelloWorldImplService");
        Service service = Service.create(url, qName);
        HelloWorld helloWorld = service.getPort(HelloWorld.class);
        System.out.println(helloWorld.getHelloWorldAsString("RPC Style"));
    }
}
