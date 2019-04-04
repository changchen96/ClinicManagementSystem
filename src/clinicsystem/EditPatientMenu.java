/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicsystem;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author c7-ong
 */
public class EditPatientMenu extends javax.swing.JFrame {

    /**
     * Creates new form EditPatientGUI
     */
    public String role;
    final static String DATE_FORMAT = "dd/MM/yyyy";
    public EditPatientMenu() {
        initComponents();
    }

    
    public void setRole(String setRole)
    {
        this.role = setRole;
        System.out.println(role);
    }
    
    public String getRole()
    {
        return role;
    }
    
    public javax.swing.JComboBox<String> getComboBox()
    {
        return patientCombo;
    }
    
    public void setPatientEditData(String ID, String FirstName, String LastName, String Gender, String PatientDOB, String PatientAddress, String PatientTelNo)
    {
       textPatientID.setText(ID);
       textPatientFirstName.setText(FirstName);
       textPatientLastName.setText(LastName);
       patientGenderCombo.setSelectedItem(Gender);
       textPatientDOB.setText(PatientDOB);
       textPatientAddress.setText(PatientAddress);
       textPatientTelNo.setText(PatientTelNo);
    }
    
     public boolean isNameValid(String name)
    {
        return name.matches("[a-zA-Z\\s']+");
    }
    
    public boolean isNumberValid(String number)
    {
        return number.matches("[0-9]+");
    }
    
    public boolean isDateValid(String date)
    {
        try
        {
            DateFormat format = new SimpleDateFormat(DATE_FORMAT);
            format.setLenient(false);
            format.parse(date);
            return true;
        }
        catch (ParseException e)
        {
            System.out.println(e.getMessage());
            return false;
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patientCombo = new javax.swing.JComboBox<>();
        searchPatientBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textPatientID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textPatientFirstName = new javax.swing.JTextField();
        textPatientLastName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        patientGenderCombo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        textPatientDOB = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textPatientAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textPatientTelNo = new javax.swing.JTextField();
        btnSaveChanges = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchPatientBtn.setText("Search patients");
        searchPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPatientBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Patient ID:");

        textPatientID.setEnabled(false);

        jLabel2.setText("Patient first name:");

        textPatientFirstName.setEnabled(false);

        textPatientLastName.setEnabled(false);

        jLabel3.setText("Patient last name:");

        jLabel4.setText("Patient gender:");

        patientGenderCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Male", "Female" }));
        patientGenderCombo.setEnabled(false);

        jLabel5.setText("Patient DOB:");

        textPatientDOB.setEnabled(false);

        jLabel6.setText("Patient Address:");

        textPatientAddress.setEnabled(false);

        jLabel7.setText("Patient Tel.No:");

        textPatientTelNo.setEnabled(false);

        btnSaveChanges.setText("Save changes");
        btnSaveChanges.setEnabled(false);
        btnSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(btnSaveChanges))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(patientCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchPatientBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textPatientLastName)
                                    .addComponent(textPatientID)
                                    .addComponent(textPatientFirstName)
                                    .addComponent(patientGenderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textPatientDOB)
                                    .addComponent(textPatientAddress)
                                    .addComponent(textPatientTelNo, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchPatientBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textPatientFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPatientLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(patientGenderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textPatientDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textPatientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textPatientTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveChanges)
                    .addComponent(btnBack))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPatientBtnActionPerformed
        // TODO add your handling code here:
        String id = patientCombo.getSelectedItem().toString();
         if (id.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Select a patient first!");
        }
        else
        {
        databaseConn.findPatientInfoForEdit(id, textPatientID, textPatientFirstName, textPatientLastName, patientGenderCombo, textPatientDOB, textPatientAddress, textPatientTelNo);
        textPatientFirstName.setEnabled(true);
        textPatientLastName.setEnabled(true);
        patientGenderCombo.setEnabled(true);
        textPatientDOB.setEnabled(true);
        textPatientAddress.setEnabled(true);
        textPatientTelNo.setEnabled(true);
        btnSaveChanges.setEnabled(true);
        }
       
    }//GEN-LAST:event_searchPatientBtnActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ManagePatientMenu managePatient = new ManagePatientMenu();
        managePatient.setVisible(true);
        managePatient.setRole(this.getRole());
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed
        // TODO add your handling code here:
        if (textPatientFirstName.getText().isEmpty() || 
                textPatientLastName.getText().isEmpty() || 
                patientGenderCombo.getSelectedIndex() == -1 || 
                textPatientDOB.getText().isEmpty() || 
                textPatientAddress.getText().isEmpty() ||
                textPatientTelNo.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "One or more empty fields detected! Please fill in the empty fields!");
        }
        else if (isNameValid(textPatientFirstName.getText()) == false || isNameValid(textPatientLastName.getText()) == false)
        {
            JOptionPane.showMessageDialog(null, "Numbers detected in a alphabet-only field!");
        }
        else if (isNumberValid(textPatientTelNo.getText()) == false)
        {
            JOptionPane.showMessageDialog(null, "Alphabets detected in a numbers-only field!");
        }
        else if (isDateValid(textPatientDOB.getText()) == false)
        {
            JOptionPane.showMessageDialog(null, "Please re-enter date again!");
        }
        else
        {
        String retrievedPatientID = textPatientID.getText();
        String retrievedFirstName = textPatientFirstName.getText();
        String retrievedLastName = textPatientLastName.getText();
        String retrievedGender = patientGenderCombo.getItemAt(patientGenderCombo.getSelectedIndex());
        String retrievedDOB = textPatientDOB.getText();
        String retrievedAddress = textPatientAddress.getText();
        String retrievedTelNo = textPatientTelNo.getText();
        databaseConn.updatePatients(retrievedFirstName, retrievedLastName, retrievedGender, retrievedDOB, retrievedAddress, retrievedTelNo, retrievedPatientID);
        }
    }//GEN-LAST:event_btnSaveChangesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditPatientMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditPatientMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditPatientMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditPatientMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditPatientMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> patientCombo;
    private javax.swing.JComboBox<String> patientGenderCombo;
    private javax.swing.JButton searchPatientBtn;
    private javax.swing.JTextField textPatientAddress;
    private javax.swing.JTextField textPatientDOB;
    private javax.swing.JTextField textPatientFirstName;
    private javax.swing.JTextField textPatientID;
    private javax.swing.JTextField textPatientLastName;
    private javax.swing.JTextField textPatientTelNo;
    // End of variables declaration//GEN-END:variables
}
