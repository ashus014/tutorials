package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
	    try{

            Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\databases\\testjava.db");
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");
            statement.close();
            conn.close();

        }catch(Exception e){
	        e.printStackTrace();
        }

    }
}
