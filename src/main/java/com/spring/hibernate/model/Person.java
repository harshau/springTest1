package com.spring.hibernate.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by harsh on 2/21/14.
 */
public class Person  implements Serializable{
    private static final long serialVersionUID=1L;

    private int id;
    private String firstName;
    private String lastName;
    private Timestamp creationDate;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }
}
