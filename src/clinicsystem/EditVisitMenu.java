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
public class EditVisitMenu extends javax.swing.JFrame {

    /**
     * Creates new form AddPatientMenu
     */
    String role;
    final static String DATE_FORMAT = "dd/MM/yyyy";
    public EditVisitMenu() {
        initComponents();
        System.out.println("Add patient menu");
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
    
      public javax.swing.JComboBox<String> getVisitComboBox()
    {
        return comboVisit;
    }
    
     public javax.swing.JComboBox<String> getAppointmentComboBox()
    {
        return appointmentCombo;
    }
    
    public javax.swing.JComboBox<String> getPatientComboBox()
    {
        return patientCombo;
    }
    
    public javax.swing.JComboBox<String> getDoctorComboBox()
    {
        return doctorCombo;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        visitDate = new javax.swing.JTextField();
        patientCombo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        updateVisitBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        doctorCombo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        visitDetails = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        appointmentCombo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        visitNotes = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        comboVisit = new javax.swing.JComboBox<>();
        SelectVisitBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        visitIDText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Edit visit");

        jLabel2.setText("Visit details:");

        jLabel3.setText("Visit date:");
        jLabel3.setToolTipText("");

        jLabel4.setText("Patient ID:");

        visitDate.setEnabled(false);
        visitDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitDateActionPerformed(evt);
            }
        });

        patientCombo.setEnabled(false);

        jLabel5.setText("Doctor ID:");

        updateVisitBtn.setText("Update visit details");
        updateVisitBtn.setEnabled(false);
        updateVisitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateVisitBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        doctorCombo.setEnabled(false);

        visitDetails.setColumns(20);
        visitDetails.setLineWrap(true);
        visitDetails.setRows(5);
        visitDetails.setEnabled(false);
        jScrollPane1.setViewportView(visitDetails);

        jLabel6.setText("Appointment ID:");

        appointmentCombo.setEnabled(false);

        visitNotes.setColumns(20);
        visitNotes.setLineWrap(true);
        visitNotes.setRows(5);
        visitNotes.setEnabled(false);
        jScrollPane2.setViewportView(visitNotes);

        jLabel7.setText("Visit notes:");

        SelectVisitBtn.setText("Select visit");
        SelectVisitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectVisitBtnActionPerformed(evt);
            }
        });

        jLabel8.setText("Visit ID:");

        visitIDText.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(updateVisitBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(87, 87, 87))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(appointmentCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doctorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel8))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(14, 14, 14)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(27, 27, 27)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboVisit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SelectVisitBtn))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane2)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(visitDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(visitIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 208, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboVisit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectVisitBtn))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(visitIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(visitDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(appointmentCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(patientCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(doctorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateVisitBtn)
                    .addComponent(backBtn))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateVisitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateVisitBtnActionPerformed
        // TODO add your handling code here:
        if (visitIDText.getText().isEmpty() || visitDetails.getText().isEmpty() || visitDate.getText().isEmpty() || visitNotes.getText().isEmpty() ||
               appointmentCombo.getSelectedItem().toString().isEmpty() || patientCombo.getSelectedItem().toString().isEmpty() || doctorCombo.getSelectedItem().toString().isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "One or more fields are empty! Please fill in the empty fields!");
        }
        else if (isDateValid(visitDate.getText()) == false)
        {
            JOptionPane.showMessageDialog(null, "Please re-enter date again!");
        }
        String visitID = visitIDText.getText();
        String details = visitDetails.getText();
        String date = visitDate.getText();
        String notes = visitNotes.getText();
        String appointmentID = appointmentCombo.getSelectedItem().toString();
        String patientID = patientCombo.getSelectedItem().toString();
        String doctorID = doctorCombo.getSelectedItem().toString();
        databaseConn.updateVisitDetails(details, date, notes, appointmentID, patientID, doctorID, visitID);
    }//GEN-LAST:event_updateVisitBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        ManageVisitsMenu visits = new ManageVisitsMenu();
        visits.setVisible(true);
        visits.setRole(this.getRole());
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void visitDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visitDateActionPerformed

    private void SelectVisitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectVisitBtnActionPerformed
        // TODO add your handling code here:
        String visitid = comboVisit.getItemAt(comboVisit.getSelectedIndex());
        if (visitid.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Select a visit first!");
        }
        else
        {
        databaseConn.findVisitDetailsForEdit(visitid, visitIDText, visitDetails, visitDate, visitNotes, appointmentCombo, patientCombo, doctorCombo);
        visitDate.setEnabled(true);
        visitDetails.setEnabled(true);
        visitNotes.setEnabled(true);
        patientCombo.setEnabled(true);
        doctorCombo.setEnabled(true);
        comboVisit.setEnabled(true);
        appointmentCombo.setEnabled(true);
        updateVisitBtn.setEnabled(true);
        }
    }//GEN-LAST:event_SelectVisitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(EditVisitMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditVisitMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditVisitMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditVisitMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditVisitMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SelectVisitBtn;
    private javax.swing.JComboBox<String> appointmentCombo;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<String> comboVisit;
    private javax.swing.JComboBox<String> doctorCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> patientCombo;
    private javax.swing.JButton updateVisitBtn;
    private javax.swing.JTextField visitDate;
    private javax.swing.JTextArea visitDetails;
    private javax.swing.JTextField visitIDText;
    private javax.swing.JTextArea visitNotes;
    // End of variables declaration//GEN-END:variables
}
