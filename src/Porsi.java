import java.awt.Image;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import koneksi.konek;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Porsi extends javax.swing.JFrame {

    public Porsi() {
        initComponents();
    }
        
    private double price;
    public void setHarga(String harga){
        double intharga = Double.parseDouble(harga);
        this.price = intharga;
    }
    private String menu;
    public void setMenu(String menu){
        String strmenu = menu;
        this.menu = strmenu;
    }
    
    public String kode_menu;
    public String kode_trans;
    public double subtotal;
    public double porsi;
    
    private void kode_menu(){
        try {
            Statement st = konek.GetConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT kode_menu FROM menu WHERE nama_menu = '"+menu+"';");
            if(rs.next()){
                kode_menu = rs.getString("kode_menu");
            }
            rs.close();
        } catch (Exception e) {
        }
    }
    private void invoice(){
        try {
            Statement st = konek.GetConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT MAX(kode_transaksi) AS kode_transaksi FROM transaksi");
            if(rs.next()){
                kode_trans = rs.getString("kode_transaksi");
            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        makanan = new javax.swing.JLabel();
        RP = new javax.swing.JLabel();
        harga = new javax.swing.JLabel();
        gambar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        layanan = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jumlah = new javax.swing.JTextField();
        beli = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        makanan.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        makanan.setForeground(new java.awt.Color(255, 255, 255));
        makanan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(makanan);
        makanan.setBounds(30, 160, 300, 30);

        RP.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        RP.setForeground(new java.awt.Color(255, 255, 255));
        RP.setText("Harga  :");
        jPanel1.add(RP);
        RP.setBounds(130, 190, 70, 20);

        harga.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        harga.setForeground(new java.awt.Color(255, 255, 255));
        harga.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(harga);
        harga.setBounds(180, 190, 190, 20);

        gambar.setForeground(new java.awt.Color(255, 255, 255));
        gambar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gambar.setText("130px x 140px");
        jPanel1.add(gambar);
        gambar.setBounds(110, 220, 130, 150);
        gambar.getAccessibleContext().setAccessibleDescription("");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Makan dimana?          :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(340, 210, 180, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jumlah                         :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(340, 250, 160, 16);

        layanan.setBackground(new java.awt.Color(255, 255, 255));
        layanan.setForeground(new java.awt.Color(0, 0, 0));
        layanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dine-in", "Take way" }));
        layanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                layananActionPerformed(evt);
            }
        });
        jPanel1.add(layanan);
        layanan.setBounds(510, 210, 120, 22);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total                            :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(340, 290, 160, 20);

        total.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(total);
        total.setBounds(510, 290, 140, 20);

        jumlah.setBackground(new java.awt.Color(255, 255, 255));
        jumlah.setForeground(new java.awt.Color(0, 0, 0));
        jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahActionPerformed(evt);
            }
        });
        jumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jumlahKeyPressed(evt);
            }
        });
        jPanel1.add(jumlah);
        jumlah.setBounds(510, 250, 120, 22);

        beli.setBackground(new java.awt.Color(0, 204, 204));
        beli.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        beli.setForeground(new java.awt.Color(255, 255, 255));
        beli.setText("Beli");
        beli.setBorder(null);
        beli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beliActionPerformed(evt);
            }
        });
        jPanel1.add(beli);
        beli.setBounds(590, 340, 90, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transaksi.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 500);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void layananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_layananActionPerformed
        
    }//GEN-LAST:event_layananActionPerformed

    private void jumlahKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumlahKeyPressed
        DecimalFormat df = new DecimalFormat("#.##");
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            String strporsi = jumlah.getText();
             porsi = Double.parseDouble(strporsi);
             subtotal = porsi*price;
            total.setText(String.valueOf(df.format(subtotal)));
        }
        
    }//GEN-LAST:event_jumlahKeyPressed

    private void beliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beliActionPerformed
        invoice();
        kode_menu();
        String lyn = layanan.getSelectedItem().toString();
        
        
         try {
             Statement statement = (Statement) konek.GetConnection().createStatement();
             String sql= "INSERT INTO detail_transaksi VALUES('"+kode_trans+"','"+kode_menu+"','"+lyn+"','"+porsi+"','"+subtotal+"')";
             statement.executeUpdate(sql);
             statement.close();
             JOptionPane.showMessageDialog(null, "data masuk");
             
         }catch(SQLException e){
             JOptionPane.showMessageDialog(null, e.getMessage());
         }
         
         jumlah.setText("");
         total.setText("");
        this.setVisible(false);
        

    }//GEN-LAST:event_beliActionPerformed

    private void jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahActionPerformed

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
            java.util.logging.Logger.getLogger(Porsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Porsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Porsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Porsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Porsi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RP;
    private javax.swing.JButton beli;
    public javax.swing.JLabel gambar;
    public javax.swing.JLabel harga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jumlah;
    private javax.swing.JComboBox<String> layanan;
    public javax.swing.JLabel makanan;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
