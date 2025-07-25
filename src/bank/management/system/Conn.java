package bank.management.system;

import java.sql.*;


public class Conn {
    
    Connection c;
    Statement s;
    public Conn(){
        try {
            // Register the Driver
            // Class.forName(com.mysql.cj.jdbc.Driver);
            
            // Create connection
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "abir2711");
            
            // Create Statement
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
        
}
