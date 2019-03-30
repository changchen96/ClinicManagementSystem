/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicsystem;

/**
 *
 * @author c7-ong
 */
public class ManageAppointmentsMenu extends javax.swing.JFrame {

    /**
     * Creates new form ManagePatientMenu
     */
    public String role;
    public ManageAppointmentsMenu() {
        initComponents();
        System.out.println("Manage appointments menu");
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addAppointment = new javax.swing.JButton();
        editAppointment = new javax.swing.JButton();
        deleteAppointment = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        addAppointment.setText("Add appointment");
        addAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAppointmentActionPerformed(evt);
            }
        });

        editAppointment.setText("Edit existing appointment");
        editAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAppointmentActionPerformed(evt);
            }
        });

        deleteAppointment.setText("Delete existing appointment");
        deleteAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAppointmentActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(editAppointment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addAppointment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteAppointment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(addAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(back)
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        MainMenuGUI mainMenu = new MainMenuGUI();
        mainMenu.setVisible(true);
        mainMenu.setRole(this.getRole());
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void addAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAppointmentActionPerformed
        // TODO add your handling code here:
        AddAppointmentMenu addAppointment = new AddAppointmentMenu();
        databaseConn.fillDoctorID(addAppointment.getDoctorComboBox());
        databaseConn.fillPatientID(addAppointment.getPatientComboBox());
        addAppointment.setRole(this.getRole());
        addAppointment.setVisible(true);
        dispose();
       
    }//GEN-LAST:event_addAppointmentActionPerformed

    private void editAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAppointmentActionPerformed
        // TODO add your handling code here:
        EditAppointmentMenu editAppointment = new EditAppointmentMenu();
        databaseConn.fillAppointmentID(editAppointment.getAppointmentComboBox());
        databaseConn.fillDoctorID(editAppointment.getDoctorComboBox());
        databaseConn.fillPatientID(editAppointment.getPatientComboBox());
        editAppointment.setRole(this.getRole());
        editAppointment.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_editAppointmentActionPerformed

    private void deleteAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAppointmentActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_deleteAppointmentActionPerformed

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
            java.util.logging.Logger.getLogger(ManageAppointmentsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageAppointmentsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageAppointmentsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageAppointmentsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageAppointmentsMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAppointment;
    private javax.swing.JButton back;
    private javax.swing.JButton deleteAppointment;
    private javax.swing.JButton editAppointment;
    // End of variables declaration//GEN-END:variables
}