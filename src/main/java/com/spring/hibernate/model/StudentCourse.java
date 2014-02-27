package com.spring.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * Created by harsh on 2/26/14.
 */



public class StudentCourse {

    @Id
    @Column(name = "student_Id")
    private int studentId;
    @Column(name = "course_id")
    private int courseId;
    @Column(name = "campus_Id")
    private int campusId;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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
