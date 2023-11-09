import java.awt.Color;
import java.sql.Statement;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import koneksi.konek;

public class menu_kariawan extends javax.swing.JFrame {

    public menu_kariawan() {
        initComponents();
        makanan();
        minuman();
        background();
        chart();
    }
    public void chart(){
       ImageIcon ii = new ImageIcon(getClass().getResource("icon/chart2.png"));
       Image image = (ii).getImage().getScaledInstance(chart.getWidth(), chart.getHeight(), Image.SCALE_SMOOTH);
       ii = new ImageIcon(image);
       chart.setIcon(ii);
    }
    public void background(){
       ImageIcon ii = new ImageIcon(getClass().getResource("icon/menu.png"));
       Image image = (ii).getImage().getScaledInstance(design.getWidth(), design.getHeight(), Image.SCALE_SMOOTH);
       ii = new ImageIcon(image);
       design.setIcon(ii);
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
        } catch (Exception e) {
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        keluar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        minuman = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        makanan = new javax.swing.JTable();
        chart = new javax.swing.JLabel();
        design = new javax.swing.JLabel();

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

        jPanel1.setBackground(new java.awt.Color(115, 206, 191));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        keluar.setForeground(new java.awt.Color(255, 255, 255));
        keluar.setText("Keluar");
        keluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keluarMouseClicked(evt);
            }
        });
        jPanel1.add(keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(731, 6, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 800, 30));

        minuman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Minuman", "Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(minuman);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 240, 220));

        makanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Makanan", "Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(makanan);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 240, 220));
        getContentPane().add(chart, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 390, 60, 60));
        getContentPane().add(design, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            Font fn = Font.createFont(Font.TRUETYPE_FONT,getClass().getResourceAsStream("font/Inter-Bold.otf"));
            fn = fn.deriveFont(Font.PLAIN,12);
            keluar.setFont(fn);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_formWindowOpened

    private void keluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keluarMouseClicked
        this.setVisible(false);
        login_page login = new login_page();
        login.setVisible(true);
    }//GEN-LAST:event_keluarMouseClicked

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
            java.util.logging.Logger.getLogger(menu_kariawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_kariawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_kariawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_kariawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_kariawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chart;
    private javax.swing.JLabel design;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel keluar;
    private javax.swing.JTable makanan;
    private javax.swing.JTable minuman;
    // End of variables declaration//GEN-END:variables
}
