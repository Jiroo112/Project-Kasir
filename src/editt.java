/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import com.mysql.cj.jdbc.Driver;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import koneksi.konek;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import java.sql.DriverManager;
import java.sql.Connection;
/**
 *
 * @author oser
 */
public class editt extends javax.swing.JFrame {
private String filemenu;

    /**
     * Creates new form editt
     */
    public editt() {
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
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_kode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_harga = new javax.swing.JTextField();
        btn_keluar = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        btn_pilih = new javax.swing.JButton();
        filefoto = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel5.setText("Edit Menu");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 0, 141, 51));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel1.setText("Kode Menu");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 104, -1, -1));
        jPanel1.add(txt_kode, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 94, 180, 40));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel2.setText("Nama ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 174, -1, -1));
        jPanel1.add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 164, 180, 40));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel3.setText("Harga");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 244, -1, -1));
        jPanel1.add(txt_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 234, 180, 40));

        btn_keluar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        btn_keluar.setText("Keluar");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 326, 100, 40));

        btn_hapus.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        jPanel1.add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 326, 100, 40));

        btn_simpan.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        jPanel1.add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 326, 100, 40));

        btn_pilih.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_pilih.setText("Pilih Foto");
        btn_pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pilihActionPerformed(evt);
            }
        });
        jPanel1.add(btn_pilih, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 100, 23));

        filefoto.setBackground(new java.awt.Color(255, 255, 255));
        filefoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(filefoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 180, 160));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Picture1.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        String kode_menu = txt_kode.getText();
        String nama_menu = txt_nama.getText();
        String harga = txt_harga.getText();
        
        try {
            Statement st = konek.GetConnection().createStatement();
            st.executeUpdate("DELETE FROM menu WHERE kode_menu =('"+kode_menu+"') OR nama_menu = ('"+ nama_menu+"') ");
            JOptionPane.showMessageDialog(null, "Menu Berhasil Dihapus");
            txt_kode.setText("");
            txt_nama.setText("");
            txt_harga.setText("");
        } catch (Exception t) {
            JOptionPane.showMessageDialog(null, "Menu Gagal Dihapus");
        }
        this.setVisible(false);
        new data().setVisible(true);
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        String kode_menu = txt_kode.getText();
        String nama_menu = txt_nama.getText();
        String harga = txt_harga.getText();
        try {
            Statement st = konek.GetConnection().createStatement();
            st.executeUpdate("UPDATE menu SET nama_menu='" + nama_menu + "', harga= '" + harga + "' WHERE kode_menu='"+ kode_menu +"' OR nama_menu='" + nama_menu + "';");
            JOptionPane.showMessageDialog(null, "Menu Berhasil Disimpan");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menu Gagal Disimpan");
        }
        this.setVisible(false);
        new data().setVisible(true);
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_pilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pilihActionPerformed
        // TODO add your handling code here:
        try{
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File f = chooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(f.toString());
            Image img = icon.getImage().getScaledInstance(filefoto.getWidth(), filefoto.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon ic = new ImageIcon(img);
            filefoto.setIcon(ic);
            this.filemenu = f.getAbsolutePath();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_pilihActionPerformed

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
            java.util.logging.Logger.getLogger(editt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_pilih;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JLabel filefoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txt_harga;
    public javax.swing.JTextField txt_kode;
    public javax.swing.JTextField txt_nama;
    // End of variables declaration//GEN-END:variables
}
