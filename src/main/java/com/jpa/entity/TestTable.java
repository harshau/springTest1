package com.jpa.entity;

import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by harsh on 2/18/14.
 */

@Entity
public class TestTable {
    private int tableid;
    private String col1;
    private String col2;
    private Timestamp column_name;


    public int getTableid() {
        return tableid;
    }

    public void setTableid(int tableid) {
        this.tableid = tableid;
    }

    public String getCol1() {
        return col1;
    }

    public void setCol1(String col1) {
        this.col1 = col1;
    }

    public String getCol2() {
        return col2;
    }

    public void setCol2(String col2) {
        this.col2 = col2;
    }

    public Timestamp getColumn_name() {
        return column_name;
    }

    public void setColumn_name(Timestamp column_name) {
        this.column_name = column_name;
    }
}
