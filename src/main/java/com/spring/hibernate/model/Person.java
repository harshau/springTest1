package com.spring.hibernate.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by harsh on 2/21/14.
 */

@Entity
@Table(name = "Person")

public class Person  implements Serializable{
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    private String firstName;
    private String lastName;

    @GeneratedValue
    @Column(name ="creationData" )
    private Timestamp creationData ;

//    @Column(name="address_id",nullable = true)
//    private Integer addressId;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private PersonAddress address ;



    public PersonAddress getAddress() {
        return address;
    }

    public void setAddress(PersonAddress address) {
        this.address = address;
    }



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

    public Timestamp getCreationData() {
        return creationData;
    }

    public void setCreationData(Timestamp creationData) {
        this.creationData = creationData;
    }
//
//    public int getAddressId() {
//        return addressId;
//    }
//
//    public void setAddressId(int addressId) {
//        this.addressId = addressId;
//    }

    public String toString(){
        return "Person Details FirstName: "+firstName+"  LastName: "+lastName +" Id: "+id+"  Created: "+creationData;
    }
}
