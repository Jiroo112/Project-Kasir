/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import koneksi.konek;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.PreparedStatement;
//import com.mysql.cj.jdbc.Driver;
import java.awt.HeadlessException;
import java.sql.SQLException;
/**
 *
 * @author Ferdi
 */
public class RegistrasiKaryawan extends javax.swing.JFrame {
   

  
    public RegistrasiKaryawan() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        jabatancom = new javax.swing.JComboBox<>();
        jsimpan = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        labelKeluar = new javax.swing.JLabel();
        jLabelDataKaryawan = new javax.swing.JLabel();
        jLabelLaporan = new javax.swing.JLabel();
        labelmenu = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        genderCombo1 = new javax.swing.JComboBox<>();
        passwordField = new javax.swing.JPasswordField();
        rePassField = new javax.swing.JPasswordField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Registrasi Karyawan");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(230, 30, 350, 60);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Username");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 160, 190, 32);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("RePassword");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 320, 200, 32);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Nama");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 90, 160, 32);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("No. Telp");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(430, 240, 170, 32);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Gender");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(430, 90, 170, 32);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("Jabatan");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(430, 160, 170, 32);

        usernameField.setBackground(new java.awt.Color(0, 153, 153));
        usernameField.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        usernameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(usernameField);
        usernameField.setBounds(110, 200, 230, 30);

        phoneField.setBackground(new java.awt.Color(0, 153, 153));
        phoneField.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        phoneField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        phoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneFieldActionPerformed(evt);
            }
        });
        jPanel1.add(phoneField);
        phoneField.setBounds(430, 280, 230, 30);

        nameField.setBackground(new java.awt.Color(0, 153, 153));
        nameField.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        nameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(nameField);
        nameField.setBounds(110, 120, 230, 30);

        jabatancom.setBackground(new java.awt.Color(0, 153, 153));
        jabatancom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jabatancom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Kasir" }));
        jabatancom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        jabatancom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jabatancomActionPerformed(evt);
            }
        });
        jPanel1.add(jabatancom);
        jabatancom.setBounds(430, 200, 240, 30);

        jsimpan.setBackground(new java.awt.Color(0, 153, 153));
        jsimpan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jsimpan.setText("simpan");
        jsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsimpanActionPerformed(evt);
            }
        });
        jPanel1.add(jsimpan);
        jsimpan.setBounds(490, 330, 120, 32);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelKeluar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelKeluar.setForeground(new java.awt.Color(255, 255, 255));
        labelKeluar.setText("Keluar");
        labelKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelKeluarMouseClicked(evt);
            }
        });
        jPanel3.add(labelKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, -1));

        jLabelDataKaryawan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDataKaryawan.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDataKaryawan.setText("Data Karyawan");
        jLabelDataKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelDataKaryawanMouseClicked(evt);
            }
        });
        jPanel3.add(jLabelDataKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));

        jLabelLaporan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelLaporan.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLaporan.setText("Laporan");
        jLabelLaporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLaporanMouseClicked(evt);
            }
        });
        jPanel3.add(jLabelLaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));

        labelmenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelmenu.setForeground(new java.awt.Color(255, 255, 255));
        labelmenu.setText("Daftar Menu");
        labelmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelmenuMouseClicked(evt);
            }
        });
        jPanel3.add(labelmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        jPanel1.add(jPanel3);
        jPanel3.setBounds(-10, 450, 800, 40);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("Password");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(110, 240, 180, 32);

        genderCombo1.setBackground(new java.awt.Color(0, 153, 153));
        genderCombo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        genderCombo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));
        genderCombo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        genderCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderCombo1ActionPerformed(evt);
            }
        });
        jPanel1.add(genderCombo1);
        genderCombo1.setBounds(430, 120, 240, 30);

        passwordField.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.add(passwordField);
        passwordField.setBounds(110, 280, 230, 30);

        rePassField.setBackground(new java.awt.Color(0, 153, 153));
        rePassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rePassFieldActionPerformed(evt);
            }
        });
        jPanel1.add(rePassField);
        rePassField.setBounds(110, 360, 230, 30);

        background.setBackground(new java.awt.Color(0, 153, 153));
        background.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Picture1.png"))); // NOI18N
        jPanel1.add(background);
        background.setBounds(0, 0, 790, 490);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 790, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void phoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void jsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsimpanActionPerformed
                                            
      Connection connection = null;
      PreparedStatement statementTabel1 = null;
      PreparedStatement statementTabel2 = null;

        String nama_karyawan = nameField.getText();
        String jabatan = jabatancom.getSelectedItem().toString();
        String username = usernameField.getText();
        String password = passwordField.getText();
        String repassword = rePassField.getText();
        String no_hp = phoneField.getText();
        String jenis_kelamin = genderCombo1.getSelectedItem().toString();

    if (password.equals(repassword)) {
        try {
            connection = konek.GetConnection();
            connection.setAutoCommit(false);

            String sqlTabel1 = "INSERT INTO data_karyawan (username, nama_karyawan, jenis_kelamin, no_hp, jabatan) VALUES (?, ?, ?, ?, ?)";
            statementTabel1 = connection.prepareStatement(sqlTabel1);
            statementTabel1.setString(1, username);
            statementTabel1.setString(2, nama_karyawan);
            statementTabel1.setString(3, jenis_kelamin);
            statementTabel1.setString(4, no_hp);
            statementTabel1.setString(5, jabatan);

            statementTabel1.executeUpdate();

            String sqlTabel2 = "INSERT INTO akun (username, password) VALUES (?, ?)";
            statementTabel2 = connection.prepareStatement(sqlTabel2);
            statementTabel2.setString(1, username);
            statementTabel2.setString(2, password);

            statementTabel2.executeUpdate();

              connection.commit();

        JOptionPane.showMessageDialog(this, "Registrasi Berhasil");
        } catch (SQLException e) {
        if (connection != null) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        JOptionPane.showMessageDialog(this, "Registrasi Gagal"+e.getMessage());
        e.printStackTrace();
        }

        } else {
            JOptionPane.showMessageDialog(this, "Kata Sandi dan Konfirmasi Kata Sandi Tidak Cocok. Registrasi Gagal.");
}
    }//GEN-LAST:event_jsimpanActionPerformed

    private void jabatancomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jabatancomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jabatancomActionPerformed

    private void jLabelDataKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDataKaryawanMouseClicked
        data_karyawan p = new data_karyawan();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelDataKaryawanMouseClicked

    private void labelKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelKeluarMouseClicked
       login_page login = new login_page();
       login.setVisible(true);
       dispose();
       
    }//GEN-LAST:event_labelKeluarMouseClicked

    private void genderCombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderCombo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderCombo1ActionPerformed

    private void labelmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelmenuMouseClicked
        data menu = new data();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_labelmenuMouseClicked

    private void jLabelLaporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLaporanMouseClicked
        KeuntunganFrame untung = new KeuntunganFrame();
        untung.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelLaporanMouseClicked

    private void rePassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rePassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rePassFieldActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrasiKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrasiKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrasiKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrasiKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrasiKaryawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JComboBox<String> genderCombo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelDataKaryawan;
    private javax.swing.JLabel jLabelLaporan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> jabatancom;
    private javax.swing.JButton jsimpan;
    private javax.swing.JLabel labelKeluar;
    private javax.swing.JLabel labelmenu;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField phoneField;
    private javax.swing.JPasswordField rePassField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
