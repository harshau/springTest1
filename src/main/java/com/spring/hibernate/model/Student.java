package com.spring.hibernate.model;

import javax.persistence.*;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Set;

/**Student Object
 * Created by harsh on 2/25/14.
 */
@Entity
@Table(name="Student")
public class Student  implements Serializable {

    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "personId")
    private Person person;

    @Id
    @GeneratedValue
    @Column(name="student_Id")
    private String studentId;
    @Column(name="student_email")
    private String studentEmail;
    @Column(name="student_type")
    private String studentType;
    @Column(name="student_user_id")
    private String studentUserId;




//    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//    @JoinTable(name = "Student_course" ,joinColumns = {@JoinColumn(name="student_Id")},inverseJoinColumns = {@JoinColumn(name = "course_id")})
//    private Set<Course> courses;

//    public Set<Course> getCourses() {
//        return courses;
//    }
//
//    public void setCourses(Set<Course> courses) {
//        this.courses = courses;
//    }


    @OneToMany(cascade = CascadeType.ALL,mappedBy = "student", fetch = FetchType.EAGER)
    private Set<CourseCampus> courseCampusSet;



    public Set<CourseCampus> getCourseCampusSet() {
        return courseCampusSet;
    }

    public void setCourseCampusSet(Set<CourseCampus> courseCampusSet) {
        this.courseCampusSet = courseCampusSet;
    }


//    @OneToMany(cascade = CascadeType.ALL,mappedBy = "student")
//    private Set<StudentCourseCampus> studentCourseCampusSet;
//
//    public Set<StudentCourseCampus> getStudentCourseCampusSet() {
//        return studentCourseCampusSet;
//    }
//
//    public void setStudentCourseCampusSet(Set<StudentCourseCampus> studentCourseCampusSet) {
//        this.studentCourseCampusSet = studentCourseCampusSet;
//    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentType() {
        return studentType;
    }

    public void setStudentType(String studentType) {
        this.studentType = studentType;
    }

    public String getStudentUserId() {
        return studentUserId;
    }

    public void setStudentUserId(String studentUserId) {
        this.studentUserId = studentUserId;
    }

    @Override
    public String toString() {
        return "Student{" +
                ", studentId='" + studentId + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentType='" + studentType + '\'' +
                ", studentUserId='" + studentUserId + '\'' +
                '}';
    }
}
