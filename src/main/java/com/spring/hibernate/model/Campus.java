package com.spring.hibernate.model;

import javax.persistence.*;

/**Campus class
 * Created by harsh on 2/26/14.
 */
@Entity
@Table(name = "Campus")
public class Campus {

    @Id
    @GeneratedValue
    @Column(name = "campusId")
    private int campusId;
    @Column(name = "campus_name")
    private String campusName;
    @Column(name = "campus_code")
    private String campusCode;

    public int getCampusId() {
        return campusId;
    }

    public void setCampusId(int campusId) {
        this.campusId = campusId;
    }

    public String getCampusName() {
        return campusName;
    }

    public void setCampusName(String campusName) {
        this.campusName = campusName;
    }

    public String getCampusCode() {
        return campusCode;
    }

    public void setCampusCode(String campusCode) {
        this.campusCode = campusCode;
    }


    @Override
    public String toString() {
        return "Campus{" +
                "campusId=" + campusId +
                ", campusName='" + campusName + '\'' +
                ", campusCode='" + campusCode + '\'' +
                '}';
    }
}
