package com.spring.core;

import com.spring.beans.DatabaseConnection;
import com.spring.beans.PrintData;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.ResultSet;

/**
 * Created by harsh on 2/12/14.
 */
public class TestSpring {
    public static void main (String args[]){
        System.out.println("Main method class:  TestSpring");
       ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
       PrintData obj =(PrintData)context.getBean("hello");
       System.out.println(obj.printName());
        DatabaseConnection conn = (DatabaseConnection)context.getBean("dbConn");
        System.out.println("*******************call to Database ***********");
        try {
        conn.init();
            Connection con = conn.getConnection();
            ResultSet resutlSet = con.createStatement().executeQuery("Select * from testtable");
            if (resutlSet !=null ){
                while(resutlSet.next() ){
                    System.out.println(resutlSet.getString(1)+resutlSet.getString(2)+ resutlSet.getString(3));
                }
            }

            System.out.println(con.isReadOnly() );
        }catch(Exception ex ){
         System.out.println(ex.getMessage());
        }





    }

//public static void main(String [] args){
//    System.out.print("inside SpringHibernate");
//    ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
//    PrintData test = context.getBean(PrintData.class);
//    test.printName();
//}

}
