package com.spring.beans;

import org.springframework.beans.factory.annotation.Value;

import java.beans.ConstructorProperties;

/**
 * Created by harsh on 2/12/14.
 */
public class PrintData {

//    @ConstructorProperties("string")
//    public  PrintData( String string){
//        name=string;
//    }

    //TODO need to do following
    public void init(){
        System.out.println("inside Init");
    }

     @Value("#{constantProperites.name}")
    private String name;


    public String printName() {
        return "Welcome to spring: "+name;
    }

    /*public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/
}
