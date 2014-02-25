package com.spring.hibernate.model;

import javax.persistence.*;
import java.io.Serializable;

/**Student Object
 * Created by harsh on 2/25/14.
 */
@Entity
@Table(name="Student")
public class Student  implements Serializable {

    @OneToOne(cascade = CascadeType.ALL)
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
}
