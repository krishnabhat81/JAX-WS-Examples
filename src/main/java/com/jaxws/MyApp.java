package com.jaxws;

import java.util.UUID;

/**
 * Created by krishna1bhat on 5/2/17.
 */
public class MyApp {
    public static void main(String[] args){
        System.out.println("Setup is okey..");
    }

    public String generateUniqueKey(){

        return UUID.randomUUID().toString();

    }
}
