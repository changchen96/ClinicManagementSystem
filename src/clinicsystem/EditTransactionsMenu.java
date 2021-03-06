/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author c7-ong
 */
public class EditTransactionsMenu extends javax.swing.JFrame {

    /**
     * Creates new form AddTransactionsMenu
     */
    String role;
    public EditTransactionsMenu() {
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
    
     public javax.swing.JComboBox<String> getTransactionCombo()
    {
        return transactionCombo;
    }
    
     public javax.swing.JComboBox<String> getStaffComboBox()
    {
        return staffCombo;
    }
     
      public javax.swing.JComboBox<String> getPatientComboBox()
    {
        return patientCombo;
    }
      
       public boolean isNameValid(String name)
    {
        return name.matches("[a-zA-Z\\s']+");
    }
    
    public boolean isNumberValid(String number)
    {
        return number.matches("[0-9]+(\\.[0-9][0-9]?)?");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        transactionDetails = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        amntPaid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        transactionMethod = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        transactionAmnt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        balanceLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        staffCombo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        patientCombo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        updateTransactionBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        transactionCombo = new javax.swing.JComboBox<>();
        selectTransaction = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        visitIDText = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Transaction details:");

        transactionDetails.setColumns(20);
        transactionDetails.setRows(5);
        transactionDetails.setEnabled(false);
        jScrollPane1.setViewportView(transactionDetails);

        jLabel2.setText("Amount paid:");

        amntPaid.setEnabled(false);

        jLabel3.setText("Transaction method:");

        transactionMethod.setEnabled(false);

        jLabel4.setText("Transaction amount:");

        transactionAmnt.setEnabled(false);

        jLabel5.setText("Balance:");

        balanceLabel.setText("Balance shown here");

        jLabel7.setText("Staff ID in charge:");

        staffCombo.setEnabled(false);

        jLabel8.setText("Patient ID:");

        patientCombo.setEnabled(false);

        jLabel9.setText("Edit transaction");

        updateTransactionBtn.setText("Update transaction details");
        updateTransactionBtn.setEnabled(false);
        updateTransactionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTransactionBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Select transaction:");

        selectTransaction.setText("Select transaction");
        selectTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTransactionActionPerformed(evt);
            }
        });

        jLabel10.setText("Transaction ID:");

        visitIDText.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(updateTransactionBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(staffCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(transactionAmnt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(transactionMethod, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(amntPaid, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(balanceLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(transactionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectTransaction))
                            .addComponent(visitIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(transactionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectTransaction))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(visitIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(amntPaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(transactionMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(transactionAmnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(balanceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(staffCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(patientCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateTransactionBtn)
                    .addComponent(backBtn))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        ManageTransactionsMenu transaction = new ManageTransactionsMenu();
        transaction.setRole(this.getRole());
        transaction.setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void updateTransactionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTransactionBtnActionPerformed
        // TODO add your handling code here:
         if (
                transactionDetails.getText().isEmpty() ||
                amntPaid.getText().isEmpty() ||
                transactionMethod.getText().isEmpty() ||
                transactionAmnt.getText().isEmpty() ||
                staffCombo.getItemAt(staffCombo.getSelectedIndex()).isEmpty() ||
                patientCombo.getItemAt(patientCombo.getSelectedIndex()).isEmpty()
                )
        {
             JOptionPane.showMessageDialog(null, "One or more empty fields detected! Please fill in the empty fields!");
        }
         else if ((isNumberValid(amntPaid.getText()) == false) || isNumberValid(transactionAmnt.getText()) == false)
        {
            JOptionPane.showMessageDialog(null, "Alphabets detected in a numbers-only field!");
        }
         else
         {
             String visitid = visitIDText.getText();
        String details = transactionDetails.getText();
        Double amountpaid = Double.parseDouble(amntPaid.getText());
        String method = transactionMethod.getText();
        Double amount = Double.parseDouble(transactionAmnt.getText());
        Double balance = amountpaid - amount;
        balanceLabel.setText(balance.toString());
        String staffid = staffCombo.getItemAt(staffCombo.getSelectedIndex());
        String patientid = patientCombo.getItemAt(patientCombo.getSelectedIndex());
        databaseConn.updateTransactionDetails(details, amountpaid, method, amount, balance, staffid, patientid, visitid);
         }
        
    }//GEN-LAST:event_updateTransactionBtnActionPerformed

    private void selectTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTransactionActionPerformed
        // TODO add your handling code here:
        String visitid = transactionCombo.getSelectedItem().toString();
         if (visitid.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Select a visit first!");
        }
         else
         {
            databaseConn.findTransactionInfoForEdit(visitid, visitIDText, transactionDetails, amntPaid, transactionMethod, transactionAmnt, balanceLabel, staffCombo, patientCombo);
            transactionAmnt.setEnabled(true);
            transactionCombo.setEnabled(true);
            transactionDetails.setEnabled(true);
            transactionMethod.setEnabled(true);
            updateTransactionBtn.setEnabled(true);
            amntPaid.setEnabled(true);
            
         }
    }//GEN-LAST:event_selectTransactionActionPerformed

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
            java.util.logging.Logger.getLogger(EditTransactionsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditTransactionsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditTransactionsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditTransactionsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditTransactionsMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amntPaid;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> patientCombo;
    private javax.swing.JButton selectTransaction;
    private javax.swing.JComboBox<String> staffCombo;
    private javax.swing.JTextField transactionAmnt;
    private javax.swing.JComboBox<String> transactionCombo;
    private javax.swing.JTextArea transactionDetails;
    private javax.swing.JTextField transactionMethod;
    private javax.swing.JButton updateTransactionBtn;
    private javax.swing.JTextField visitIDText;
    // End of variables declaration//GEN-END:variables
}
