package com.spring.beans;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by harsh on 2/13/14.
 */
public class DatabaseConnection {
    private String driveClassName;
    private String databaseUrl;
    private String databaseUserName;
    private String databasePassword;
    private Connection connection;

    public DatabaseConnection(String drive, String url, String userName, String password){
        this.driveClassName=drive;
        this.databaseUrl =url;
        this.databaseUserName =userName;
        this.databasePassword =password;
    }

    public void init(){
        try{
            Class.forName(driveClassName);
        connection= DriverManager.getConnection(databaseUrl,databaseUserName,databasePassword);
        }catch(Exception ex){
            ex.printStackTrace();
            System.out.println("Error while trying to connect " + ex.getMessage());
            connection=null;
        }

    }
    public Connection getConnection(){
        return connection;
    }
    public void closeConnection() throws Exception{
        connection.close();
    }



}
