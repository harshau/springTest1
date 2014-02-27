package com.spring.hibernate.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by harsh on 2/26/14.
 */

@Entity
@Table(name="Student_course")
public class CourseCampus  {

    @EmbeddedId
    private Id id ;

    @ManyToOne
    @JoinColumn(name = "student_Id")
    private Student student;


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }



    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    @Transient
    public Course getCourse() {
        return id.getCourse();
    }

    @Transient
    public void setCourse(Course course) {
        if( this.id==null){
            id=new Id();
        }
        this.id.setCourse(course);
    }
    @Transient
    public Campus getCampus() {
        return id.getCampus();
    }

    @Transient
    public void setCampus(Campus campus) {
        if( this.id==null){
            id=new Id();
        }
        this.id.setCampus(campus);
    }

//    public void setStudent(Student student) {
//        if( this.id==null){
//            id=new Id();
//        }
//        this.id.setStudent(student);
//    }
//
//    public Student getStudent() {
//        return this.id.getStudent();
//    }



    @Override
    public String toString() {
        return "CourseCampus{" +
                "id=" + id +
                ", student=" + student +
                '}';
    }
}
