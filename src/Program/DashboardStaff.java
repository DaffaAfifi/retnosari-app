/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import static Program.DbAdmin.btnAbout1;
import static Program.DbAdmin.btnLogOut1;
import static Program.DbAdmin.chartMingguan;
import static Program.DbAdmin.ddLogOut1;
import static Program.DbAdmin.jTable4;
import static Program.DbAdmin.jTextField8;
import static Program.DbAdmin.jTextField9;
import static Program.DbAdmin.txtBulanpemesanan;
import static Program.DbAdmin.txtIdBPes;
import static Program.DbAdmin.txtIdkarBB;
import static Program.DbAdmin.txtIdkarTrx;
import static Program.DbAdmin.txtIdkarTrx1;
import static Program.DbAdmin.txtIdkarTrx2;
import static Program.DbAdmin.txtIdkarbs;
import static Program.DbAdmin.txtIdkarbs1;
import static Program.DbAdmin.txtIdkarpesan;
import static Program.DbAdmin.txtIdsup;
import static Program.DbAdmin.txtJamPemesanan;
import static Program.DbAdmin.txtTanggal;
import static Program.DbAdmin.txt_Haribeli;
import static Program.DbAdmin.txt_Jambeli;
import static Program.DbAdmin.txt_bulanPenjualan;
import static Program.DbAdmin.txt_bulanbeli;
import static Program.DbAdmin.txt_hariPenjualan;
import static Program.DbAdmin.txt_jamPenjualan;
import static Program.DbAdmin.txtharipemesanan;
import com.barcodelib.barcode.Linear;
import com.mysql.jdbc.CharsetMapping;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.MySQLConnection;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.jdbc.JDBCCategoryDataset;

/**
 *
 * @author Daffa Afifi Syahrony
 */
public class DashboardStaff extends javax.swing.JFrame {

    private DefaultTableModel modelreportpengeluaran;
    private DefaultTableModel modelreportpemasukan;
    private DefaultTableModel modelpemesanan;
    private DefaultTableModel modelprotran;
    
        public ArrayList nambarBB = new ArrayList();
        public ArrayList hargaBB = new ArrayList();
        public ArrayList qtyBB = new ArrayList();
        public ArrayList subtoBB = new ArrayList();
        
        public ArrayList nambarbs = new ArrayList();
        public ArrayList hargabs = new ArrayList();
        public ArrayList qtybs = new ArrayList();
        public ArrayList subtobs = new ArrayList();
        
        public ArrayList motif = new ArrayList();
        public ArrayList warna = new ArrayList();
        public ArrayList PK = new ArrayList();
        public ArrayList harga = new ArrayList();
        
        public ArrayList qtyTrx = new ArrayList();
        public ArrayList nambarTrx = new ArrayList();
        public ArrayList totalTrx = new ArrayList();
    /**
     * Creates new form DbStaff
     */
    public DashboardStaff() {
        initComponents();
        setTitle("RetnosariApp");
        jTable7.setAutoCreateRowSorter(true);
        jTable6.setAutoCreateRowSorter(true);
        txtCariPemesanan.setVisible(false);
            Jtahun.setVisible(true);
            Jbulan.setVisible(false);
            Jbulan1.setVisible(false);
            Jminggu.setVisible(false);
            Jharian.setVisible(false);
            CariHarian.setVisible(false);
            CariTahunan.setVisible(true);
        PopUpQty.setVisible(false);
        txtPopUpQty.setVisible(false);
        
        ddLogOut12.setVisible(false);
        btnLogOut12.setVisible(false);
        btnAbout12.setVisible(false);
        
        ddLogOut3.setVisible(false);
        btnLogOut3.setVisible(false);
        btnAbout3.setVisible(false);
        
        ddLogOut4.setVisible(false);
        btnLogOut4.setVisible(false);
        btnAbout4.setVisible(false);
        
        ddLogOut5.setVisible(false);
        btnLogOut5.setVisible(false);
        btnAbout5.setVisible(false);
        
        ddLogOut6.setVisible(false);
        btnLogOut6.setVisible(false);
        btnAbout6.setVisible(false);
        
        ddLogOut7.setVisible(false);
        btnLogOut7.setVisible(false);
        btnAbout7.setVisible(false);
        
        ddLogOut10.setVisible(false);
        btnLogOut10.setVisible(false);
        btnAbout10.setVisible(false);
        
        ddLogOut11.setVisible(false);
        btnLogOut11.setVisible(false);
        btnAbout11.setVisible(false);
        
        ddLogOut13.setVisible(false);
        btnLogOut13.setVisible(false);
        btnAbout13.setVisible(false);
        
        jTable1.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 14));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.setRowHeight(25);
        
        jTable4.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 14));
        jTable4.getTableHeader().setOpaque(false);
        jTable4.setRowHeight(25);
        jTable4.getTableHeader().setBackground(new Color(44,107,52));
        jTable4.getTableHeader().setForeground(new Color(255,255,255));
        
        jTable5.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 14));
        jTable5.getTableHeader().setOpaque(false);
        jTable5.setRowHeight(25);
        jTable5.getTableHeader().setBackground(new Color(44,107,52));
        jTable5.getTableHeader().setForeground(new Color(255,255,255));
        
        jTable6.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 14));
        jTable6.getTableHeader().setOpaque(false);
        jTable6.setRowHeight(25);
        jTable6.getTableHeader().setBackground(new Color(44,107,52));
        jTable6.getTableHeader().setForeground(new Color(255,255,255));
        
        jTable7.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 14));
        jTable7.getTableHeader().setOpaque(false);
        jTable7.setRowHeight(25);
        jTable7.getTableHeader().setBackground(new Color(44,107,52));
        jTable7.getTableHeader().setForeground(new Color(255,255,255));
        
        jTable8.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 14));
        jTable8.getTableHeader().setOpaque(false);
        jTable8.setRowHeight(25);
        jTable8.getTableHeader().setBackground(new Color(44,107,52));
        jTable8.getTableHeader().setForeground(new Color(255,255,255));
        
        jTable9.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 14));
        jTable9.getTableHeader().setOpaque(false);
        jTable9.setRowHeight(25);
        jTable9.getTableHeader().setBackground(new Color(44,107,52));
        jTable9.getTableHeader().setForeground(new Color(255,255,255));
        
        jTable11.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 16));
        jTable11.getTableHeader().setOpaque(false);
        jTable11.setRowHeight(25);
        jTable11.getTableHeader().setBackground(new Color(44,107,52));
        jTable11.getTableHeader().setForeground(new Color(255,255,255));
        
        modelpemesanan = new DefaultTableModel ( );
        jTable4.setModel(modelpemesanan);
        modelpemesanan.addColumn("NO");
        modelpemesanan.addColumn("ID PEMESANAN");
        modelpemesanan.addColumn("CUSTOMER");
        modelpemesanan.addColumn("PHONE");
        modelpemesanan.addColumn("ALAMAT");
        modelpemesanan.addColumn("TANGGAL PESAN");
        modelpemesanan.addColumn("TOTAL HARGA");
        modelpemesanan.addColumn("STATUS");
        
        modelreportpengeluaran = new DefaultTableModel();
        jTable6.setModel(modelreportpengeluaran);
        modelreportpengeluaran.addColumn("NO");
        modelreportpengeluaran.addColumn("ID PEMBELIAN");
        modelreportpengeluaran.addColumn("NAMA KARYAWAN");
        modelreportpengeluaran.addColumn("TANGGAL PEMBELIAN");
        modelreportpengeluaran.addColumn("NAMA BARANG");
        modelreportpengeluaran.addColumn("QTY");
        modelreportpengeluaran.addColumn("TOTAL"); 
        
        modelreportpemasukan = new DefaultTableModel();
        jTable7.setModel(modelreportpemasukan);
        modelreportpemasukan.addColumn("NO");
        modelreportpemasukan.addColumn("ID PENJUALAN");
        modelreportpemasukan.addColumn("TANGGAL PENJUALAN");
        modelreportpemasukan.addColumn("NAMA KARYAWAN");
        modelreportpemasukan.addColumn("CUSTOMER");
        modelreportpemasukan.addColumn("NAMA BARANG");
        modelreportpemasukan.addColumn("QTY");
        modelreportpemasukan.addColumn("TOTAL");
        
        modelprotran = new DefaultTableModel ( );
        jTable11.setModel(modelprotran);
        modelprotran.addColumn("NO");
        modelprotran.addColumn("ID BARANG");
        modelprotran.addColumn("NAMA BARANG");
        modelprotran.addColumn("SIZE");
        modelprotran.addColumn("MOTIF");
        modelprotran.addColumn("HARGA");
        modelprotran.addColumn("STOK");
        
        jTable4.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTable4.getColumnModel().getColumn(1).setPreferredWidth(120);
        jTable4.getColumnModel().getColumn(2).setPreferredWidth(180);
        jTable4.getColumnModel().getColumn(3).setPreferredWidth(150);
        jTable4.getColumnModel().getColumn(4).setPreferredWidth(150);
        jTable4.getColumnModel().getColumn(5).setPreferredWidth(140);
        jTable4.getColumnModel().getColumn(6).setPreferredWidth(120);
        jTable4.getColumnModel().getColumn(7).setPreferredWidth(90);
        
        jTable6.getColumnModel().getColumn(0).setPreferredWidth(45);
        jTable6.getColumnModel().getColumn(1).setPreferredWidth(155);
        jTable6.getColumnModel().getColumn(2).setPreferredWidth(160);
        jTable6.getColumnModel().getColumn(3).setPreferredWidth(160);
        jTable6.getColumnModel().getColumn(4).setPreferredWidth(240);
        jTable6.getColumnModel().getColumn(5).setPreferredWidth(50);
        jTable6.getColumnModel().getColumn(6).setPreferredWidth(100);
        
        jTable7.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTable7.getColumnModel().getColumn(1).setPreferredWidth(120);
        jTable7.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTable7.getColumnModel().getColumn(3).setPreferredWidth(150);
        jTable7.getColumnModel().getColumn(4).setPreferredWidth(150);
        jTable7.getColumnModel().getColumn(5).setPreferredWidth(250);
        jTable7.getColumnModel().getColumn(6).setPreferredWidth(50);
        jTable7.getColumnModel().getColumn(7).setPreferredWidth(100);
        
        jTable11.getColumnModel().getColumn(0).setPreferredWidth(35);
        jTable11.getColumnModel().getColumn(1).setPreferredWidth(90);
        jTable11.getColumnModel().getColumn(2).setPreferredWidth(170);
        jTable11.getColumnModel().getColumn(3).setPreferredWidth(50);
        jTable11.getColumnModel().getColumn(4).setPreferredWidth(150);
        jTable11.getColumnModel().getColumn(5).setPreferredWidth(80);
        jTable11.getColumnModel().getColumn(6).setPreferredWidth(50);
        
      
     //   pemasukan();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
//        barcodeAuto();
        getDataPemesanan();
        getDataReportPengeluaran();
        getDataReportPemasukan();
        ComboBoxSupplier();
//        ComboBoxBarang();
        getDataBarangTransaksi();
        tanggal();
        JumlahPengeluaran();
        JumlahPemasukan();
