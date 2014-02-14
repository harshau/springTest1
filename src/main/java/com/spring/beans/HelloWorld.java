package com.spring.beans;

/**
 * Created by harsh on 2/12/14.
 */
public class HelloWorld {

    //TODO need to do following
    public void init(){
        System.out.println("inside Init");
    }

    private String name;

    public String getName() {
        return "Welcome to spring: "+name;
    }


}
