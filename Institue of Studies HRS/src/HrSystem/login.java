/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HrSystem;

import javax.swing.JOptionPane;

/**
 *
 * @author Buthshana
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form loginpageform
     */
    public login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnexit = new javax.swing.JButton();
        btnlogin = new javax.swing.JButton();
        btnbck = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1020, 518));
        setSize(new java.awt.Dimension(1020, 518));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Institute of studies Colombo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(310, 0, 350, 86);

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Enter your logins");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(310, 140, 232, 33);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("username  :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 180, 90, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("password  :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(313, 230, 90, 30);

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsername);
        txtUsername.setBounds(400, 182, 190, 30);

        txtPassword.setEchoChar('*');
        getContentPane().add(txtPassword);
        txtPassword.setBounds(400, 230, 190, 30);

        btnexit.setBackground(new java.awt.Color(204, 204, 204));
        btnexit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnexit.setText("exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        getContentPane().add(btnexit);
        btnexit.setBounds(900, 20, 72, 27);

        btnlogin.setBackground(new java.awt.Color(204, 204, 204));
        btnlogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnlogin.setText("login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin);
        btnlogin.setBounds(520, 280, 72, 27);

        btnbck.setBackground(new java.awt.Color(204, 204, 204));
        btnbck.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnbck.setText("Home");
        btnbck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbckActionPerformed(evt);
            }
        });
        getContentPane().add(btnbck);
        btnbck.setBounds(10, 20, 72, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HrSystem/51751193_m.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-3, 0, 1030, 510);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed

        String user1 = txtUsername.getText();
        String user2 = txtUsername.getText();
        String pass1 = txtPassword.getText();
        String pass2 = txtPassword.getText();

        if (user1.equals("Hrmanager") && pass1.equals("1234")) {
            Interfacehrmanager ifm = new Interfacehrmanager();
            ifm.setVisible(true);

            this.dispose();

        } else if (user2.equals("Hrasis") && pass2.equals("1234")) {
            Employeetbl etbl = new Employeetbl();
            etbl.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Unauthorized Login");
        }
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        int res = JOptionPane.showConfirmDialog(this, "Are you sure want Exit?", "Exit", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.YES_OPTION == res) {
            System.exit(0);

        }

    }//GEN-LAST:event_btnexitActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnbckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbckActionPerformed
        Home fp = new Home();
        fp.show();
        dispose();
    }//GEN-LAST:event_btnbckActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbck;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
