
import java.awt.Color;
import java.sql.Statement;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import koneksi.konek;

public class data extends javax.swing.JFrame {


    public data() {
        initComponents();
        makanan();
        minuman();

    }
    
     editt data = new editt();
     
 
    
 
    public void makanan(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Makanan");
        tbl.addColumn("Harga");
        tbl.addColumn("Stok");
        makanan.setModel(tbl);
        makanan.getTableHeader().setBackground(new Color(115,206,191));
        makanan.getTableHeader().setForeground(new Color(255,255,255));
        try {
            Statement st = konek.GetConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT nama_menu, harga, stok FROM menu WHERE kode_menu LIKE '%MA%'");
            while(rs.next()){
                tbl.addRow(new Object[]{
                    rs.getString("nama_menu"),
                    rs.getString("harga"),
                    rs.getString("stok")
                });
                makanan.setModel(tbl);
            }
        } catch (Exception e) {
        }
    }
    public void minuman(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Minuman");
        tbl.addColumn("Harga");
        tbl.addColumn("Stok");
        minuman.setModel(tbl);
        minuman.getTableHeader().setBackground(new Color(115,206,191));
        minuman.getTableHeader().setForeground(new Color(255,255,255));
        try {
            Statement st = konek.GetConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT nama_menu, harga, stok FROM menu WHERE kode_menu LIKE '%MI%'");
            while(rs.next()){
                tbl.addRow(new Object[]{
                    rs.getString("nama_menu"),
                    rs.getString("harga"),
                    rs.getString("stok")
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

        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tambah_menu = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        minuman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Minuman", "Harga", "Stok"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        minuman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minumanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(minuman);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 240, 220));

        makanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Makanan", "Harga", "Stok"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        makanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                makananMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(makanan);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 240, 220));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kembali");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 780, 40));

        tambah_menu.setBackground(new java.awt.Color(0, 153, 153));
        tambah_menu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tambah_menu.setForeground(new java.awt.Color(255, 255, 255));
        tambah_menu.setText("Tambah");
        tambah_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambah_menuActionPerformed(evt);
            }
        });
        getContentPane().add(tambah_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/111.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 850, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void makananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_makananMouseClicked
        int index = makanan.getSelectedRow();
        editt p = new editt();
        TableModel model = makanan.getModel();
        String makanan = model.getValueAt(index, 0).toString();
        String harga = model.getValueAt(index, 1).toString();
       
        p.setVisible(true);
        p.pack();
        
        p.txt_nama.setText(makanan);
        p.txt_harga.setText(harga);
                try {
            Statement st = konek.GetConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT kode_menu FROM menu WHERE nama_menu = '"+makanan+"';");
            if(rs.next()){
              String kode_menu = rs.getString("kode_menu");
              
              
              p.txt_kode.setText(kode_menu);
              p.txt_kode.disable();
              
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_makananMouseClicked

    private void minumanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minumanMouseClicked
         int index = minuman.getSelectedRow();
        editt p = new editt();
        TableModel model = minuman.getModel();
        String minuman = model.getValueAt(index, 0).toString();
        String harga = model.getValueAt(index, 1).toString();
        
        p.setVisible(true);
        p.pack();
 
        p.txt_nama.setText(minuman);
        p.txt_harga.setText(harga);
                try {
            Statement st = konek.GetConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT kode_menu FROM menu WHERE nama_menu = '"+minuman+"';");
            if(rs.next()){
              String kode_menu = rs.getString("kode_menu");

              
              p.txt_kode.setText(kode_menu);
              p.txt_kode.disable();

            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_minumanMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dashboard_admin d = new dashboard_admin();
        d.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void tambah_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambah_menuActionPerformed
        this.setVisible(false);
        new tamba().setVisible(true);
    }//GEN-LAST:event_tambah_menuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static final javax.swing.JTable makanan = new javax.swing.JTable();
    public static final javax.swing.JTable minuman = new javax.swing.JTable();
    private javax.swing.JButton tambah_menu;
    // End of variables declaration//GEN-END:variables
}
