package com.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**Person Entity
 * Created by harsh on 2/19/14.
 */

@Entity
@Table(name = "Person")
public class Person{

    private String firstName;
    private String lastName;
    private int id;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
