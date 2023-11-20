import java.sql.Statement;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import koneksi.konek;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class data_karyawan extends javax.swing.JFrame {

    public data_karyawan() {
        initComponents();
        tabelkaryawan();
    }
    public void tabelkaryawan() {
    DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Username");
        tbl.addColumn("Nama");
        tbl.addColumn("Gender");
        tbl.addColumn("No Telepon");
        tbl.addColumn("Jabatan");
        karyawan.setModel(tbl);
        karyawan.getTableHeader().setBackground(new Color(115,206,191));
        karyawan.getTableHeader().setForeground(new Color(255,255,255));
        try {
            Statement st = konek.GetConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM data_karyawan");
            while(rs.next ()){
                tbl.addRow(new Object[] {
                rs.getString("username"),
                rs.getString("nama_karyawan"),
                rs.getString("jenis_kelamin"),
                rs.getString("no_hp"),
                rs.getString("jabatan")
                });
            } 
            st.close();
        } catch (Exception e) {
        }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();
        btn_hapus = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        karyawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        karyawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                karyawanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(karyawan);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 90, 700, 280);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("DATA KARYAWAN");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 10, 320, 70);

        btn_hapus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_hapus.setText("HAPUS");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        jPanel1.add(btn_hapus);
        btn_hapus.setBounds(510, 390, 110, 40);

        btn_edit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_edit.setText("EDIT DATA");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel1.add(btn_edit);
        btn_edit.setBounds(630, 390, 130, 40);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setForeground(new java.awt.Color(115, 206, 191));
        jPanel2.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DAFTAR MENU");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3);
        jLabel3.setBounds(400, 10, 110, 20);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("KELUAR");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1);
        jLabel1.setBounds(720, 10, 60, 20);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("REGISTRASI");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4);
        jLabel4.setBounds(530, 10, 90, 20);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("LAPORAN");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5);
        jLabel5.setBounds(630, 10, 70, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 460, 800, 40);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Picture1.png"))); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(0, 0, 800, 500);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        int index = karyawan.getSelectedRow();
        edit_karyawan p = new edit_karyawan();
        
        DefaultTableModel tblModel = (DefaultTableModel)karyawan.getModel();
        
        String Username = tblModel.getValueAt(index, 0).toString();
        String Nama = tblModel.getValueAt(index, 1).toString();
        String Gender = tblModel.getValueAt(index, 2).toString();
        String Notelp = tblModel.getValueAt(index, 3).toString();
        String Jabatan = tblModel.getValueAt(index, 4).toString();
        
        p.setVisible(true);
        p.pack();
        p.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        p.txt_username.setText(Username);
        p.txt_nama.setText(Nama);
        p.txt_notelp.setText(Notelp);
        p.jabatan.setSelectedItem(Jabatan);
        p.gender.setSelectedItem(Gender);
    }//GEN-LAST:event_btn_editActionPerformed

    private void karyawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_karyawanMouseClicked

    }//GEN-LAST:event_karyawanMouseClicked

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        int index = karyawan.getSelectedRow();
        
        DefaultTableModel tblModel = (DefaultTableModel)karyawan.getModel();
        String Username = tblModel.getValueAt(index, 0).toString();
        
        try {
            Statement st = konek.GetConnection().createStatement();
            st.executeUpdate("DELETE FROM data_karyawan WHERE username =('"+Username+"')");
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Data gagal dihapus");
        }
        tabelkaryawan();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        data menu = new data();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        int result = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin keluar?");
        if (result == JOptionPane.YES_NO_OPTION) {
            login_page login = new login_page();
            login.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Batal keluar");
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
    RegistrasiKaryawan regist = new RegistrasiKaryawan();
    regist.setVisible(true);
    dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
    KeuntunganFrame untung = new KeuntunganFrame();
    untung.setVisible(true);
    dispose();
    }//GEN-LAST:event_jLabel5MouseClicked
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Default".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(data_karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(data_karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(data_karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(data_karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new data_karyawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static final javax.swing.JTable karyawan = new javax.swing.JTable();
    // End of variables declaration//GEN-END:variables
}
