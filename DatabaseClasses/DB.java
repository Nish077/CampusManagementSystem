/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campusconnectjava.DatabaseClasses;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class DB {
    
    private static String serverName = "localhost";
     private static String userName = "root";
      private static String dbName = "campusconnectprojava";
      private static int portNumber = 3306;
      private static String pass = "";
      
      //create a function to create and return the connection
      
public static Connection getConnection() {
    Connection connection = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://" + serverName + ":" + portNumber + "/" + dbName, userName, pass);
    } catch (SQLException | ClassNotFoundException ex) {
        Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
    }
    return connection;
}

    
    
}
