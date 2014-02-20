package com.spring.beans;

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


    private String name;


    public String printName() {
        return "Welcome to spring: "+name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
