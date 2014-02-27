package com.spring.hibernate.model;

import javax.persistence.*;

/**
 * Created by harsh on 2/26/14.
 */

//@Entity
//@Table(name="Student_course")
public class StudentCourseCampus {

    public  StudentCourseCampus(Student student,int courseId, int campusId){
        this.student=student;
        this.campusId=campusId;
        this.courseId=courseId;
    }

    @Id
//    @Column(name = "student_Id")
//    private int studentId;
    @Column(name = "course_id")
    private int courseId;
    @Column(name = "campus_Id")
    private int campusId;

    @ManyToOne
    @JoinColumn(name = "student_Id")
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getCampusId() {
        return campusId;
    }

    public void setCampusId(int campusId) {
        this.campusId = campusId;
    }
}
