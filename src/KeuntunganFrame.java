
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JTextField;

public class KeuntunganFrame extends javax.swing.JFrame {
    double modal;
    double transaksi;
    double keuntungan;
    
     public KeuntunganFrame() {
        initComponents();
        data_table();   
        data_table_belanja();
  }
 public void data_table() {
    DefaultTableModel tbl = new DefaultTableModel();
    tbl.addColumn("Tanggal");
    tbl.addColumn("Kode Transaksi");
    tbl.addColumn("Pemasukan");
    tabel.setModel(tbl);

    try {
      Statement statement = konek.GetConnection().createStatement();
    ResultSet res = statement.executeQuery(
            "select transaksi.tgl_transaksi, transaksi.kode_transaksi, transaksi.total"
                    + " FROM transaksi order by tgl_transaksi ASC");
 
          while (res.next()) {
        tbl.addRow(new Object[]{
                res.getDate("tgl_transaksi"),
                res.getString("kode_transaksi"),
                res.getInt("total"),
                
        });
    }
    tabel.setModel(tbl);

} catch (Exception e) {

}
 }
    public void data_table_belanja() {
    DefaultTableModel tblB = new DefaultTableModel();
    tblB.addColumn("Tanggal");
    tblB.addColumn("Total Belanja");
    tblB.addColumn("Keterangan");
    belanjatabel.setModel(tblB);

    try {
      Statement statement = konek.GetConnection().createStatement();
    ResultSet res = statement.executeQuery("select belanja.tanggal, belanja.total, belanja.keterangan "
            + "FROM belanja ORDER BY tanggal ASC;");
 
          while (res.next()) {
        tblB.addRow(new Object[]{
                res.getDate("tanggal"),
                res.getInt("total"),
                res.getString("keterangan"),
                
        });
    }
    belanjatabel.setModel(tblB);

} catch (Exception e) {
    JOptionPane.showMessageDialog(rootPane, "Error: " + e.getMessage());
    e.printStackTrace();
}
    }
  public double modal(String tanggal1, String tanggal2) {
    double nilaiModal = 0.0;
    try {
        String query = "SELECT SUM(belanja.total) AS total_belanja FROM belanja WHERE tanggal BETWEEN ? AND ?";
        PreparedStatement preparedStatement = konek.GetConnection().prepareStatement(query);

        preparedStatement.setString(1, tanggal1);
        preparedStatement.setString(2, tanggal2);

        ResultSet res = preparedStatement.executeQuery();

        while (res.next()) {
            nilaiModal = res.getDouble("total_belanja");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return nilaiModal;
}

public double transaksi(String tanggal1, String tanggal2) {
    double nilaiTotal = 0.0;
    try {
        String query = "SELECT SUM(transaksi.total) AS total_transaksi FROM transaksi WHERE tgl_transaksi BETWEEN ? AND ?";
        PreparedStatement preparedStatement = konek.GetConnection().prepareStatement(query);

        preparedStatement.setString(1, tanggal1);
        preparedStatement.setString(2, tanggal2);

        ResultSet res = preparedStatement.executeQuery();

        while (res.next()) {
            nilaiTotal = res.getDouble("total_transaksi");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return nilaiTotal;
}

 
  
//   public void Keuntungan(String tanggal1, String tanggal2) {
    
  /* private void refresh() {
  
          fieldModal.setText("");
          totalField.setText("");
          keuntunganField.setText("");
  
          date1.setDate(null);
         date2.setDate(null);*/
////}
//   public double hitungPresentaseUntung(double keuntungan, double modal) {
////    if (modal != 0) {
//        return (keuntungan / modal) * 100;
////    } else {
//        return 0.0;
//    }
//}

//public void presentaseUntung() {

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        date1 = new com.toedter.calendar.JDateChooser();
        date2 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ButtonHitung = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        BelanjaMentah = new javax.swing.JButton();
        kembalibtn = new javax.swing.JButton();
        totaluntungField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        belanjatabel = new javax.swing.JTable();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        date1.setBackground(new java.awt.Color(204, 255, 204));
        date1.setDateFormatString("yyyy-MM- dd");
        date1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                date1MouseClicked(evt);
            }
        });
        jPanel1.add(date1);
        date1.setBounds(50, 90, 280, 30);

        date2.setBackground(new java.awt.Color(204, 255, 204));
        date2.setDateFormatString("yyyy-MM- dd");
        date2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                date2MouseClicked(evt);
            }
        });
        jPanel1.add(date2);
        date2.setBounds(400, 90, 240, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Perhitungan Keuntungan");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(190, 10, 450, 48);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Sampai Tanggal");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(460, 60, 140, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Dari Tanggal");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 60, 110, 30);

        ButtonHitung.setBackground(new java.awt.Color(204, 255, 204));
        ButtonHitung.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonHitung.setText("Hitung");
        ButtonHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHitungActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonHitung);
        ButtonHitung.setBounds(650, 90, 80, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Keuntungan");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 440, 130, 25);

        tabel.setBackground(new java.awt.Color(204, 255, 204));
        tabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tanggal", "Kode Transaksi", "Pemasukan"
            }
        ));
        tabel.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tabel);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(70, 150, 320, 250);

        BelanjaMentah.setBackground(new java.awt.Color(204, 255, 204));
        BelanjaMentah.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BelanjaMentah.setText("Belanja Mentah");
        BelanjaMentah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BelanjaMentahActionPerformed(evt);
            }
        });
        jPanel1.add(BelanjaMentah);
        BelanjaMentah.setBounds(650, 420, 140, 30);

        kembalibtn.setBackground(new java.awt.Color(204, 255, 204));
        kembalibtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kembalibtn.setText("Kembali");
        kembalibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembalibtnActionPerformed(evt);
            }
        });
        jPanel1.add(kembalibtn);
        kembalibtn.setBounds(650, 460, 140, 30);

        totaluntungField.setBackground(new java.awt.Color(204, 255, 204));
        totaluntungField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(totaluntungField);
        totaluntungField.setBounds(190, 440, 310, 30);

        belanjatabel.setBackground(new java.awt.Color(204, 255, 204));
        belanjatabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        belanjatabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Total Belanja", "Keterangan"
            }
        ));
        belanjatabel.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(belanjatabel);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(420, 150, 320, 250);

        background.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        background.setForeground(new java.awt.Color(204, 255, 204));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/background.png"))); // NOI18N
        jPanel1.add(background);
        background.setBounds(0, 0, 800, 500);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void date1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_date1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_date1MouseClicked

    private void date2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_date2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_date2MouseClicked

    private void ButtonHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHitungActionPerformed
                                   
    String tanggalPattern = "yyyy-MM-dd";
    SimpleDateFormat dateFormat = new SimpleDateFormat(tanggalPattern);

    String tanggal1 = dateFormat.format(date1.getDate());
    String tanggal2 = dateFormat.format(date2.getDate());

    try {
      
        String queryTransaksi = "SELECT tgl_transaksi, kode_transaksi, total "
            + "FROM transaksi WHERE tgl_transaksi BETWEEN ? AND ? order by tgl_transaksi asc";
        PreparedStatement statementTransaksi = konek.GetConnection().prepareStatement(queryTransaksi);
        statementTransaksi.setString(1, tanggal1);
        statementTransaksi.setString(2, tanggal2);

        ResultSet resTransaksi = statementTransaksi.executeQuery();

        DefaultTableModel tblTransaksi = new DefaultTableModel();
        tblTransaksi.addColumn("Tanggal");
        tblTransaksi.addColumn("Kode Transaksi");
        tblTransaksi.addColumn("Pemasukan");

        while (resTransaksi.next()) {
            tblTransaksi.addRow(new Object[]{
                    resTransaksi.getDate("tgl_transaksi"),
                    resTransaksi.getString("kode_transaksi"),
                    resTransaksi.getInt("total")
            });
        }

      
        String queryBelanja = "SELECT tanggal, total, keterangan "
            + "FROM belanja WHERE tanggal BETWEEN ? AND ? order by tanggal asc";
        PreparedStatement statementBelanja = konek.GetConnection().prepareStatement(queryBelanja);
        statementBelanja.setString(1, tanggal1);
        statementBelanja.setString(2, tanggal2);

        ResultSet resBelanja = statementBelanja.executeQuery();

        DefaultTableModel tblBelanja = new DefaultTableModel();
        tblBelanja.addColumn("Tanggal");
        tblBelanja.addColumn("Total Belanja");
        tblBelanja.addColumn("Keterangan");

        while (resBelanja.next()) {
            tblBelanja.addRow(new Object[]{
                    resBelanja.getDate("tanggal"),
                    resBelanja.getInt("total"),
                    resBelanja.getString("keterangan")
            });
        }
        tabel.setModel(tblTransaksi);
        belanjatabel.setModel(tblBelanja);
        
        
        double modal = modal(tanggal1, tanggal2);
        double transaksi = transaksi(tanggal1, tanggal2);
        double keuntungan = transaksi - modal;
        totaluntungField.setText(String.valueOf(keuntungan));
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(rootPane, "Error: " + e.getMessage());
        e.printStackTrace();
    }

    }//GEN-LAST:event_ButtonHitungActionPerformed

    private void BelanjaMentahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BelanjaMentahActionPerformed
        /*BelanjaMentah belanja = new BelanjaMentah();
        belanja.setVisible(true);
        dispose();*/
    }//GEN-LAST:event_BelanjaMentahActionPerformed

    private void kembalibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembalibtnActionPerformed
       dashboard_admin das = new dashboard_admin();
       das.setVisible(true);
       dispose();
    }//GEN-LAST:event_kembalibtnActionPerformed

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
            java.util.logging.Logger.getLogger(KeuntunganFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KeuntunganFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KeuntunganFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KeuntunganFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KeuntunganFrame().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BelanjaMentah;
    private javax.swing.JButton ButtonHitung;
    private javax.swing.JLabel background;
    private javax.swing.JTable belanjatabel;
    private com.toedter.calendar.JDateChooser date1;
    private com.toedter.calendar.JDateChooser date2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton kembalibtn;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField totaluntungField;
    // End of variables declaration//GEN-END:variables
}
