import java.sql.Statement;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import koneksi.konek;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JTable;


public class BelanjaMentah extends javax.swing.JFrame {
 
    
    public BelanjaMentah() {
        initComponents();
        data_table();
    }

   public void data_table() { 
    DefaultTableModel tbl = new DefaultTableModel();
    tbl.addColumn("tanggal");
    tbl.addColumn("uang belanja");
    tbl.addColumn("keterangan");
    tabel.setModel(tbl);
    
    try{
            Statement statement = (Statement)konek.GetConnection().createStatement();
            ResultSet res= statement.executeQuery("select * from belanja");
            while(res.next())

        while (res.next()) {
            tbl.addRow(new Object[] {
                res.getDate("tanggal"),
                res.getInt("total"),
                res.getString("keterangan")
            });
         tabel.setModel(tbl);
        }
        

      }catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, "salah"); 
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        date1 = new com.toedter.calendar.JDateChooser();
        kulakField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        keteranganField = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jButtonSimpan = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        keluar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Tanggal");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 90, 80, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Keterangan");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 160, 100, 30);

        date1.setBackground(new java.awt.Color(204, 255, 204));
        date1.setDateFormatString("yyyy-MM- dd");
        date1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                date1MouseClicked(evt);
            }
        });
        jPanel1.add(date1);
        date1.setBounds(230, 82, 370, 30);

        kulakField.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.add(kulakField);
        kulakField.setBounds(230, 122, 370, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Uang Belanja");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 120, 130, 30);

        keteranganField.setBackground(new java.awt.Color(204, 255, 204));
        keteranganField.setColumns(20);
        keteranganField.setRows(5);
        keteranganField.setTabSize(4);
        jScrollPane1.setViewportView(keteranganField);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(230, 160, 370, 110);

        tabel.setBackground(new java.awt.Color(204, 255, 204));
        tabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tanggal", "Uang Belanja", "Keterangan"
            }
        ));
        jScrollPane2.setViewportView(tabel);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(40, 290, 730, 180);

        jButtonSimpan.setBackground(new java.awt.Color(204, 255, 204));
        jButtonSimpan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonSimpan.setText("Simpan");
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSimpan);
        jButtonSimpan.setBounds(640, 230, 90, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("Belanja Harian");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(280, 20, 270, 50);

        keluar.setBackground(new java.awt.Color(204, 255, 204));
        keluar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        keluar.setText("Kembali");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        jPanel1.add(keluar);
        keluar.setBounds(640, 180, 90, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Picture1.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 800, 500);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void date1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_date1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_date1MouseClicked

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        Connection connection = null;
        PreparedStatement statementTabel1 = null;
        String tanggal = "yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tanggal);

        String tanggal1 = String.valueOf(fm.format(date1.getDate()));
        String uang_belanja = kulakField.getText();
        String keterangan = keteranganField.getText();

        try {
            connection = konek.GetConnection();
            String sqlTabel1 = "INSERT INTO belanja (tanggal, total, keterangan) VALUES (?, ?, ?)";
            statementTabel1 = connection.prepareStatement(sqlTabel1);
            statementTabel1.setString(1, tanggal1);
            statementTabel1.setString(2, uang_belanja);
            statementTabel1.setString(3, keterangan);
            statementTabel1.executeUpdate();

            data_table();
    JOptionPane.showMessageDialog(this, "Simpan Berhasil");
} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Simpan Gagal. Terjadi kesalahan database.");
}
    }//GEN-LAST:event_jButtonSimpanActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        KeuntunganFrame untung = new KeuntunganFrame();
        untung.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_keluarActionPerformed

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
            java.util.logging.Logger.getLogger(BelanjaMentah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BelanjaMentah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BelanjaMentah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BelanjaMentah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BelanjaMentah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser date1;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton keluar;
    private javax.swing.JTextArea keteranganField;
    private javax.swing.JTextField kulakField;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}