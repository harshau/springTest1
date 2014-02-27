package com.spring.hibernate.businessObjImpl;

import com.spring.hibernate.businessObject.PersonBO;
import com.spring.hibernate.model.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by harsh on 2/26/14.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:springConfig.xml")
public class PersonImplTest {

    //businessObject
    @Autowired
    PersonBO businessObj;

    @Test
    public  void testSaveStudentWithCourse(){

        Student student = businessObj.findStudent(4);
        Set<CourseCampus> studentDetails=student.getCourseCampusSet();
         System.out.println(studentDetails);
        CourseCampus courseCampus = new CourseCampus();
        Course course=businessObj.findCourse(1);
        Campus campus=businessObj.findCampus(1);
        courseCampus.setCampus(campus);
        courseCampus.setCourse(course);
        courseCampus.setStudent(student);

        Course course1=businessObj.findCourse(2);
        Campus campus1=businessObj.findCampus(2);
        CourseCampus courseCampus1 = new CourseCampus();
        courseCampus1.setCampus(campus1);
        courseCampus1.setCourse(course1);
        courseCampus1.setStudent(student);

         Set<CourseCampus > courseSet = new HashSet<CourseCampus >();
            courseSet.add(courseCampus);
            courseSet.add(courseCampus1);
            student.setCourseCampusSet(courseSet);

//        StudentCourseCampus studentCourseCampus = new StudentCourseCampus(student,1,1);
//        Set<StudentCourseCampus> studentCourseCampusSet = new HashSet<StudentCourseCampus>();
//        studentCourseCampusSet.add(studentCourseCampus);
//       StudentCourseCampus studentCourseCampus1 = new StudentCourseCampus(student,1,2);
//        studentCourseCampusSet.add(studentCourseCampus1);
//        student.setStudentCourseCampusSet(studentCourseCampusSet);
        businessObj.studentUpdate(student);


//        Course course = businessObj.findCourse(2);
//        System.out.println(course.getCourseName()+"--"+course.getCourseId());
        //update Course
//        course.setCourseName("Course Two");
//        course.setCourseDescription("Second Course Desc");
//        businessObj.courseUpdate(course);
//         Set<Course> courseSet = new HashSet<Course>();
//        courseSet.add(course);
        //student.setCourses(courseSet);
    //    businessObj.studentUpdate(student);


        //campus creation
//        Campus campus = new Campus();
//        campus.setCampusCode("CODE3");
//        campus.setCampusName("Campus Name");
//        businessObj.saveObject(campus);




    }
}
