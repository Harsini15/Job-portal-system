/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracleconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class employerlogin extends javax.swing.JFrame {

    /**
     * Creates new form employerlogin
     */
    Connection conn=null;
    Statement st=null;
    ResultSet rs=null;
    public employerlogin() {
        initComponents();
        try{
    
  String driverName = "oracle.jdbc.driver.OracleDriver";
  Class.forName(driverName);
  String serverName = "LAPTOP-9GA03MGL";
  String serverPort = "1521";
  String sid = "XE";
  String url = "jdbc:oracle:thin:@" + serverName + ":" + serverPort + ":"+sid;
  String username = "system"; 
  String password = "cmkn1999$"; 
  conn = DriverManager.getConnection(url,username,password);
  st=conn.createStatement();
  //System.out.println("Success");
 } catch (ClassNotFoundException e){
  System.out.println("Cant find db server" + e.getMessage());
 } catch (SQLException e) {
  System.out.println("Cant connect" + e.getMessage());
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
        jLabel3 = new javax.swing.JLabel();
        epassword = new javax.swing.JPasswordField();
        signin = new javax.swing.JButton();
        signup = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        e_id = new javax.swing.JTextField();
        ename = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(1380, 800));
        setSize(new java.awt.Dimension(1380, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 110, -1));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jLabel3.setText("E_ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 60, -1));
        getContentPane().add(epassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, 130, -1));

        signin.setBackground(new java.awt.Color(153, 255, 255));
        signin.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        signin.setText("SIGN IN");
        signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinActionPerformed(evt);
            }
        });
        getContentPane().add(signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, -1, -1));

        signup.setBackground(new java.awt.Color(153, 255, 255));
        signup.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        signup.setText("SIGN UP");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        getContentPane().add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 100, -1));

        e_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e_idActionPerformed(evt);
            }
        });
        getContentPane().add(e_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 320, 130, -1));

        ename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enameActionPerformed(evt);
            }
        });
        getContentPane().add(ename, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 210, 130, -1));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        jLabel2.setText("EMPLOYER");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 140, -1));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1460, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
new employerdetails1().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_signupActionPerformed

    private void e_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_e_idActionPerformed

    private void enameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enameActionPerformed

    private void signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinActionPerformed

        try {
            // TODO add your handling code here:
            PreparedStatement stmt=null;
            ResultSet rs=null;
            String e_id1=e_id.getText();
            String epassword1=epassword.getText();
         //   String epassword1=epassword.getText();
            String ename1=ename.getText();
            stmt=conn.prepareStatement("Select ename from employer where ename=? and epassword=?");
            stmt.setString(1,ename1);
            stmt.setString(2,epassword1);
            rs=stmt.executeQuery();
            if(rs.next())
            {
                new employerdetailssignin(ename1).setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(employerlogin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_signinActionPerformed

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
            java.util.logging.Logger.getLogger(employerlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employerlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employerlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employerlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employerlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField e_id;
    private javax.swing.JTextField ename;
    private javax.swing.JPasswordField epassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton signin;
    private javax.swing.JButton signup;
    // End of variables declaration//GEN-END:variables
}
