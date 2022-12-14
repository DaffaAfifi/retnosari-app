/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import static Program.Mastermotif.Tabelmastermotif;
import static Program.Mastermotif.Txt_NamaMotif;
import static Program.PopUpMotif1.Txt_Gambar;
import static Program.PopUpMotif1.Txt_IdMotif;
import static Program.PopUpMotif1.Txt_Motif;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class MasterJasa extends javax.swing.JFrame {
private DefaultTableModel modeljasa;
    /**
     * Creates new form MasterJasa
     */
    public MasterJasa() {
        initComponents();
        id_autoJasa();
        modeljasa = new DefaultTableModel ( );
        jTable1.setModel(modeljasa);
        modeljasa.addColumn("NO");
        modeljasa.addColumn("Nama Jasa");
        modeljasa.addColumn("Harga");
        
        getDatajasa();
    }

    
     public void id_autoJasa(){
        try{
            java.sql.Connection c = koneksi.getKoneksi();
            Statement stat= c.createStatement();
            
            String sql ="select max(right(id_jasa,4))as no from jasa";//query select data yang paling akhir
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()){
                if (rs.first()==false){
                    Id_MasterJasa1.setText("IDJ0001");//jika data masih kosong maka akan menampilkan
                }else{
                    rs.last();//jika ada data maka membuat id baru
                    int set_id = rs.getInt(1)+1;
                    String no = String.valueOf(set_id);
                    int id_next = no.length();
                    for (int a=0; a<4-id_next; a++){
                        no = "0"+no;
                    }
                    Id_MasterJasa1.setText("IDJ"+no);
                }
            }
        }catch (SQLException ex){
//            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     private void getDatajasa(){
        int a = 1;
        modeljasa.getDataVector().removeAllElements();
        modeljasa.getDataVector().removeAllElements();
        try {
        java.sql.Connection conn=(com.mysql.jdbc.Connection)koneksi.getKoneksi();
        String sql = "SELECT nama_jasa, harga FROM jasa";
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet res = pst.executeQuery(sql);
         while(res.next()){
               Object[] obj = new Object[3];
               obj[0] = a++;
               obj[1] = res.getString(1);
               obj[2] = res.getString(2);
               
             
               modeljasa.addRow(obj);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        Txt_HargaJasa = new javax.swing.JTextField();
        Txt_NamaJasa = new javax.swing.JTextField();
        Btn_Hapus = new javax.swing.JLabel();
        Btn_Edit = new javax.swing.JLabel();
        Btn_Tambah = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Id_MasterJasa1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 30, 30));

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
        jTable1.setSelectionBackground(new java.awt.Color(244, 171, 78));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 260, 180));

        jTextField1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField1.setText("Rp");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 30, 30));

        Txt_HargaJasa.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Txt_HargaJasa.setBorder(null);
        jPanel1.add(Txt_HargaJasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 220, 30));

        Txt_NamaJasa.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Txt_NamaJasa.setBorder(null);
        jPanel1.add(Txt_NamaJasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 296, 250, 30));

        Btn_Hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_HapusMouseClicked(evt);
            }
        });
        jPanel1.add(Btn_Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 80, 30));

        Btn_Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_EditMouseClicked(evt);
            }
        });
        jPanel1.add(Btn_Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 80, 30));

        Btn_Tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_TambahMouseClicked(evt);
            }
        });
        jPanel1.add(Btn_Tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 80, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/MasterJasa.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 490));

        Id_MasterJasa1.setForeground(new java.awt.Color(255, 255, 255));
        Id_MasterJasa1.setBorder(null);
        Id_MasterJasa1.setOpaque(false);
        jPanel1.add(Id_MasterJasa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 250, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 490));

        setSize(new java.awt.Dimension(362, 491));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void Btn_TambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_TambahMouseClicked
        try {
            String sql ="INSERT INTO jasa (id_jasa, nama_jasa, harga) VALUES ('"+
                    Id_MasterJasa1.getText()+"','"+
                    Txt_NamaJasa.getText()+"','"+
                    Txt_HargaJasa.getText()+"')";
            java.sql.Connection conn=(com.mysql.jdbc.Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            stm.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan");
        }
        getDatajasa();
        Txt_NamaJasa.setText("");
        Txt_HargaJasa.setText("");
    }//GEN-LAST:event_Btn_TambahMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setVisible(false);
       
        try {
            String sql = "SELECT nama_jasa FROM jasa ORDER BY nama_jasa ASC";
            java.sql.Connection conn = (com.mysql.jdbc.Connection)koneksi.getKoneksi();
            java.sql.Statement stm= conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                Object[] ob = new Object[4];
                ob[0] = res.getString(1);
                DbAdmin.jcomboboxmotif.addItem((String) ob[0]);
                
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    
    }//GEN-LAST:event_jLabel2MouseClicked

    private void Btn_EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_EditMouseClicked
        try {
            String sql ="UPDATE jasa SET nama_jasa = '"+Txt_NamaJasa.getText()+"', harga = '"+Txt_HargaJasa.getText()+"' "
                    + "WHERE id_jasa =  '"+Id_MasterJasa1.getText()+"'";
        java.sql.Connection conn= (com.mysql.jdbc.Connection)koneksi.getKoneksi();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
            JOptionPane.showMessageDialog(this, "Berhasil diupdate");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal diupdate");
        }
        getDatajasa();
        Txt_NamaJasa.setText("");
        Txt_HargaJasa.setText("");
        id_autoJasa();
       
    }//GEN-LAST:event_Btn_EditMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int baris;
    baris = jTable1.rowAtPoint(evt.getPoint());
        try{
        java.sql.Connection conn=(com.mysql.jdbc.Connection)koneksi.getKoneksi();
        String sql = "SELECT id_jasa,nama_jasa,harga FROM jasa WHERE nama_jasa = '"+jTable1.getValueAt(baris, 1)+"'";
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet res = pst.executeQuery(sql);
           while(res.next()){
               Id_MasterJasa1.setText(res.getString(1));
               Txt_NamaJasa.setText(res.getString(2));
               Txt_HargaJasa.setText(res.getString(3));
           }
        } catch(SQLException err){
             JOptionPane.showMessageDialog(null, err.getMessage() );
        } 
    }//GEN-LAST:event_jTable1MouseClicked

    private void Btn_HapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_HapusMouseClicked
         
                try {
            String sql ="DELETE FROM jasa WHERE id_jasa  =  '"+Id_MasterJasa1.getText()+"'";
        java.sql.Connection conn= (com.mysql.jdbc.Connection)koneksi.getKoneksi();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
            JOptionPane.showMessageDialog(this, "Berhasil dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tidak Bisa dihapus");
        }
        getDatajasa();
        Txt_NamaJasa.setText("");
        Txt_HargaJasa.setText("");
        id_autoJasa();
    }//GEN-LAST:event_Btn_HapusMouseClicked

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
            java.util.logging.Logger.getLogger(MasterJasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasterJasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasterJasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasterJasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasterJasa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Btn_Edit;
    private javax.swing.JLabel Btn_Hapus;
    private javax.swing.JLabel Btn_Tambah;
    private javax.swing.JTextField Id_MasterJasa1;
    private javax.swing.JTextField Txt_HargaJasa;
    private javax.swing.JTextField Txt_NamaJasa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
