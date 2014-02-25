package com.spring.hibernate.model;

import javax.persistence.*;
import java.io.Serializable;

/**PersonAddress Entity
 * Created by harsh on 2/25/14.
 */

@Entity
@Table(name = "Person_Address")
public class PersonAddress implements Serializable{

    @Id
    @GeneratedValue
    @Column(name = "address_id")
    private int address_id;

    @Column(name="address_line1")
    private String address_line1;

    @Column(name="address_line2")
    private String address_line2;

    @Column(name="city")
    private String city;

    @Column(name="state")
    private  String state;

    @Column(name="country")
    private String country;

//    @OneToOne(mappedBy = "address",cascade = CascadeType.ALL)
//    private Person person;


//    public Person getPerson() {
//        return person;
//    }
//
//    public void setPerson(Person person) {
//        this.person = person;
//    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getAddress_line1() {
        return address_line1;
    }

    public void setAddress_line1(String address_line1) {
        this.address_line1 = address_line1;
    }

    public String getAddress_line2() {
        return address_line2;
    }

    public void setAddress_line2(String address_line2) {
        this.address_line2 = address_line2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public String toString(){
        return "Address: id:"+address_id+" address: "+address_line1+" "+address_line2+", City: "+city+", State: "+state+", Country: "+country;
    }
}
