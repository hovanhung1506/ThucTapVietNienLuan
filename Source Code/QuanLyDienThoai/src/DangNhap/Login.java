package DangNhap;

import JDBCConnection.ConnectSQL;
import ManHinhChinh.HomeScreen;
import java.awt.event.KeyEvent;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        addIcon();
        setLocationRelativeTo(null);
        setTitle("Đăng nhập");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTenDN = new javax.swing.JTextField();
        btnDangNhap = new javax.swing.JButton();
        txtMatKhau = new javax.swing.JPasswordField();
        btnHuyBo = new javax.swing.JButton();
        chkMatKhau = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đăng nhập hệ thống");

        jLabel2.setText("Tên đăng nhập");

        jLabel3.setText("Mật khẩu");

        txtTenDN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        btnDangNhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnDangNhapKeyPressed(evt);
            }
        });

        txtMatKhau.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnHuyBo.setText("Hủy bỏ");
        btnHuyBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyBoActionPerformed(evt);
            }
        });

        chkMatKhau.setText("Hiện mật khẩu");
        chkMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMatKhauActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkMatKhau)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtTenDN, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                                        .addComponent(txtMatKhau))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btnHuyBo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenDN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(chkMatKhau)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHuyBo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyBoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnHuyBoActionPerformed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        if (KiemTraDangNhap()) {
            HomeScreen hs = new HomeScreen(txtTenDN.getText());
            hs.ShowManHinhChinh(txtTenDN.getText());
            dispose();
        } else {
            String pass = new String(txtMatKhau.getPassword());
            if (txtTenDN.getText().equals("") && pass.equals("")) {
                JOptionPane.showMessageDialog(null, "Nhập tài khoản và mật khẩu");
                txtTenDN.grabFocus();
                return;
            } else {
                JOptionPane.showMessageDialog(null, "Sai tài khoản hoặc mật khẩu", "Message", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnDangNhapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDangNhapKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (KiemTraDangNhap()) {
                HomeScreen hs = new HomeScreen(txtTenDN.getText());
                hs.ShowManHinhChinh(txtTenDN.getText());
                dispose();
            } else {
                String pass = new String(txtMatKhau.getPassword());
                if (txtTenDN.getText().equals("") && pass.equals("")) {
                    JOptionPane.showMessageDialog(null, "Nhập tài khoản và mật khẩu");
                    return;
                } else {
                    JOptionPane.showMessageDialog(null, "Sai tài khoản hoặc mật khẩu", "Message", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnDangNhapKeyPressed

    private void chkMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMatKhauActionPerformed
        if(chkMatKhau.isSelected()){
            txtMatKhau.setEchoChar((char)0);
        }else{
            txtMatKhau.setEchoChar('*');
        }
    }//GEN-LAST:event_chkMatKhauActionPerformed

    public void showLogin() {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnHuyBo;
    private javax.swing.JCheckBox chkMatKhau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JPasswordField txtMatKhau;
    public javax.swing.JTextField txtTenDN;
    // End of variables declaration//GEN-END:variables

    public boolean KiemTraDangNhap() {
        Connection con = ConnectSQL.getConnection();
        String tendn = txtTenDN.getText();
        String pass = new String(txtMatKhau.getPassword());
            try {
                CallableStatement cstm = con.prepareCall("{call DangNhap(?,?)}");
                cstm.setString(1, tendn);
                cstm.setString(2, pass);
                ResultSet rs = cstm.executeQuery();
                if (rs.next()) {
                    return true;
                }
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        return false;
    }

    private void addIcon() {
        btnDangNhap.setIcon(new ImageIcon("icon/key.png"));
        btnHuyBo.setIcon(new ImageIcon("icon/cancel.png"));
    }
}
