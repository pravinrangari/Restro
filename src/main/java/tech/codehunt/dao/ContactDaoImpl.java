package tech.codehunt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContactDaoImpl implements ContactDao {

    @Override
    public String saveContact(String name, String email, String subject, String message, String datetime) {
        String result = "DB ERROR";  // Default result in case of failure
        Connection connection = null;
        PreparedStatement prepareStatement = null;
    
        try {
            connection = ConnectionFactory.getConnection();  // Get the connection

            if (connection == null) {
                return "Failed to establish connection with the database.";
            }

            String sql = "INSERT INTO contact(name, email, subject, message, datetime) VALUES (?, ?, ?, ?, ?)";
            prepareStatement = connection.prepareStatement(sql);

            // Set the parameters
            prepareStatement.setString(1, name);
            prepareStatement.setString(2, email);
            prepareStatement.setString(3, subject);
            prepareStatement.setString(4, message);
            prepareStatement.setString(5, datetime);

            // Execute the query and check the result
            int executeUpdate = prepareStatement.executeUpdate();
            if (executeUpdate == 1) {
                result = "VALID";  // Successfully inserted
            } else {
                result = "INSERT FAILED";  // Query didn't execute as expected
            }

        } catch (SQLException e) {
            e.printStackTrace();
            result = "DB ERROR: " + e.getMessage();  // Provide more specific error details
        } catch (Exception e) {
            e.printStackTrace();
            result = "GENERAL ERROR: " + e.getMessage();  // General error
        } finally {
            // Always close the resources in the finally block
            try {
                if (prepareStatement != null) {
                    prepareStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return result;
    }
}
