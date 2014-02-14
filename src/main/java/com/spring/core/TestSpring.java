package com.spring.core;

import com.spring.beans.HelloWorld;
import com.spring.config.ApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by harsh on 2/12/14.
 */
public class TestSpring {
//    public static void main (String args[]){
//        System.out.println("Hello:");
       // ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
       // HelloWorld obj =(HelloWorld)context.getBean("hello");
       // System.out.print(obj.getName());



//    }

public static void main(String [] args){
    System.out.print("inside TestSpring2");
    ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
    HelloWorld test = context.getBean(HelloWorld.class);
    test.getName();
}

}
