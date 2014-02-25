package com.spring.core;

import com.spring.hibernate.DAO.ApplicationDAO;
import com.spring.hibernate.model.Course;
import com.spring.hibernate.model.Person;
import com.spring.hibernate.model.PersonAddress;
import com.spring.hibernate.model.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Timestamp;

/**
 * Created by harsh on 2/13/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:springConfig.xml")
public class CreateStudent_Course {

    @Autowired
    public ApplicationDAO obj;


    @Test
    public void hibernate(){
        System.out.println("Start Test for Hibernate.");

        Person person= new Person();
//        person  = obj.findPerson(2);
//        obj.delete(person);
        person.setFirstName("harsh");
        person.setLastName("khurana3");
        PersonAddress address = new PersonAddress();
        address.setAddress_line1("addressline1");
        address.setAddress_line2("addressline2");
        address.setCity("city");
        address.setState("state");
        address.setCountry("country");
        person.setAddress(address);


        Student student = new Student();
        //delete existing student;
        //student=obj.findStudent(1);
        //obj.studentDelete(student);
        student.setPerson(person);
        student.setStudentEmail("email@email.com");
        student.setStudentUserId("userId");
        student.setStudentType("Full Time");
       // obj.studentSave(student);

        Course course = new Course();
        course.setCourseDescription("Fist course Description");
        course.setCourseName("Course One");
        Timestamp startDate= new Timestamp(System.currentTimeMillis());

        course.setStartDate(startDate);
        course.setEndDate(startDate);
        obj.courseSave(course);

        System.out.println("Data Saved");





    }


}
