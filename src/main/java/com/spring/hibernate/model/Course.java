package com.spring.hibernate.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**Course Details
 * Created by harsh on 2/25/14.
 */

@Entity
@Table(name = "Course")
public class Course implements Serializable {

    @Id
    @GeneratedValue
    private int courseId;

    @Column (name= "course_Name")
    private String courseName;
    @Column (name= "course_desc")
    private String courseDescription;
    @Column (name= "start_date")
    private Timestamp startDate;
    @Column (name= "end_date")
    private Timestamp endDate;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }
}
