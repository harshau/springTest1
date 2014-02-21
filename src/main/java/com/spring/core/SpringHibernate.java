package com.spring.core;

import com.spring.hibernate.businessObjectImpl.PersonImpl;
import com.spring.hibernate.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by harsh on 2/13/14.
 */
public class SpringHibernate {
    public static void main(String [] args){
        System.out.println("Start Test for Hibernate.");
        ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
        PersonImpl obj =(PersonImpl)context.getBean("personBo");

        Person person = new Person();
        person.setFirstName("harsh");
        person.setLastName("khurana");
        obj.save(person);

        System.out.println("Data Saved");





    }
}
