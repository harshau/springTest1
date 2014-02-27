package com.spring.hibernate.model;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * Created by harsh on 2/27/14.
 */
@Embeddable
public class Id implements Serializable {

    public Id(){

    }

    @ManyToOne
    @JoinColumn(name="course_id")
    private Course course;

    @ManyToOne
    @JoinColumn(name = "campus_Id")
    private Campus campus;



    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }

    @Override
    public String toString() {
        return "Id{" +
                "course=" + course +
                ", campus=" + campus +
                '}';
    }
}
