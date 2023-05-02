package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class AddressbookSystem {
    //Retrieve data from addressbook system.
    public  void retrieveData() {
        try {
            //1.Load a driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2.Create a Connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/addressbook_service", "root", "Abhi");
            if (connection.isClosed()) {
                System.out.println("Connection is not created");
            } else {
                System.out.println("Connection is created");
            }

            //3.Write a Query
            String query = "select * from address_book;";

            //4.prepare a statement
            Statement statement = connection.createStatement();
            ResultSet set = statement.executeQuery(query);

            while (set.next()) {   // Retrieve all data from address_book table.
                System.out.println("FirstName : " + set.getString(1));
                System.out.println("LastName : " + set.getString(2));
                System.out.println("Address : " + set.getString(3));
                System.out.println("City : " + set.getString(4));
                System.out.println("State : " + set.getString(5));
                System.out.println("Zip : " + set.getInt(6));
                System.out.println("PhoneNumber : " + set.getLong(7));
                System.out.println("Email : " + set.getString(8));

                System.out.println("==============================================================");
            }
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        AddressbookSystem object = new AddressbookSystem();
        object.retrieveData();
    }
}