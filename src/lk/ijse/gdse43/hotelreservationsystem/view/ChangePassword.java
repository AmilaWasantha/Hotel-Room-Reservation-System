/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse43.hotelreservationsystem.view;

/**
 *
 * @author user
 */
public class ChangePassword extends javax.swing.JFrame {

    /**
     * Creates new form ChangePassword
     */
    public ChangePassword() {
        initComponents();
        setSize(1920,1080);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        oldpasswordlabel = new javax.swing.JLabel();
        newpasswordlabel = new javax.swing.JLabel();
        verifypasswordlabel = new javax.swing.JLabel();
        oldpasswordtext = new javax.swing.JTextField();
        backbtn = new javax.swing.JButton();
        verifypasswordtext = new javax.swing.JTextField();
        okbtn = new javax.swing.JButton();
        newpasswordtext = new javax.swing.JTextField();
        usernametext = new javax.swing.JTextField();
        usernamelabel = new javax.swing.JLabel();
        changepassword = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gdse43/hotelroomreservation/resource/change password key.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 110));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 110, 110));

        oldpasswordlabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        oldpasswordlabel.setForeground(new java.awt.Color(255, 255, 255));
        oldpasswordlabel.setText("Old  Password");
        jPanel1.add(oldpasswordlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 190, 50));

        newpasswordlabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        newpasswordlabel.setForeground(new java.awt.Color(255, 255, 255));
        newpasswordlabel.setText("New Password");
        jPanel1.add(newpasswordlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 560, -1, -1));

        verifypasswordlabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        verifypasswordlabel.setForeground(new java.awt.Color(255, 255, 255));
        verifypasswordlabel.setText("Verify Password");
        jPanel1.add(verifypasswordlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 710, 200, 40));
        jPanel1.add(oldpasswordtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 402, 460, 40));

        backbtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backbtn.setText("Back");
        backbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbtnMouseClicked(evt);
            }
        });
        jPanel1.add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 910, 100, -1));

        verifypasswordtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifypasswordtextActionPerformed(evt);
            }
        });
        jPanel1.add(verifypasswordtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 720, 460, 40));

        okbtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        okbtn.setText("OK");
        jPanel1.add(okbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 910, 100, -1));
        jPanel1.add(newpasswordtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 552, 460, 40));
        jPanel1.add(usernametext, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 262, 460, 40));

        usernamelabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        usernamelabel.setForeground(new java.awt.Color(255, 255, 255));
        usernamelabel.setText("User Name");
        jPanel1.add(usernamelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 160, 30));

        changepassword.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        changepassword.setForeground(new java.awt.Color(255, 255, 255));
        changepassword.setText("Change Password");
        jPanel1.add(changepassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 210, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gdse43/hotelroomreservation/resource/JPanelFormBackground_1.jpg"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1920, 1150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verifypasswordtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifypasswordtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verifypasswordtextActionPerformed

    private void backbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseClicked
        LoginScreen l1=new LoginScreen();
        l1.setVisible(true);
        this.disable();
    }//GEN-LAST:event_backbtnMouseClicked

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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel changepassword;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel newpasswordlabel;
    private javax.swing.JTextField newpasswordtext;
    private javax.swing.JButton okbtn;
    private javax.swing.JLabel oldpasswordlabel;
    private javax.swing.JTextField oldpasswordtext;
    private javax.swing.JLabel usernamelabel;
    private javax.swing.JTextField usernametext;
    private javax.swing.JLabel verifypasswordlabel;
    private javax.swing.JTextField verifypasswordtext;
    // End of variables declaration//GEN-END:variables
}
