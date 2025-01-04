package TP6;

import java.sql.*;

public class DatabaseApp {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/TP6_DB";
        String user = "root";
        String password = ""; // Replace with your MySQL password if set

        try {
            // Explicitly load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database!");

            // Query the database
            String query = "SELECT * FROM PRODUIT";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Display the results
            System.out.println("ID | Name      | Price");
            System.out.println("-------------------------");
            while (rs.next()) {
                System.out.printf("%d  | %-10s | %.2f%n",
                                  rs.getInt("id"),
                                  rs.getString("name"),
                                  rs.getDouble("price"));
            }

            // Close the connection
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error connecting to the database.");
            e.printStackTrace();
        }
    }
}
