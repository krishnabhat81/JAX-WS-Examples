package com.jaxws.main;

import com.jaxws.rpcstyle.HelloWorld;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

/**
 * Created by krishna1bhat on 5/2/17.
 */

//first run HelloWorldPublisher main ...
//then run this client main method (or client may be new project, right? yes... ;))
public class HelloWorldClient {
    public static void main(String[] args) throws Exception{
        try {
            URL url = new URL("http://localhost:8090/ws/hello?wsdl");

            //1st argument service URI, refer to wsdl document above
            //2nd argument is service name, refer to wsdl document above

            QName qName = new QName("http://rpcstyle.jaxws.com/", "HelloWorldImplService");
            Service service = Service.create(url, qName);
            HelloWorld helloWorld = service.getPort(HelloWorld.class);
            System.out.println(helloWorld.getHelloWorldAsString("RPC Style"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
