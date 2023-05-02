package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;


public class AddressbookSystem {
    public static void main(String[] args) {
        //connecting addressbook system to jdbc.
        public  void connectToJDBC() {
            try {
                //1.Load a driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                //2.Create a Connection
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/addressbook_service","root","Abhi");
                if (connection.isClosed()){
                    System.out.println("Connection is closed");
                }else {
                    System.out.println("Connection is created");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) {
            AddressbookSystem object = new AddressbookSystem();
            object.connectToJDBC();
    }
}