/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author c7-ong
 */
public class databaseConn {
     private static String connString = "jdbc:mysql://weeb03.cems.uwe.ac.uk:3306/fet17035315";
    private static Connection connection;
    private static String username = "fet17035315";
    private static String password = "y1WW3R";
    public static boolean openConn() throws SQLException
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded!");
        }
        catch (ClassNotFoundException ex)
        {
            System.out.println(ex);
        }
        try
        {
            connection = DriverManager.getConnection(connString, username, password);
            System.out.println("Database connected!");
            return true;
        }
        catch (SQLException e)
        {
            System.out.println("Error connecting to database!");
            System.out.println(e);
        }
        return false;
    }
}
