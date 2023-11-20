

import com.mysql.cj.jdbc.Driver;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import koneksi.konek;
/**
 *
 * @author oser
 */
public class data extends javax.swing.JFrame {

    /**
     * Creates new form data
     */
    public data() {
        initComponents();
        makanan();
        minuman();
    }

    public void makanan(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Makanan");
        tbl.addColumn("Harga");
        makanan.setModel(tbl);
        makanan.getTableHeader().setBackground(new Color(115,206,191));
        makanan.getTableHeader().setForeground(new Color(255,255,255));
        try {
            Statement st = konek.GetConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT nama_menu, harga FROM menu WHERE kode_menu LIKE '%MA%'");
            while(rs.next()){
                tbl.addRow(new Object[]{
                    rs.getString("nama_menu"),
                    rs.getString("harga")
                });
            }
        } catch (Exception e) {
        }
    }
    public void minuman(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Minuman");
        tbl.addColumn("Harga");
        minuman.setModel(tbl);
        minuman.getTableHeader().setBackground(new Color(115,206,191));
        minuman.getTableHeader().setForeground(new Color(255,255,255));
        try {
            Statement st = konek.GetConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT nama_menu, harga FROM menu WHERE kode_menu LIKE '%MI%'");
            while(rs.next()){
                tbl.addRow(new Object[]{
                    rs.getString("nama_menu"),
                    rs.getString("harga")
                });
                minuman.setModel(tbl);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        makanan = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        minuman = new javax.swing.JTable();
        keluar = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        tambah_menu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(null);

        makanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Makanan", "Harga"
            }
        ));
        makanan.setEnabled(false);
        makanan.setGridColor(new java.awt.Color(0, 0, 0));
        makanan.setRowHeight(25);
        makanan.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(makanan);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(70, 150, 271, 220);

        minuman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Minuman", "Harga"
            }
        ));
        minuman.setEnabled(false);
        minuman.setGridColor(new java.awt.Color(0, 0, 0));
        minuman.setRowHeight(25);
        minuman.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(minuman);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(430, 150, 280, 220);

        keluar.setBackground(new java.awt.Color(0, 153, 153));
        keluar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        keluar.setForeground(new java.awt.Color(255, 255, 255));
        keluar.setText("Kembali");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        jPanel2.add(keluar);
        keluar.setBounds(630, 430, 90, 27);

        edit.setBackground(new java.awt.Color(0, 153, 153));
        edit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setText("edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel2.add(edit);
        edit.setBounds(410, 430, 80, 27);

        tambah_menu.setBackground(new java.awt.Color(0, 153, 153));
        tambah_menu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tambah_menu.setForeground(new java.awt.Color(255, 255, 255));
        tambah_menu.setText("Tambah");
        tambah_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambah_menuActionPerformed(evt);
            }
        });
        jPanel2.add(tambah_menu);
        tambah_menu.setBounds(520, 430, 90, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 500);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        dashboard_admin db = new dashboard_admin();
        this.setVisible(false);
        db.setVisible(true);
        db.pack();
    }//GEN-LAST:event_keluarActionPerformed

    private void tambah_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambah_menuActionPerformed
        this.setVisible(false);
        new tambah().setVisible(true);
    }//GEN-LAST:event_tambah_menuActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        this.setVisible(false);
        new edit().setVisible(true);
    }//GEN-LAST:event_editActionPerformed

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
                if ("Default".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton keluar;
    private javax.swing.JTable makanan;
    private javax.swing.JTable minuman;
    private javax.swing.JButton tambah_menu;
    // End of variables declaration//GEN-END:variables

}
