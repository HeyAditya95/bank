package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class conn {

    Connection c;
    Statement s;

    public conn() {
        try {
            // Establishing the connection
            c = DriverManager.getConnection("jdbc:mysql://localhost/bank", "root", "HaAditya95b$");
            s = c.createStatement();
        } catch (SQLException e) {
            // Print the error message
            System.out.println("Connection failed: " + e.getMessage());
        }
    }

    // Method to close the connection and statement
    public void close() {
        try {
            if (s != null) s.close(); // Close the Statement
            if (c != null) c.close(); // Close the Connection
        } catch (SQLException e) {
            System.out.println("Error closing resources: " + e.getMessage());
        }
    }
}