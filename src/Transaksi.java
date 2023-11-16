import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import koneksi.konek;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;


public class Transaksi extends javax.swing.JFrame {

    public Transaksi() {
        initComponents();
        table();
        invoice();
        tanggal();
        total();
        usr();
    }
    
    private double total1;
    private double jumlah;
    private String kode_menu1;
    
    private String nama;
    public void setNama(String usr){
        String strnama = usr;
        this.nama = strnama;
    }    
    public void usr(){
        if(nama==null){
            try {
                Statement st = konek.GetConnection().createStatement();
                ResultSet rs = st.executeQuery("SELECT MAX(username) AS user FROM transaksi");
                rs.next();
                nama = rs.getString("user");
                username.setText(nama);
            } catch (Exception e) {
            }
        }
}
    public void table(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Nama menu");
        tbl.addColumn("Qty");
        tbl.addColumn("subtotal");
        tbl.addColumn("Layanan");
        detail.setModel(tbl);
        detail.getTableHeader().setBackground(new Color(115,206,191));
        detail.getTableHeader().setForeground(new Color(255,255,255));
        
        try {
            Statement st = konek.GetConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT  menu.nama_menu, detail_transaksi.jumlah, detail_transaksi.subtotal, detail_transaksi.layanan_transaksi FROM detail_transaksi JOIN menu ON detail_transaksi.kode_menu=menu.kode_menu WHERE detail_transaksi.kode_transaksi = (SELECT MAX(kode_transaksi) FROM detail_transaksi);");
            while(rs.next()){
                tbl.addRow(new Object[]{
                     rs.getString("nama_menu"),
                     rs.getString("jumlah"),
                     rs.getString("subtotal"),
                     rs.getString("layanan_transaksi")
                });
            }
        } catch (Exception e) {
        }
    }
    public void invoice(){
        try {
            Statement st = konek.GetConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT MAX(kode_transaksi) AS kode FROM transaksi");
            rs.next();
            String id = rs.getString("kode");
            invoice.setText(id);
        } catch (Exception e) {
        }
    }
    public void tanggal(){
        try {
            Statement st = konek.GetConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT MAX(tgl_transaksi) AS tgl FROM transaksi");
            rs.next();
            String tgl1 = rs.getString("tgl");
            tgl.setText(tgl1);
        } catch (Exception e) {
        }
    }
    public void total(){
        try {
            Statement st = konek.GetConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT SUM(subtotal) AS total FROM detail_transaksi WHERE kode_transaksi = (SELECT MAX(kode_transaksi)FROM detail_transaksi)");
            rs.next();
            total1 = rs.getDouble("total");
            total.setText(String.valueOf(total1));
        } catch (Exception e) {
        }
    }
    
    private void kode_menu(){
        int index = detail.getSelectedRow();
        TableModel model = detail.getModel();
        String menu = model.getValueAt(index, 0).toString();
        
        try {
            Statement st = konek.GetConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT kode_menu FROM menu WHERE nama_menu = '"+menu+"';");
            if(rs.next()){
                kode_menu1 = rs.getString("kode_menu");
            }
            rs.close();
        } catch (Exception e) {
        }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detail = new javax.swing.JTable();
        delete = new javax.swing.JLabel();
        save = new javax.swing.JLabel();
        tgl = new javax.swing.JLabel();
        invoice = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        bayar = new javax.swing.JTextField();
        kembali = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        detail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode transaksi", "Nama makanan", "Qty", "Subtotal"
            }
        ));
        jScrollPane1.setViewportView(detail);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(140, 180, 452, 190);

        delete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delete.setText("Hapus");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(640, 310, 90, 30);

        save.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        save.setText("Simpan");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });
        jPanel1.add(save);
        save.setBounds(640, 250, 90, 40);

        tgl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tgl.setForeground(new java.awt.Color(255, 255, 255));
        tgl.setText("2023-11-01");
        jPanel1.add(tgl);
        tgl.setBounds(500, 130, 130, 30);

        invoice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        invoice.setForeground(new java.awt.Color(255, 255, 255));
        invoice.setText("T-001");
        jPanel1.add(invoice);
        invoice.setBounds(260, 130, 90, 30);

        username.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(username);
        username.setBounds(100, 40, 90, 30);

        bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarActionPerformed(evt);
            }
        });
        bayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bayarKeyPressed(evt);
            }
        });
        jPanel1.add(bayar);
        bayar.setBounds(360, 390, 90, 30);

        kembali.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kembali.setForeground(new java.awt.Color(0, 167, 157));
        jPanel1.add(kembali);
        kembali.setBounds(580, 380, 120, 40);

        total.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        total.setForeground(new java.awt.Color(0, 167, 157));
        total.setText("5000000");
        jPanel1.add(total);
        total.setBounds(180, 390, 70, 25);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transaksi 2.png"))); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(0, 0, 800, 500);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bayarActionPerformed

    private void bayarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bayarKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            String a = bayar.getText();
            double b = Double.valueOf(a);
            jumlah = b - total1;
            kembali.setText(String.valueOf(jumlah));
        }
    }//GEN-LAST:event_bayarKeyPressed

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        kode_menu();
        try {
            Statement st = konek.GetConnection().createStatement();
            st.executeUpdate("DELETE FROM detail_transaksi WHERE kode_menu = ('" + kode_menu1 + "');");
            JOptionPane.showMessageDialog(this, "data dihapus");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        table();
        total();
    }//GEN-LAST:event_deleteMouseClicked

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        String a = bayar.getText();
        double b = Double.valueOf(a);
        String name = username.getText();
        String id = invoice.getText();
        
        try {
            Statement st = konek.GetConnection().createStatement();
            st.executeUpdate("UPDATE transaksi SET username = '"+name+"', total = '"+total1+"', bayar = '"+b+"', kembalian = '"+jumlah+"' WHERE kode_transaksi = '"+id+"'");
            JOptionPane.showMessageDialog(null, "Berhasil");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        menu_kariawan kry = new menu_kariawan();
        System.out.println(name);
        this.setVisible(false);
        kry.setVisible(true);
    }//GEN-LAST:event_saveMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        invoice();
        table();
        total();
        tanggal();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaksi().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bayar;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel delete;
    private javax.swing.JTable detail;
    private javax.swing.JLabel invoice;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kembali;
    private javax.swing.JLabel save;
    private javax.swing.JLabel tgl;
    private javax.swing.JLabel total;
    public javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
