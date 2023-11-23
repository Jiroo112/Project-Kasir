
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
  }
 public void data_table() {
    DefaultTableModel tbl = new DefaultTableModel();
    tbl.addColumn("Tanggal");
    tbl.addColumn("Modal");
    tbl.addColumn("Keterangan");
    tbl.addColumn("Pemasukan");
    tabel.setModel(tbl);

    try {
      Statement statement = konek.GetConnection().createStatement();
    ResultSet res = statement.executeQuery(
            "SELECT transaksi.tgl_transaksi, modal.modal, modal.keterangan, transaksi.total " +
            "FROM transaksi LEFT JOIN modal ON transaksi.tgl_transaksi = modal.tanggal");
               
        
          while (res.next()) {
        tbl.addRow(new Object[]{
                res.getDate("tgl_transaksi"),
                res.getInt("modal"),
                res.getString("keterangan"),
                res.getString("total")
        });
    }
    tabel.setModel(tbl);

} catch (Exception e) {
    JOptionPane.showMessageDialog(rootPane, "Error: " + e.getMessage());
    e.printStackTrace();
}
}
  public  double modal(String tanggal1, String tanggal2) {
    double nilaiModal = 0.0;
    try {
        String query = "SELECT SUM(modal) AS total_modal FROM modal WHERE tanggal BETWEEN ? AND ?";
        PreparedStatement preparedStatement = konek.GetConnection().prepareStatement(query);

        preparedStatement.setString(1, tanggal1);
        preparedStatement.setString(2, tanggal2);

        ResultSet res = preparedStatement.executeQuery();

        while (res.next()) {
            nilaiModal = res.getDouble("total_modal");
            fieldModal.setText(String.valueOf(nilaiModal));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return modal; 
    
}
  public  double transaksi(String tanggal1, String tanggal2) {
    double nilaiTotal = 0.0;
    try {
        String query = "SELECT SUM(total) AS total_transaksi FROM transaksi WHERE tgl_transaksi BETWEEN ? AND ?";
        PreparedStatement preparedStatement = konek.GetConnection().prepareStatement(query);

        preparedStatement.setString(1, tanggal1);
        preparedStatement.setString(2, tanggal2);

        ResultSet res = preparedStatement.executeQuery();

        while (res.next()) {
            nilaiTotal = res.getDouble("total_transaksi");
            totalField.setText(String.valueOf(nilaiTotal));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
      return transaksi; 
 
  }
 
   public void Keuntungan(String tanggal1, String tanggal2) {
       
    double modalValue = Double.parseDouble(fieldModal.getText());
    double transaksiValue = Double.parseDouble(totalField.getText());

    double keuntungan = transaksiValue - modalValue;
    keuntunganField.setText(String.valueOf(keuntungan));

  /* private void refresh() {
  
          fieldModal.setText("");
          totalField.setText("");
          keuntunganField.setText("");
  
          date1.setDate(null);
         date2.setDate(null);*/
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        date1 = new com.toedter.calendar.JDateChooser();
        date2 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ButtonHitung = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        fieldModal = new javax.swing.JTextField();
        totalField = new javax.swing.JTextField();
        keuntunganField = new javax.swing.JTextField();
        BelanjaMentah = new javax.swing.JButton();
        kembalibtn = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        date1.setDateFormatString("yyyy-MM- dd");
        date1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                date1MouseClicked(evt);
            }
        });
        jPanel1.add(date1);
        date1.setBounds(60, 100, 280, 30);

        date2.setDateFormatString("yyyy-MM- dd");
        date2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                date2MouseClicked(evt);
            }
        });
        jPanel1.add(date2);
        date2.setBounds(450, 100, 300, 30);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setText("Perhitungan Keuntungan");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(200, 20, 390, 47);

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setText("sampai tanggal");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(540, 70, 140, 30);

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setText("dari tanggal");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(130, 70, 110, 30);

        ButtonHitung.setText("Hitung");
        ButtonHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHitungActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonHitung);
        ButtonHitung.setBounds(560, 150, 120, 30);

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setText("Modal");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 150, 110, 24);

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setText("Pemasukan");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 190, 160, 24);

        jLabel6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel6.setText("Keuntungan");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 230, 150, 24);

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tanggal", "Modal", "Keterangan", "Pemasukan"
            }
        ));
        tabel.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tabel);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 300, 730, 190);

        fieldModal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldModalActionPerformed(evt);
            }
        });
        jPanel1.add(fieldModal);
        fieldModal.setBounds(220, 150, 320, 30);

        totalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalFieldActionPerformed(evt);
            }
        });
        jPanel1.add(totalField);
        totalField.setBounds(220, 190, 320, 30);

        keuntunganField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keuntunganFieldActionPerformed(evt);
            }
        });
        jPanel1.add(keuntunganField);
        keuntunganField.setBounds(220, 230, 320, 30);

        BelanjaMentah.setText("Belanja Mentah");
        BelanjaMentah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BelanjaMentahActionPerformed(evt);
            }
        });
        jPanel1.add(BelanjaMentah);
        BelanjaMentah.setBounds(560, 190, 120, 30);

        kembalibtn.setText("kembali");
        kembalibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembalibtnActionPerformed(evt);
            }
        });
        jPanel1.add(kembalibtn);
        kembalibtn.setBounds(560, 230, 120, 30);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Picture1.png"))); // NOI18N
        jPanel1.add(background);
        background.setBounds(0, 0, 810, 510);

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

    private void fieldModalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldModalActionPerformed
       
    }//GEN-LAST:event_fieldModalActionPerformed

    private void ButtonHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHitungActionPerformed
    String tanggalPattern = "yyyy-MM-dd";
    SimpleDateFormat dateFormat = new SimpleDateFormat(tanggalPattern);

         String tanggal1 = dateFormat.format(date1.getDate());
    String tanggal2 = dateFormat.format(date2.getDate());

    modal(tanggal1, tanggal2);
    transaksi(tanggal1, tanggal2);
    Keuntungan(tanggal1, tanggal2); // Panggil metode Keuntungan

    try{
   String sqlQry = "SELECT transaksi.tgl_transaksi, modal.modal, modal.keterangan, transaksi.total " +
                    "FROM transaksi LEFT JOIN modal ON transaksi.tgl_transaksi = modal.tanggal " +
                    "WHERE transaksi.tgl_transaksi BETWEEN ? AND ? " +
                    "GROUP BY transaksi.tgl_transaksi";

    PreparedStatement statement = konek.GetConnection().prepareStatement(sqlQry);
    statement.setString(1, tanggal1);
    statement.setString(2, tanggal2);

    ResultSet res = statement.executeQuery();

    DefaultTableModel tbl = new DefaultTableModel();
    tbl.addColumn("Tanggal");
    tbl.addColumn("Modal");
    tbl.addColumn("Keterangan");
    tbl.addColumn("Pemasukan");

    while (res.next()) {
        tbl.addRow(new Object[]{
                res.getDate("tgl_transaksi"),
                res.getInt("modal"), 
                res.getString("keterangan"),
                res.getString("total")
        });
    }
    tabel.setModel(tbl);

} catch (Exception e) {
    JOptionPane.showMessageDialog(rootPane, "Error: " + e.getMessage());
    e.printStackTrace();
}
    }//GEN-LAST:event_ButtonHitungActionPerformed

    private void totalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalFieldActionPerformed

    private void keuntunganFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keuntunganFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keuntunganFieldActionPerformed

    private void BelanjaMentahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BelanjaMentahActionPerformed
        BelanjaMentah belanja = new BelanjaMentah();
        belanja.setVisible(true);
        dispose();
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
    private com.toedter.calendar.JDateChooser date1;
    private com.toedter.calendar.JDateChooser date2;
    private javax.swing.JTextField fieldModal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kembalibtn;
    private javax.swing.JTextField keuntunganField;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField totalField;
    // End of variables declaration//GEN-END:variables
}
