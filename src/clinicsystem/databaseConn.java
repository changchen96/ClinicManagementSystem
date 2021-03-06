/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicsystem;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
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
     
     public static void fillVisitID(JComboBox comboBox)
     {
         String visitComboBoxQuery = "SELECT idvisit FROM visit";
         try
         {
             statement = connection.prepareStatement(visitComboBoxQuery);
             result = statement.executeQuery();
             while (result.next())
             {
                 comboBox.addItem(result.getString("idvisit"));
             }
         }
         catch (SQLException e)
         {
             System.out.println(e.getMessage());
         }
     }
     
      public static void fillDoctorID(JComboBox comboBox)
     {
         String doctorComboBoxQuery = "SELECT idstaff FROM staff WHERE staffRole = 'Doctor'";
         try
         {
             statement = connection.prepareStatement(doctorComboBoxQuery);
             result = statement.executeQuery();
             while(result.next())
             {
                 comboBox.addItem(result.getString("idstaff"));
             }
         }
         catch (SQLException e)
         {
             System.out.println(e.getMessage());
         }
     }
      
      public static void fillAppointmentID(JComboBox comboBox)
     {
         String appointmentComboBoxQuery = "SELECT idappointment FROM appointment";
         try
         {
             statement = connection.prepareStatement(appointmentComboBoxQuery);
             result = statement.executeQuery();
             while(result.next())
             {
                 comboBox.addItem(result.getString("idappointment"));
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
     
     public static void addNewAppointment(String retrievedDetails, 
             String retrievedDate,
             String retrievedStatus,
             String retrievedPatientID, 
             String retrievedStaffID)
     {
         String addAppointmentQuery = "INSERT INTO appointment (appointmentDetails, appointmentDate, appointmentStatus, patient_idpatient, staff_idstaff) VALUES " + "(?,?,?,?,?)";
         try
         {
             statement = connection.prepareStatement(addAppointmentQuery);
             statement.setString(1, retrievedDetails);
             statement.setString(2, retrievedDate);
             statement.setString(3, retrievedStatus);
             statement.setString(4, retrievedPatientID);
             statement.setString(5, retrievedStaffID);
             statement.executeUpdate();
             JOptionPane.showMessageDialog(null, "Appointment successsfully inserted!");
         }
         catch(SQLException e)
         {
             System.out.println(e.getMessage());
         }
     }
     
     public static void findAppointmentInfoForEdit(String appointmentid, JTextField id, JTextArea details, JTextField date, JComboBox status, JComboBox patientid, JComboBox doctorid)
     {
         String patientEditQuery = "SELECT * FROM appointment WHERE idappointment = ?";
         try
         {
             statement = connection.prepareStatement(patientEditQuery);
             statement.setString(1, appointmentid);
             result = statement.executeQuery();
             while(result.next())
             {
                 id.setText(result.getString("idappointment"));
                 details.setText(result.getString("appointmentDetails"));
                 date.setText(result.getString("appointmentDate"));
                 status.setSelectedItem(result.getString("appointmentStatus"));
                 patientid.setSelectedItem(result.getString("patient_idpatient"));
                 doctorid.setSelectedItem(result.getString("staff_idstaff"));
             }
         }
         catch (SQLException e)
         {
             System.out.println(e.getMessage());
         }
     }
     
     public static void updateAppointmentDetails(String details, String date, String status, String doctorID, String id)
     {
         String updateAppointmentsQuery = "UPDATE appointment SET appointmentDetails = ?, appointmentDate = ?, appointmentStatus = ?, staff_idStaff = ? WHERE idappointment = ?";
         try
         {
             statement = connection.prepareStatement(updateAppointmentsQuery);
             statement.setString(1, details);
             statement.setString(2, date);
             statement.setString(3, status);
             statement.setString(4, doctorID);
             statement.setString(5, id);
             statement.executeUpdate();
             JOptionPane.showMessageDialog(null, "Appointment details updated!");
         }
         catch(SQLException e)
         {
              System.out.println(e.getMessage());
         }
     }
     
     public static void deleteAppointment(String id)
     {
         String deleteQuery = "DELETE FROM appointment WHERE idappointment = ?";
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
     
     public static void addStaff(String username, String password, String staffName, String staffRole, String staffAddress, String staffTelNo, String staffDOB)
     {
         String addStaffQuery = "INSERT INTO staff (staffUsername, staffPassword, staffName, staffRole, staffAddress, staffTelNo, staffDOB) VALUES " + "(?,?,?,?,?,?,?)";
         try
         {
             statement = connection.prepareStatement(addStaffQuery);
             statement.setString(1, username);
             statement.setString(2, password);
             statement.setString(3, staffName);
             statement.setString(4, staffRole);
             statement.setString(5, staffAddress);
             statement.setString(6, staffTelNo);
             statement.setString(7, staffDOB);
             statement.executeUpdate();
             JOptionPane.showMessageDialog(null, "Staff member added!");
         }
         catch(SQLException e)
         {
              System.out.println(e.getMessage());
         }
     }
     
     public static void fillStaffID(JComboBox staffComboBox)
     {
         String addStaffQuery = "SELECT idstaff FROM staff";
         try
         {
             statement = connection.prepareStatement(addStaffQuery);
             result = statement.executeQuery();
              while(result.next())
             {
                 staffComboBox.addItem(result.getString("idstaff"));

             }
         }
         catch(SQLException e)
         {
              System.out.println(e.getMessage());
         }
     }
     
     public static void findStaffDetailsForEdit(String staffid, 
             JTextField id, 
             JTextField username, 
             JPasswordField password, 
             JTextField staffName, 
             JTextField staffRole, 
             JTextField address, 
             JTextField telno, 
             JTextField dob)
     {
         String staffEditQuery = "SELECT * FROM staff WHERE idstaff = ?";
         try
         {
             statement = connection.prepareStatement(staffEditQuery);
             statement.setString(1, staffid);
             result = statement.executeQuery();
             while(result.next())
             {
                 id.setText(result.getString("idstaff"));
                 username.setText(result.getString("staffUsername"));
                 password.setText(result.getString("staffPassword"));
                 staffName.setText(result.getString("staffName"));
                 staffRole.setText(result.getString("staffRole"));
                 address.setText(result.getString("staffAddress"));
                 telno.setText(result.getString("staffTelNo"));
                 dob.setText(result.getString("staffDOB"));
             }
         }
         catch (SQLException e)
         {
             System.out.println(e.getMessage());
         }
     }
     
     public static void updateStaffDetails(String username, String password, String staffName, String staffRole, String staffAddress, String staffTelNo, String staffDOB, String staffid)
     {
         String updateAppointmentsQuery = "UPDATE staff SET staffUsername = ?, staffPassword = ?, staffName = ?, staffRole = ?, staffAddress = ?, staffTelNo = ?, staffDOB = ? WHERE idstaff = ?";
         try
         {
             statement = connection.prepareStatement(updateAppointmentsQuery);
             statement.setString(1, username);
             statement.setString(2, password);
             statement.setString(3, staffName);
             statement.setString(4, staffRole);
             statement.setString(5, staffAddress);
             statement.setString(6, staffTelNo);
             statement.setString(7, staffDOB);
             statement.setString(8, staffid);
             statement.executeUpdate();
             JOptionPane.showMessageDialog(null, "Staff details updated!");
         }
         catch(SQLException e)
         {
              System.out.println(e.getMessage());
         }
     }
     
      public static void deleteStaff(String id)
     {
         String deleteQuery = "DELETE FROM staff WHERE idstaff = ?";
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
      
      public static void addVisit(String details, String date, String notes, String appointmentid, String patientid, String doctorid)
      {
          String addVisitQuery = "INSERT INTO visit (visitDetails, visitDate, visitNotes, appointment_idappointment, appointment_patient_idpatient, appointment_staff_idStaff) VALUES " + "(?,?,?,?,?,?)";
          try
          {
              statement = connection.prepareStatement(addVisitQuery);
              statement.setString(1, details);
              statement.setString(2, date);
              statement.setString(3, notes);
              statement.setString(4, appointmentid);
              statement.setString(5, patientid);
              statement.setString(6, doctorid);
              statement.executeUpdate();
              JOptionPane.showMessageDialog(null, "New visit recorded!");
          }
          catch(SQLException e)
          {
              System.out.println(e.getMessage());
          }
      }
      
     
      public static void fillTransactionDetails(JComboBox comboBox)
      {
           String transactionComboBoxQuery = "SELECT idtransaction FROM transaction";
         try
         {
             statement = connection.prepareStatement(transactionComboBoxQuery);
             result = statement.executeQuery();
             while(result.next())
             {
                 comboBox.addItem(result.getString("idtransaction"));
             }
         }
         catch (SQLException e)
         {
             System.out.println(e.getMessage());
         }
      }
      
      public static void fillStockManagerDetails(JComboBox comboBox)
      {
          String stockManagerQuery = "SELECT idstaff FROM staff WHERE staffRole = 'Stock Manager'";
          try
          {
              statement = connection.prepareStatement(stockManagerQuery);
              result = statement.executeQuery();
              while(result.next())
             {
                 comboBox.addItem(result.getString("idstaff"));
             }
          }
          catch (SQLException e)
          {
              System.out.println(e.getMessage());
          }
      }
      
      public static void findVisitDetailsForEdit(String id, JTextField visitId, JTextArea details, JTextField date, JTextArea notes, JComboBox appointment, JComboBox patient, JComboBox doctor)
      {
          String selectVisitQuery = "SELECT * FROM visit WHERE idvisit = ?";
          try
          {
              statement = connection.prepareStatement(selectVisitQuery);
              statement.setString(1, id);
              result = statement.executeQuery();
              while (result.next())
              {
                  visitId.setText(result.getString("idvisit"));
                  details.setText(result.getString("visitDetails"));
                  date.setText(result.getString("visitDate"));
                  notes.setText(result.getString("visitNotes"));
                  appointment.setSelectedItem(result.getString("appointment_idappointment"));
                  patient.setSelectedItem(result.getString("appointment_patient_idpatient"));
                  doctor.setSelectedItem(result.getString("appointment_staff_idstaff"));
              }
          }
          catch(SQLException e)
          {
              System.out.println(e.getMessage());
          }
      }
      
       public static void updateVisitDetails(String details, String date, String notes, String appointmentID, String patientID, String doctorID, String id)
     {
         String updateAppointmentsQuery = "UPDATE visit SET visitDetails = ?, visitDate = ?, visitNotes = ?, appointment_idappointment = ?, appointment_patient_idpatient = ?, appointment_staff_idStaff = ? WHERE idvisit = ?";
         try
         {
             statement = connection.prepareStatement(updateAppointmentsQuery);
             statement.setString(1, details);
             statement.setString(2, date);
             statement.setString(3, notes);
             statement.setString(4, appointmentID);
             statement.setString(5, patientID);
             statement.setString(6, doctorID);
             statement.setString(7, id);
             statement.executeUpdate();
             JOptionPane.showMessageDialog(null, "Visit details updated!");
         }
         catch(SQLException e)
         {
              System.out.println(e.getMessage());
         }
     }
       
       public static void deleteVisit(String id)
     {
         String deleteQuery = "DELETE FROM visit WHERE idvisit = ?";
         try
         {
             statement = connection.prepareStatement(deleteQuery);
             statement.setString(1, id);
             statement.executeUpdate();
             JOptionPane.showMessageDialog(null, "Visit successsfully deleted!");
         }
         catch (SQLException e)
         {
             System.out.println(e.getMessage());
         }
     }
       
       public static void addNewTransaction(String details, double amountPaid, String method, double amount, double balance, String staffid, String patientid)
       {
           String insertTransactionQuery = "INSERT INTO transaction (transactionDetails, transactionAmountPaid, transactionMethod, transactionAmount, transactionBalance, staff_idstaff, patient_idpatient) VALUES" + "(?,?,?,?,?,?,?)";
           try
           {
               statement = connection.prepareStatement(insertTransactionQuery);
               statement.setString(1, details);
               statement.setDouble(2, amountPaid);
               statement.setString(3, method);
               statement.setDouble(4, amount);
               statement.setDouble(5, balance);
               statement.setString(6, staffid);
               statement.setString(7, patientid);
               statement.executeUpdate();
               JOptionPane.showMessageDialog(null, "New transaction added!");
           }
           catch (SQLException e)
           {
               System.out.println(e.getMessage());
           }
       }
       
       public static void findTransactionInfoForEdit(String transactionid, 
               JTextField transactionidtext,
               JTextArea transactionDetails, 
               JTextField amountpaid, 
               JTextField transactionmethod, 
               JTextField transactionamount, 
               JLabel balance, 
               JComboBox staffID, 
               JComboBox patientID)
       {
           String findTransactionQuery = "SELECT * FROM transaction WHERE idtransaction = ?";
           try
           {
               statement = connection.prepareStatement(findTransactionQuery);
               statement.setString(1, transactionid);
               result = statement.executeQuery();
               while (result.next())
               {
                   transactionidtext.setText(result.getString("idtransaction"));
                   transactionDetails.setText(result.getString("transactionDetails"));
                   amountpaid.setText(result.getString("transactionAmountPaid"));
                   transactionmethod.setText(result.getString("transactionMethod"));
                   transactionamount.setText(result.getString("transactionAmount"));
                   balance.setText(result.getString("transactionBalance"));
                   staffID.setSelectedItem(result.getString("staff_idstaff"));
                   patientID.setSelectedItem(result.getString("patient_idpatient"));
               }
           }
           catch (SQLException e)
           {
               System.out.println(e.getMessage());
           }
       }

    public static void updateTransactionDetails(
            String details, 
            double amntPaid, 
            String method,
            double transactionamnt,
            double balance,
            String staffid,
            String patientid,
            String id)
    {
        String updateTransactionDetailsQuery = "UPDATE transaction SET transactionDetails = ?, transactionAmountPaid = ?, transactionMethod = ?, transactionAmount = ?, transactionBalance = ?, staff_idstaff = ?, patient_idpatient = ? WHERE idtransaction = ?";
        try
        {
            statement = connection.prepareStatement(updateTransactionDetailsQuery);
            statement.setString(1, details);
            statement.setDouble(2, amntPaid);
            statement.setString(3, method);
            statement.setDouble(4, transactionamnt);
            statement.setDouble(5, balance);
            statement.setString(6, staffid);
            statement.setString(7, patientid);
            statement.setString(8, id);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Transaction details updated!");
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public static void deleteTransactionDetails(String transactionid)
    {
        String deleteTransactionQuery = "DELETE FROM transaction WHERE idtransaction = ?";
        try
        {
            statement = connection.prepareStatement(deleteTransactionQuery);
            statement.setString(1, transactionid);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Transaction details deleted!");
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public static void addStock(String name, String details, String status, String managerID)
    {
        String addStockQuery = "INSERT INTO stock (productName, productDesc, productStatus, staff_idstaff) VALUES" + "(?,?,?,?)";
        try
        {
            statement = connection.prepareStatement(addStockQuery);
            statement.setString(1, name);
            statement.setString(2, details);
            statement.setString(3, status);
            statement.setString(4, managerID);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "New item added!");
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public static void fillStockID(JComboBox comboBox)
    {
        String fillStockIDQuery = "SELECT idstock FROM stock";
        try
        {
            statement = connection.prepareStatement(fillStockIDQuery);
            result = statement.executeQuery();
            while (result.next())
            {
                comboBox.addItem(result.getString("idstock"));
            }
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public static void findStockDetailsForEdit(JTextField stockid, JTextField name, JTextArea description, JTextField status, JComboBox stockmanagerid, String id)
    {
        String findStockDetailsQuery = "SELECT * FROM stock WHERE idstock = ?";
        try
        {
            statement = connection.prepareStatement(findStockDetailsQuery);
            statement.setString(1, id);
            result = statement.executeQuery();
            while (result.next())
            {
                stockid.setText(result.getString("idstock"));
                name.setText(result.getString("productName"));
                description.setText(result.getString("productDesc"));
                status.setText(result.getString("productStatus"));
                stockmanagerid.setSelectedItem(result.getString("staff_idstaff"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public static void updateStockDetails(String name, String desc, String status, String id)
    {
        String updateStockQuery = "UPDATE stock SET productName = ?, productDesc = ?, productStatus = ? WHERE idstock = ?";
        try
        {
            statement = connection.prepareStatement(updateStockQuery);
            statement.setString(1,name);
            statement.setString(2,desc);
            statement.setString(3,status);
            statement.setString(4,id);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Equipment details updated!");
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public static void deleteStockDetails(String id)
    {
        String deleteStockQuery = "DELETE FROM stock WHERE idstock = ?";
        try
        {
            statement = connection.prepareStatement(deleteStockQuery);
            statement.setString(1, id);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Equipment details deleted!");
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public static void generatePatientVisitReport() throws FileNotFoundException
    {
        String generatePatientReportQuery = "SELECT * FROM visit";
        try
        {
            statement = connection.prepareStatement(generatePatientReportQuery);
            result = statement.executeQuery();
            PrintWriter visitreport = new PrintWriter("patientvisitreport.txt");
            while(result.next())
            {
                visitreport.println("Visit ID:" + result.getString("idvisit"));
                visitreport.println("Visit Details:" + result.getString("visitDetails"));
                visitreport.println("Visit Date:" + result.getString("visitDate"));
                visitreport.println("Visit Notes:" + result.getString("visitNotes"));
                visitreport.println("Appointment ID for visit:" + result.getString("appointment_idappointment"));
                visitreport.println("Patient ID for visit:" + result.getString("appointment_patient_idpatient"));
                visitreport.println("Doctor ID in charge:" + result.getString("appointment_staff_idstaff"));
            }
            JOptionPane.showMessageDialog(null, "Patient visit report generated!");
            visitreport.close();
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
     public static void generateTransactionReport() throws FileNotFoundException
    {
        String generatePatientReportQuery = "SELECT * FROM transaction";
        try
        {
            statement = connection.prepareStatement(generatePatientReportQuery);
            result = statement.executeQuery();
            PrintWriter transactionreport = new PrintWriter("transactionreport.txt");
            while(result.next())
            {
                transactionreport.println("Transaction ID:" + result.getString("idtransaction"));
                transactionreport.println("Transaction details:" + result.getString("transactionDetails"));
                transactionreport.println("Transaction amount paid:" + result.getString("transactionAmountPaid"));
                transactionreport.println("Transaction method:" + result.getString("transactionMethod"));
                transactionreport.println("Transaction amount:" + result.getString("transactionAmount"));
                transactionreport.println("Transaction balance:" + result.getString("transactionBalance"));
                transactionreport.println("Staff ID in charge:" + result.getString("staff_idstaff"));
                transactionreport.println("Patient ID for payment:" + result.getString("patient_idpatient"));
            }
            JOptionPane.showMessageDialog(null, "Transaction report generated!");
            transactionreport.close();
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
     
     public static void generateEquipmentReport() throws FileNotFoundException
    {
        String generatePatientReportQuery = "SELECT * FROM stock";
        try
        {
            statement = connection.prepareStatement(generatePatientReportQuery);
            result = statement.executeQuery();
            PrintWriter equipmentreport = new PrintWriter("equipmentreport.txt");
            while(result.next())
            {
                equipmentreport.println("Equipment ID:" + result.getString("idstock"));
                equipmentreport.println("Equipment name:" + result.getString("productName"));
                equipmentreport.println("Equipment description:" + result.getString("productDesc"));
                equipmentreport.println("Equipment status:" + result.getString("productStatus"));
                equipmentreport.println("Inserted by staff ID:" + result.getString("staff_idstaff"));
            }
            JOptionPane.showMessageDialog(null, "Equipment report generated!");
            equipmentreport.close();
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
     
     public static String getDateToCompare(String idappointment, String idpatient)
     {
         String getDate = "SELECT appointmentDate FROM appointment WHERE idappointment = ? AND patient_idpatient = ?";
         String retrievedDate = null;
         try
         {
             statement = connection.prepareStatement(getDate);
             statement.setString(1, idappointment);
             statement.setString(2, idpatient);
             result = statement.executeQuery();
             while (result.next())
             {
                 retrievedDate = result.getString("appointmentDate");
             }
             
         }
         catch (SQLException e)
         {
             System.out.println(e.getMessage());
         }
         return retrievedDate;
     }
}
