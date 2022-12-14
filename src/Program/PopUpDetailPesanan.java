/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daffa Afifi Syahrony
 */
public class PopUpDetailPesanan extends javax.swing.JDialog {

    private DefaultTableModel barangpesanan;
    String id = "";
    /**
     * Creates new form PopUpDetailPesanan
     */
    public PopUpDetailPesanan(JFrame frame, String id) {
        super(frame, true);
        this.id = id;
        initComponents();
        this.setLocationRelativeTo(frame);
        System.out.println(id);
        
        jTable1.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 14));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.setRowHeight(25);
        jTable1.getTableHeader().setBackground(new Color(44,107,52));
        jTable1.getTableHeader().setForeground(new Color(255,255,255));
        
        barangpesanan = new DefaultTableModel ( );
        jTable1.setModel(barangpesanan);
        barangpesanan.addColumn("NO");
        barangpesanan.addColumn("ID BARANG");
        barangpesanan.addColumn("MOTIF");
        barangpesanan.addColumn("WARNA");
        barangpesanan.addColumn("PANJANG KAIN");
        barangpesanan.addColumn("HARGA");
        barangpesanan.addColumn("ID BARANG");
        motifFromDataBaseToComboBox();
        getdataBarangPesanan();
        motifff();
        jPanel2.setVisible(false);
    }
    
    private void motifff(){
        jTextField1.setText(jTextField2.getText());
    }
    
    
    public void motifFromDataBaseToComboBox(){
             
        try {
            String sql = "SELECT motifbatik.Motif FROM motifbatik ORDER by motifbatik.Motif asc";
            java.sql.Connection conn = (com.mysql.jdbc.Connection)koneksi.getKoneksi();
            java.sql.Statement stm= conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                Object[] ob = new Object[4];
                ob[0] = res.getString(1);
                jComboBox1.addItem((String) ob[0]);
                
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    private void getdataBarangPesanan(){
        int a = 1;
        barangpesanan.getDataVector().removeAllElements();
        barangpesanan.getDataVector().removeAllElements();
        try {
        java.sql.Connection conn=(com.mysql.jdbc.Connection)koneksi.getKoneksi();
        String sql = "select id_barang, detail_pemesanan.id_pemesanan, detail_pemesanan.id_barangPesanan, motifbatik.Motif, barangPesanan.warna, barangPesanan.panjangKain, barangPesanan.harga from detail_pemesanan JOIN barangPesanan on detail_pemesanan.id_barangPesanan=barangPesanan.id_barangPesanan JOIN motifbatik ON barangpesanan.id_motif = motifbatik.id_motif where id_pemesanan = '" + id + "'";
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet res = pst.executeQuery(sql);
         while(res.next()){
               Object[] obj = new Object[7];
               obj[0] = a++;
               obj[1] = res.getString("detail_pemesanan.id_barangPesanan");
               obj[2] = res.getString("motifbatik.Motif");
               obj[3] = res.getString("barangPesanan.warna");
               obj[4] = res.getString("barangPesanan.panjangKain");
               obj[5] = res.getString("barangPesanan.harga");
               obj[6] = res.getString(1);
               barangpesanan.addRow(obj);
         }
        } catch (Exception e) {
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

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtWarna = new javax.swing.JTextField();
        txtPK = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtMotif = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setGridColor(new java.awt.Color(197, 210, 197));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(244, 171, 78));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 470, 190));

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 10, 20, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DetailPesanan.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jComboBox1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 200, 40));

        txtWarna.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtWarna.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtWarna.setMargin(new java.awt.Insets(2, 5, 2, 2));
        jPanel2.add(txtWarna, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 200, 40));

        txtPK.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtPK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtPK, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 200, 40));

        txtHarga.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtHarga.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 200, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Warna");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Panjang Kain");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Harga");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Motif");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 4, 30, 30));

        jButton1.setBackground(new java.awt.Color(44, 107, 52));
        jButton1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton1.setText("Update");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 80, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DetailPesanan.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txtMotif.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtMotif.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtMotif, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 200, 40));

        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(null);
        jTextField2.setOpaque(false);
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 150, -1));

        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("jTextField1");
        jTextField1.setBorder(null);
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel3, "card4");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here: 
        jPanel1.setVisible(false);
        jPanel2.setVisible(true);
        
        int baris = jTable1.getSelectedRow();
        jTextField1.setText(jTable1.getValueAt(baris, 1).toString());
        txtMotif.setText(jTable1.getValueAt(baris, 2).toString());
        txtWarna.setText(jTable1.getValueAt(baris, 3).toString());
        txtPK.setText(jTable1.getValueAt(baris, 4).toString());
        txtHarga.setText(jTable1.getValueAt(baris, 5).toString());
        jTextField2.setText(jTable1.getValueAt(baris, 1).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        jPanel2.setVisible(false);
        jPanel1.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
        String sql ="UPDATE barangPesanan "
                + "SET id_motif = '"+txtMotif.getText()+
                "', warna = '"+txtWarna.getText()+
                "', panjangKain = '"+txtPK.getText()+
                "', harga = '"+txtHarga.getText()+
                "'WHERE barangPesanan.id_barangPesanan = '"+jTextField1.getText()+"'";
        java.sql.Connection conn=(com.mysql.jdbc.Connection)koneksi.getKoneksi();
        java.sql.PreparedStatement pst=conn.prepareStatement(sql);
        pst.execute();
        jPanel2.setVisible(false);
        jPanel1.setVisible(true);
        JOptionPane.showMessageDialog(null, "Data Berhasil di Edit");
    } catch (Exception e){
       JOptionPane.showMessageDialog(null, "Perubahan Data Gagal (Pilih Kembali Motif)"
               
        );
    }
        getdataBarangPesanan();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        try {
            String sql = "SELECT id_motif FROM motifbatik WHERE motifbatik.Motif = '"+jComboBox1.getSelectedItem()+"'";
            java.sql.Connection conn = (Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet res = pst.executeQuery();
            while (res.next()) {                
                txtMotif.setText(res.getString(1));
            }
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(PopUpDetailPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopUpDetailPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopUpDetailPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopUpDetailPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PopUpDetailPesanan dialog = new PopUpDetailPesanan(new javax.swing.JFrame(), null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtMotif;
    private javax.swing.JTextField txtPK;
    private javax.swing.JTextField txtWarna;
    // End of variables declaration//GEN-END:variables
}
