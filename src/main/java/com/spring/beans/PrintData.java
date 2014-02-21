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

        for (int i=0;i<=100; i++ ){
           System.out.print(i+" ");
        }
        System.out.println();
        return "Welcome to spring: "+name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
