import com.mysql.jdbc.Driver;
import java.awt.Image;
import java.io.File;
import javax.swing.JOptionPane;
import koneksi.konek;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;


public class tambah extends javax.swing.JFrame {

    private String filemenu;

    /**
     * Creates new form tambah
     */
    public tambah() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        filefoto = new javax.swing.JLabel();
        btn_pilih = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_kode = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        txt_harga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel6.setText("Tambah Menu");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 200, 50));

        filefoto.setBackground(new java.awt.Color(255, 255, 255));
        filefoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(filefoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 180, 160));

        btn_pilih.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_pilih.setText("Pilih Foto");
        btn_pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pilihActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pilih, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 100, 23));

        btn_simpan.setBackground(new java.awt.Color(0, 102, 102));
        btn_simpan.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 120, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel1.setText("Harga");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 130, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel2.setText("Kode Menu");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 130, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel3.setText("Nama");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 130, 40));

        txt_kode.setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().add(txt_kode, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 220, 40));

        txt_nama.setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 220, 40));

        txt_harga.setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().add(txt_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 220, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Picture1.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 930, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        String kode_menu = txt_kode.getText();
        String nama_menu = txt_nama.getText();
        String harga = txt_harga.getText();       
        try {
            Statement st = konek.GetConnection().createStatement();
            st.executeUpdate ("INSERT INTO menu (kode_menu, nama_menu, harga, gambar)"
                    + " VALUES ('" + kode_menu + "','" + nama_menu + "','" + harga + "')");
            JOptionPane.showMessageDialog(null, "Menu Berhasil Ditambahkan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menu Gagal Ditambahkan");
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
            java.util.logging.Logger.getLogger(tambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tambah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_pilih;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JLabel filefoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_kode;
    private javax.swing.JTextField txt_nama;
    // End of variables declaration//GEN-END:variables
}
