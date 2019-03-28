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
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

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
    private String role;
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
    
     public static boolean login(String username, String password)
    {
        String loginQuery = "SELECT staffUsername, staffPassword, staffRole FROM staff WHERE staffUsername = ? AND staffPassword = ?";
        boolean flag = true;
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
                  mainmenu.setRole(result.getString("staffRole"));
                  mainmenu.checkCredentials();
                  mainmenu.setVisible(true);
                  flag = true;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Login failed!");
                flag = false;
            }
            }
        catch (SQLException e)
        {
            System.out.println(e);
        }
        if (flag == false)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
     
     public static void addNewPatient(String retrievedFirstName, 
             String retrievedLastName, 
             String retrievedGender, 
             String retrievedDOB, 
             String retrievedAddress, 
             String retrievedTelNo)
     {
         String addPatientQuery = "INSERT INTO patient (patientFirstName, patientLastName, patientGender, patientDOB, patientAddress, patientTelNo) VALUES " + "(?,?,?,?,?,?)";
         try
         {
             statement = connection.prepareStatement(addPatientQuery);
             statement.setString(1, retrievedFirstName);
             statement.setString(2, retrievedLastName);
             statement.setString(3, retrievedGender);
             statement.setString(4, retrievedDOB);
             statement.setString(5, retrievedAddress);
             statement.setString(6, retrievedTelNo);
             statement.executeUpdate();
             JOptionPane.showMessageDialog(null, "Record successsfully inserted!");
         }
         catch(SQLException e)
         {
             System.out.println(e.getMessage());
         }
     }
     
     public static void fillPatientID(JComboBox comboBox)
     {
         String patientComboBoxQuery = "SELECT idpatient FROM patient";
         try
         {
             statement = connection.prepareStatement(patientComboBoxQuery);
             result = statement.executeQuery();
             while(result.next())
             {
                 comboBox.addItem(result.getString("idpatient"));
             }
         }
         catch (SQLException e)
         {
             System.out.println(e.getMessage());
         }
     }
     
     public static void findPatientInfoForEdit(String patientID, JTextField id, JTextField firstname, JTextField lastname, JComboBox gender, JTextField dob, JTextField address, JTextField telno)
     {
         String patientEditQuery = "SELECT * FROM patient WHERE idpatient = ?";
         try
         {
             statement = connection.prepareStatement(patientEditQuery);
             statement.setString(1, patientID);
             result = statement.executeQuery();
             while(result.next())
             {
                 id.setText(result.getString("idpatient"));
                 firstname.setText(result.getString("patientFirstName"));
                 lastname.setText(result.getString("patientLastName"));
                 gender.setSelectedItem(result.getString("patientGender"));
                 dob.setText(result.getString("patientDOB"));
                 address.setText(result.getString("patientAddress"));
                 telno.setText(result.getString("patientTelNo"));
             }
         }
         catch (SQLException e)
         {
             System.out.println(e.getMessage());
         }
     }
     
     public static void updatePatients(String FirstName, String LastName, String Gender, String DOB, String Address, String TelNo, String PatientID)
     {
         String updatePatientQuery = "UPDATE patient SET patientFirstName = ?, patientLastName = ?, patientGender = ?, patientDOB = ?, patientAddress = ?, patientTelNo = ? WHERE idpatient = ?";
         try
         {
             statement =connection.prepareStatement(updatePatientQuery);
             statement.setString(1,FirstName);
             statement.setString(2, LastName);
             statement.setString(3, Gender);
             statement.setString(4, DOB);
             statement.setString(5, Address);
             statement.setString(6, TelNo);
             statement.setString(7, PatientID);
             statement.executeUpdate();
             JOptionPane.showMessageDialog(null, "Record successsfully updated!");
         }
         catch (SQLException e)
         {
             System.out.println(e.getMessage());
         }
     }
     
     public static void deletePatients(String id)
     {
         String deleteQuery = "DELETE FROM patient WHERE idpatient = ?";
         try
         {
             statement = connection.prepareStatement(deleteQuery);
             statement.setString(1, id);
             statement.executeUpdate();
             JOptionPane.showMessageDialog(null, "Record successsfully deleted!");
         }
         catch (SQLException e)
         {
             System.out.println(e.getMessage());
         }
     }
     
}
