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
   

    /**
     * Creates new form RegistrasiKaryawan
     */
    public RegistrasiKaryawan() {
        setTitle("Registrasi Karyawan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        passwordField = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        jabatanField = new javax.swing.JTextField();
        genderCombo = new javax.swing.JComboBox<>();
        jsimpan = new javax.swing.JButton();
        rePassField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        labelKeluar = new javax.swing.JLabel();
        jLabelDataKaryawan = new javax.swing.JLabel();
        jLabelLaporan = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setText("Registrasi Karyawan");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(230, 20, 350, 60);

        jLabel2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel2.setText("Username");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 180, 190, 32);

        jLabel3.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel3.setText("RePassword");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 340, 200, 32);

        jLabel4.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel4.setText("Nama");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(110, 110, 160, 32);

        jLabel5.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel5.setText("No. Telp");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(420, 260, 170, 32);

        jLabel6.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel6.setText("Gender");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(420, 110, 170, 32);

        jLabel7.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel7.setText("Jabatan");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(420, 180, 170, 32);

        passwordField.setBackground(new java.awt.Color(72, 219, 161));
        passwordField.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        passwordField.setActionCommand("<Not Set>");
        passwordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(passwordField);
        passwordField.setBounds(100, 300, 230, 30);

        usernameField.setBackground(new java.awt.Color(72, 219, 161));
        usernameField.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        usernameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(usernameField);
        usernameField.setBounds(100, 210, 230, 30);

        phoneField.setBackground(new java.awt.Color(72, 219, 161));
        phoneField.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        phoneField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        phoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneFieldActionPerformed(evt);
            }
        });
        jPanel1.add(phoneField);
        phoneField.setBounds(420, 300, 230, 30);

        nameField.setBackground(new java.awt.Color(72, 219, 161));
        nameField.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        nameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(nameField);
        nameField.setBounds(100, 140, 230, 30);

        jabatanField.setBackground(new java.awt.Color(72, 219, 161));
        jabatanField.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jabatanField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        jabatanField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jabatanFieldActionPerformed(evt);
            }
        });
        jPanel1.add(jabatanField);
        jabatanField.setBounds(420, 210, 230, 30);

        genderCombo.setBackground(new java.awt.Color(72, 219, 161));
        genderCombo.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        genderCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));
        genderCombo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        genderCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderComboActionPerformed(evt);
            }
        });
        jPanel1.add(genderCombo);
        genderCombo.setBounds(420, 140, 230, 30);

        jsimpan.setBackground(new java.awt.Color(72, 219, 161));
        jsimpan.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jsimpan.setText("simpan");
        jsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsimpanActionPerformed(evt);
            }
        });
        jPanel1.add(jsimpan);
        jsimpan.setBounds(420, 380, 120, 31);

        rePassField.setBackground(new java.awt.Color(72, 219, 161));
        rePassField.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        rePassField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        jPanel1.add(rePassField);
        rePassField.setBounds(100, 380, 230, 30);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelKeluar.setForeground(new java.awt.Color(255, 255, 255));
        labelKeluar.setText("Keluar");
        labelKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelKeluarMouseClicked(evt);
            }
        });
        jPanel3.add(labelKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(739, 6, -1, -1));

        jLabelDataKaryawan.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDataKaryawan.setText("Data Karyawan");
        jLabelDataKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelDataKaryawanMouseClicked(evt);
            }
        });
        jPanel3.add(jLabelDataKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 6, -1, -1));

        jLabelLaporan.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLaporan.setText("Laporan");
        jLabelLaporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLaporanMouseClicked(evt);
            }
        });
        jPanel3.add(jLabelLaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 6, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Registrasi");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 6, -1, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Daftar Menu");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 6, -1, -1));

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 460, 780, 30);

        background.setBackground(new java.awt.Color(72, 219, 161));
        background.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/regis karyawan123.png"))); // NOI18N
        jPanel1.add(background);
        background.setBounds(0, 0, 790, 490);

        jLabel8.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel8.setText("Password");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(100, 260, 180, 32);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 790, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void phoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void jabatanFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jabatanFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jabatanFieldActionPerformed

    private void jsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsimpanActionPerformed
                                            
    Connection connection = null;
    PreparedStatement statementTabel1 = null;
    PreparedStatement statementTabel2 = null;

    String nama_karyawan = nameField.getText();
    String jabatan = jabatanField.getText();
    String username = usernameField.getText();
    String password = passwordField.getText();
    String repassword = rePassField.getText();
    String no_hp = phoneField.getText();
    String jenis_kelamin = genderCombo.getSelectedItem().toString();

    if (password.equals(repassword)) {
        try {
            // Menyimpan data ke dalam tabel MySQL
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/percobaan_projek1", "root", "");
            connection.setAutoCommit(false); // Nonaktifkan otomatis commit

            // Query pertama: INSERT ke tabel data_karyawan
            String sqlTabel1 = "INSERT INTO data_karyawan (nama_karyawan, jabatan, username, no_hp, jenis_kelamin) VALUES (?, ?, ?, ?, ?)";
            statementTabel1 = connection.prepareStatement(sqlTabel1);
            statementTabel1.setString(1, nama_karyawan);
            statementTabel1.setString(2, jabatan);
            statementTabel1.setString(3, username);
            statementTabel1.setString(4, no_hp);
            statementTabel1.setString(5, jenis_kelamin);

            // Eksekusi query pertama
            statementTabel1.executeUpdate();

            // Query kedua: INSERT ke tabel akun
            String sqlTabel2 = "INSERT INTO akun (username, password) VALUES (?, ?)";
            statementTabel2 = connection.prepareStatement(sqlTabel2);
            statementTabel2.setString(1, username);
            statementTabel2.setString(2, password);

            // Eksekusi query kedua
            statementTabel2.executeUpdate();

            // Commit transaksi
            connection.commit();

            JOptionPane.showMessageDialog(this, "Registrasi Berhasil");
            nameField.setText("");
            jabatanField.setText("");
            usernameField.setText("");
            passwordField.setText("");
            rePassField.setText("");
            phoneField.setText("");
        } catch (SQLException e) {
            try {
                // Rollback jika terjadi kesalahan
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Registrasi Gagal. Terjadi kesalahan database.");
        } finally {
            try {
                // Tutup PreparedStatement
                if (statementTabel1 != null) {
                    statementTabel1.close();
                }
                if (statementTabel2 != null) {
                    statementTabel2.close();
                }
                // Tutup koneksi
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Kata Sandi dan Konfirmasi Kata Sandi Tidak Cocok. Registrasi Gagal.");
    }

    }//GEN-LAST:event_jsimpanActionPerformed

    private void genderComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderComboActionPerformed

    private void jLabelDataKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDataKaryawanMouseClicked
        menu_kariawan p = new menu_kariawan();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelDataKaryawanMouseClicked

    private void jLabelLaporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLaporanMouseClicked
       KeuntunganFrame untung = new KeuntunganFrame();
        untung.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelLaporanMouseClicked

    private void labelKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelKeluarMouseClicked
       login_page login = new login_page();
       login.setVisible(true);
       dispose();
       
    }//GEN-LAST:event_labelKeluarMouseClicked

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
    private javax.swing.JComboBox<String> genderCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTextField jabatanField;
    private javax.swing.JButton jsimpan;
    private javax.swing.JLabel labelKeluar;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField phoneField;
    private javax.swing.JTextField rePassField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
