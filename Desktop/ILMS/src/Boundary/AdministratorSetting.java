
package Boundary;

import Controller.JDBC;
import Entity.Administrator;

/**
 *
 * @author Amanuel
 */
public class AdministratorSetting extends javax.swing.JFrame {

    Administrator admin;
    JDBC conn = new JDBC();
    
    public AdministratorSetting() {
        initComponents();
        
        this.admin = conn.returnAdministrator("123");
        System.out.print(admin.getName());
    }
    
    public AdministratorSetting(Administrator admin) {
        initComponents();
        this.admin = admin;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        changeAdminPassButt = new javax.swing.JToggleButton();
        errorMessage = new javax.swing.JLabel();
        adminNewPass = new javax.swing.JPasswordField();
        adminNewPassConf = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        patronID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        patronNewPass = new javax.swing.JTextField();
        changePatronPassButt = new javax.swing.JButton();
        passShortErr = new javax.swing.JLabel();
        patronErrDisp = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrator General Setting");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel1.setText("New Password");

        jLabel2.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel2.setText("Confirm Password");

        changeAdminPassButt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        changeAdminPassButt.setText("Change");
        changeAdminPassButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeAdminPassButtActionPerformed(evt);
            }
        });

        errorMessage.setForeground(new java.awt.Color(255, 0, 0));

        adminNewPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                adminNewPassKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(changeAdminPassButt, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(255, 255, 255))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(adminNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(adminNewPassConf, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(errorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)))))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminNewPassConf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(changeAdminPassButt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Change Password", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel5.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel5.setText("Patron ID");

        jLabel6.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel6.setText("New Password");

        patronNewPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                patronNewPassKeyReleased(evt);
            }
        });

        changePatronPassButt.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        changePatronPassButt.setText("Change");
        changePatronPassButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePatronPassButtActionPerformed(evt);
            }
        });

        passShortErr.setForeground(new java.awt.Color(255, 0, 0));

        patronErrDisp.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(patronID, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(patronErrDisp, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(patronNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(changePatronPassButt, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(passShortErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patronID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patronErrDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patronNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passShortErr, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(changePatronPassButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(41, 41, 41))
        );

        jTabbedPane4.addTab("Change Patron Password", jPanel3);

        jLabel3.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("General Settings");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changePatronPassButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePatronPassButtActionPerformed
        try
        {

            Object object = conn.returnPatron(patronID.getText());

            if (object == null)
            {
                patronErrDisp.setText("Patron ID Doesn't exist!");
            }
            else
            {
                admin.changePatronPassword(patronID.getText(), patronNewPass.getText());
                patronErrDisp.setText("");
                passShortErr.setText("");
            }
        }

        catch (Exception e)
        {}
    }//GEN-LAST:event_changePatronPassButtActionPerformed

    private void patronNewPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_patronNewPassKeyReleased
        try
        {
            if (patronNewPass.getText().length() <= 4)
            {
                passShortErr.setText("Password too Sort!");
            }
            else
            {
                passShortErr.setText("");
            }
        }

        catch (Exception e)
        {}
    }//GEN-LAST:event_patronNewPassKeyReleased

    private void adminNewPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adminNewPassKeyReleased
        if (adminNewPass.getText().length() <= 4)
        {
            errorMessage.setText("Password is too Short!");
        }
        else
        {
            errorMessage.setText("");
        }
    }//GEN-LAST:event_adminNewPassKeyReleased

    private void changeAdminPassButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeAdminPassButtActionPerformed
        try
        {
            String newPassword = adminNewPass.getText();
            String confirmPassword = adminNewPassConf.getText();

            if (!newPassword.equals(confirmPassword))
            {
                errorMessage.setText("The Password you typed didnt match!");
            }

            else
            {
                admin.changePassword(newPassword);
                errorMessage.setText("");
            }
        }

        catch (Exception e)
        {

        }
    }//GEN-LAST:event_changeAdminPassButtActionPerformed

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
            java.util.logging.Logger.getLogger(AdministratorSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministratorSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministratorSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministratorSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministratorSetting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField adminNewPass;
    private javax.swing.JPasswordField adminNewPassConf;
    private javax.swing.JToggleButton changeAdminPassButt;
    private javax.swing.JButton changePatronPassButt;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JLabel passShortErr;
    private javax.swing.JLabel patronErrDisp;
    private javax.swing.JTextField patronID;
    private javax.swing.JTextField patronNewPass;
    // End of variables declaration//GEN-END:variables
}