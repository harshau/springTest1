package com.spring.beans;

import java.sql.Connection;

/**
 * Created by harsh on 2/13/14.
 */
public class DatabaseConnection {
    private String driveClassName;
    private String driverUrl;
    private String databaseUserName;
    private String databasePassword;
    private Connection connection;

    public DatabaseConnection(String drive, String url, String userName, String password){
        this.driveClassName=drive;
        this.driverUrl =url;
        this.databaseUserName =userName;
        this.databasePassword =password;
    }

    public void closeConnection() throws Exception{
        connection.close();
    }



}