//        getStokKP();
        dashboardchartbulanan();
    }

    private void dashboardchartbulanan(){
        PemasukanRBT();
        PengeluaranRBT();
        KeuntunganRBT();
        getdatachartbulanan();
    }
    
    private void KeuntunganRBT(){
        
        if (txt_pemasukan.getText().equals("")) {
            txt_pemasukan.setText("0");
        }if(txt_pengeluaran.getText().equals("")){
            txt_pengeluaran.setText("0");
        }
        int a = Integer.parseInt(txt_pengeluaran.getText());
        int b = Integer.parseInt(txt_pemasukan.getText());
        txt_Keuntungan.setText((""+(b-a))); 
    }
    
    private void PemasukanRBT(){
        try {
            String sql ="SELECT SUM(total_bayar) FROM penjualan WHERE "
                    + "tanggal_penjualan LIKE '%"+jTextField9.getText()+"-"+jTextField8.getText()+"%'"
                    ;
            java.sql.Connection conn = (Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet res = pst.executeQuery();
            while (res.next()) {                
                txt_pemasukan.setText(res.getString(1));
            }
        } catch (Exception e) {
        }if (txt_pemasukan.getText().equals("")) {
            txt_pemasukan.setText("0");
        }
    }
    
    private void PengeluaranRBT(){
        try {
            String sql ="SELECT SUM(total_pembelian) FROM pembelian WHERE tanggal_pembelian LIKE '%"+jTextField9.getText()+"-"+jTextField8.getText()+"%'"
                    ;
            java.sql.Connection conn = (Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet res = pst.executeQuery();
            while (res.next()) {                
                txt_pengeluaran.setText(res.getString(1));
            }
        } catch (Exception e) {
        }if (txt_pengeluaran.getText().equals("")) {
            txt_pengeluaran.setText("0");
        }
    }
    
   private void getdatachartbulanan(){
        try {
            String query = "SELECT DISTINCT  tanggal_penjualan,  SUM(total_bayar) FROM penjualan WHERE "
                    + "tanggal_penjualan LIKE '%"+jTextField9.getText()+"-"+jTextField8.getText()+"%'"
                    + " GROUP BY tanggal_penjualan "
                    + "ORDER BY tanggal_penjualan ASC";
            JDBCCategoryDataset dataset = new JDBCCategoryDataset((Connection)koneksi.getKoneksi(),query);
            
            JFreeChart chart = ChartFactory.createBarChart3D("", "Tanggal Transaksi", "Total Pemasukan (Bulan ini) ", dataset, PlotOrientation.VERTICAL, false, true, true);

        chart.getPlot().setBackgroundPaint(Color.WHITE);
        CategoryPlot plot = chart.getCategoryPlot();
        BarRenderer renderer = (BarRenderer)plot.getRenderer();
        renderer.setSeriesPaint(0, Color.GRAY);
        plot.setRangeGridlinePaint(Color.RED); 
        
        ChartPanel chartpp = new ChartPanel(chart);
        chartMingguan.removeAll();
        chartMingguan.add(chartpp);
        chartMingguan.updateUI(); 
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    
    private boolean cekDataTabelBS(String data){
        boolean hasil = nambarbs.contains(data);
        if(hasil==true) JOptionPane.showMessageDialog(null, "Barang Sudah Ditambahkan sebelumnya");
        return hasil;
    }
    
    public void JumlahPemasukan(){
        Txt_TotalPemasukan.setText("0");
        {
            int sum = 0;
            for (int i = 0; i < jTable7.getRowCount(); i++) {
                {
                    sum = sum +Integer.parseInt(jTable7.getValueAt(i, 7
                    ).toString());
                    
                }   
                Txt_TotalPemasukan.setText(Integer.toString(sum));
            }
            
        }
    }
    
    public void JumlahPengeluaran(){
        Txt_TotalPengeluaran.setText("0");
        {
            int sum = 0;
            for (int i = 0; i < jTable6.getRowCount(); i++) {
                {
                    sum = sum +Integer.parseInt(jTable6.getValueAt(i, 6).toString());
                    
                }   
                Txt_TotalPengeluaran.setText(Integer.toString(sum));
            } 
        }
    }
    
    public void clearFTrx(){
        txtSubtotalF.setText(null);
        txtCustomerF.setText(null);
        txtTPF.setText(null);
        txtReturn.setText(null);
    }
    
    public void id_autoPenjualan(){
        try{
            java.sql.Connection c = koneksi.getKoneksi();
            Statement stat= c.createStatement();
            String sql ="select max(right(id_penjualan,4))as no from penjualan";//query select data yang paling akhir
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()){
                if (rs.first()==false){
                    txtIdPenjualan.setText("IDT0001");//jika data masih kosong maka akan menampilkan
                    txtKodebarPesan1.setText("IDT0001");
                }else{
                    rs.last();//jika ada data maka membuat id baru
                    int set_id = rs.getInt(1)+1;
                    String no = String.valueOf(set_id);
                    int id_next = no.length();
                    for (int a=0; a<4-id_next; a++){
                        no = "0"+no;
                    }
                    txtIdPenjualan.setText("IDT"+no);
                    txtKodebarPesan1.setText("IDT"+no);
                }
            }
        }catch (SQLException ex){
//            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void CariBarangTransaksi(){
        int a = 1;
        modelprotran.getDataVector().removeAllElements();
        modelprotran.getDataVector().removeAllElements();
        try {
        java.sql.Connection conn=(com.mysql.jdbc.Connection)koneksi.getKoneksi();
        String sql = "SELECT * from barang where id_barang like '%"
                    +txtCariBT.getText()+"%' or nama_barang like '%"
                    +txtCariBT.getText()+"%' or ukuran like '%"
                    +txtCariBT.getText()+"%' or motif like '%"
                    +txtCariBT.getText()+"%' or harga_jual like '%"
                    +txtCariBT.getText()+"%' or stok like '%"
                    +txtCariBT.getText()+"%' or barcode like '%"
                    +txtCariBT.getText()+"%'";
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet res = pst.executeQuery(sql);
         while(res.next()){
               Object[] obj = new Object[7];
               obj[0] = a++;
               obj[1] = res.getString("id_barang");
               obj[2] = res.getString("nama_barang");
               obj[3] = res.getString("ukuran");
               obj[4] = res.getString("motif");
               obj[5] = res.getString("harga_jual");
               obj[6] = res.getString("stok");
               modelprotran.addRow(obj);
         }
        } catch (Exception e) {
        }
    }
    
    public void getDataBarangTransaksi(){
        
        int a = 1;
        modelprotran.getDataVector().removeAllElements();
        modelprotran.getDataVector().removeAllElements();
        try {
        java.sql.Connection conn=(com.mysql.jdbc.Connection)koneksi.getKoneksi();
        String sql = "SELECT id_barang, nama_barang, ukuran, motifbatik.Motif, "
                + "harga_jual, stok FROM barang JOIN motifbatik ON "
                + "barang.id_motif = motifbatik.id_motif where "
                + "(kategori = 'Baju' or kategori = 'Kain') and (harga_jual > 0)";
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet res = pst.executeQuery(sql);
         while(res.next()){
               Object[] obj = new Object[7];
               obj[0] = a++;
               obj[1] = res.getString(1);
               obj[2] = res.getString(2);
               obj[3] = res.getString(3);
               obj[4] = res.getString(4);
               obj[5] = res.getString(5);
               obj[6] = res.getString(6);
               modelprotran.addRow(obj);
         }
        } catch (Exception e) {
        
    }
    }
    
        public void getStokKP(){
        int barisSup = jTable4.getSelectedRow();
        try{
        java.sql.Connection conn=(com.mysql.jdbc.Connection)koneksi.getKoneksi();
        String sql = "Select stok from barang where nama_barang = 'Kain Putih Polos'";
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet res = pst.executeQuery(sql);
           while(res.next()){
               txtStokKp.setText(res.getString("stok"));
               txtStokKp1.setText((String) jTable4.getValueAt(barisSup, 8));
               double a = Double.parseDouble(txtStokKp.getText());
               double b = Double.parseDouble(txtStokKp1.getText());
               double c = a - b;
               txtStokKp2.setText(String.valueOf(c));
           }
        } catch(SQLException err){
             JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    }
    
    private void setTabelTransaksi(){
        int total=0;
        int a = 1;
        
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("NO");
        tbl.addColumn("NAMA BARANG");
        tbl.addColumn("QTY");
        tbl.addColumn("TOTAL");
        
        for(int n=0; n<qtyTrx.size(); n++){
            total = total + Integer.parseInt(totalTrx.get(n).toString());
            
            tbl.addRow(new Object[]{
                a++,
                nambarTrx.get(n),
                qtyTrx.get(n),
                totalTrx.get(n),
            });
        }
        jTable1.setModel(tbl);
        txtSubtotTrx.setText(""+total);
        }
    
    public void clearPesan(){
        txtMotif.setText(null);
        txtWarna.setText(null);
        txtPanjang.setText(null);
        txtHarga.setText(null);
        txtNamaCus.setText(null);
        txtPhone1.setText(null);
        txtAlamat1.setText(null);
        txtTotal.setText(null);
        
        motif.clear();
        warna.clear();
        PK.clear();
        harga.clear();
        rpps.setText(null);
        
        setTabelPesan();
    }
    
    public void id_autoPemesanan(){
        try{
            java.sql.Connection c = koneksi.getKoneksi();
            Statement stat= c.createStatement();
            String sql ="select max(right(id_pemesanan,4))as no from pemesanan";//query select data yang paling akhir
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()){
                if (rs.first()==false){
                    txtIdpsn.setText("IDO0001");//jika data masih kosong maka akan menampilkan
                }else{
                    rs.last();//jika ada data maka membuat id baru
                    int set_id = rs.getInt(1)+1;
                    String no = String.valueOf(set_id);
                    int id_next = no.length();
                    for (int a=0; a<4-id_next; a++){
                        no = "0"+no;
                    }
                    txtIdpsn.setText("IDO"+no);
                }
            }
        }catch (SQLException ex){
//            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void setTabelPesan(){
        int total=0;
        
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Motif");
        tbl.addColumn("Warna");
        tbl.addColumn("Panjang Kain");
        tbl.addColumn("Harga");
        
        for(int n=0; n<motif.size(); n++){
            total = total + Integer.parseInt(harga.get(n).toString());
            
            tbl.addRow(new Object[]{
                motif.get(n),
                warna.get(n),
                PK.get(n),
                harga.get(n),
            });
        }
        jTable9.setModel(tbl);
        rpps.setText(" Rp.");
        txtTotal.setText(""+total);
        }
    
    private void setTabelPembelianBS(){
        int total=0;
        
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Nama Barang");
        tbl.addColumn("Harga");
        tbl.addColumn("Qty");
        tbl.addColumn("Sub Total");
        
        for(int n=0; n<nambarbs.size(); n++){
            total = total + Integer.parseInt(subtobs.get(n).toString());
            
            tbl.addRow(new Object[]{
                nambarbs.get(n),
                hargabs.get(n),
                qtybs.get(n),
                subtobs.get(n),
            });
        }
        jTable5.setModel(tbl);
        rpbs.setText(" Rp.");
        txtTotalbs.setText(""+total);
        }
    
    private void setTabelPembelianBB(){
        int total=0;
        
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Nama Barang");
        tbl.addColumn("Harga");
        tbl.addColumn("Qty");
        tbl.addColumn("Sub Total");
        
        for(int n=0; n<nambarBB.size(); n++){
            total = total + Integer.parseInt(subtoBB.get(n).toString());
            
            tbl.addRow(new Object[]{
                nambarBB.get(n),
                hargaBB.get(n),
                qtyBB.get(n),
                subtoBB.get(n),
            });
        }
        jTable8.setModel(tbl);
        rpbb.setText(" Rp.");
        txtTotalBB.setText(""+total);
        }
    
    public void tanggal(){
        new Timer(0, new ActionListener() {
            @Override
            
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
                SimpleDateFormat b = new SimpleDateFormat("HH");
                SimpleDateFormat c = new SimpleDateFormat("EEE");
                SimpleDateFormat g = new SimpleDateFormat("MM");
                SimpleDateFormat h = new SimpleDateFormat("yyyy");
                SimpleDateFormat a = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
                String timee = s.format(d);
                String timeee = a.format(d);
                String timehari = c.format(d);
                String timejam = b.format(d);
                String timebulan = g.format(d);
                String timetahun = h.format(d);
                txtTanggalBB.setText(timee);
                txtTanggalbs.setText(timee);
                txtTanggal.setText(timee);
                txtIdkarTrx1.setText(timee);
                txtKodebarPesan3.setText(timee);
                txtTanggalHome.setText(timeee);
                txt_hariPenjualan.setText(timehari);
                txt_Haribeli.setText(timehari);
                txt_jamPenjualan.setText(timejam);
                txt_Jambeli.setText(timejam);
                txt_bulanPenjualan.setText(timebulan);
                txt_bulanbeli.setText(timebulan);
                jTextField8.setText(timebulan);
                jTextField9.setText(timetahun);
                txtTanggalBBJam.setText(timejam);
                txtTanggalBBbulan.setText(timebulan);
                txtTanggalBBhari.setText(timehari);
                txtJamPemesanan.setText(timejam);
                txtBulanpemesanan.setText(timebulan);
                txtharipemesanan.setText(timehari);
            }
        }).start();
     
    }
    
    public void id_autoBarang(){
        try{
            java.sql.Connection c = koneksi.getKoneksi();
            Statement stat= c.createStatement();
            String sql ="select max(right(id_barang,4))as no from barang";//query select data yang paling akhir
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()){
                if (rs.first()==false){
                    txtIdbar2.setText("IDB0001");//jika data masih kosong maka akan menampilkan
                    txtIdbarps.setText("IDB0001");
                    txtKodebarBB.setText("RETNOSARI0001");
                    txtKodebarPesan.setText("RETNOSARI0001");
                }else{
                    rs.last();//jika ada data maka membuat id baru
                    int set_id = rs.getInt(1)+1;
                    String no = String.valueOf(set_id);
                    int id_next = no.length();
                    for (int a=0; a<4-id_next; a++){
                        no = "0"+no;
                    }
                    txtIdbar2.setText("IDB"+no);
                    txtIdbarps.setText("IDB"+no);
                    txtKodebarBB.setText("RETNOSARI"+no);
                    txtKodebarPesan.setText("RETNOSARI"+no);
                }
            }
        }catch (SQLException ex){
//            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void id_autoBarangPesanan(){
        try{
            java.sql.Connection c = koneksi.getKoneksi();
            Statement stat= c.createStatement();
            String sql ="select max(right(id_barangPesanan,4))as no from barangPesanan";//query select data yang paling akhir
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()){
                if (rs.first()==false){
                    txtIdBPes.setText("IDBP0001");//jika data masih kosong maka akan menampilkan
                }else{
                    rs.last();//jika ada data maka membuat id baru
                    int set_id = rs.getInt(1)+1;
                    String no = String.valueOf(set_id);
                    int id_next = no.length();
                    for (int a=0; a<4-id_next; a++){
                        no = "0"+no;
                    }
                    txtIdBPes.setText("IDBP"+no);
                }
            }
        }catch (SQLException ex){
//            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void id_autoPembelian(){
        try{
            java.sql.Connection c = koneksi.getKoneksi();
            Statement stat= c.createStatement();
            String sql ="select max(right(id_pembelian,4))as no from pembelian";//query select data yang paling akhir
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()){
                if (rs.first()==false){
                    txtIdresbs.setText("IDR0001");
                    txtIdres2.setText("IDR0001");//jika data masih kosong maka akan menampilkan
                }else{
                    rs.last();//jika ada data maka membuat id baru
                    int set_id = rs.getInt(1)+1;
                    String no = String.valueOf(set_id);
                    int id_next = no.length();
                    for (int a=0; a<4-id_next; a++){
                        no = "0"+no;
                    }
                    txtIdresbs.setText("IDR"+no);
                    txtIdres2.setText("IDR"+no);
                }
            }
        }catch (SQLException ex){
//            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void ComboBoxSupplier(){
        try {
        Connection con = (Connection)koneksi.getKoneksi();
        Statement stt = con.createStatement();
        String sql = "select nama_supplier from supplier order by nama_supplier asc";
        ResultSet res = stt.executeQuery(sql);                              
        while(res.next()){
            Object[] ob = new Object[3];
            ob[0] = res.getString(1);
            cb_distributor.addItem((String) ob[0]); 
            cb_distributor3.addItem((String) ob[0]);// fungsi ini bertugas menampung isi dari database
            }
            res.close(); stt.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ComboBoxBarang(){
        try {
        Connection con = (Connection)koneksi.getKoneksi();
        Statement stt = con.createStatement();
        String sql = "select nama_barang from barang where id_supplier = '"+txtIdsupbs.getText()+"' order by nama_barang asc";
        ResultSet res = stt.executeQuery(sql);                              
        while(res.next()){
            Object[] ob = new Object[3];
            ob[0] = res.getString(1);
            cb_distributor2.addItem((String) ob[0]);// fungsi ini bertugas menampung isi dari database
            }
            res.close(); stt.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
        private void cariDataPemesanan(){
        try{
            java.sql.Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/retnosari","root","");
            ResultSet res = cn.createStatement().executeQuery("Select pemesanan.nama_customer, pemesanan.phone, pemesanan.alamat, "
                + "pemesanan.tanggal_pemesanan, barangpesanan.id_barangPesanan, barangpesanan.motif, barangpesanan.warna,"
                + "barangpesanan.panjangKain, barangpesanan.harga, detail_pemesanan.status from detail_pemesanan join pemesanan on "
                + "detail_pemesanan.Id_pemesanan = pemesanan.Id_pemesanan join barangPesanan on detail_pemesanan.id_barangPesanan ="
                + "barangPesanan.id_barangPesanan WHERE barangPesanan.id_barangPesanan like '%"
                    +txtCariPemesanan.getText()+"%' or pemesanan.nama_customer like '%"
                    +txtCariPemesanan.getText()+"%' or pemesanan.phone like '%"
                    +txtCariPemesanan.getText()+"%' or pemesanan.alamat like '%"
                    +txtCariPemesanan.getText()+"%' or pemesanan.tanggal_pemesanan like '%"
                    +txtCariPemesanan.getText()+"%' or barangPesanan.motif like '%"
                    +txtCariPemesanan.getText()+"%' or barangPesanan.warna like '%"
                    +txtCariPemesanan.getText()+"%' or barangPesanan.panjangKain like '%"
                    +txtCariPemesanan.getText()+"%' or barangPesanan.harga like '%"
                    +txtCariPemesanan.getText()+"%' or detail_pemesanan.status like '%"
                    +txtCariPemesanan.getText()+"%' ");
            modelpemesanan.getDataVector().removeAllElements();
            int a = 1;
            while(res.next()){
               Object[] obj = new Object[11];
               obj[0] = a++;
               obj[1] = res.getString("nama_customer");
               obj[2] = res.getString("phone");
               obj[3] = res.getString("alamat");
               obj[4] = res.getDate("tanggal_pemesanan");
               obj[5] = res.getString("id_barangPesanan");
               obj[6] = res.getString("motif");
               obj[7] = res.getString("warna");
               obj[8] = res.getString("panjangKain");
               obj[9] = res.getString("harga");
               obj[10] = res.getString("status");
               modelpemesanan.addRow(obj);
            }
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }
   
    public void getDataPemesanan(){
        modelpemesanan.getDataVector().removeAllElements();
        modelpemesanan.fireTableDataChanged();
        int a = 1;
        try{
        java.sql.Connection conn=(com.mysql.jdbc.Connection)koneksi.getKoneksi();
        String sql = "Select * from pemesanan";
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet res = pst.executeQuery(sql);
           while(res.next()){
               Object[] obj = new Object[8];
               obj[0] = a++;
               obj[1] = res.getString("id_pemesanan");
               obj[2] = res.getString("nama_customer");
               obj[3] = res.getString("phone");
               obj[4] = res.getString("alamat");
               obj[5] = res.getDate("tanggal_pemesanan");
               obj[6] = res.getString("total_harga");
               obj[7] = res.getString("status");
               modelpemesanan.addRow(obj);
           }
        } catch(SQLException err){
             JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    }

    public void getDataReportPengeluaran(){
        int a = 1;
        modelreportpengeluaran.getDataVector().removeAllElements();
        modelreportpengeluaran.getDataVector().removeAllElements();
        try {
        java.sql.Connection conn=(com.mysql.jdbc.Connection)koneksi.getKoneksi();
        String sql = "SELECT pembelian.id_pembelian, karyawan.nama_karyawan, pembelian.tanggal_pembelian, barang.nama_barang,detail_pembelian.qty, detail_pembelian.sub_total from pembelian join karyawan on karyawan.id_karyawan = pembelian.id_karyawan join detail_pembelian on pembelian.id_pembelian = detail_pembelian.id_pembelian join barang on detail_pembelian.id_barang= barang.id_barang";
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet res = pst.executeQuery(sql);
         while(res.next()){
               Object[] obj = new Object[7];
               obj[0] = a++;
               obj[1] = res.getString(1);
               obj[2] = res.getString(2);
               obj[3] = res.getString(3);
               obj[4] = res.getString(4);
               obj[5] = res.getString(5);
               obj[6] = res.getString(6);
               modelreportpengeluaran.addRow(obj);
         }
        } catch (Exception e) {
        }
    }
    
    public void getDataReportPemasukan(){
        int a = 1;
        modelreportpemasukan.getDataVector().removeAllElements();
        modelreportpemasukan.fireTableDataChanged();
        try{
        java.sql.Connection conn=(com.mysql.jdbc.Connection)koneksi.getKoneksi();
        String sql = "SELECT penjualan.id_penjualan, penjualan.tanggal_penjualan, "
                + "karyawan.nama_karyawan, penjualan.nama_customer, barang.nama_barang, "
                + "detail_penjualan.qty, detail_penjualan.sub_total from karyawan JOIN penjualan "
                + "on karyawan.id_karyawan = penjualan.id_karyawan join detail_penjualan on "
                + "penjualan.id_penjualan = detail_penjualan.id_penjualan join barang on "
                + "detail_penjualan.id_barang = barang.id_barang";
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet res = pst.executeQuery(sql);
           while(res.next()){
               Object[] obj = new Object[8];
               obj[0] = a++;
               obj[1] = res.getString(1);
               obj[2] = res.getString(2);
               obj[3] = res.getString(3);
               obj[4] = res.getString(4);
               obj[5] = res.getString(5);
               obj[6] = res.getString(6);
               obj[7] = res.getString(7);
                             
               modelreportpemasukan.addRow(obj);
           }
        } catch(SQLException err){
             JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    }
    
    public void clearbs(){
        txtHarbelbs.setText(null);
        txtQtybs.setText(null);
        txtSubtobs.setText(null);
        cb_distributor3.setSelectedIndex(0);
        cb_distributor2.setSelectedIndex(0);
        
        nambarbs.clear();
        hargabs.clear();
        qtybs.clear();
        subtobs.clear();
        txtTotalbs.setText(null);
        rpbs.setText(null);
        
        setTabelPembelianBS();
    }
    
    public void clear(){
        txtNambarBB.setText(null);
        txtMotifBB.setText(null);
        txtHarbelBB.setText(null);
        txtQtyBB.setText(null);
        txtSubtoBB.setText(null);
        txtUkuranBB.setText(null);
        cb_distributor1.setSelectedIndex(0);
        cb_distributor.setSelectedIndex(0);
        
        nambarBB.clear();
        hargaBB.clear();
        qtyBB.clear();
        subtoBB.clear();
        txtTotalBB.setText(null);
        rpbb.setText(null);
        
        setTabelPembelianBB();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PopupMenuPemesanan = new javax.swing.JPopupMenu();
        detailPesanan = new javax.swing.JMenuItem();
        TandaiSelesai = new javax.swing.JMenuItem();
        checkOut = new javax.swing.JMenuItem();
        hapus = new javax.swing.JMenuItem();
        cancelPemesanan = new javax.swing.JMenuItem();
        BodyPanel = new javax.swing.JPanel();
        ContentPanel = new javax.swing.JPanel();
        HomePanel = new javax.swing.JPanel();
        btnAbout3 = new javax.swing.JLabel();
        btnLogOut3 = new javax.swing.JLabel();
        ddLogOut3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        Jtahun = new javax.swing.JComboBox<>();
        CariHarian = new javax.swing.JButton();
        Jbulan = new javax.swing.JComboBox<>();
        Jbulan1 = new javax.swing.JComboBox<>();
        Jminggu = new javax.swing.JComboBox<>();
        Jharian = new com.toedter.calendar.JDateChooser();
        CariTahunan = new javax.swing.JButton();
        CariBulanan = new javax.swing.JButton();
        txtTanggalHome = new javax.swing.JTextField();
        txt_pengeluaran = new javax.swing.JTextField();
        txt_Keuntungan = new javax.swing.JTextField();
        txt_pemasukan = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        TransaksiPanel = new javax.swing.JPanel();
        TransaksiScan = new javax.swing.JPanel();
        txtPopUpQty = new javax.swing.JTextField();
        PopUpQty = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnPay1 = new javax.swing.JLabel();
        btnPay = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtSubtotTrx = new javax.swing.JTextField();
        txtIdPenjualan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TransaksiManual = new javax.swing.JPanel();
        Manual = new javax.swing.JPanel();
        btnAbout12 = new javax.swing.JLabel();
        btnLogOut12 = new javax.swing.JLabel();
        ddLogOut12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        txtCariBT = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Field = new javax.swing.JPanel();
        btnCancel1 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JLabel();
        btnAbout13 = new javax.swing.JLabel();
        btnLogOut13 = new javax.swing.JLabel();
        ddLogOut13 = new javax.swing.JLabel();
        txtCustomerF = new javax.swing.JTextField();
        txtTPF = new javax.swing.JTextField();
        txtReturn = new javax.swing.JTextField();
        txtSubtotalF = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        PesanPanel = new javax.swing.JPanel();
        PemesanaPanel = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        btnLogOut4 = new javax.swing.JLabel();
        btnAbout4 = new javax.swing.JLabel();
        ddLogOut4 = new javax.swing.JLabel();
        txtCariPemesanan = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtStokKp1 = new javax.swing.JTextField();
        txtStokKp = new javax.swing.JTextField();
        txtStokKp2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIdbarps = new javax.swing.JTextField();
        txtKodebarPesan1 = new javax.swing.JTextField();
        txtKodebarPesan3 = new javax.swing.JTextField();
        PesanBarangPanel = new javax.swing.JPanel();
        txtPhone1 = new javax.swing.JTextField();
        txtAlamat1 = new javax.swing.JTextField();
        txtMotif = new javax.swing.JTextField();
        txtWarna = new javax.swing.JTextField();
        txtPanjang = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        txtNamaCus = new javax.swing.JTextField();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        btnLogOut6 = new javax.swing.JLabel();
        btnAbout6 = new javax.swing.JLabel();
        ddLogOut6 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        rpps = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtIdpsn = new javax.swing.JTextField();
        txtTanggal = new javax.swing.JTextField();
        txtIdBPes = new javax.swing.JTextField();
        PembelianPanel = new javax.swing.JPanel();
        brgStok = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        btnLogOut5 = new javax.swing.JLabel();
        btnAbout5 = new javax.swing.JLabel();
        ddLogOut5 = new javax.swing.JLabel();
        txtTotalbs = new javax.swing.JTextField();
        rpbs = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cb_distributor2 = new javax.swing.JComboBox<>();
        cb_distributor3 = new javax.swing.JComboBox<>();
        txtHarbelbs = new javax.swing.JTextField();
        txtQtybs = new javax.swing.JTextField();
        txtSubtobs = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIdresbs = new javax.swing.JTextField();
        txtIdbarbs = new javax.swing.JTextField();
        txtIdsupbs = new javax.swing.JTextField();
        txtTanggalbs = new javax.swing.JTextField();
        txtIdkarbs1 = new javax.swing.JTextField();
        txtTanggalBBJam = new javax.swing.JTextField();
        txtTanggalBBbulan = new javax.swing.JTextField();
        txtTanggalBBhari = new javax.swing.JTextField();
        brgBaru = new javax.swing.JPanel();
        btnBP = new javax.swing.JLabel();
        cb_distributor = new javax.swing.JComboBox<>();
        cb_distributor1 = new javax.swing.JComboBox<>();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        btnLogOut7 = new javax.swing.JLabel();
        btnAbout7 = new javax.swing.JLabel();
        ddLogOut7 = new javax.swing.JLabel();
        txtTotalBB = new javax.swing.JTextField();
        rpbb = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtNambarBB = new javax.swing.JTextField();
        txtUkuranBB = new javax.swing.JTextField();
        txtMotifBB = new javax.swing.JTextField();
        txtHarbelBB = new javax.swing.JTextField();
        txtQtyBB = new javax.swing.JTextField();
        txtSubtoBB = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtIdbar2 = new javax.swing.JTextField();
        txtIdres2 = new javax.swing.JTextField();
        txtIdsup = new javax.swing.JTextField();
        txtTanggalBB = new javax.swing.JTextField();
        txtKodebarBB = new javax.swing.JTextField();
        ReportPanel = new javax.swing.JPanel();
        rpPenjualan = new javax.swing.JPanel();
        btnRpPembelian = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        btnLogOut10 = new javax.swing.JLabel();
        btnAbout10 = new javax.swing.JLabel();
        ddLogOut10 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        Btn_CariPemasukan = new javax.swing.JLabel();
        Btn_PrintExcelPemasukan = new javax.swing.JLabel();
        btn_PrintPDFPemasukan = new javax.swing.JLabel();
        jlabelll = new javax.swing.JTextField();
        Txt_TotalPemasukan = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        rpPembelian = new javax.swing.JPanel();
        btnRpPenjualan = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        btnLogOut11 = new javax.swing.JLabel();
        btnAbout11 = new javax.swing.JLabel();
        ddLogOut11 = new javax.swing.JLabel();
        Btn_PrintPDFpengeluaran = new javax.swing.JLabel();
        Btn_PrintExcelpengeluaran = new javax.swing.JLabel();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        Btn_CariPengeluaran = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        Txt_TotalPengeluaran = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        MenuPanel = new javax.swing.JPanel();
        HomeMenu = new javax.swing.JPanel();
        StokHome = new javax.swing.JLabel();
        CashInOutHome = new javax.swing.JLabel();
        PesanBarangHome = new javax.swing.JLabel();
        TransaksiHome = new javax.swing.JLabel();
        namaTop6 = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        TransaksiMenu = new javax.swing.JPanel();
        HomeTransaksi = new javax.swing.JLabel();
        PesanBarangTransaksi = new javax.swing.JLabel();
        CashInOutTransaksi = new javax.swing.JLabel();
        StokBarangTransaksi = new javax.swing.JLabel();
        namaTop7 = new javax.swing.JLabel();
        Transaksi = new javax.swing.JLabel();
        PesanBarangMenu = new javax.swing.JPanel();
        HomePesanBarang = new javax.swing.JLabel();
        TransaksiPesanBarang = new javax.swing.JLabel();
        CashInOutPesanBarang = new javax.swing.JLabel();
        StokBarangPesanBarang = new javax.swing.JLabel();
        namaTop8 = new javax.swing.JLabel();
        PesanBarang = new javax.swing.JLabel();
        Pembelian = new javax.swing.JPanel();
        HomePesanBarang1 = new javax.swing.JLabel();
        TransaksiPesanBarang1 = new javax.swing.JLabel();
        CashInOutPesanBarang1 = new javax.swing.JLabel();
        StokBarangPesanBarang1 = new javax.swing.JLabel();
        namaTop9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Report = new javax.swing.JPanel();
        HomeStokBarang = new javax.swing.JLabel();
        TransaksiStokBarang = new javax.swing.JLabel();
        PesanBarangStokBarang = new javax.swing.JLabel();
        CashInOutStokBarang = new javax.swing.JLabel();
        namaTop10 = new javax.swing.JLabel();
        StokBarang = new javax.swing.JLabel();
        TopMenuPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblTopMenu = new javax.swing.JLabel();

        detailPesanan.setText("Detail Pesanan");
        detailPesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailPesananActionPerformed(evt);
            }
        });
        PopupMenuPemesanan.add(detailPesanan);

        TandaiSelesai.setText("Tandai Selesai");
        TandaiSelesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TandaiSelesaiActionPerformed(evt);
            }
        });
        PopupMenuPemesanan.add(TandaiSelesai);

        checkOut.setText("Checkout");
        checkOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutActionPerformed(evt);
            }
        });
        PopupMenuPemesanan.add(checkOut);

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        PopupMenuPemesanan.add(hapus);

        cancelPemesanan.setText("Close");
        cancelPemesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelPemesananActionPerformed(evt);
            }
        });
        PopupMenuPemesanan.add(cancelPemesanan);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ContentPanel.setBackground(new java.awt.Color(255, 255, 255));
        ContentPanel.setPreferredSize(new java.awt.Dimension(1025, 677));
        ContentPanel.setLayout(new java.awt.CardLayout());

        HomePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomePanelMouseClicked(evt);
            }
        });
        HomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAbout3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAbout3MouseClicked(evt);
            }
        });
        HomePanel.add(btnAbout3, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 6, 130, 30));

        btnLogOut3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOut3MouseClicked(evt);
            }
        });
        HomePanel.add(btnLogOut3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, 130, 30));

        ddLogOut3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DropDownTop.png"))); // NOI18N
        HomePanel.add(ddLogOut3, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 0, -1, 70));

        jComboBox2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TAHUN", "BULAN", "HARI" }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        HomePanel.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 90, 30));

        Jtahun.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Jtahun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        Jtahun.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Jtahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtahunActionPerformed(evt);
            }
        });
        HomePanel.add(Jtahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, 140, 30));

        CariHarian.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        CariHarian.setText("Cari");
        CariHarian.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CariHarian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CariHarianMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CariHarianMouseEntered(evt);
            }
        });
        CariHarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CariHarianActionPerformed(evt);
            }
        });
        HomePanel.add(CariHarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 190, 60, 30));

        Jbulan.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Jbulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        Jbulan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Jbulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbulanActionPerformed(evt);
            }
        });
        HomePanel.add(Jbulan, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, 70, 30));

        Jbulan1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Jbulan1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        Jbulan1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        HomePanel.add(Jbulan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 190, 70, 30));

        Jminggu.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Jminggu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Minggu Sebelumnya", "2 Minggu Sebelumnya", "3 Minggu Sebelumnya", "4 Minggu Sebelumnya" }));
        Jminggu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        HomePanel.add(Jminggu, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, 200, 30));

        Jharian.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Jharian.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Jharian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JharianMouseClicked(evt);
            }
        });
        HomePanel.add(Jharian, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, 140, 30));

        CariTahunan.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        CariTahunan.setText("Cari");
        CariTahunan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CariTahunan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CariTahunanMouseClicked(evt);
            }
        });
        CariTahunan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CariTahunanActionPerformed(evt);
            }
        });
        HomePanel.add(CariTahunan, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 190, 60, 30));

        CariBulanan.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        CariBulanan.setText("Cari");
        CariBulanan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CariBulanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CariBulananMouseClicked(evt);
            }
        });
        CariBulanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CariBulananActionPerformed(evt);
            }
        });
        HomePanel.add(CariBulanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 190, 60, 30));

        chartMingguan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        chartMingguan.setLayout(new javax.swing.BoxLayout(chartMingguan, javax.swing.BoxLayout.LINE_AXIS));
        HomePanel.add(chartMingguan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 930, 400));

        txtTanggalHome.setEditable(false);
        txtTanggalHome.setBackground(new java.awt.Color(255, 255, 255));
        txtTanggalHome.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtTanggalHome.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTanggalHome.setBorder(null);
        HomePanel.add(txtTanggalHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 230, 20));

        txt_pengeluaran.setEditable(false);
        txt_pengeluaran.setBackground(new java.awt.Color(255, 255, 255));
        txt_pengeluaran.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txt_pengeluaran.setBorder(null);
        HomePanel.add(txt_pengeluaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 80, 40));

        txt_Keuntungan.setEditable(false);
        txt_Keuntungan.setBackground(new java.awt.Color(255, 255, 255));
        txt_Keuntungan.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txt_Keuntungan.setBorder(null);
        HomePanel.add(txt_Keuntungan, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 90, 80, 40));

        txt_pemasukan.setEditable(false);
        txt_pemasukan.setBackground(new java.awt.Color(255, 255, 255));
        txt_pemasukan.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txt_pemasukan.setBorder(null);
        HomePanel.add(txt_pemasukan, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 80, 40));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Home Panel.png"))); // NOI18N
        HomePanel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1025, 677));

        ContentPanel.add(HomePanel, "card2");

        TransaksiPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransaksiPanelMouseClicked(evt);
            }
        });

        TransaksiScan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPopUpQty.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtPopUpQty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPopUpQty.setBorder(null);
        txtPopUpQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPopUpQtyKeyPressed(evt);
            }
        });
        TransaksiScan.add(txtPopUpQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 160, 30));

        PopUpQty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/PopUp Qty.png"))); // NOI18N
        TransaksiScan.add(PopUpQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 230, 120));

        jTable1.setBackground(new java.awt.Color(197, 210, 197));
        jTable1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO", "NAMA BARANG", "QTY", "TOTAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setOpaque(false);
        jTable1.setPreferredSize(new java.awt.Dimension(225, 100));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(244, 171, 78));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);

        TransaksiScan.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 67, 420, 470));

        btnPay1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPay1MouseClicked(evt);
            }
        });
        TransaksiScan.add(btnPay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 580, 40, 70));

        btnPay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPayMouseClicked(evt);
            }
        });
        TransaksiScan.add(btnPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, 40, 70));

        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        TransaksiScan.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 584, 50, 60));

        txtSubtotTrx.setEditable(false);
        txtSubtotTrx.setBackground(new java.awt.Color(197, 210, 197));
        txtSubtotTrx.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtSubtotTrx.setBorder(null);
        TransaksiScan.add(txtSubtotTrx, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 70, 40));

        txtIdPenjualan.setEditable(false);
        txtIdPenjualan.setBackground(new java.awt.Color(44, 107, 52));
        txtIdPenjualan.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtIdPenjualan.setForeground(new java.awt.Color(255, 255, 255));
        txtIdPenjualan.setBorder(null);
        txtIdPenjualan.setOpaque(false);
        TransaksiScan.add(txtIdPenjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 80, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Panel Transaksi.png"))); // NOI18N
        TransaksiScan.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txtIdkarTrx.setEditable(false);
        txtIdkarTrx.setBackground(new java.awt.Color(255, 255, 255));
        txtIdkarTrx.setForeground(new java.awt.Color(255, 255, 255));
        txtIdkarTrx.setBorder(null);
        txtIdkarTrx.setOpaque(false);
        TransaksiScan.add(txtIdkarTrx, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 650, 100, -1));

        txtIdkarTrx1.setEditable(false);
        txtIdkarTrx1.setBackground(new java.awt.Color(255, 255, 255));
        txtIdkarTrx1.setForeground(new java.awt.Color(255, 255, 255));
        txtIdkarTrx1.setBorder(null);
        txtIdkarTrx1.setOpaque(false);
        TransaksiScan.add(txtIdkarTrx1, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 650, 100, -1));

        txtIdkarTrx2.setEditable(false);
        txtIdkarTrx2.setBackground(new java.awt.Color(255, 255, 255));
        txtIdkarTrx2.setForeground(new java.awt.Color(255, 255, 255));
        txtIdkarTrx2.setBorder(null);
        txtIdkarTrx2.setOpaque(false);
        TransaksiScan.add(txtIdkarTrx2, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 650, 100, -1));

        TransaksiManual.setLayout(new java.awt.CardLayout());

        Manual.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAbout12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAbout12MouseClicked(evt);
            }
        });
        Manual.add(btnAbout12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 120, 30));

        btnLogOut12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOut12MouseClicked(evt);
            }
        });
        Manual.add(btnLogOut12, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 36, 130, 30));

        ddLogOut12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DropDownTop.png"))); // NOI18N
        Manual.add(ddLogOut12, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 0, -1, -1));

        jTable11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTable11.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable11.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable11.setGridColor(new java.awt.Color(197, 210, 197));
        jTable11.setRowHeight(25);
        jTable11.setSelectionBackground(new java.awt.Color(244, 171, 78));
        jTable11.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable11MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable11);

        Manual.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 480, 420));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(36, 158, 33));
        jTextField3.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(null);
        jTextField3.setOpaque(false);
        Manual.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, 220, 40));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(36, 158, 33));
        jTextField2.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(null);
        jTextField2.setOpaque(false);
        Manual.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 610, 220, 40));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(36, 186, 55));
        jTextField1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(null);
        Manual.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 220, 80));

        txtCariBT.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtCariBT.setBorder(null);
        txtCariBT.setOpaque(false);
        txtCariBT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariBTKeyReleased(evt);
            }
        });
        Manual.add(txtCariBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 400, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Manual Sch.png"))); // NOI18N
        Manual.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 545, -1));

        TransaksiManual.add(Manual, "card2");

        Field.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancel1MouseClicked(evt);
            }
        });
        Field.add(btnCancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 610, 90, 40));

        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        Field.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, 100, 40));
        Field.add(btnAbout13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 130, 30));

        btnLogOut13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOut13MouseClicked(evt);
            }
        });
        Field.add(btnLogOut13, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 36, 130, 30));

        ddLogOut13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DropDownTop.png"))); // NOI18N
        Field.add(ddLogOut13, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 0, -1, -1));

        txtCustomerF.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtCustomerF.setBorder(null);
        Field.add(txtCustomerF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 210, 20));

        txtTPF.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtTPF.setBorder(null);
        txtTPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTPFKeyReleased(evt);
            }
        });
        Field.add(txtTPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 210, 30));

        txtReturn.setEditable(false);
        txtReturn.setBackground(new java.awt.Color(255, 255, 255));
        txtReturn.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtReturn.setBorder(null);
        txtReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtReturnMouseClicked(evt);
            }
        });
        Field.add(txtReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 149, 210, -1));

        txtSubtotalF.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtSubtotalF.setBorder(null);
        txtSubtotalF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSubtotalFMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtSubtotalFMouseEntered(evt);
            }
        });
        Field.add(txtSubtotalF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 210, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Transaksi Field.png"))); // NOI18N
        Field.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 545, -1));

        TransaksiManual.add(Field, "card3");

        javax.swing.GroupLayout TransaksiPanelLayout = new javax.swing.GroupLayout(TransaksiPanel);
        TransaksiPanel.setLayout(TransaksiPanelLayout);
        TransaksiPanelLayout.setHorizontalGroup(
            TransaksiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransaksiPanelLayout.createSequentialGroup()
                .addComponent(TransaksiScan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(TransaksiManual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TransaksiPanelLayout.setVerticalGroup(
            TransaksiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransaksiPanelLayout.createSequentialGroup()
                .addGroup(TransaksiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TransaksiScan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TransaksiManual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        ContentPanel.add(TransaksiPanel, "card5");

        PesanPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PesanPanelMouseClicked(evt);
            }
        });
        PesanPanel.setLayout(new java.awt.CardLayout());

        PemesanaPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PemesanaPanelMouseClicked(evt);
            }
        });
        PemesanaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jTable4.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable4.setGridColor(new java.awt.Color(197, 210, 197));
        jTable4.setRowHeight(25);
        jTable4.setSelectionBackground(new java.awt.Color(244, 171, 78));
        jTable4.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable4MouseReleased(evt);
            }
        });
        jScrollPane6.setViewportView(jTable4);

        PemesanaPanel.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 140, 940, 500));

        btnLogOut4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOut4MouseClicked(evt);
            }
        });
        PemesanaPanel.add(btnLogOut4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, 130, 30));

        btnAbout4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAbout4MouseClicked(evt);
            }
        });
        PemesanaPanel.add(btnAbout4, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 6, 130, 30));

        ddLogOut4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DropDownTop.png"))); // NOI18N
        PemesanaPanel.add(ddLogOut4, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 0, -1, 70));

        txtCariPemesanan.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtCariPemesanan.setBorder(null);
        txtCariPemesanan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCariPemesananKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariPemesananKeyReleased(evt);
            }
        });
        PemesanaPanel.add(txtCariPemesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 830, 30));

        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        PemesanaPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 104, 870, 20));

        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        PemesanaPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 100, 40, 30));

        txtStokKp1.setEditable(false);
        txtStokKp1.setBackground(new java.awt.Color(255, 255, 255));
        txtStokKp1.setForeground(new java.awt.Color(255, 255, 255));
        txtStokKp1.setBorder(null);
        PemesanaPanel.add(txtStokKp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 120, -1));

        txtStokKp.setEditable(false);
        txtStokKp.setBackground(new java.awt.Color(255, 255, 255));
        txtStokKp.setForeground(new java.awt.Color(255, 255, 255));
        txtStokKp.setBorder(null);
        PemesanaPanel.add(txtStokKp, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 120, -1));

        txtStokKp2.setEditable(false);
        txtStokKp2.setBackground(new java.awt.Color(255, 255, 255));
        txtStokKp2.setForeground(new java.awt.Color(255, 255, 255));
        txtStokKp2.setBorder(null);
        PemesanaPanel.add(txtStokKp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 120, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Barang Pesanan Panel.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        PemesanaPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txtIdbarps.setEditable(false);
        txtIdbarps.setBackground(new java.awt.Color(255, 255, 255));
        txtIdbarps.setForeground(new java.awt.Color(255, 255, 255));
        txtIdbarps.setBorder(null);
        PemesanaPanel.add(txtIdbarps, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, 120, -1));

        txtKodebarPesan.setEditable(false);
        txtKodebarPesan.setBackground(new java.awt.Color(255, 255, 255));
        txtKodebarPesan.setForeground(new java.awt.Color(255, 255, 255));
        txtKodebarPesan.setBorder(null);
        PemesanaPanel.add(txtKodebarPesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, 120, -1));

        txtKodebarPesan1.setEditable(false);
        txtKodebarPesan1.setBackground(new java.awt.Color(255, 255, 255));
        txtKodebarPesan1.setForeground(new java.awt.Color(255, 255, 255));
        txtKodebarPesan1.setBorder(null);
        PemesanaPanel.add(txtKodebarPesan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, 120, -1));

        txtKodebarPesan2.setEditable(false);
        txtKodebarPesan2.setBackground(new java.awt.Color(255, 255, 255));
        txtKodebarPesan2.setForeground(new java.awt.Color(255, 255, 255));
        txtKodebarPesan2.setBorder(null);
        PemesanaPanel.add(txtKodebarPesan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, 120, -1));

        txtKodebarPesan3.setEditable(false);
        txtKodebarPesan3.setBackground(new java.awt.Color(255, 255, 255));
        txtKodebarPesan3.setForeground(new java.awt.Color(255, 255, 255));
        txtKodebarPesan3.setBorder(null);
        PemesanaPanel.add(txtKodebarPesan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, 120, -1));

        PesanPanel.add(PemesanaPanel, "card6");

        PesanBarangPanel.setBackground(new java.awt.Color(255, 255, 255));
        PesanBarangPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PesanBarangPanelMouseClicked(evt);
            }
        });
        PesanBarangPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPhone1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtPhone1.setBorder(null);
        txtPhone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhone1ActionPerformed(evt);
            }
        });
        PesanBarangPanel.add(txtPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 200, 30));

        txtAlamat1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtAlamat1.setBorder(null);
        txtAlamat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlamat1ActionPerformed(evt);
            }
        });
        PesanBarangPanel.add(txtAlamat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 200, -1));

        txtMotif.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtMotif.setBorder(null);
        txtMotif.setOpaque(false);
        txtMotif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMotifActionPerformed(evt);
            }
        });
        PesanBarangPanel.add(txtMotif, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 200, 40));

        txtWarna.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtWarna.setBorder(null);
        txtWarna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWarnaActionPerformed(evt);
            }
        });
        PesanBarangPanel.add(txtWarna, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, 200, 30));

        txtPanjang.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtPanjang.setBorder(null);
        txtPanjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPanjangActionPerformed(evt);
            }
        });
        PesanBarangPanel.add(txtPanjang, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 300, 200, 20));

        txtHarga.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtHarga.setBorder(null);
        txtHarga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtHargaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtHargaMouseEntered(evt);
            }
        });
        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });
        PesanBarangPanel.add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 390, 180, 20));

        txtNamaCus.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtNamaCus.setBorder(null);
        txtNamaCus.setOpaque(false);
        txtNamaCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaCusActionPerformed(evt);
            }
        });
        PesanBarangPanel.add(txtNamaCus, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 200, 40));

        jTable9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Motif", "Warna", "Panjang Kain", "Harga"
            }
        ));
        jTable9.setGridColor(new java.awt.Color(197, 210, 197));
        jTable9.setRowHeight(25);
        jTable9.setSelectionBackground(new java.awt.Color(244, 171, 78));
        jTable9.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane11.setViewportView(jTable9);

        PesanBarangPanel.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 400, 410));

        btnLogOut6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOut6MouseClicked(evt);
            }
        });
        PesanBarangPanel.add(btnLogOut6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, 130, 30));
        PesanBarangPanel.add(btnAbout6, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 6, 130, 30));

        ddLogOut6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DropDownTop.png"))); // NOI18N
        PesanBarangPanel.add(ddLogOut6, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 0, -1, 70));

        txtTotal.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtTotal.setBorder(null);
        PesanBarangPanel.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 530, 100, 30));

        rpps.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        rpps.setBorder(null);
        PesanBarangPanel.add(rpps, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 530, 40, 30));

        jLabel30.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel30.setText("Total :");
        PesanBarangPanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, -1, 30));

        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        PesanBarangPanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 384, 30, 30));

        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });
        PesanBarangPanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 614, 80, 30));

        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });
        PesanBarangPanel.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 614, 80, 30));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Pesan Barang Panel.png"))); // NOI18N
        PesanBarangPanel.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txtIdpsn.setEditable(false);
        txtIdpsn.setBackground(new java.awt.Color(255, 255, 255));
        txtIdpsn.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtIdpsn.setForeground(new java.awt.Color(255, 255, 255));
        txtIdpsn.setBorder(null);
        txtIdpsn.setOpaque(false);
        txtIdpsn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdpsnActionPerformed(evt);
            }
        });
        PesanBarangPanel.add(txtIdpsn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 490, 200, 40));

        txtIdkarpesan.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtIdkarpesan.setBorder(null);
        txtIdkarpesan.setOpaque(false);
        txtIdkarpesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdkarpesanActionPerformed(evt);
            }
        });
        PesanBarangPanel.add(txtIdkarpesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 610, 200, 40));

        txtTanggal.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtTanggal.setBorder(null);
        txtTanggal.setOpaque(false);
        txtTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTanggalActionPerformed(evt);
            }
        });
        PesanBarangPanel.add(txtTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 200, 40));

        txtIdBPes.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtIdBPes.setBorder(null);
        txtIdBPes.setOpaque(false);
        txtIdBPes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdBPesActionPerformed(evt);
            }
        });
        PesanBarangPanel.add(txtIdBPes, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 200, 40));

        PesanPanel.add(PesanBarangPanel, "card4");

        ContentPanel.add(PesanPanel, "card11");

        PembelianPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PembelianPanelMouseClicked(evt);
            }
        });
        PembelianPanel.setLayout(new java.awt.CardLayout());

        brgStok.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NAMA BARANG", "QTY", "SUB TOTAL"
            }
        ));
        jTable5.setGridColor(new java.awt.Color(197, 210, 197));
        jTable5.setRowHeight(25);
        jTable5.setSelectionBackground(new java.awt.Color(244, 171, 78));
        jTable5.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane7.setViewportView(jTable5);

        brgStok.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 440, 360));

        btnLogOut5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOut5MouseClicked(evt);
            }
        });
        brgStok.add(btnLogOut5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, 130, 30));

        btnAbout5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAbout5MouseClicked(evt);
            }
        });
        brgStok.add(btnAbout5, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 6, 130, 30));

        ddLogOut5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DropDownTop.png"))); // NOI18N
        brgStok.add(ddLogOut5, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 0, -1, 70));

        txtTotalbs.setEditable(false);
        txtTotalbs.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalbs.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtTotalbs.setBorder(null);
        brgStok.add(txtTotalbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, 100, 30));

        rpbs.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        rpbs.setBorder(null);
        rpbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rpbsActionPerformed(evt);
            }
        });
        brgStok.add(rpbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 530, 50, 30));

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel16.setText("Total :");
        brgStok.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, -1, 30));

        cb_distributor2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cb_distributor2.setMaximumRowCount(5);
        cb_distributor2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- PILIH -" }));
        cb_distributor2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cb_distributor2PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cb_distributor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_distributor2ActionPerformed(evt);
            }
        });
        brgStok.add(cb_distributor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 210, 40));

        cb_distributor3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cb_distributor3.setMaximumRowCount(5);
        cb_distributor3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- PILIH -" }));
        cb_distributor3.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cb_distributor3PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cb_distributor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_distributor3ActionPerformed(evt);
            }
        });
        brgStok.add(cb_distributor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 210, 40));

        txtHarbelbs.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtHarbelbs.setBorder(null);
        brgStok.add(txtHarbelbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 190, -1));

        txtQtybs.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtQtybs.setBorder(null);
        txtQtybs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtQtybsMouseClicked(evt);
            }
        });
        txtQtybs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQtybsKeyReleased(evt);
            }
        });
        brgStok.add(txtQtybs, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 270, 190, -1));

        txtSubtobs.setEditable(false);
        txtSubtobs.setBackground(new java.awt.Color(255, 255, 255));
        txtSubtobs.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtSubtobs.setBorder(null);
        txtSubtobs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSubtobsMouseClicked(evt);
            }
        });
        txtSubtobs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubtobsActionPerformed(evt);
            }
        });
        brgStok.add(txtSubtobs, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 350, 160, -1));

        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        brgStok.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 344, 30, 30));

        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        brgStok.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 610, 90, 40));

        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        brgStok.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 610, 90, 40));

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        brgStok.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 120, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/PembelianBS.png"))); // NOI18N
        jLabel7.setOpaque(true);
        brgStok.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txtIdresbs.setEditable(false);
        txtIdresbs.setBackground(new java.awt.Color(255, 255, 255));
        txtIdresbs.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtIdresbs.setForeground(new java.awt.Color(255, 255, 255));
        txtIdresbs.setBorder(null);
        brgStok.add(txtIdresbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 190, -1));

        txtIdbarbs.setForeground(new java.awt.Color(255, 255, 255));
        txtIdbarbs.setBorder(null);
        brgStok.add(txtIdbarbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 100, 30));

        txtIdsupbs.setForeground(new java.awt.Color(255, 255, 255));
        txtIdsupbs.setBorder(null);
        brgStok.add(txtIdsupbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 100, 30));

        txtIdkarbs.setForeground(new java.awt.Color(255, 255, 255));
        txtIdkarbs.setBorder(null);
        txtIdkarbs.setCaretColor(new java.awt.Color(255, 255, 255));
        txtIdkarbs.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        brgStok.add(txtIdkarbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 100, 30));

        txtTanggalbs.setForeground(new java.awt.Color(255, 255, 255));
        txtTanggalbs.setBorder(null);
        txtTanggalbs.setOpaque(false);
        brgStok.add(txtTanggalbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 100, 30));

        txtIdkarbs1.setForeground(new java.awt.Color(255, 255, 255));
        txtIdkarbs1.setBorder(null);
        txtIdkarbs1.setCaretColor(new java.awt.Color(255, 255, 255));
        txtIdkarbs1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        brgStok.add(txtIdkarbs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 100, 30));

        txtTanggalBBJam.setForeground(new java.awt.Color(255, 255, 255));
        txtTanggalBBJam.setBorder(null);
        txtTanggalBBJam.setOpaque(false);
        brgStok.add(txtTanggalBBJam, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 620, 170, -1));

        txtTanggalBBbulan.setForeground(new java.awt.Color(255, 255, 255));
        txtTanggalBBbulan.setBorder(null);
        txtTanggalBBbulan.setOpaque(false);
        brgStok.add(txtTanggalBBbulan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 620, 170, -1));

        txtTanggalBBhari.setForeground(new java.awt.Color(255, 255, 255));
        txtTanggalBBhari.setBorder(null);
        txtTanggalBBhari.setOpaque(false);
        brgStok.add(txtTanggalBBhari, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 620, 170, -1));

        PembelianPanel.add(brgStok, "card2");

        brgBaru.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBPMouseClicked(evt);
            }
        });
        brgBaru.add(btnBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 84, 130, 40));

        cb_distributor.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cb_distributor.setMaximumRowCount(5);
        cb_distributor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- PILIH -" }));
        cb_distributor.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cb_distributorPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cb_distributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_distributorActionPerformed(evt);
            }
        });
        brgBaru.add(cb_distributor, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 210, 40));

        cb_distributor1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cb_distributor1.setMaximumRowCount(5);
        cb_distributor1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- PILIH -", "Kain", "Baju", "Alat Batik" }));
        cb_distributor1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cb_distributor1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cb_distributor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_distributor1ActionPerformed(evt);
            }
        });
        brgBaru.add(cb_distributor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, 210, 40));

        jTable8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NAMA BARANG", "QTY", "SUB TOTAL"
            }
        ));
        jTable8.setGridColor(new java.awt.Color(197, 210, 197));
        jTable8.setRowHeight(25);
        jTable8.setSelectionBackground(new java.awt.Color(244, 171, 78));
        jTable8.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane10.setViewportView(jTable8);

        brgBaru.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 440, 360));

        btnLogOut7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOut7MouseClicked(evt);
            }
        });
        brgBaru.add(btnLogOut7, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, 130, 30));
        brgBaru.add(btnAbout7, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 6, 130, 30));

        ddLogOut7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DropDownTop.png"))); // NOI18N
        brgBaru.add(ddLogOut7, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 0, -1, 70));

        txtTotalBB.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtTotalBB.setBorder(null);
        txtTotalBB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalBBActionPerformed(evt);
            }
        });
        brgBaru.add(txtTotalBB, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, 100, 30));

        rpbb.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        rpbb.setBorder(null);
        rpbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rpbbActionPerformed(evt);
            }
        });
        brgBaru.add(rpbb, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, 40, 30));

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel22.setText("Total :");
        brgBaru.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 531, -1, 30));

        txtNambarBB.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtNambarBB.setBorder(null);
        txtNambarBB.setOpaque(false);
        brgBaru.add(txtNambarBB, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 190, 40));

        txtUkuranBB.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtUkuranBB.setBorder(null);
        txtUkuranBB.setOpaque(false);
        brgBaru.add(txtUkuranBB, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 190, 30));

        txtMotifBB.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtMotifBB.setBorder(null);
        txtMotifBB.setOpaque(false);
        brgBaru.add(txtMotifBB, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 190, 40));

        txtHarbelBB.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtHarbelBB.setBorder(null);
        txtHarbelBB.setOpaque(false);
        brgBaru.add(txtHarbelBB, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 260, 190, 40));

        txtQtyBB.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtQtyBB.setBorder(null);
        txtQtyBB.setOpaque(false);
        txtQtyBB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtQtyBBMouseClicked(evt);
            }
        });
        txtQtyBB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQtyBBKeyReleased(evt);
            }
        });
        brgBaru.add(txtQtyBB, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 350, 190, 20));

        txtSubtoBB.setEditable(false);
        txtSubtoBB.setBackground(new java.awt.Color(255, 255, 255));
        txtSubtoBB.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtSubtoBB.setBorder(null);
        txtSubtoBB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSubtoBBMouseClicked(evt);
            }
        });
        brgBaru.add(txtSubtoBB, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 430, 170, 30));

        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        brgBaru.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 430, 30, 30));

        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        brgBaru.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 614, 90, 30));

        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        brgBaru.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 610, 90, 40));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/PembelianBB.png"))); // NOI18N
        brgBaru.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txtIdbar2.setEditable(false);
        txtIdbar2.setBackground(new java.awt.Color(255, 255, 255));
        txtIdbar2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtIdbar2.setForeground(new java.awt.Color(255, 255, 255));
        txtIdbar2.setBorder(null);
        txtIdbar2.setOpaque(false);
        brgBaru.add(txtIdbar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 600, 190, 40));

        txtIdres2.setEditable(false);
        txtIdres2.setBackground(new java.awt.Color(255, 255, 255));
        txtIdres2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtIdres2.setForeground(new java.awt.Color(255, 255, 255));
        txtIdres2.setBorder(null);
        brgBaru.add(txtIdres2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 610, 190, 20));

        txtIdsup.setEditable(false);
        txtIdsup.setForeground(new java.awt.Color(255, 255, 255));
        txtIdsup.setBorder(null);
        txtIdsup.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtIdsup.setOpaque(false);
        brgBaru.add(txtIdsup, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 620, 70, -1));

        txtIdkarBB.setForeground(new java.awt.Color(255, 255, 255));
        txtIdkarBB.setBorder(null);
        txtIdkarBB.setOpaque(false);
        brgBaru.add(txtIdkarBB, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 570, 70, -1));

        txtTanggalBB.setForeground(new java.awt.Color(255, 255, 255));
        txtTanggalBB.setBorder(null);
        txtTanggalBB.setOpaque(false);
        brgBaru.add(txtTanggalBB, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 620, 60, -1));

        txtKodebarBB.setEditable(false);
        txtKodebarBB.setBackground(new java.awt.Color(255, 255, 255));
        txtKodebarBB.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtKodebarBB.setForeground(new java.awt.Color(255, 255, 255));
        txtKodebarBB.setBorder(null);
        txtKodebarBB.setOpaque(false);
        brgBaru.add(txtKodebarBB, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 600, 190, 40));

        PembelianPanel.add(brgBaru, "card3");

        ContentPanel.add(PembelianPanel, "card7");

        ReportPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReportPanelMouseClicked(evt);
            }
        });
        ReportPanel.setLayout(new java.awt.CardLayout());

        rpPenjualan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRpPembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRpPembelianMouseClicked(evt);
            }
        });
        rpPenjualan.add(btnRpPembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 84, 120, 40));

        jTable7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No", "ID Penjualan", "Nama Karyawan", "Customer", "Tanggal Penjualan", "Total Pembayaran"
            }
        ));
        jTable7.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable7.setGridColor(new java.awt.Color(197, 210, 197));
        jTable7.setRowHeight(25);
        jTable7.setSelectionBackground(new java.awt.Color(244, 171, 78));
        jTable7.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane9.setViewportView(jTable7);

        rpPenjualan.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 910, 340));

        btnLogOut10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOut10MouseClicked(evt);
            }
        });
        rpPenjualan.add(btnLogOut10, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, 130, 30));

        btnAbout10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAbout10MouseClicked(evt);
            }
        });
        rpPenjualan.add(btnAbout10, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 6, 130, 30));

        ddLogOut10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DropDownTop.png"))); // NOI18N
        rpPenjualan.add(ddLogOut10, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 0, -1, 70));
        rpPenjualan.add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 190, 30));
        rpPenjualan.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 190, 30));

        Btn_CariPemasukan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Btn_CariReport.png"))); // NOI18N
        Btn_CariPemasukan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_CariPemasukanMouseClicked(evt);
            }
        });
        rpPenjualan.add(Btn_CariPemasukan, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 90, 30));

        Btn_PrintExcelPemasukan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_PrintExcelPemasukanMouseClicked(evt);
            }
        });
        rpPenjualan.add(Btn_PrintExcelPemasukan, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 610, 100, 30));

        btn_PrintPDFPemasukan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_PrintPDFPemasukanMouseClicked(evt);
            }
        });
        rpPenjualan.add(btn_PrintPDFPemasukan, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 610, 100, 30));

        jlabelll.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlabelll.setText("Rp");
        rpPenjualan.add(jlabelll, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 550, 30, -1));

        Txt_TotalPemasukan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rpPenjualan.add(Txt_TotalPemasukan, new org.netbeans.lib.awtextra.AbsoluteConstraints(835, 550, 130, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ReportPemasukan.png"))); // NOI18N
        rpPenjualan.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ReportPanel.add(rpPenjualan, "card2");

        rpPembelian.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRpPenjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRpPenjualanMouseClicked(evt);
            }
        });
        rpPembelian.add(btnRpPenjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 84, 130, 40));

        jTable6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No", "ID Pembelian", "Nama Karyawan", "Customer", "Tanggal Penjualan", "Total Pembayaran"
            }
        ));
        jTable6.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable6.setGridColor(new java.awt.Color(197, 210, 197));
        jTable6.setRowHeight(25);
        jTable6.setSelectionBackground(new java.awt.Color(244, 171, 78));
        jTable6.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane8.setViewportView(jTable6);

        rpPembelian.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 910, 340));

        btnLogOut11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOut11MouseClicked(evt);
            }
        });
        rpPembelian.add(btnLogOut11, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, 130, 30));
        rpPembelian.add(btnAbout11, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 6, 130, 30));

        ddLogOut11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DropDownTop.png"))); // NOI18N
        rpPembelian.add(ddLogOut11, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 0, -1, 70));

        Btn_PrintPDFpengeluaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_PrintPDFpengeluaranMouseClicked(evt);
            }
        });
        rpPembelian.add(Btn_PrintPDFpengeluaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 610, 100, 30));

        Btn_PrintExcelpengeluaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_PrintExcelpengeluaranMouseClicked(evt);
            }
        });
        rpPembelian.add(Btn_PrintExcelpengeluaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 610, 100, 30));
        rpPembelian.add(jDateChooser4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 190, 30));
        rpPembelian.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 190, 30));

        Btn_CariPengeluaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Btn_CariReport_1.png"))); // NOI18N
        Btn_CariPengeluaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_CariPengeluaranMouseClicked(evt);
            }
        });
        rpPembelian.add(Btn_CariPengeluaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 90, 30));

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField5.setText("Rp");
        rpPembelian.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 550, -1, -1));

        Txt_TotalPengeluaran.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rpPembelian.add(Txt_TotalPengeluaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(835, 550, 135, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ReportPengeluaran.png"))); // NOI18N
        rpPembelian.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ReportPanel.add(rpPembelian, "card3");

        ContentPanel.add(ReportPanel, "card9");

        MenuPanel.setPreferredSize(new java.awt.Dimension(255, 720));
        MenuPanel.setLayout(new java.awt.CardLayout());

        HomeMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StokHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StokHomeMouseClicked(evt);
            }
        });
        HomeMenu.add(StokHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 250, 30));

        CashInOutHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CashInOutHomeMouseClicked(evt);
            }
        });
        HomeMenu.add(CashInOutHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 250, 40));

        PesanBarangHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PesanBarangHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PesanBarangHomeMouseEntered(evt);
            }
        });
        HomeMenu.add(PesanBarangHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 250, 30));

        TransaksiHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransaksiHomeMouseClicked(evt);
            }
        });
        HomeMenu.add(TransaksiHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 250, 40));

        namaTop6.setBackground(new java.awt.Color(255, 255, 255));
        namaTop6.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        namaTop6.setForeground(new java.awt.Color(255, 255, 255));
        HomeMenu.add(namaTop6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 130, 30));

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Navigasi.png"))); // NOI18N
        HomeMenu.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        MenuPanel.add(HomeMenu, "card2");

        TransaksiMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomeTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeTransaksiMouseClicked(evt);
            }
        });
        TransaksiMenu.add(HomeTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 250, 40));

        PesanBarangTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PesanBarangTransaksiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PesanBarangTransaksiMouseEntered(evt);
            }
        });
        TransaksiMenu.add(PesanBarangTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 250, 30));

        CashInOutTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CashInOutTransaksiMouseClicked(evt);
            }
        });
        TransaksiMenu.add(CashInOutTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 250, 40));

        StokBarangTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StokBarangTransaksiMouseClicked(evt);
            }
        });
        TransaksiMenu.add(StokBarangTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 250, 40));

        namaTop7.setBackground(new java.awt.Color(255, 255, 255));
        namaTop7.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        namaTop7.setForeground(new java.awt.Color(255, 255, 255));
        TransaksiMenu.add(namaTop7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 130, 30));

        Transaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Transaksi.png"))); // NOI18N
        TransaksiMenu.add(Transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        MenuPanel.add(TransaksiMenu, "card3");

        PesanBarangMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomePesanBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomePesanBarangMouseClicked(evt);
            }
        });
        PesanBarangMenu.add(HomePesanBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 250, 30));

        TransaksiPesanBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransaksiPesanBarangMouseClicked(evt);
            }
        });
        PesanBarangMenu.add(TransaksiPesanBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 250, 40));

        CashInOutPesanBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CashInOutPesanBarangMouseClicked(evt);
            }
        });
        PesanBarangMenu.add(CashInOutPesanBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 250, 40));

        StokBarangPesanBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StokBarangPesanBarangMouseClicked(evt);
            }
        });
        PesanBarangMenu.add(StokBarangPesanBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 250, 30));

        namaTop8.setBackground(new java.awt.Color(255, 255, 255));
        namaTop8.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        namaTop8.setForeground(new java.awt.Color(255, 255, 255));
        PesanBarangMenu.add(namaTop8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 130, 30));

        PesanBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Pesan Barang.png"))); // NOI18N
        PesanBarangMenu.add(PesanBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        MenuPanel.add(PesanBarangMenu, "card4");

        Pembelian.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomePesanBarang1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomePesanBarang1MouseClicked(evt);
            }
        });
        Pembelian.add(HomePesanBarang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 250, 30));

        TransaksiPesanBarang1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransaksiPesanBarang1MouseClicked(evt);
            }
        });
        Pembelian.add(TransaksiPesanBarang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 250, 40));

        CashInOutPesanBarang1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CashInOutPesanBarang1MouseClicked(evt);
            }
        });
        Pembelian.add(CashInOutPesanBarang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 250, 30));

        StokBarangPesanBarang1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StokBarangPesanBarang1MouseClicked(evt);
            }
        });
        Pembelian.add(StokBarangPesanBarang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 250, 30));

        namaTop9.setBackground(new java.awt.Color(255, 255, 255));
        namaTop9.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        namaTop9.setForeground(new java.awt.Color(255, 255, 255));
        Pembelian.add(namaTop9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 130, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/PembelianMenu.png"))); // NOI18N
        Pembelian.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        MenuPanel.add(Pembelian, "card5");

        Report.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomeStokBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeStokBarangMouseClicked(evt);
            }
        });
        Report.add(HomeStokBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 250, 30));

        TransaksiStokBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransaksiStokBarangMouseClicked(evt);
            }
        });
        Report.add(TransaksiStokBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 250, 40));

        PesanBarangStokBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PesanBarangStokBarangMouseClicked(evt);
            }
        });
        Report.add(PesanBarangStokBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 250, 30));

        CashInOutStokBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CashInOutStokBarangMouseClicked(evt);
            }
        });
        Report.add(CashInOutStokBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 250, 40));

        namaTop10.setBackground(new java.awt.Color(255, 255, 255));
        namaTop10.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        namaTop10.setForeground(new java.awt.Color(255, 255, 255));
        Report.add(namaTop10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 130, 30));

        StokBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ReportMenu.png"))); // NOI18N
        Report.add(StokBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        MenuPanel.add(Report, "card6");

        TopMenuPanel.setPreferredSize(new java.awt.Dimension(1025, 43));
        TopMenuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        TopMenuPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(971, 10, 40, 30));

        lblTopMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Top Menu.png"))); // NOI18N
        TopMenuPanel.add(lblTopMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout BodyPanelLayout = new javax.swing.GroupLayout(BodyPanel);
        BodyPanel.setLayout(BodyPanelLayout);
        BodyPanelLayout.setHorizontalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TopMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ContentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BodyPanelLayout.setVerticalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BodyPanelLayout.createSequentialGroup()
                        .addComponent(TopMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ContentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(BodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TransaksiHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransaksiHomeMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        ContentPanel.add(TransaksiPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(TransaksiMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_TransaksiHomeMouseClicked

    private void PesanBarangHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesanBarangHomeMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        ContentPanel.add(PemesanaPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(PesanBarangMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_PesanBarangHomeMouseClicked

    private void CashInOutHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CashInOutHomeMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        ContentPanel.add(brgStok);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(Pembelian);
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_CashInOutHomeMouseClicked

    private void StokHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StokHomeMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        ContentPanel.add(ReportPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(Report);
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_StokHomeMouseClicked

    private void HomeTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeTransaksiMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        ContentPanel.add(HomePanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(HomeMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_HomeTransaksiMouseClicked

    private void PesanBarangTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesanBarangTransaksiMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        ContentPanel.add(PemesanaPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(PesanBarangMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_PesanBarangTransaksiMouseClicked

    private void CashInOutTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CashInOutTransaksiMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        ContentPanel.add(brgStok);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(Pembelian);
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_CashInOutTransaksiMouseClicked

    private void StokBarangTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StokBarangTransaksiMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        ContentPanel.add(ReportPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(Report);
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_StokBarangTransaksiMouseClicked

    private void HomePesanBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePesanBarangMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        ContentPanel.add(HomePanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(HomeMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_HomePesanBarangMouseClicked

    private void TransaksiPesanBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransaksiPesanBarangMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        ContentPanel.add(TransaksiPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(TransaksiMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_TransaksiPesanBarangMouseClicked

    private void CashInOutPesanBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CashInOutPesanBarangMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        ContentPanel.add(brgStok);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(Pembelian);
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_CashInOutPesanBarangMouseClicked

    private void StokBarangPesanBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StokBarangPesanBarangMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        ContentPanel.add(ReportPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(Report);
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_StokBarangPesanBarangMouseClicked

    private void HomeStokBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeStokBarangMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        ContentPanel.add(HomePanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(HomeMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_HomeStokBarangMouseClicked

    private void TransaksiStokBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransaksiStokBarangMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        ContentPanel.add(TransaksiPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(TransaksiMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_TransaksiStokBarangMouseClicked

    private void PesanBarangStokBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesanBarangStokBarangMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        ContentPanel.add(PemesanaPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(PesanBarangMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_PesanBarangStokBarangMouseClicked

    private void CashInOutStokBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CashInOutStokBarangMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        ContentPanel.add(brgStok);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(Pembelian);
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_CashInOutStokBarangMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        ddLogOut12.setVisible(true);
        btnLogOut12.setVisible(true);
        btnAbout12.setVisible(true);
        
        ddLogOut3.setVisible(true);
        btnLogOut3.setVisible(true);
        btnAbout3.setVisible(true);
        
        ddLogOut4.setVisible(true);
        btnLogOut4.setVisible(true);
        btnAbout4.setVisible(true);
        
        ddLogOut5.setVisible(true);
        btnLogOut5.setVisible(true);
        btnAbout5.setVisible(true);
        
        ddLogOut6.setVisible(true);
        btnLogOut6.setVisible(true);
        btnAbout6.setVisible(true);
        
        ddLogOut7.setVisible(true);
        btnLogOut7.setVisible(true);
        btnAbout7.setVisible(true);
        
        ddLogOut10.setVisible(true);
        btnLogOut10.setVisible(true);
        btnAbout10.setVisible(true);
        
        ddLogOut11.setVisible(true);
        btnLogOut11.setVisible(true);
        btnAbout11.setVisible(true);
        
        ddLogOut13.setVisible(true);
        btnLogOut13.setVisible(true);
        btnAbout13.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void btnLogOut3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOut3MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new LogIn().setVisible(true);
    }//GEN-LAST:event_btnLogOut3MouseClicked

    private void HomePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePanelMouseClicked
        // TODO add your handling code here:
        ddLogOut12.setVisible(false);
        btnLogOut12.setVisible(false);
        btnAbout12.setVisible(false);
        
        ddLogOut3.setVisible(false);
        btnLogOut3.setVisible(false);
        btnAbout3.setVisible(false);
        
        ddLogOut4.setVisible(false);
        btnLogOut4.setVisible(false);
        btnAbout4.setVisible(false);
        
        ddLogOut5.setVisible(false);
        btnLogOut5.setVisible(false);
        btnAbout5.setVisible(false);
        
        ddLogOut6.setVisible(false);
        btnLogOut6.setVisible(false);
        btnAbout6.setVisible(false);
        
        ddLogOut7.setVisible(false);
        btnLogOut7.setVisible(false);
        btnAbout7.setVisible(false);
        
        ddLogOut10.setVisible(false);
        btnLogOut10.setVisible(false);
        btnAbout10.setVisible(false);
        
        ddLogOut11.setVisible(false);
        btnLogOut11.setVisible(false);
        btnAbout11.setVisible(false);
        
        ddLogOut13.setVisible(false);
        btnLogOut13.setVisible(false);
        btnAbout13.setVisible(false);
    }//GEN-LAST:event_HomePanelMouseClicked

    private void btnRpPembelianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRpPembelianMouseClicked
        // TODO add your handling code here:
        ReportPanel.removeAll();
        ReportPanel.repaint();
        ReportPanel.revalidate();

        ReportPanel.add(rpPembelian);
        ReportPanel.repaint();
        ReportPanel.revalidate();
    }//GEN-LAST:event_btnRpPembelianMouseClicked

    private void btnLogOut10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOut10MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new LogIn().setVisible(true);
    }//GEN-LAST:event_btnLogOut10MouseClicked

    private void Btn_CariPemasukanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_CariPemasukanMouseClicked
        String tampilan = "yyyy-MM-dd";
        String tampilann = "yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        SimpleDateFormat fmm = new SimpleDateFormat(tampilann);
        String tanggal = String.valueOf(fm.format(jDateChooser2.getDate()));
        String tanggal2 = String.valueOf(fmm.format(jDateChooser3.getDate()));
        
        try{
            java.sql.Connection conn=(com.mysql.jdbc.Connection)koneksi.getKoneksi();
            String sql = 
                    "SELECT penjualan.id_penjualan, penjualan.tanggal_penjualan, "
                    + "karyawan.nama_karyawan, penjualan.nama_customer, barang.nama_barang, "
                    + "detail_penjualan.qty, detail_penjualan.sub_total FROM karyawan JOIN "
                    + "penjualan on karyawan.id_karyawan = penjualan.id_karyawan JOIN "
                    + "detail_penjualan ON penjualan.id_penjualan = detail_penjualan.id_penjualan "
                    + "JOIN barang ON detail_penjualan.id_barang = barang.id_barang WHERE "
                    + "penjualan.tanggal_penjualan BETWEEN '" +tanggal+"' AND '"+tanggal2+"' ORDER by penjualan.tanggal_penjualan ASC";
            
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            modelreportpemasukan.getDataVector().removeAllElements();
            int a = 1;
            while(rs.next()){
            Object[] obj = new Object[8];
               obj[0] = a++;
               obj[1] = rs.getString(1);
               obj[2] = rs.getDate(2);
               obj[3] = rs.getString(3);
               obj[4] = rs.getString(4);
               obj[5] = rs.getString(5);
               obj[6] = rs.getString(6);
               obj[7] = rs.getString(7);
               
               modelreportpemasukan.addRow(obj);
            }
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
      
        JumlahPemasukan();
    }//GEN-LAST:event_Btn_CariPemasukanMouseClicked

    private void Btn_PrintExcelPemasukanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_PrintExcelPemasukanMouseClicked
        try {
            JFileChooser jfilechooserr= new JFileChooser();
            jfilechooserr.showSaveDialog(this);
            File saveFile = jfilechooserr.getSelectedFile();
            if (saveFile != null){
                saveFile= new File(saveFile.toString()+".xlsx");
                Workbook wb = new org.apache.poi.xssf.usermodel.XSSFWorkbook();
                org.apache.poi.ss.usermodel.Sheet sheet = wb.createSheet("Customer");
                Row rowcoll= sheet.createRow(0);
                for (int i = 0; i < jTable7.getColumnCount(); i++) {
                    org.apache.poi.ss.usermodel.Cell cell= rowcoll.createCell(i);
                    cell.setCellValue(jTable7.getColumnName(i));

                }for (int j = 0; j < jTable7.getRowCount(); j++) {
                    Row row = sheet.createRow(j+1);
                    for (int k = 0; k < jTable7.getColumnCount(); k++) {
                        org.apache.poi.ss.usermodel.Cell cell = row.createCell(k);
                        if (jTable7.getValueAt(j,k)!=null) {
                            cell.setCellValue(jTable7.getValueAt(j, k).toString());
                        }
                    }
                }
                FileOutputStream out = new FileOutputStream(new File(saveFile.toString()));
                wb.write(out);
                wb.close();
                out.close();
                //openFile(saveFile.toString());
            }else{
                JOptionPane.showMessageDialog(null, "Rekap Excel Berhasil dibuat");
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }catch(IOException io){
            System.out.println(io);

        }
    }//GEN-LAST:event_Btn_PrintExcelPemasukanMouseClicked

    private void btn_PrintPDFPemasukanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PrintPDFPemasukanMouseClicked
        String tampilan = "yyyy-MM-dd";
    SimpleDateFormat fm = new SimpleDateFormat(tampilan);
    String tanggal = String.valueOf(fm.format(jDateChooser2.getDate()));    
    String tanggal1 = String.valueOf(fm.format(jDateChooser3.getDate())); 
        try{
            InputStream nota = getClass().getResourceAsStream("report2.jasper");
            Connection conn = (Connection) koneksi.getKoneksi();
            HashMap param = new HashMap();
            param.put("parameter1", tanggal);
            param.put("parameter2", tanggal1);
            
            JasperPrint jp = JasperFillManager.fillReport(nota, param, conn);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_PrintPDFPemasukanMouseClicked

    private void btnRpPenjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRpPenjualanMouseClicked
        // TODO add your handling code here:
        ReportPanel.removeAll();
        ReportPanel.repaint();
        ReportPanel.revalidate();

        ReportPanel.add(rpPenjualan);
        ReportPanel.repaint();
        ReportPanel.revalidate();
    }//GEN-LAST:event_btnRpPenjualanMouseClicked

    private void btnLogOut11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOut11MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new LogIn().setVisible(true);
    }//GEN-LAST:event_btnLogOut11MouseClicked

    private void Btn_PrintPDFpengeluaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_PrintPDFpengeluaranMouseClicked
        String tampilan = "yyyy-MM-dd";
    SimpleDateFormat fm = new SimpleDateFormat(tampilan);
    String tanggal = String.valueOf(fm.format(jDateChooser1.getDate()));   
    String tanggal1 = String.valueOf(fm.format(jDateChooser4.getDate()));   
        try{
            InputStream nota = getClass().getResourceAsStream("report3.jasper");
            Connection conn = (Connection) koneksi.getKoneksi();
            HashMap paramm = new HashMap();
            paramm.put("parameterr1", tanggal);
            paramm.put("parameterr2", tanggal1);
            
            JasperPrint jp = JasperFillManager.fillReport(nota, paramm, conn);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_Btn_PrintPDFpengeluaranMouseClicked

    private void Btn_PrintExcelpengeluaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_PrintExcelpengeluaranMouseClicked
        try {
            JFileChooser jfilechooserr= new JFileChooser();
            jfilechooserr.showSaveDialog(this);
            File saveFile = jfilechooserr.getSelectedFile();
            if (saveFile != null){
                saveFile= new File(saveFile.toString()+".xlsx");
                Workbook wb = new org.apache.poi.xssf.usermodel.XSSFWorkbook();
                org.apache.poi.ss.usermodel.Sheet sheet = wb.createSheet("Customer");
                Row rowcoll= sheet.createRow(0);
                for (int i = 0; i < jTable6.getColumnCount(); i++) {
                    org.apache.poi.ss.usermodel.Cell cell= rowcoll.createCell(i);
                    cell.setCellValue(jTable6.getColumnName(i));

                }for (int j = 0; j < jTable6.getRowCount(); j++) {
                    Row row = sheet.createRow(j+1);
                    for (int k = 0; k < jTable6.getColumnCount(); k++) {
                        org.apache.poi.ss.usermodel.Cell cell = row.createCell(k);
                        if (jTable6.getValueAt(j,k)!=null) {
                            cell.setCellValue(jTable6.getValueAt(j, k).toString());
                        }
                    }
                }
                FileOutputStream out = new FileOutputStream(new File(saveFile.toString()));
                wb.write(out);
                wb.close();
                out.close();
                //openFile(saveFile.toString());
            }else{
                JOptionPane.showMessageDialog(null, "Rekap Excel Berhasil dibuat");
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }catch(IOException io){
            System.out.println(io);

        }
    }//GEN-LAST:event_Btn_PrintExcelpengeluaranMouseClicked

    private void Btn_CariPengeluaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_CariPengeluaranMouseClicked
        String tampilan = "yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(fm.format(jDateChooser1.getDate()));
        String tanggal2 = String.valueOf(fm.format(jDateChooser4.getDate()));
        try{
            java.sql.Connection conn=(com.mysql.jdbc.Connection)koneksi.getKoneksi();
            String sql = ("SELECT pembelian.id_pembelian, karyawan.nama_karyawan, "
                    + "pembelian.tanggal_pembelian,barang.nama_barang, detail_pembelian.qty, "
                    + "detail_pembelian.sub_total from karyawan JOIN pembelian on "
                    + "karyawan.id_karyawan = pembelian.id_karyawan join detail_pembelian "
                    + "ON pembelian.id_pembelian = detail_pembelian.id_pembelian join barang "
                    + "ON detail_pembelian.id_barang = barang.id_barang "
                    + "WHERE pembelian.tanggal_pembelian BETWEEN '" + tanggal +"' AND '"
                    + tanggal2 + "' ORDER by pembelian.tanggal_pembelian ASC");
            
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            modelreportpengeluaran.getDataVector().removeAllElements();
            int a = 1;
            while(rs.next()){
            Object[] obj = new Object[7];
               obj[0] = a++;
               obj[1] = rs.getString(1);
               obj[2] = rs.getString(2);
               obj[3] = rs.getDate(3);
               obj[4] = rs.getString(4);
               obj[5] = rs.getString(5);
               obj[6] = rs.getString(6);
               
               
               modelreportpengeluaran.addRow(obj);
               
            }
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
       JumlahPengeluaran();
    }//GEN-LAST:event_Btn_CariPengeluaranMouseClicked

    private void ReportPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportPanelMouseClicked
        // TODO add your handling code here:
ddLogOut12.setVisible(false);
        btnLogOut12.setVisible(false);
        btnAbout12.setVisible(false);
        
        ddLogOut3.setVisible(false);
        btnLogOut3.setVisible(false);
        btnAbout3.setVisible(false);
        
        ddLogOut4.setVisible(false);
        btnLogOut4.setVisible(false);
        btnAbout4.setVisible(false);
        
        ddLogOut5.setVisible(false);
        btnLogOut5.setVisible(false);
        btnAbout5.setVisible(false);
        
        ddLogOut6.setVisible(false);
        btnLogOut6.setVisible(false);
        btnAbout6.setVisible(false);
        
        ddLogOut7.setVisible(false);
        btnLogOut7.setVisible(false);
        btnAbout7.setVisible(false);
        
        ddLogOut10.setVisible(false);
        btnLogOut10.setVisible(false);
        btnAbout10.setVisible(false);
        
        ddLogOut11.setVisible(false);
        btnLogOut11.setVisible(false);
        btnAbout11.setVisible(false);
        
        ddLogOut13.setVisible(false);
        btnLogOut13.setVisible(false);
        btnAbout13.setVisible(false);
    }//GEN-LAST:event_ReportPanelMouseClicked

    private void HomePesanBarang1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePesanBarang1MouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        ContentPanel.add(HomePanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(HomeMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();
    }//GEN-LAST:event_HomePesanBarang1MouseClicked

    private void TransaksiPesanBarang1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransaksiPesanBarang1MouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        ContentPanel.add(TransaksiPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(TransaksiMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();
    }//GEN-LAST:event_TransaksiPesanBarang1MouseClicked

    private void CashInOutPesanBarang1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CashInOutPesanBarang1MouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        ContentPanel.add(PemesanaPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(PesanBarangMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();
    }//GEN-LAST:event_CashInOutPesanBarang1MouseClicked

    private void StokBarangPesanBarang1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StokBarangPesanBarang1MouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();
        
        ContentPanel.add(ReportPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(Report);
        MenuPanel.repaint();
        MenuPanel.revalidate();
    }//GEN-LAST:event_StokBarangPesanBarang1MouseClicked

    private void detailPesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailPesananActionPerformed
        // TODO add your handling code here:
        int barisSup = jTable4.getSelectedRow();
        String idBarang = jTable4.getValueAt(barisSup, 1).toString();
        PopUpDetailPesanan p = new PopUpDetailPesanan((JFrame) SwingUtilities.getWindowAncestor(this), idBarang);
        p.setVisible(true);

        getDataPemesanan();
    }//GEN-LAST:event_detailPesananActionPerformed

    private void TandaiSelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TandaiSelesaiActionPerformed
        // TODO add your handling code here:
        int barisSup = jTable4.getSelectedRow();
        String status = jTable4.getValueAt(barisSup, 7).toString();
        if(status.equalsIgnoreCase("Proses")){
            try {
                String sql1 = "UPDATE pemesanan set status = 'Selesai' where id_pemesanan='"+jTable4.getValueAt(barisSup, 1)+"'";
                java.sql.Connection conn=(Connection)koneksi.getKoneksi();
                java.sql.PreparedStatement pst1=conn.prepareStatement(sql1);
                pst1.execute();
            } catch (Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }

        try {
            String sql = "INSERT INTO barang (id_barang,nama_barang,kategori,harga_jual,barcode,stok) VALUES ('"
            +txtIdbarps.getText()+"','"
            +"Kain Pesanan "+jTable4.getValueAt(barisSup, 1)+" "+jTable4.getValueAt(barisSup, 2)+"','"
            +"Pesanan"+"','"
            +jTable4.getValueAt(barisSup, 6)+"','"
            +txtKodebarPesan.getText()+"','1')";
            java.sql.Connection conn=(Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst1=conn.prepareStatement(sql);
            pst1.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        }if(status.equalsIgnoreCase("Selesai")){
            JOptionPane.showMessageDialog(null, "Barang Sudah Selesai!");
        }
        getDataPemesanan();
    }//GEN-LAST:event_TandaiSelesaiActionPerformed

    private void checkOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutActionPerformed
        // TODO add your handling code here:
        int barisSup = jTable4.getSelectedRow();
        String status = jTable4.getValueAt(barisSup, 7).toString();
        if(status.equalsIgnoreCase("Selesai")){
            ContentPanel.removeAll();
            ContentPanel.repaint();
            ContentPanel.revalidate();

            ContentPanel.add(TransaksiPanel);
            ContentPanel.repaint();
            ContentPanel.revalidate();

            try {
                String sql="INSERT INTO penjualan (id_penjualan, id_karyawan, tanggal_penjualan) VALUES('"
                +txtKodebarPesan1.getText()
                +"','"+txtKodebarPesan2.getText()
                +"','"+txtKodebarPesan3.getText()+"')";
                java.sql.Connection conn=(com.mysql.jdbc.Connection)koneksi.getKoneksi();
                java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                pst.execute();
            }catch (Exception e){
                //            JOptionPane.showMessageDialog(null, e.getMessage());
            }

            try {
                String sql1 = "INSERT INTO detail_penjualan (id_penjualan, id_barang, sub_total, qty) VALUES ('"
                +txtKodebarPesan1.getText()+"','"
                +txtIdbarps.getText()+"','"
                +jTable4.getValueAt(barisSup, 6)+"','1')";
                java.sql.Connection conn=(com.mysql.jdbc.Connection)koneksi.getKoneksi();
                java.sql.PreparedStatement pst1=conn.prepareStatement(sql1);
                pst1.execute();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }

            qtyTrx.add(1);
            nambarTrx.add("Kain Pesanan "+jTable4.getValueAt(barisSup, 1)+" "+jTable4.getValueAt(barisSup, 2));
            totalTrx.add(jTable4.getValueAt(barisSup, 6));
            setTabelTransaksi();
            
            try {
                String sql1 = "UPDATE pemesanan set status = 'Diambil' where id_pemesanan='"+jTable4.getValueAt(barisSup, 1)+"'";
                java.sql.Connection conn=(Connection)koneksi.getKoneksi();
                java.sql.PreparedStatement pst1=conn.prepareStatement(sql1);
                pst1.execute();
            } catch (Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Barang belum selesai!");
        }
    }//GEN-LAST:event_checkOutActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        int barisSup = jTable4.getSelectedRow();
        String status = jTable4.getValueAt(barisSup, 7).toString();
        String idPemesanan = jTable4.getValueAt(barisSup, 1).toString();
        if(status.equalsIgnoreCase("Diambil")){
            WarningDeletePesanan x = new WarningDeletePesanan((JFrame) SwingUtilities.getWindowAncestor(this), idPemesanan);
            x.setVisible(true);
        }else{
            WarningCancelPesanan y = new WarningCancelPesanan((JFrame) SwingUtilities.getWindowAncestor(this), idPemesanan);
            y.setVisible(true);
        }
        getDataPemesanan();
    }//GEN-LAST:event_hapusActionPerformed

    private void cancelPemesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelPemesananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelPemesananActionPerformed

    private void PesanBarangHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesanBarangHomeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_PesanBarangHomeMouseEntered

    private void PesanBarangTransaksiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesanBarangTransaksiMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_PesanBarangTransaksiMouseEntered

    private void btnAbout3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbout3MouseClicked
        new About().setVisible(true);
        btnAbout3.setVisible(false);
        btnLogOut3.setVisible(false);
        ddLogOut3.setVisible(false);
    }//GEN-LAST:event_btnAbout3MouseClicked

    private void btnAbout10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbout10MouseClicked
        new About().setVisible(true);
        btnAbout10.setVisible(false);
        btnLogOut10.setVisible(false);
        ddLogOut10.setVisible(false);
    }//GEN-LAST:event_btnAbout10MouseClicked

    private void PembelianPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PembelianPanelMouseClicked
        // TODO add your handling code here:
        ddLogOut12.setVisible(false);
        btnLogOut12.setVisible(false);
        btnAbout12.setVisible(false);

        ddLogOut3.setVisible(false);
        btnLogOut3.setVisible(false);
        btnAbout3.setVisible(false);

        ddLogOut4.setVisible(false);
        btnLogOut4.setVisible(false);
        btnAbout4.setVisible(false);

        ddLogOut5.setVisible(false);
        btnLogOut5.setVisible(false);
        btnAbout5.setVisible(false);

        ddLogOut6.setVisible(false);
        btnLogOut6.setVisible(false);
        btnAbout6.setVisible(false);

        ddLogOut7.setVisible(false);
        btnLogOut7.setVisible(false);
        btnAbout7.setVisible(false);

        ddLogOut10.setVisible(false);
        btnLogOut10.setVisible(false);
        btnAbout10.setVisible(false);

        ddLogOut11.setVisible(false);
        btnLogOut11.setVisible(false);
        btnAbout11.setVisible(false);

        ddLogOut13.setVisible(false);
        btnLogOut13.setVisible(false);
        btnAbout13.setVisible(false);
    }//GEN-LAST:event_PembelianPanelMouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        // TODO add your handling code here:
        try {
            String sql ="DELETE FROM detail_pembelian where id_pembelian='"+txtIdres2.getText()+"'";
            java.sql.Connection conn=(Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            //        JOptionPane.showMessageDialog(this, "Berhasil di Hapus");
        } catch (Exception e) {
            //        JOptionPane.showMessageDialog(this, "Data ini dibutuhkan dalam fitur lain");
        }

        try {
            String sql ="DELETE FROM pembelian where id_pembelian='"+txtIdres2.getText()+"'";
            java.sql.Connection conn=(Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            //        JOptionPane.showMessageDialog(this, "Berhasil di Hapus");
        } catch (Exception e) {
            //        JOptionPane.showMessageDialog(this, "Data ini dibutuhkan dalam fitur lain");
        }

        try {
            String sql ="DELETE FROM barang where id_barang='"+txtIdbar2.getText()+"'";
            java.sql.Connection conn=(Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            //        JOptionPane.showMessageDialog(this, "Berhasil di Hapus");
        } catch (Exception e) {
            //        JOptionPane.showMessageDialog(this, "Data ini dibutuhkan dalam fitur lain");
        }
        clear();
        id_autoBarang();
        id_autoPembelian();
        getDataBarangTransaksi();
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
        if(txtTotalBB.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Belum ada Barang yang dibeli");
        } else {
            try {
                String sql1 = "UPDATE pembelian set total_pembelian='"+txtTotalBB.getText()+
                "'where Id_pembelian='"+txtIdres2.getText()+"'";
                java.sql.Connection conn=(Connection)koneksi.getKoneksi();
                java.sql.PreparedStatement pst1=conn.prepareStatement(sql1);
                pst1.execute();
            } catch (Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }

            clear();
            id_autoPembelian();
            id_autoBarang();
            getDataBarangTransaksi();
            dashboardchartbulanan();
            
        }
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
        if(txtIdbar2.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field ID Barang belum diisi");
        } else if(txtNambarBB.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Nama Barang belum diisi");
        } else if(txtKodebarBB.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Kode Barcode belum diisi");
        } else if(txtHarbelBB.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Harga Beli belum diisi");
        } else if(txtIdsup.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Silahkan pilih Supplier terlebih dahulu");
        } else {
            try {
                String sql = "INSERT INTO barang (id_barang,nama_barang,kategori,ukuran,motif, barcode, harga_beli, id_supplier) VALUES ('"
                +txtIdbar2.getText()+"','"
                +txtNambarBB.getText()+"','"
                +cb_distributor1.getSelectedItem()+"','"
                +txtUkuranBB.getText()+"','"
                +txtMotifBB.getText()+"','"
                +txtKodebarBB.getText()+"','"
                +txtHarbelBB.getText()+"','"
                +txtIdsup.getText()+"')";
                java.sql.Connection conn=(Connection)koneksi.getKoneksi();
                java.sql.PreparedStatement pst1=conn.prepareStatement(sql);
                pst1.execute();
            } catch (Exception e) {
                //            JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

        if(txtIdres2.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field ID Pembelian belum diisi");
        } else if(txtQtyBB.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Qty belum diisi");
        } else if(txtSubtoBB.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Subtotal belum diisi");
        } else {
            try {
                String sql1 = "INSERT INTO detail_pembelian (id_pembelian,id_barang,nama_supplier,qty,sub_total) VALUES ('"
                +txtIdres2.getText()+"','"
                +txtIdbar2.getText()+"','"
                +cb_distributor.getSelectedItem()+"','"
                +txtQtyBB.getText()+"','"
                +txtSubtoBB.getText()+"')";
                java.sql.Connection conn=(Connection)koneksi.getKoneksi();
                java.sql.PreparedStatement pst1=conn.prepareStatement(sql1);
                pst1.execute();
            } catch (Exception e) {
                //            JOptionPane.showMessageDialog(null, e.getMessage());
            }

            try{
                Linear barcode = new Linear();
                barcode.setType(Linear.CODE128B);
                barcode.setData(txtKodebarBB.getText());
                barcode.setI(11.0f);
                String fname = txtKodebarBB.getText();
                barcode.renderBarcode("src/barcode/" + fname + ".png");
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

            nambarBB.add(txtNambarBB.getText());
            hargaBB.add(txtHarbelBB.getText());
            qtyBB.add(txtQtyBB.getText());
            subtoBB.add(txtSubtoBB.getText());
            setTabelPembelianBB();

            id_autoBarang();

            txtNambarBB.setText(null);
            txtMotifBB.setText(null);
            txtHarbelBB.setText(null);
            txtQtyBB.setText(null);
            txtSubtoBB.setText(null);
            txtUkuranBB.setText(null);
            cb_distributor1.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jLabel23MouseClicked

    private void txtSubtoBBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSubtoBBMouseClicked
        // TODO add your handling code here:
        //        try{
            //            int harga = Integer.parseInt(txtHarbelBB.getText());
            //            int qty = Integer.parseInt(txtQtyBB.getText());
            //            txtSubtoBB.setText(""+(harga*qty));
            //        }catch(NumberFormatException e){
            //            //            txt_subtotal.setText("0");
            //        }
    }//GEN-LAST:event_txtSubtoBBMouseClicked

    private void txtQtyBBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyBBKeyReleased
        // TODO add your handling code here:
        try{
            int harga = Integer.parseInt(txtHarbelBB.getText());
            int qty = Integer.parseInt(txtQtyBB.getText());
            txtSubtoBB.setText(""+(harga*qty));
        }catch(NumberFormatException e){
            //            txt_subtotal.setText("0");
        }
    }//GEN-LAST:event_txtQtyBBKeyReleased

    private void txtQtyBBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQtyBBMouseClicked
        // TODO add your handling code here:
        if(txtIdres2.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field ID Pembelian belum diisi");
        } else if(txtIdsup.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Silahkan pilih Supplier terlebih dahulu");
        } else if(txtIdkarBB.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field ID Karyawan belum diisi");
        } else if(txtTanggalBB.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Tanggal belum diisi");
        } else {
            try {
                String sql="INSERT INTO pembelian(id_pembelian,id_supplier,id_karyawan,tanggal_pembelian)"
                + " VALUES('"
                +txtIdres2.getText()
                +"','"+txtIdsup.getText()
                +"','"+txtIdkarBB.getText()
                +"','"+txtTanggalBB.getText()+"')";
                java.sql.Connection conn=(Connection)koneksi.getKoneksi();
                java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                pst.execute();
            } catch (Exception e) {
                //            JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_txtQtyBBMouseClicked

    private void rpbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rpbbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rpbbActionPerformed

    private void txtTotalBBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalBBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalBBActionPerformed

    private void btnLogOut7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOut7MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new LogIn().setVisible(true);
    }//GEN-LAST:event_btnLogOut7MouseClicked

    private void cb_distributor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_distributor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_distributor1ActionPerformed

    private void cb_distributor1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cb_distributor1PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_distributor1PopupMenuWillBecomeInvisible

    private void cb_distributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_distributorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_distributorActionPerformed

    private void cb_distributorPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cb_distributorPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        String tmp =(String)cb_distributor.getSelectedItem();
        String sql ="select * from supplier where nama_supplier=?";
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            con = (Connection)koneksi.getKoneksi();
            ps = con.prepareStatement(sql);
            ps.setString(1, tmp);
            rs = ps.executeQuery();
            if(rs.next()){
                String add = rs.getString("id_supplier");
                txtIdsupbs.setText(add);
                txtIdsup.setText(add);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cb_distributorPopupMenuWillBecomeInvisible

    private void btnBPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBPMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();

        ContentPanel.add(brgStok);
        ContentPanel.repaint();
        ContentPanel.revalidate();
    }//GEN-LAST:event_btnBPMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();

        ContentPanel.add(brgBaru);
        ContentPanel.repaint();
        ContentPanel.revalidate();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        // TODO add your handling code here:
        try {
            String sql ="DELETE FROM detail_pembelian where id_pembelian='"+txtIdresbs.getText()+"'";
            java.sql.Connection conn=(Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            //        JOptionPane.showMessageDialog(this, "Berhasil di Hapus");
        } catch (Exception e) {
            //        JOptionPane.showMessageDialog(this, "Data ini dibutuhkan dalam fitur lain");
        }

        try {
            String sql ="DELETE FROM pembelian where id_pembelian='"+txtIdresbs.getText()+"'";
            java.sql.Connection conn=(Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            //        JOptionPane.showMessageDialog(this, "Berhasil di Hapus");
        } catch (Exception e) {
            //        JOptionPane.showMessageDialog(this, "Data ini dibutuhkan dalam fitur lain");
        }
        clearbs();
        id_autoPembelian();
        getDataBarangTransaksi();
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        // TODO add your handling code here:
        if(txtTotalbs.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Belum ada Barang yang dibeli");
        } else {
            try {
                String sql1 = "UPDATE pembelian set total_pembelian='"+txtTotalbs.getText()+
                "'where Id_pembelian='"+txtIdresbs.getText()+"'";
                java.sql.Connection conn=(Connection)koneksi.getKoneksi();
                java.sql.PreparedStatement pst1=conn.prepareStatement(sql1);
                pst1.execute();
            } catch (Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
            clearbs();
            id_autoPembelian();
            getDataBarangTransaksi();
            getDataReportPengeluaran();
            dashboardchartbulanan();
        }
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        // TODO add your handling code here:
        try {
            String sql1 = "UPDATE barang set harga_beli='"+txtHarbelbs.getText()+
                    "'where Id_barang='"+txtIdbarbs.getText()+"'";
            java.sql.Connection conn=(Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst1=conn.prepareStatement(sql1);
            pst1.execute();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }

        if(txtIdresbs.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field ID Pembelian belum diisi");
        } else if(txtIdsupbs.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Silahkan pilih Supplier terlebih dahulu");
        } else if(txtIdbarbs.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Silahkan pilih Barang terlebih dahulu");
        } else if(txtQtybs.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Qty belum diisi");
        } else if(txtSubtobs.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Subtotal belum diisi");
        } else {
            try {
            String sql1 = "INSERT INTO detail_pembelian (id_pembelian,id_barang,nama_supplier,qty,sub_total) VALUES ('"
            +txtIdresbs.getText()+"','"
            +txtIdbarbs.getText()+"','"
            +cb_distributor3.getSelectedItem()+"','"
            +txtQtybs.getText()+"','"
            +txtSubtobs.getText()+"')";
            java.sql.Connection conn=(Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst1=conn.prepareStatement(sql1);
            pst1.execute();
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            }

            String namaBarangBs = cb_distributor2.getSelectedItem().toString();
            cekDataTabelBS(namaBarangBs);

            nambarbs.add(txtIdkarbs1.getText());
            hargabs.add(txtHarbelbs.getText());
            qtybs.add(txtQtybs.getText());
            subtobs.add(txtSubtobs.getText());
            setTabelPembelianBS();

            txtHarbelbs.setText(null);
            txtQtybs.setText(null);
            txtSubtobs.setText(null);
            cb_distributor2.setSelectedIndex(0);
        }

    }//GEN-LAST:event_jLabel26MouseClicked

    private void txtSubtobsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubtobsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubtobsActionPerformed

    private void txtSubtobsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSubtobsMouseClicked
        // TODO add your handling code here:
        //        try{
            //            int harga = Integer.parseInt(txtHarbelbs.getText());
            //            int qty = Integer.parseInt(txtQtybs.getText());
            //            txtSubtobs.setText(""+(harga*qty));
            //        }catch(NumberFormatException e){
            //            //            txt_subtotal.setText("0");
            //        }
    }//GEN-LAST:event_txtSubtobsMouseClicked

    private void txtQtybsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtybsKeyReleased
        // TODO add your handling code here:
        try{
            int harga = Integer.parseInt(txtHarbelbs.getText());
            int qty = Integer.parseInt(txtQtybs.getText());
            txtSubtobs.setText(""+(harga*qty));
        }catch(NumberFormatException e){
            //            txt_subtotal.setText("0");
        }
    }//GEN-LAST:event_txtQtybsKeyReleased

    private void txtQtybsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQtybsMouseClicked
        // TODO add your handling code here:
        if(txtIdresbs.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field ID Pembelian belum diisi");
        } else if(txtIdsupbs.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Silahkan pilih Supplier terlebih dahulu");
        } else if(txtIdkarbs.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field ID Karyawan belum diisi");
        } else if(txtTanggalbs.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Tanggal belum diisi");
        } else {
            try {
            String sql="INSERT INTO pembelian(id_pembelian,id_supplier,id_karyawan, "
                    + "Hari_pembelian, tanggal_pembelian,BulanPembelian, JamPembelian)"
                    + " VALUES('"
                    +txtIdresbs.getText()
                    +"','"+txtIdsupbs.getText()
                    +"','"+txtIdkarbs.getText()
                    +"','"+txt_Haribeli.getText()
                    +"','"+txtTanggalbs.getText()
                    +"','"+txt_bulanbeli.getText()
                    +"','"+txt_Jambeli.getText()
                    +"')";
            java.sql.Connection conn=(Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_txtQtybsMouseClicked

    private void cb_distributor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_distributor3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_distributor3ActionPerformed

    private void cb_distributor3PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cb_distributor3PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        String tmp =(String)cb_distributor3.getSelectedItem();
        String sql ="select * from supplier where nama_supplier=?";
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            con = (Connection)koneksi.getKoneksi();
            ps = con.prepareStatement(sql);
            ps.setString(1, tmp);
            rs = ps.executeQuery();
            if(rs.next()){
                String add = rs.getString("id_supplier");
                txtIdsupbs.setText(add);
                ComboBoxBarang();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cb_distributor3PopupMenuWillBecomeInvisible

    private void cb_distributor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_distributor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_distributor2ActionPerformed

    private void cb_distributor2PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cb_distributor2PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        String tmp =(String)cb_distributor2.getSelectedItem();
        String sql ="select * from barang where nama_barang=?";
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            con = (Connection)koneksi.getKoneksi();
            ps = con.prepareStatement(sql);
            ps.setString(1, tmp);
            rs = ps.executeQuery();
            if(rs.next()){
                String add = rs.getString("id_barang");
                txtIdbarbs.setText(add);
                txtHarbelbs.setText(rs.getString("harga_beli"));
                txtIdkarbs1.setText(rs.getString("nama_barang"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        cb_distributor2.removeAllItems();
        cb_distributor2.addItem("- PILIH -");
    }//GEN-LAST:event_cb_distributor2PopupMenuWillBecomeInvisible

    private void rpbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rpbsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rpbsActionPerformed

    private void btnAbout5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbout5MouseClicked
        new About().setVisible(true);
        btnAbout5.setVisible(false);
        btnLogOut5.setVisible(false);
        ddLogOut5.setVisible(false);
    }//GEN-LAST:event_btnAbout5MouseClicked

    private void btnLogOut5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOut5MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new LogIn().setVisible(true);
    }//GEN-LAST:event_btnLogOut5MouseClicked

    private void PesanPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesanPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PesanPanelMouseClicked

    private void PesanBarangPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesanBarangPanelMouseClicked
        // TODO add your handling code here:
        //        ddLogOut.setVisible(false);
        //        btnLogOut.setVisible(false);
        //        btnAbout.setVisible(false);
        //
        //        ddLogOut1.setVisible(false);
        //        btnLogOut1.setVisible(false);
        //        btnAbout1.setVisible(false);
        //
        //        ddLogOut2.setVisible(false);
        //        btnLogOut2.setVisible(false);
        //        btnAbout2.setVisible(false);

        ddLogOut12.setVisible(false);
        btnLogOut12.setVisible(false);
        btnAbout12.setVisible(false);

        ddLogOut13.setVisible(false);
        btnLogOut13.setVisible(false);
        btnAbout13.setVisible(false);
    }//GEN-LAST:event_PesanBarangPanelMouseClicked

    private void txtIdBPesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdBPesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdBPesActionPerformed

    private void txtTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTanggalActionPerformed

    private void txtIdkarpesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdkarpesanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdkarpesanActionPerformed

    private void txtIdpsnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdpsnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdpsnActionPerformed

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        // TODO add your handling code here:
        try {
            String sql ="DELETE FROM detail_pemesanan where id_pemesanan='"+txtIdpsn.getText()+"'";
            java.sql.Connection conn=(Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            //        JOptionPane.showMessageDialog(this, "Berhasil di Hapus");
        } catch (Exception e) {
            //        JOptionPane.showMessageDialog(this, "Data ini dibutuhkan dalam fitur lain");
        }

        try {
            String sql ="DELETE FROM pemesanan where id_pemesanan='"+txtIdpsn.getText()+"'";
            java.sql.Connection conn=(Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            //        JOptionPane.showMessageDialog(this, "Berhasil di Hapus");
        } catch (Exception e) {
            //        JOptionPane.showMessageDialog(this, "Data ini dibutuhkan dalam fitur lain");
        }
        clearPesan();
        id_autoPemesanan();
        getDataPemesanan();

        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();

        ContentPanel.add(PemesanaPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
    }//GEN-LAST:event_jLabel34MouseClicked

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        // TODO add your handling code here:
        if(txtTotal.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Belum ada Barang yang dipesan");
        } else {
            try {
                String sql1 = "UPDATE pemesanan set total_harga='"+txtTotal.getText()+
                "'where Id_pemesanan='"+txtIdpsn.getText()+"'";
                java.sql.Connection conn=(Connection)koneksi.getKoneksi();
                java.sql.PreparedStatement pst1=conn.prepareStatement(sql1);
                pst1.execute();
                ContentPanel.removeAll();
                ContentPanel.repaint();
                ContentPanel.revalidate();

                ContentPanel.add(PemesanaPanel);
                ContentPanel.repaint();
                ContentPanel.revalidate();
            } catch (Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
            clearPesan();
            id_autoPemesanan();
            getDataPemesanan();
        }
        getDataPemesanan();
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        // TODO add your handling code here:
        if(txtIdBPes.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field ID Barang Pesanan belum diisi");
        } else if(txtMotif.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Motif belum diisi");
        } else if(txtWarna.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Warna belum diisi");
        } else if(txtPanjang.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Panjang Kain belum diisi");
        } else if(txtHarga.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Harga belum diisi");
        } else {
            try {
                String sql1 = "INSERT INTO barangpesanan (id_barangPesanan, motif, warna, panjangKain, harga) VALUES ('"
                +txtIdBPes.getText()+"','"
                +txtMotif.getText()+"','"
                +txtWarna.getText()+"','"
                +txtPanjang.getText()+"','"
                +txtHarga.getText()+"')";
                java.sql.Connection conn=(Connection)koneksi.getKoneksi();
                java.sql.PreparedStatement pst1=conn.prepareStatement(sql1);
                pst1.execute();
            } catch (Exception e) {
                //            JOptionPane.showMessageDialog(null, e.getMessage());
            }

            motif.add(txtMotif.getText());
            warna.add(txtWarna.getText());
            PK.add(txtPanjang.getText());
            harga.add(txtHarga.getText());
            setTabelPesan();

            txtMotif.setText(null);
            txtWarna.setText(null);
            txtPanjang.setText(null);
            txtHarga.setText(null);
        }

        if(txtIdpsn.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field ID Pemesanan belum diisi");
        } else if(txtIdBPes.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field ID Barang Pesanan belum diisi");
        } else {
            try {
                String sql1 = "INSERT INTO detail_pemesanan (Id_pemesanan, id_barangPesanan) VALUES ('"
                +txtIdpsn.getText()+"','"
                +txtIdBPes.getText()+"')";
                java.sql.Connection conn=(Connection)koneksi.getKoneksi();
                java.sql.PreparedStatement pst1=conn.prepareStatement(sql1);
                pst1.execute();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        id_autoBarangPesanan();
    }//GEN-LAST:event_jLabel31MouseClicked

    private void btnLogOut6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOut6MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new LogIn().setVisible(true);
    }//GEN-LAST:event_btnLogOut6MouseClicked

    private void txtNamaCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaCusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaCusActionPerformed

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void txtHargaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHargaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaMouseEntered

    private void txtHargaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHargaMouseClicked
        // TODO add your handling code here:
        if(txtIdpsn.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field ID Pemesanan belum diisi");
        } else if(txtIdkarpesan.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field ID Karyawan belum diisi");
        } else if(txtNamaCus.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Nama Customer belum diisi");
        } else if(txtPhone1.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Phone belum diisi");
        } else if(txtAlamat1.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Alamat belum diisi");
        } else if(txtTanggal.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Tanggal belum diisi");
        } else {
            try {
                String sql="INSERT INTO pemesanan(Id_pemesanan,id_karyawan,nama_customer,phone,alamat,tanggal_pemesanan)"
                + " VALUES('"
                +txtIdpsn.getText()
                +"','"+txtIdkarpesan.getText()
                +"','"+txtNamaCus.getText()
                +"','"+txtPhone1.getText()
                +"','"+txtAlamat1.getText()
                +"','"+txtTanggal.getText()+"')";
                java.sql.Connection conn=(Connection)koneksi.getKoneksi();
                java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                pst.execute();
            } catch (Exception e) {
                //            JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_txtHargaMouseClicked

    private void txtPanjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPanjangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPanjangActionPerformed

    private void txtWarnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWarnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWarnaActionPerformed

    private void txtMotifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMotifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMotifActionPerformed

    private void txtAlamat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlamat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlamat1ActionPerformed

    private void txtPhone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhone1ActionPerformed

    private void PemesanaPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PemesanaPanelMouseClicked
        // TODO add your handling code here:
        //        ddLogOut.setVisible(false);
        //        btnLogOut.setVisible(false);
        //        btnAbout.setVisible(false);
        //
        //        ddLogOut1.setVisible(false);
        //        btnLogOut1.setVisible(false);
        //        btnAbout1.setVisible(false);

        ddLogOut6.setVisible(false);
        btnLogOut6.setVisible(false);
        btnAbout6.setVisible(false);

        //        ddLogOut2.setVisible(false);
        //        btnLogOut2.setVisible(false);
        //        btnAbout2.setVisible(false);

        ddLogOut3.setVisible(false);
        btnLogOut3.setVisible(false);
        btnAbout3.setVisible(false);

        ddLogOut4.setVisible(false);
        btnLogOut4.setVisible(false);
        btnAbout4.setVisible(false);

        ddLogOut5.setVisible(false);
        btnLogOut5.setVisible(false);
        btnAbout5.setVisible(false);

        ddLogOut7.setVisible(false);
        btnLogOut7.setVisible(false);
        btnAbout7.setVisible(false);

        //        ddLogOut8.setVisible(false);
        //        btnLogOut8.setVisible(false);
        //        btnAbout8.setVisible(false);
        //
        //        ddLogOut9.setVisible(false);
        //        btnLogOut9.setVisible(false);
        //        btnAbout9.setVisible(false);

        ddLogOut10.setVisible(false);
        btnLogOut10.setVisible(false);
        btnAbout10.setVisible(false);

        ddLogOut11.setVisible(false);
        btnLogOut11.setVisible(false);
        btnAbout11.setVisible(false);

        ddLogOut12.setVisible(false);
        btnLogOut12.setVisible(false);
        btnAbout12.setVisible(false);

        ddLogOut13.setVisible(false);
        btnLogOut13.setVisible(false);
        btnAbout13.setVisible(false);
    }//GEN-LAST:event_PemesanaPanelMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        txtCariPemesanan.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        //        PesanPanel.removeAll();
        //        PesanPanel.repaint();
        //        PesanPanel.revalidate();
        //
        //        PesanPanel.add(PesanBarangPanel);
        //        PesanPanel.repaint();
        //        PesanPanel.revalidate();

        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();

        ContentPanel.add(PesanBarangPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        txtCariPemesanan.setVisible(true);
    }//GEN-LAST:event_jLabel21MouseClicked

    private void txtCariPemesananKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariPemesananKeyReleased
        // TODO add your handling code here:
        cariDataPemesanan();
    }//GEN-LAST:event_txtCariPemesananKeyReleased

    private void txtCariPemesananKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariPemesananKeyPressed
        // TODO add your handling code here:
        //        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            //            cariDataPemesanan();
            //        }
    }//GEN-LAST:event_txtCariPemesananKeyPressed

    private void btnAbout4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbout4MouseClicked
        new About().setVisible(true);
        btnAbout4.setVisible(false);
        btnLogOut4.setVisible(false);
        ddLogOut4.setVisible(false);
    }//GEN-LAST:event_btnAbout4MouseClicked

    private void btnLogOut4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOut4MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new LogIn().setVisible(true);
    }//GEN-LAST:event_btnLogOut4MouseClicked

    private void jTable4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseReleased
        // TODO add your handling code here:
        if (evt.getButton()==MouseEvent.BUTTON3){
            if(evt.isPopupTrigger()&& jTable4.getSelectedRowCount()!=0){
                PopupMenuPemesanan.show(evt.getComponent(),evt.getX(),evt.getY());
            }
        }
    }//GEN-LAST:event_jTable4MouseReleased

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable4MouseClicked

    private void TransaksiPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransaksiPanelMouseClicked
        // TODO add your handling code here:
        ddLogOut12.setVisible(false);
        btnLogOut12.setVisible(false);
        btnAbout12.setVisible(false);

        ddLogOut3.setVisible(false);
        btnLogOut3.setVisible(false);
        btnAbout3.setVisible(false);

        ddLogOut4.setVisible(false);
        btnLogOut4.setVisible(false);
        btnAbout4.setVisible(false);

        ddLogOut5.setVisible(false);
        btnLogOut5.setVisible(false);
        btnAbout5.setVisible(false);

        ddLogOut6.setVisible(false);
        btnLogOut6.setVisible(false);
        btnAbout6.setVisible(false);

        ddLogOut7.setVisible(false);
        btnLogOut7.setVisible(false);
        btnAbout7.setVisible(false);

        ddLogOut10.setVisible(false);
        btnLogOut10.setVisible(false);
        btnAbout10.setVisible(false);

        ddLogOut11.setVisible(false);
        btnLogOut11.setVisible(false);
        btnAbout11.setVisible(false);

        ddLogOut13.setVisible(false);
        btnLogOut13.setVisible(false);
        btnAbout13.setVisible(false);
    }//GEN-LAST:event_TransaksiPanelMouseClicked

    private void txtSubtotalFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSubtotalFMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubtotalFMouseEntered

    private void txtSubtotalFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSubtotalFMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubtotalFMouseClicked

    private void txtReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReturnMouseClicked
        // TODO add your handling code here:
        //        int totalBayar = Integer.parseInt(txtSubtotalF.getText());
        //        int jumlahBayar = Integer.parseInt(txtTPF.getText());
        //        if (jumlahBayar >= totalBayar){
            //            txtReturn.setText(""+(jumlahBayar-totalBayar));
            //        } else {
            //            JOptionPane.showMessageDialog(null, "Jumlah Bayar Kurang");
            //        }
    }//GEN-LAST:event_txtReturnMouseClicked

    private void txtTPFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTPFKeyReleased
        // TODO add your handling code here:
        int totalBayar = Integer.parseInt(txtSubtotalF.getText());
        int jumlahBayar = Integer.parseInt(txtTPF.getText());
        txtReturn.setText(""+(jumlahBayar-totalBayar));
    }//GEN-LAST:event_txtTPFKeyReleased

    private void btnLogOut13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOut13MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new LogIn().setVisible(true);
    }//GEN-LAST:event_btnLogOut13MouseClicked

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        // TODO add your handling code here:
        clearFTrx();

        TransaksiManual.removeAll();
        TransaksiManual.repaint();
        TransaksiManual.revalidate();

        TransaksiManual.add(Manual);
        TransaksiManual.repaint();
        TransaksiManual.revalidate();
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnCancel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancel1MouseClicked
        // TODO add your handling code here:
        String HT = txtSubtotalF.getText();
        int Htt = Integer.parseInt(HT);
        String HB = txtTPF.getText();
        int Hbb = Integer.parseInt(HB);
        
        if(txtCustomerF.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Customer belum diisi");
        } else if(txtSubtotalF.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Subtotal belum diisi");
        } else if(txtTPF.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Total Pembayaran belum diisi");
        } else if(txtReturn.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Kembalian belum diisi");
        } else if(Htt > Hbb ==true){
           JOptionPane.showMessageDialog(null, "Total Pembayaran harus lebih tinggi");
        } else {
            try {
        String sql ="UPDATE penjualan "
                + "SET nama_customer = '"+txtCustomerF.getText()+
                "', total_bayar = '"+txtSubtotalF.getText()+
                "', tunai = '"+txtTPF.getText()+
                "', kembalian = '"+txtReturn.getText()+
                "'WHERE id_penjualan = '"+txtIdPenjualan.getText()+"'";
        java.sql.Connection conn=(com.mysql.jdbc.Connection)koneksi.getKoneksi();
        java.sql.PreparedStatement pst=conn.prepareStatement(sql);
        pst.execute();

    } catch (Exception e){
//        JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"
//        +e.getMessage());
    }
        clearFTrx();
        TransaksiManual.removeAll();
        TransaksiManual.repaint();
        TransaksiManual.revalidate();

        TransaksiManual.add(Manual);
        TransaksiManual.repaint();
        TransaksiManual.revalidate();

        try{
        java.sql.Connection conn=(com.mysql.jdbc.Connection)koneksi.getKoneksi();
        String sql = "Select total_bayar, tunai, kembalian from penjualan where id_penjualan = '"+txtIdPenjualan.getText()+"'";
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet res = pst.executeQuery(sql);
        while (res.next()){
            jTextField1.setText("Rp. "+res.getString(1));
            jTextField2.setText("Rp. "+res.getString(3));
            jTextField3.setText("Rp. "+res.getString(2));
        }
        } catch(SQLException err){
//             JOptionPane.showMessageDialog(null, err.getMessage());
        }
        }

    }//GEN-LAST:event_btnCancel1MouseClicked

    private void txtCariBTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariBTKeyReleased
        // TODO add your handling code here:
        CariBarangTransaksi();
    }//GEN-LAST:event_txtCariBTKeyReleased

    private void jTable11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable11MouseClicked
        // TODO add your handling code here:
        try {
        String sql="INSERT INTO penjualan(id_penjualan, id_karyawan, Hari_Penjualan, BulanPenjualan, tanggal_penjualan, Jam_Penjualan) VALUES('"
                    +txtIdPenjualan.getText()
                    +"','"+txtIdkarTrx.getText()
                    +"','"+txt_hariPenjualan.getText()
                    +"','"+txt_bulanPenjualan.getText()
                    +"','"+txtIdkarTrx1.getText()
                    +"','"+txt_jamPenjualan.getText()+"')";
        java.sql.Connection conn=(com.mysql.jdbc.Connection)koneksi.getKoneksi();
        java.sql.PreparedStatement pst=conn.prepareStatement(sql);
        pst.execute();
        }catch (Exception e){
//            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    PopUpQty.setVisible(true);
    txtPopUpQty.setVisible(true);
    }//GEN-LAST:event_jTable11MouseClicked

    private void btnLogOut12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOut12MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new LogIn().setVisible(true);
    }//GEN-LAST:event_btnLogOut12MouseClicked

    private void btnAbout12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbout12MouseClicked
        new About().setVisible(true);
        btnAbout12.setVisible(false);
        btnLogOut12.setVisible(false);
        ddLogOut12.setVisible(false);
    }//GEN-LAST:event_btnAbout12MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        try{
            InputStream nota = getClass().getResourceAsStream("report1.jasper");
            Connection conn = (Connection) koneksi.getKoneksi();
            HashMap param = new HashMap();
            param.put("parameter1", txtIdPenjualan.getText());
            JasperPrint jp = JasperFillManager.fillReport(nota, param, conn);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        qtyTrx.clear();
        nambarTrx.clear();
        totalTrx.clear();
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        PopUpQty.setVisible(false);
        txtPopUpQty.setText(null);
        txtPopUpQty.setVisible(false);
        id_autoPenjualan();
        setTabelTransaksi();
        getDataBarangTransaksi();
        
        getDataReportPemasukan();
        getDataPemesanan();
        dashboardchartbulanan();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void btnPayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPayMouseClicked
        // TODO add your handling code here:
        Object x = 0;
        if(txtSubtotTrx.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Silahkan pilih barang terlebih dahulu");
        }else if(txtSubtotTrx.getText().equals(x)){
            JOptionPane.showMessageDialog(null, "Silahkan pilih barang terlebih dahulu");
        } else {
            TransaksiManual.removeAll();
            TransaksiManual.repaint();
            TransaksiManual.revalidate();

            TransaksiManual.add(Field);
            TransaksiManual.repaint();
            TransaksiManual.revalidate();

            txtSubtotalF.setText(txtSubtotTrx.getText());
        }
    }//GEN-LAST:event_btnPayMouseClicked

    private void btnPay1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPay1MouseClicked
        // TODO add your handling code here:
        try {
            String sql ="DELETE FROM detail_penjualan where id_penjualan='"+txtIdPenjualan.getText()+"'";
            java.sql.Connection conn=(Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            //        JOptionPane.showMessageDialog(this, "Berhasil di Hapus");
        } catch (Exception e) {
            //        JOptionPane.showMessageDialog(this, "Data ini dibutuhkan dalam fitur lain");
        }

        try {
            String sql ="DELETE FROM penjualan where id_penjualan='"+txtIdPenjualan.getText()+"'";
            java.sql.Connection conn=(Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            //        JOptionPane.showMessageDialog(this, "Berhasil di Hapus");
        } catch (Exception e) {
            //        JOptionPane.showMessageDialog(this, "Data ini dibutuhkan dalam fitur lain");
        }

        qtyTrx.clear();
        nambarTrx.clear();
        totalTrx.clear();
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        PopUpQty.setVisible(false);
        txtPopUpQty.setText(null);
        txtPopUpQty.setVisible(false);
        id_autoPenjualan();
        setTabelTransaksi();
        getDataBarangTransaksi();
    }//GEN-LAST:event_btnPay1MouseClicked

    private void txtPopUpQtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPopUpQtyKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
        if(txtPopUpQty.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Silahkan masukkan jumlah barang yang dibeli");
        } else {

        int barisSup = jTable11.getSelectedRow();
            try{
            java.sql.Connection conn=(com.mysql.jdbc.Connection)koneksi.getKoneksi();
            String sql = "Select stok from barang where id_barang = '"+jTable11.getValueAt(barisSup, 1)+"'";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet res = pst.executeQuery(sql);
            while (res.next()){
            int stok = res.getInt("stok");
            int qty = Integer.parseInt(txtPopUpQty.getText());
            int a = stok - qty;
            int sisa = 5;
            if (a < 0){
                JOptionPane.showMessageDialog(null, "Stok barang tidak mencukupi!");
                txtPopUpQty.setText(null);
                PopUpQty.setVisible(false);
                txtPopUpQty.setVisible(false);
            } else if ((stok)<(sisa)){
                JOptionPane.showMessageDialog(null, "Sisa stok "+jTable11.getValueAt(barisSup, 2)+" hampir habis");
                try{
                int hargaBuah = Integer.parseInt((String) jTable11.getValueAt(barisSup, 5));
                int jumlahBuah = Integer.parseInt(txtPopUpQty.getText());
                txtIdkarTrx2.setText(""+(hargaBuah*jumlahBuah));
                }catch(NumberFormatException e){
                txtIdkarTrx2.setText("0");
                }

        try {
        String sql1 = "INSERT INTO detail_penjualan (id_penjualan, id_barang, sub_total, qty) VALUES ('"
            +txtIdPenjualan.getText()+"','"
            +jTable11.getValueAt(barisSup, 1)+"','"
            +txtIdkarTrx2.getText()+"','"
            +txtPopUpQty.getText()+"')";
        java.sql.PreparedStatement pst1=conn.prepareStatement(sql1);
        pst1.execute();
        } catch (Exception e) {
//        JOptionPane.showMessageDialog(null,e.getMessage());
        }

        qtyTrx.add(txtPopUpQty.getText());
        nambarTrx.add(jTable11.getValueAt(barisSup, 2));
        totalTrx.add(txtIdkarTrx2.getText());

        txtPopUpQty.setText(null);
        PopUpQty.setVisible(false);
        txtPopUpQty.setVisible(false);

        getDataBarangTransaksi();
        setTabelTransaksi();
            }else{
                try{
            int hargaBuah = Integer.parseInt((String) jTable11.getValueAt(barisSup, 5));
            int jumlahBuah = Integer.parseInt(txtPopUpQty.getText());
            txtIdkarTrx2.setText(""+(hargaBuah*jumlahBuah));
        }catch(NumberFormatException e){
            txtIdkarTrx2.setText("0");
        }

        try {
        String sql1 = "INSERT INTO detail_penjualan (id_penjualan, id_barang, sub_total, qty) VALUES ('"
            +txtIdPenjualan.getText()+"','"
            +jTable11.getValueAt(barisSup, 1)+"','"
            +txtIdkarTrx2.getText()+"','"
            +txtPopUpQty.getText()+"')";
        java.sql.PreparedStatement pst1=conn.prepareStatement(sql1);
        pst1.execute();
        } catch (Exception e) {
//        JOptionPane.showMessageDialog(null,e.getMessage());
        }

        qtyTrx.add(txtPopUpQty.getText());
        nambarTrx.add(jTable11.getValueAt(barisSup, 2));
        totalTrx.add(txtIdkarTrx2.getText());

        txtPopUpQty.setText(null);
        PopUpQty.setVisible(false);
        txtPopUpQty.setVisible(false);

        getDataBarangTransaksi();
        setTabelTransaksi();
            }
            }
        } catch(SQLException err){
//             JOptionPane.showMessageDialog(null, err.getMessage());
        }


        }
        }
    }//GEN-LAST:event_txtPopUpQtyKeyPressed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        if (jComboBox2.getSelectedItem().toString()=="TAHUN") {
            Jtahun.setVisible(true);
            Jbulan.setVisible(false);
            Jbulan1.setVisible(false);
            Jminggu.setVisible(false);
            Jharian.setVisible(false);
            CariHarian.setVisible(false);
            CariTahunan.setVisible(true);

            CariBulanan.setVisible(false);
        }
        if (jComboBox2.getSelectedItem().toString()=="BULAN") {
            Jtahun.setVisible(false);
            Jbulan.setVisible(true);
            Jbulan1.setVisible(true);
            Jminggu.setVisible(false);
            Jharian.setVisible(false);
            CariHarian.setVisible(false);
            CariTahunan.setVisible(false);

            CariBulanan.setVisible(true);

        }
        if (jComboBox2.getSelectedItem().toString()=="HARI") {
            Jtahun.setVisible(false);
            Jbulan.setVisible(false);
            Jbulan1.setVisible(false);
            Jminggu.setVisible(false);
            Jharian.setVisible(true);
            CariHarian.setVisible(true);
            CariTahunan.setVisible(false);

            CariBulanan.setVisible(false);

        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void JtahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtahunActionPerformed

        // TODO add your handling code here:

    }//GEN-LAST:event_JtahunActionPerformed

    private void CariHarianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CariHarianMouseClicked
        String tampilan = "yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(fm.format(Jharian.getDate()));
        try {
            String query = "SELECT DISTINCT Jam_Penjualan, SUM(total_bayar) as Total_Pemasukan FROM penjualan WHERE tanggal_penjualan like '%"+tanggal+"%' GROUP BY Jam_Penjualan ORDER BY Jam_Penjualan ASC";
            JDBCCategoryDataset dataset = new JDBCCategoryDataset((Connection)koneksi.getKoneksi(),query);
            JFreeChart chart = ChartFactory.createBarChart3D("", "Jam/Waktu Transaksi", "Total Pemasukan (Harian) ", dataset, PlotOrientation.VERTICAL, false, true, true);
            chart.getPlot().setBackgroundPaint(Color.WHITE);
            CategoryPlot plot = chart.getCategoryPlot();
            BarRenderer renderer = (BarRenderer)plot.getRenderer();
            renderer.setSeriesPaint(0, Color.GREEN);
            plot.setRangeGridlinePaint(Color.BLUE);

            ChartPanel chartpp = new ChartPanel(chart);
            chartMingguan.removeAll();
            chartMingguan.add(chartpp);
            chartMingguan.updateUI();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }try {
            String sql ="SELECT SUM(total_bayar) as Total_Pemasukan FROM penjualan WHERE tanggal_penjualan like '%"+tanggal+"%'";
            java.sql.Connection conn = (Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet res = pst.executeQuery();
            while (res.next()) {
                txt_pemasukan.setText(res.getString(1));
            }if (res.getString(1).equals("")){
                txt_pemasukan.setText("0");
            }
        } catch (Exception e) {
        }if (txt_pemasukan.getText().equals("")) {
            txt_pemasukan.setText("0");
        }try {
            String sql ="SELECT SUM(total_pembelian) as Totalpembelian FROM pembelian"
            + " WHERE tanggal_pembelian like '%"+tanggal+"%'";

            java.sql.Connection conn = (Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet res = pst.executeQuery();
            while (res.next()) {
                txt_pengeluaran.setText(res.getString(1));
            }if (res.getString(1).equals("")){
                txt_pengeluaran.setText("0");
            }
        } catch (Exception e) {
            if (txt_pengeluaran.getText().equals("")) {
                txt_pengeluaran.setText("0");
            }if (txt_pemasukan.getText().equals("")) {
                txt_pemasukan.setText("0");
            }if(txt_pengeluaran.getText().equals("")){
                txt_pengeluaran.setText("0");
            }
            int a = Integer.parseInt(txt_pengeluaran.getText());
            int b = Integer.parseInt(txt_pemasukan.getText());
            txt_Keuntungan.setText((""+(b-a)));
        }
    }//GEN-LAST:event_CariHarianMouseClicked

    private void CariHarianMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CariHarianMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_CariHarianMouseEntered

    private void CariHarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CariHarianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CariHarianActionPerformed

    private void JbulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbulanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JbulanActionPerformed

    private void JharianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JharianMouseClicked

    }//GEN-LAST:event_JharianMouseClicked

    private void CariTahunanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CariTahunanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CariTahunanMouseClicked

    private void CariTahunanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CariTahunanActionPerformed
        try {
            String query = "SELECT DISTINCT  BulanPenjualan,  SUM(total_bayar) as TotalPemasukan FROM penjualan WHERE tanggal_penjualan LIKE '%"+Jtahun.getSelectedItem()+"%' GROUP by BulanPenjualan ORDER BY BulanPenjualan DESC";
            JDBCCategoryDataset dataset = new JDBCCategoryDataset((Connection)koneksi.getKoneksi(),query);
            JFreeChart chart = ChartFactory.createBarChart3D("", "Transaksi Bulan", "Total Pemasukan (Tahunan) ", dataset, PlotOrientation.VERTICAL, false, true, true);

            chart.getPlot().setBackgroundPaint(Color.WHITE);
            CategoryPlot plot = chart.getCategoryPlot();
            BarRenderer renderer = (BarRenderer)plot.getRenderer();
            renderer.setSeriesPaint(0, Color.GREEN);
            plot.setRangeGridlinePaint(Color.BLUE);

            ChartPanel chartpp = new ChartPanel(chart);
            chartMingguan.removeAll();
            chartMingguan.add(chartpp);
            chartMingguan.updateUI();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }try {
            String sql ="SELECT SUM(total_bayar) as TotalPemasukan FROM penjualan WHERE tanggal_penjualan LIKE '%"+Jtahun.getSelectedItem()+"%'";
            java.sql.Connection conn = (Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet res = pst.executeQuery();
            while (res.next()) {
                txt_pemasukan.setText(res.getString(1));
            }if (res.getString(1).equals("")){
                txt_pemasukan.setText("0");
            }
        } catch (Exception e) {
        }if (txt_pemasukan.getText().equals("")) {
            txt_pemasukan.setText("0");
        }try {
            String sql ="SELECT SUM(total_pembelian) as Totalpembelian FROM pembelian"
            + " WHERE tanggal_pembelian LIKE '%"+Jtahun.getSelectedItem()+"%'";

            java.sql.Connection conn = (Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet res = pst.executeQuery();
            while (res.next()) {
                txt_pengeluaran.setText(res.getString(1));
            }if (res.getString(1).equals("")){
                txt_pengeluaran.setText("0");
            }
        } catch (Exception e) {
            if (txt_pengeluaran.getText().equals("")) {
                txt_pengeluaran.setText("0");
            }if (txt_pemasukan.getText().equals("")) {
                txt_pemasukan.setText("0");
            }if(txt_pengeluaran.getText().equals("")){
                txt_pengeluaran.setText("0");
            }
            int a = Integer.parseInt(txt_pengeluaran.getText());
            int b = Integer.parseInt(txt_pemasukan.getText());
            txt_Keuntungan.setText((""+(b-a)));
        }
    }//GEN-LAST:event_CariTahunanActionPerformed

    private void CariBulananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CariBulananMouseClicked
        try {
            String query = "SELECT DISTINCT  tanggal_penjualan as Tanggal ,  SUM(total_bayar) as TotalPemasukan FROM penjualan WHERE "
            + "tanggal_penjualan LIKE '%"+Jbulan1.getSelectedItem()+"-"+Jbulan.getSelectedItem()+"%'"
            + " GROUP BY tanggal_penjualan "
            + "ORDER BY tanggal_penjualan DESC";
            JDBCCategoryDataset dataset = new JDBCCategoryDataset((Connection)koneksi.getKoneksi(),query);
            JFreeChart chart = ChartFactory.createBarChart3D("", "Tanggal Pemasukan", "Total Pemasukan (Bulanan)", dataset, PlotOrientation.VERTICAL, false, true, true);

            chart.getPlot().setBackgroundPaint(Color.WHITE);
            CategoryPlot plot = chart.getCategoryPlot();
            BarRenderer renderer = (BarRenderer)plot.getRenderer();
            renderer.setSeriesPaint(0, Color.GREEN);
            plot.setRangeGridlinePaint(Color.BLUE);

            ChartPanel chartpp = new ChartPanel(chart);
            chartMingguan.removeAll();
            chartMingguan.add(chartpp);
            chartMingguan.updateUI();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }try {
            String sql ="SELECT SUM(total_bayar) as TotalPemasukan FROM penjualan WHERE "
            + "tanggal_penjualan LIKE '%"+Jbulan1.getSelectedItem()+"-"+Jbulan.getSelectedItem()+"%'";
            java.sql.Connection conn = (Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet res = pst.executeQuery();
            while (res.next()) {
                txt_pemasukan.setText(res.getString(1));
            }if (res.getString(1).equals("")){
                txt_pemasukan.setText("0");
            }
        } catch (Exception e) {
        }if (txt_pemasukan.getText().equals("")) {
            txt_pemasukan.setText("0");
        }try {
            String sql ="SELECT SUM(total_pembelian) as Totalpembelian FROM pembelian"
            + " WHERE tanggal_pembelian LIKE '%"+Jbulan1.getSelectedItem()+"-"+Jbulan.getSelectedItem()+"%'";

            java.sql.Connection conn = (Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet res = pst.executeQuery();
            while (res.next()) {
                txt_pengeluaran.setText(res.getString(1));
            }if (res.getString(1).equals("")){
                txt_pengeluaran.setText("0");
            }
        } catch (Exception e) {
            if (txt_pengeluaran.getText().equals("")) {
                txt_pengeluaran.setText("0");
            }if (txt_pemasukan.getText().equals("")) {
                txt_pemasukan.setText("0");
            }if(txt_pengeluaran.getText().equals("")){
                txt_pengeluaran.setText("0");
            }
            int a = Integer.parseInt(txt_pengeluaran.getText());
            int b = Integer.parseInt(txt_pemasukan.getText());
            txt_Keuntungan.setText((""+(b-a)));
        }
    }//GEN-LAST:event_CariBulananMouseClicked

    private void CariBulananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CariBulananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CariBulananActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DashboardStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JLabel Btn_CariPemasukan;
    private javax.swing.JLabel Btn_CariPengeluaran;
    private javax.swing.JLabel Btn_PrintExcelPemasukan;
    private javax.swing.JLabel Btn_PrintExcelpengeluaran;
    private javax.swing.JLabel Btn_PrintPDFpengeluaran;
    private javax.swing.JButton CariBulanan;
    private javax.swing.JButton CariHarian;
    private javax.swing.JButton CariTahunan;
    private javax.swing.JLabel CashInOutHome;
    private javax.swing.JLabel CashInOutPesanBarang;
    private javax.swing.JLabel CashInOutPesanBarang1;
    private javax.swing.JLabel CashInOutStokBarang;
    private javax.swing.JLabel CashInOutTransaksi;
    private javax.swing.JPanel ContentPanel;
    private javax.swing.JPanel Field;
    private javax.swing.JLabel Home;
    private javax.swing.JPanel HomeMenu;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JLabel HomePesanBarang;
    private javax.swing.JLabel HomePesanBarang1;
    private javax.swing.JLabel HomeStokBarang;
    private javax.swing.JLabel HomeTransaksi;
    private javax.swing.JComboBox<String> Jbulan;
    private javax.swing.JComboBox<String> Jbulan1;
    private com.toedter.calendar.JDateChooser Jharian;
    private javax.swing.JComboBox<String> Jminggu;
    private javax.swing.JComboBox<String> Jtahun;
    private javax.swing.JPanel Manual;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JPanel Pembelian;
    private javax.swing.JPanel PembelianPanel;
    public static javax.swing.JPanel PemesanaPanel;
    private javax.swing.JLabel PesanBarang;
    private javax.swing.JLabel PesanBarangHome;
    private javax.swing.JPanel PesanBarangMenu;
    public static javax.swing.JPanel PesanBarangPanel;
    private javax.swing.JLabel PesanBarangStokBarang;
    private javax.swing.JLabel PesanBarangTransaksi;
    private javax.swing.JPanel PesanPanel;
    private javax.swing.JLabel PopUpQty;
    private javax.swing.JPopupMenu PopupMenuPemesanan;
    private javax.swing.JPanel Report;
    private javax.swing.JPanel ReportPanel;
    private javax.swing.JLabel StokBarang;
    private javax.swing.JLabel StokBarangPesanBarang;
    private javax.swing.JLabel StokBarangPesanBarang1;
    private javax.swing.JLabel StokBarangTransaksi;
    private javax.swing.JLabel StokHome;
    private javax.swing.JMenuItem TandaiSelesai;
    private javax.swing.JPanel TopMenuPanel;
    private javax.swing.JLabel Transaksi;
    private javax.swing.JLabel TransaksiHome;
    private javax.swing.JPanel TransaksiManual;
    private javax.swing.JPanel TransaksiMenu;
    private javax.swing.JPanel TransaksiPanel;
    private javax.swing.JLabel TransaksiPesanBarang;
    private javax.swing.JLabel TransaksiPesanBarang1;
    private javax.swing.JPanel TransaksiScan;
    private javax.swing.JLabel TransaksiStokBarang;
    private javax.swing.JTextField Txt_TotalPemasukan;
    private javax.swing.JTextField Txt_TotalPengeluaran;
    private javax.swing.JPanel brgBaru;
    private javax.swing.JPanel brgStok;
    public static javax.swing.JLabel btnAbout10;
    public static javax.swing.JLabel btnAbout11;
    private javax.swing.JLabel btnAbout12;
    private javax.swing.JLabel btnAbout13;
    public static javax.swing.JLabel btnAbout3;
    public static javax.swing.JLabel btnAbout4;
    public static javax.swing.JLabel btnAbout5;
    public static javax.swing.JLabel btnAbout6;
    public static javax.swing.JLabel btnAbout7;
    private javax.swing.JLabel btnBP;
    private javax.swing.JLabel btnCancel;
    private javax.swing.JLabel btnCancel1;
    public static javax.swing.JLabel btnLogOut10;
    public static javax.swing.JLabel btnLogOut11;
    private javax.swing.JLabel btnLogOut12;
    private javax.swing.JLabel btnLogOut13;
    public static javax.swing.JLabel btnLogOut3;
    public static javax.swing.JLabel btnLogOut4;
    public static javax.swing.JLabel btnLogOut5;
    public static javax.swing.JLabel btnLogOut6;
    public static javax.swing.JLabel btnLogOut7;
    private javax.swing.JLabel btnPay;
    private javax.swing.JLabel btnPay1;
    private javax.swing.JLabel btnRpPembelian;
    private javax.swing.JLabel btnRpPenjualan;
    private javax.swing.JLabel btn_PrintPDFPemasukan;
    private javax.swing.JMenuItem cancelPemesanan;
    private javax.swing.JComboBox<String> cb_distributor;
    private javax.swing.JComboBox<String> cb_distributor1;
    private javax.swing.JComboBox<String> cb_distributor2;
    private javax.swing.JComboBox<String> cb_distributor3;
    public static final javax.swing.JPanel chartMingguan = new javax.swing.JPanel();
    private javax.swing.JMenuItem checkOut;
    public static javax.swing.JLabel ddLogOut10;
    public static javax.swing.JLabel ddLogOut11;
    private javax.swing.JLabel ddLogOut12;
    private javax.swing.JLabel ddLogOut13;
    public static javax.swing.JLabel ddLogOut3;
    public static javax.swing.JLabel ddLogOut4;
    public static javax.swing.JLabel ddLogOut5;
    public static javax.swing.JLabel ddLogOut6;
    public static javax.swing.JLabel ddLogOut7;
    private javax.swing.JMenuItem detailPesanan;
    private javax.swing.JMenuItem hapus;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable11;
    public static final javax.swing.JTable jTable4 = new javax.swing.JTable();
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jlabelll;
    private javax.swing.JLabel lblTopMenu;
    public static javax.swing.JLabel namaTop10;
    public static javax.swing.JLabel namaTop6;
    public static javax.swing.JLabel namaTop7;
    public static javax.swing.JLabel namaTop8;
    public static javax.swing.JLabel namaTop9;
    private javax.swing.JPanel rpPembelian;
    private javax.swing.JPanel rpPenjualan;
    private javax.swing.JTextField rpbb;
    private javax.swing.JTextField rpbs;
    private javax.swing.JTextField rpps;
    private javax.swing.JTextField txtAlamat1;
    private javax.swing.JTextField txtCariBT;
    private javax.swing.JTextField txtCariPemesanan;
    private javax.swing.JTextField txtCustomerF;
    private javax.swing.JTextField txtHarbelBB;
    private javax.swing.JTextField txtHarbelbs;
    private javax.swing.JTextField txtHarga;
    public static javax.swing.JTextField txtIdBPes;
    private javax.swing.JTextField txtIdPenjualan;
    private javax.swing.JTextField txtIdbar2;
    private javax.swing.JTextField txtIdbarbs;
    private javax.swing.JTextField txtIdbarps;
    public static final javax.swing.JTextField txtIdkarBB = new javax.swing.JTextField();
    public static final javax.swing.JTextField txtIdkarTrx = new javax.swing.JTextField();
    public static final javax.swing.JTextField txtIdkarTrx1 = new javax.swing.JTextField();
    public static final javax.swing.JTextField txtIdkarTrx2 = new javax.swing.JTextField();
    public static final javax.swing.JTextField txtIdkarbs = new javax.swing.JTextField();
    public static javax.swing.JTextField txtIdkarbs1;
    public static final javax.swing.JTextField txtIdkarpesan = new javax.swing.JTextField();
    private javax.swing.JTextField txtIdpsn;
    private javax.swing.JTextField txtIdres2;
    private javax.swing.JTextField txtIdresbs;
    public static javax.swing.JTextField txtIdsup;
    private javax.swing.JTextField txtIdsupbs;
    private javax.swing.JTextField txtKodebarBB;
    public static final javax.swing.JTextField txtKodebarPesan = new javax.swing.JTextField();
    private javax.swing.JTextField txtKodebarPesan1;
    public static final javax.swing.JTextField txtKodebarPesan2 = new javax.swing.JTextField();
    private javax.swing.JTextField txtKodebarPesan3;
    private javax.swing.JTextField txtMotif;
    private javax.swing.JTextField txtMotifBB;
    private javax.swing.JTextField txtNamaCus;
    private javax.swing.JTextField txtNambarBB;
    private javax.swing.JTextField txtPanjang;
    private javax.swing.JTextField txtPhone1;
    private javax.swing.JTextField txtPopUpQty;
    private javax.swing.JTextField txtQtyBB;
    private javax.swing.JTextField txtQtybs;
    private javax.swing.JTextField txtReturn;
    private javax.swing.JTextField txtStokKp;
    private javax.swing.JTextField txtStokKp1;
    private javax.swing.JTextField txtStokKp2;
    private javax.swing.JTextField txtSubtoBB;
    private javax.swing.JTextField txtSubtobs;
    private javax.swing.JTextField txtSubtotTrx;
    private javax.swing.JTextField txtSubtotalF;
    private javax.swing.JTextField txtTPF;
    public static javax.swing.JTextField txtTanggal;
    private javax.swing.JTextField txtTanggalBB;
    private javax.swing.JTextField txtTanggalBBJam;
    private javax.swing.JTextField txtTanggalBBbulan;
    private javax.swing.JTextField txtTanggalBBhari;
    private javax.swing.JTextField txtTanggalHome;
    private javax.swing.JTextField txtTanggalbs;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalBB;
    private javax.swing.JTextField txtTotalbs;
    private javax.swing.JTextField txtUkuranBB;
    private javax.swing.JTextField txtWarna;
    private javax.swing.JTextField txt_Keuntungan;
    private javax.swing.JTextField txt_pemasukan;
    private javax.swing.JTextField txt_pengeluaran;
    // End of variables declaration//GEN-END:variables
}
