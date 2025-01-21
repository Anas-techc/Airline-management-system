package airlinemanagementsystem;

import java.sql.*;

public class Conn {
    Connection c; // Connection object
    Statement s;  // Statement object

    public Conn() {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection to the database
            c = DriverManager.getConnection("jdbc:mysql:///airlinemanagementsystem", "root", "vanshika2004");

            // Create a statement object
            s = c.createStatement();

            System.out.println("Database connection established successfully.");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error establishing database connection.");
            e.printStackTrace();
        }
    }

    // Main method to test the connection
    public static void main(String[] args) {
        new Conn(); // Create an instance of the Conn class
    }
}
