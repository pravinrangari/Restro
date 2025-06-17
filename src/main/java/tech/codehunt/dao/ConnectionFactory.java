package tech.codehunt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    private static String url = "jdbc:mysql://localhost:3309/`restro`?useSSL=false&serverTimezone=UTC";
    private static String username = "root";
    private static String password = "7448281829";
    private static String driverClassName = "com.mysql.cj.jdbc.Driver";
    private static Connection con;
    
    public static Connection getConnection() throws SQLException {
        try {
            // Load MySQL driver
            Class.forName(driverClassName);
            
            // Create connection to MySQL database
            con = DriverManager.getConnection(url, username, password);
            
            if (con != null) {
                System.out.println("Connection successful!");
            }
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("MySQL JDBC Driver not found.");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Error connecting to the database: " + e.getMessage());
        }
        return con;
    }
}
