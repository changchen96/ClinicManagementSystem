/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author c7-ong
 */
public class databaseConn {
    private static String connString = "jdbc:mysql://weeb03.cems.uwe.ac.uk:3306/fet17035315";
    private static String username = "fet17035315";
    private static String password = "y1WW3R";
    private static Connection connection;
    private static PreparedStatement statement;
    private static ResultSet result;
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
    
     public static void login(String username, String password)
    {
        String loginQuery = "SELECT staffUsername, staffPassword, staffRole FROM staff WHERE staffUsername = ? AND staffPassword = ?";
        try
        {
            statement = connection.prepareStatement(loginQuery);
            statement.setString(1, username);
            statement.setString(2, password);
            result = statement.executeQuery();
            if (result.next())
            {
                 JOptionPane.showMessageDialog(null, "Login successful!");
                  MainMenuGUI mainmenu = new MainMenuGUI();
                  mainmenu.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Login failed!");
            }
            }
        catch (SQLException e)
        {
            System.out.println(e);
        }
    }
}
