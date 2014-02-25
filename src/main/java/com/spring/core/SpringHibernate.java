package com.spring.core;

import com.spring.hibernate.DAO.ApplicationDAO;
import com.spring.hibernate.model.Person;
import com.spring.hibernate.model.PersonAddress;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by harsh on 2/13/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:springConfig.xml")
public class SpringHibernate {

    @Autowired
    public ApplicationDAO obj;


    @Test
    public void hibernate(){
        System.out.println("Start Test for Hibernate.");




        /** insert **/
//        Stock stock = new Stock();
//        stock.setStockCode("7669");
//        stock.setStockName("HAI1");
//        obj.saveStock(stock);

        /** select **/
//        Stock stock2 = obj.findByStockCode("7668");
//        System.out.println(stock2);

       // obj.deleteStock(stock);


        Person person = new Person();
//          person = obj.findPerson(13);
       // obj.delete(person);

        //create Person
        person.setFirstName("harsh");
        person.setLastName("khurana3");
        PersonAddress address = new PersonAddress();
        address.setAddress_line1("addressline1");
        address.setAddress_line2("addressline2");
        address.setCity("city");
        address.setState("state");
        address.setCountry("country");
        person.setAddress(address);
        obj.save(person);

//        person = obj.findPerson(13);
     //   System.out.println(person);

       // person.setLastName("Khurana");
        person.setFirstName("Rohan");
        person.getAddress().setAddress_line1("Address linet Test");
        person.getAddress().setCity("Melbourne");
        person.getAddress().setState("Victoria");
//        obj.update(person);

        System.out.println("Data Saved");





    }


}
