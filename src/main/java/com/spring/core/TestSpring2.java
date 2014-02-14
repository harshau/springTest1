package com.spring.core;

import com.spring.beans.HelloWorld;
import com.spring.config.ApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by harsh on 2/13/14.
 */
public class TestSpring2 {
    public static void main(String [] args){
        System.out.print("inside TestSpring2");
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        HelloWorld test = context.getBean(HelloWorld.class);
        test.getName();
    }
}
