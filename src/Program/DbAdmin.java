/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import OOp.PolyRestok;
import OOp.PolymorphysmSubtotal;
import static Program.DashboardStaff.jTable4;
import com.barcodelib.barcode.Linear;
import com.mysql.jdbc.CharsetMapping;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.MySQLConnection;
import com.sun.glass.events.KeyEvent;
import groovy.sql.DataSet;

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
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
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
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.openxmlformats.schemas.presentationml.x2006.main.STTLCommandType;


/**
 *
 * @author Daffa Afifi Syahrony
 */
public class DbAdmin extends javax.swing.JFrame {
    private  HashMap Datahashmap = new HashMap();
    static float Sen,Sel,Rab,Kam,Jum,Sab;
    private DefaultTableModel modelkaryawan;
    private DefaultTableModel modelsupplier;
    private DefaultTableModel modelpemesanan;
    private DefaultTableModel modelproduk;
    private DefaultTableModel modelprotran;
    private DefaultTableModel modelreportpengeluaran;
    private DefaultTableModel modelreportpemasukan;
    

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
     * Creates new form DbAdmin
     */
    public DbAdmin() {
        initComponents();
        setTitle("RetnosariApp");
            Txt_Stok2.setText("0");
            Txt_Stok2.enable();
            Jtahun.setVisible(true);
            Jbulan.setVisible(false);
            Jbulan1.setVisible(false);
            Jminggu.setVisible(false);
            Jharian.setVisible(false);
            CariHarian.setVisible(false);
            CariTahunan.setVisible(true);
            
            CariBulanan.setVisible(false);
         chartMingguan.setVisible(true);
         
    //    jComboBox2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        
        
        jTable7.setAutoCreateRowSorter(true);
        jTable6.setAutoCreateRowSorter(true);
        txtCariPemesanan.setVisible(false);
        txtCariProduk.setVisible(false);

        txtCariKaryawan.setVisible(false);
        txtCariSupplier.setVisible(false);

        ddLogOut.setVisible(false);
        btnLogOut.setVisible(false);
        btnAbout.setVisible(false);

        ddLogOut1.setVisible(false);
        btnLogOut1.setVisible(false);
        btnAbout1.setVisible(false);

        ddLogOut14.setVisible(false);
        btnLogOut14.setVisible(false);
        btnAbout14.setVisible(false);

        ddLogOut2.setVisible(false);
        btnLogOut2.setVisible(false);
        btnAbout2.setVisible(false);

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

        ddLogOut8.setVisible(false);
        btnLogOut8.setVisible(false);
        btnAbout8.setVisible(false);

        PopUpQty.setVisible(false);
        txtPopUpQty.setVisible(false);

        ddLogOut9.setVisible(false);
        btnLogOut9.setVisible(false);
        btnAbout9.setVisible(false);

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

        jTable1.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 14));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.setRowHeight(25);
        jTable1.getAutoCreateRowSorter();

        jTable2.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 14));
        jTable2.getTableHeader().setOpaque(false);
        jTable2.setRowHeight(25);
        jTable2.getTableHeader().setBackground(new Color(44,107,52));
        jTable2.getTableHeader().setForeground(new Color(255,255,255));

        jTable3.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 14));
        jTable3.getTableHeader().setOpaque(false);
        jTable3.setRowHeight(25);
        jTable3.getTableHeader().setBackground(new Color(44,107,52));
        jTable3.getTableHeader().setForeground(new Color(255,255,255));

        jTable4.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 14));
        jTable4.getTableHeader().setOpaque(false);
        jTable4.setRowHeight(25);
        jTable4.getTableHeader().setBackground(new Color(44,107,52));
        jTable4.getTableHeader().setForeground(new Color(255,255,255));
        jTable4.getColumnModel().getColumn(0).setMaxWidth(10);

        jTable7.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 14));
        jTable7.getTableHeader().setOpaque(false);
        jTable7.setRowHeight(25);
        jTable7.getTableHeader().setBackground(new Color(44,107,52));
        jTable7.getTableHeader().setForeground(new Color(255,255,255));

        jTable6.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 14));
        jTable6.getTableHeader().setOpaque(false);
        jTable6.setRowHeight(25);
        jTable6.getTableHeader().setBackground(new Color(44,107,52));
        jTable6.getTableHeader().setForeground(new Color(255,255,255));

        jTable5.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 14));
        jTable5.getTableHeader().setOpaque(false);
        jTable5.setRowHeight(25);
        jTable5.getTableHeader().setBackground(new Color(44,107,52));
        jTable5.getTableHeader().setForeground(new Color(255,255,255));

        jTable1.getTableHeader().setFont(new Font("VERDANA", Font.PLAIN, 14));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.setRowHeight(25);

        jTable5.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 14));
        jTable5.getTableHeader().setOpaque(false);
        jTable5.setRowHeight(25);

        jTable8.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 14));
        jTable8.getTableHeader().setOpaque(false);
        jTable8.setRowHeight(25);

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

        jTable10.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 14));
        jTable10.getTableHeader().setOpaque(false);
        jTable10.setRowHeight(25);
        jTable10.getTableHeader().setBackground(new Color(44,107,52));
        jTable10.getTableHeader().setForeground(new Color(255,255,255));

        jTable11.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 14));
        jTable11.getTableHeader().setOpaque(false);
        jTable11.setRowHeight(25);
        jTable11.getTableHeader().setBackground(new Color(44,107,52));
        jTable11.getTableHeader().setForeground(new Color(255,255,255));

        modelprotran = new DefaultTableModel ( );
        jTable11.setModel(modelprotran);
        modelprotran.addColumn("NO");
        modelprotran.addColumn("ID BARANG");
        modelprotran.addColumn("NAMA BARANG");
        modelprotran.addColumn("SIZE");
        modelprotran.addColumn("MOTIF");
        modelprotran.addColumn("HARGA");
        modelprotran.addColumn("STOK");

        modelkaryawan = new DefaultTableModel ( );
        jTable2.setModel(modelkaryawan);
        modelkaryawan.addColumn("NO");
        modelkaryawan.addColumn("USERNAME");
        modelkaryawan.addColumn("PASSWORD");
        modelkaryawan.addColumn("NAMA");
        modelkaryawan.addColumn("PHONE");
        modelkaryawan.addColumn("ALAMAT");

        modelsupplier = new DefaultTableModel ( );
        jTable3.setModel(modelsupplier);
        modelsupplier.addColumn("NO");
        modelsupplier.addColumn("NAMA");
        modelsupplier.addColumn("ALAMAT");
        modelsupplier.addColumn("PHONE");
        modelsupplier.addColumn("JENIS BARANG");

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

        modelproduk = new DefaultTableModel();
        jTable10.setModel(modelproduk);
        modelproduk.addColumn("NO");
        modelproduk.addColumn("ID BARANG");
        modelproduk.addColumn("NAMA BARANG");
        modelproduk.addColumn("KATEGORI");
        modelproduk.addColumn("SIZE");
        modelproduk.addColumn("MOTIF");
        modelproduk.addColumn("HARGA BELI");
        modelproduk.addColumn("HARGA JUAL");
        modelproduk.addColumn("STOK");
        modelproduk.addColumn("SUPPLIER");

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(100);
        jTable1.setModel(dtm);

        modelreportpengeluaran = new DefaultTableModel();
        jTable6.setModel(modelreportpengeluaran);
        modelreportpengeluaran.addColumn("NO");
        modelreportpengeluaran.addColumn("ID PEMBELIAN");
        modelreportpengeluaran.addColumn("NAMA KARYAWAN");
        modelreportpengeluaran.addColumn("TANGGAL");
        modelreportpengeluaran.addColumn("NAMA BARANG");
        modelreportpengeluaran.addColumn("QTY");
        modelreportpengeluaran.addColumn("TOTAL");

        modelreportpemasukan = new DefaultTableModel();
        jTable7.setModel(modelreportpemasukan);
        modelreportpemasukan.addColumn("NO");
        modelreportpemasukan.addColumn("ID PENJUALAN");
        modelreportpemasukan.addColumn("TANGGAL");
        modelreportpemasukan.addColumn("NAMA KARYAWAN");
        modelreportpemasukan.addColumn("CUSTOMER");
        modelreportpemasukan.addColumn("NAMA BARANG");
        modelreportpemasukan.addColumn("QTY");
        modelreportpemasukan.addColumn("TOTAL");

        jTable2.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable2.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTable2.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTable2.getColumnModel().getColumn(3).setPreferredWidth(150);
        jTable2.getColumnModel().getColumn(4).setPreferredWidth(120);
        jTable2.getColumnModel().getColumn(5).setPreferredWidth(150);

        jTable3.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable3.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTable3.getColumnModel().getColumn(2).setPreferredWidth(150);
        jTable3.getColumnModel().getColumn(3).setPreferredWidth(120);
        jTable3.getColumnModel().getColumn(4).setPreferredWidth(120);

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

        jTable10.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable10.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTable10.getColumnModel().getColumn(2).setPreferredWidth(200);
        jTable10.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTable10.getColumnModel().getColumn(4).setPreferredWidth(50);
        jTable10.getColumnModel().getColumn(5).setPreferredWidth(150);
        jTable10.getColumnModel().getColumn(6).setPreferredWidth(100);
        jTable10.getColumnModel().getColumn(7).setPreferredWidth(100);
        jTable10.getColumnModel().getColumn(8).setPreferredWidth(50);
        jTable10.getColumnModel().getColumn(9).setPreferredWidth(150);

        jTable11.getColumnModel().getColumn(0).setPreferredWidth(35);
        jTable11.getColumnModel().getColumn(1).setPreferredWidth(90);
        jTable11.getColumnModel().getColumn(2).setPreferredWidth(170);
        jTable11.getColumnModel().getColumn(3).setPreferredWidth(50);
        jTable11.getColumnModel().getColumn(4).setPreferredWidth(150);
        jTable11.getColumnModel().getColumn(5).setPreferredWidth(80);
        jTable11.getColumnModel().getColumn(6).setPreferredWidth(50);

        jComboBox1.setMaximumRowCount(5);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- PILIH -" }));
        jComboBox4.setMaximumRowCount(5);
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- PILIH -" }));
        jcomboboxmotif.setMaximumRowCount(5);
        jcomboboxmotif.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- PILIH -" }));
        jComboBox5.setMaximumRowCount(5);
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- PILIH -" }));
        jComboBox6.setMaximumRowCount(5);
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- PILIH -" }));
        jComboBox7.setMaximumRowCount(5);
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- PILIH -" }));
        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
        getDataKaryawan();
        getDataSupplier();
        getDataBarang();
        getDataPemesanan();
        getDataReportPengeluaran();
        getDataReportPemasukan();
        ComboBoxSupplier();
        getDataBarangTransaksi();
        tanggal();
        JumlahPengeluaran();
        JumlahPemasukan();
        Txt_Kodebarcode1.enable();
        Txt_Kodebarcode.enable();
        
        dataFromDataBaseToComboBox();
        
        JasaFromDataBaseToComboBox();
        KaindataFromDataBaseToComboBox();
        dashboardchartbulanan();
        txtCariBT1.setVisible(false);
       // XYchart();
       //pemasukan();
      
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
    
    public void KaindataFromDataBaseToComboBox(){
        try {
        java.sql.Connection cn = (Connection)koneksi.getKoneksi();
            Statement stt= cn.createStatement();
        String sql = "SELECT barang.nama_barang FROM barang WHERE barang.kategori = 'kain'";
        ResultSet res = stt.executeQuery(sql);
        while(res.next()){
            Object[] ob = new Object[4];
            ob[0] = res.getString(1);
            jComboBox7.addItem((String) ob[0]);
            
            }
            res.close(); stt.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void dataFromDataBaseToComboBox(){
        try {
        java.sql.Connection cn = (Connection)koneksi.getKoneksi();
            Statement stt= cn.createStatement();
        String sql = "SELECT Motif FROM motifbatik ORDER BY Motif ASC";
        ResultSet res = stt.executeQuery(sql);
        while(res.next()){
            Object[] ob = new Object[4];
            ob[0] = res.getString(1);
            jComboBox1.addItem((String) ob[0]);
            jcomboboxmotif.addItem((String) ob[0]);
            jComboBox4.addItem((String) ob[0]);
            jComboBox5.addItem((String) ob[0]);
            }
            res.close(); stt.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void JasaFromDataBaseToComboBox(){
             
        try {
            String sql = "SELECT nama_jasa FROM jasa ORDER BY nama_jasa ASC";
            java.sql.Connection conn = (Connection)koneksi.getKoneksi();
            java.sql.Statement stm= conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                Object[] ob = new Object[4];
                ob[0] = res.getString(1);
                jComboBox6.addItem((String) ob[0]);
                
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    

    private void cariDataPengeluaran(){
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
        }

    private void cariDataPemasukan(){
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
            String n = "";
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
//           }else{
//           JOptionPane.showMessageDialog(null, "Riwayat transaksi tidak ditemukan");
//            Object[] obj = new Object[8];
//               obj[0] = n;
//               obj[1] = n;
//               obj[2] = n;
//               obj[3] = n;
//               obj[4] = n;
//               obj[5] = n;
//               obj[6] = n;
//               obj[7] = n;
//               modelreportpemasukan.addRow(obj);
            }
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());

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

    public void barcodeAuto(){
        try{
            java.sql.Connection c = koneksi.getKoneksi();
            Statement stat= c.createStatement();
            String sql ="select max(right(barcode,4))as no from barang";//query select data yang paling akhir
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()){
                if (rs.first()==false){
                    Txt_Kodebarcode1.setText("B0001");
//                    Txt_KodebarcodeEdit.setText("B0001");//jika data masih kosong maka akan menampilkan
                }else{
                    rs.last();//jika ada data maka membuat id baru
                    int set_id = rs.getInt(1)+1;
                    String no = String.valueOf(set_id);
                    int id_next = no.length();
                    for (int a=0; a<4-id_next; a++){
                        no = "0"+no;
                    }
                    Txt_Kodebarcode1.setText("R"+no);
//                    Txt_KodebarcodeEdit.setText("R"+no);
                }
            }
        }catch (SQLException ex){
//            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, ex);
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
        
        
        String sql = "SELECT id_barang, nama_barang, ukuran, motifbatik.Motif," 
                +"harga_jual, stok FROM barang JOIN motifbatik ON barang.id_motif = motifbatik.id_motif where id_barang like '%"
                    +txtCariBT.getText()+"%' or nama_barang like '%"
                    +txtCariBT.getText()+"%' or ukuran like '%"
                    +txtCariBT.getText()+"%' or motifbatik.Motif like '%"
                    +txtCariBT.getText()+"%' or harga_jual like '%"
                    +txtCariBT.getText()+"%' or stok like '%"
                    +txtCariBT.getText()+"%' or id_barang like '%"
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

    public  void clearbarang(){
        Txt_NamaBarang1.setText("");
        Txt_Ukuran1.setText("");
        Txt_Motif1.setText("");
        Txt_HargaBeli1.setText("");
        Txt_HargaJual1.setText("");
        Txt_Stok1.setText("");
//        Txt_Kodebarcode.setText("");
        FileName1.setText("");
        PreviewImage1.setIcon(null);
        cb_distributor4.setSelectedIndex(0);

        Txt_NamaBarang2.setText("");
        Txt_Ukuran2.setText("");
//        Txt_Motif2.setText("");
        Txt_HargaBeli2.setText("");
        Txt_HargaJual2.setText("");
        Txt_Stok2.setText("");
//        Txt_Kodebarcode2.setText("");
        FileName2.setText("");
        PreviewImage2.setIcon(null);
        cb_distributor5.setSelectedIndex(0);
    }

    public void getDataBarang(){
        int a = 1;
        modelproduk.getDataVector().removeAllElements();
        modelproduk.getDataVector().removeAllElements();
        try {
        java.sql.Connection conn=(com.mysql.jdbc.Connection)koneksi.getKoneksi();
        String sql = "SELECT id_barang,nama_barang, kategori, ukuran, motifbatik.Motif, harga_beli, harga_jual,stok, supplier.nama_supplier FROM supplier JOIN barang ON supplier.id_supplier = barang.id_supplier JOIN motifbatik ON barang.id_motif = motifbatik.id_motif where kategori = 'Baju' or kategori = 'Kain' or kategori"
                + " = 'Alat Batik'";
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet res = pst.executeQuery(sql);
         while(res.next()){
               Object[] obj = new Object[10];
               obj[0] = a++;
               obj[1] = res.getString(1);
               obj[2] = res.getString(2);
               obj[3] = res.getString(3);
               obj[4] = res.getString(4);
               obj[5] = res.getString(5);
               obj[6] = res.getString(6);
               obj[7] = res.getString(7);
               obj[8] = res.getString(8);
               obj[9] = res.getString(9);

               modelproduk.addRow(obj);
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
                    txtIdbar2.setText("B0001");//jika data masih kosong maka akan menampilkan
                    txtIdbarps.setText("B0001");
                    Txt_Idbarang1.setText("B0001");
                    Txt_Idbarang2.setText("B0001");
                    Txt_Kodebarcode1.setText("B0001");
//                    Txt_KodebarcodeEdit.setText("R0001");
                    txtKodebarBB.setText("B0001");
                    txtKodebarPesan.setText("B0001");
                }else{
                    rs.last();//jika ada data maka membuat id baru
                    int set_id = rs.getInt(1)+1;
                    String no = String.valueOf(set_id);
                    int id_next = no.length();
                    for (int a=0; a<4-id_next; a++){
                        no = "0"+no;
                    }
                    txtIdbar2.setText("B"+no);
                    txtIdbarps.setText("B"+no);
                    Txt_Idbarang1.setText("B"+no);
                    Txt_Idbarang2.setText("B"+no);
                    Txt_Kodebarcode1.setText("B"+no);
//                    Txt_KodebarcodeEdit.setText("R"+no);
                    txtKodebarBB.setText("B"+no);
                    txtKodebarPesan.setText("B"+no);
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
            cb_distributor4.addItem((String) ob[0]);
            cb_distributor5.addItem((String) ob[0]);
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

        private void cariDataProduk(){
        try{
            java.sql.Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/retnosari","root","");
            ResultSet res = cn.createStatement().executeQuery("SELECT id_barang, nama_barang, kategori, ukuran, motif, "
                    + "harga_beli, harga_jual, stok, barcode from barang WHERE id_barang like '%"
                    +txtCariProduk.getText()+"%' or nama_barang like '%"
                    +txtCariProduk.getText()+"%' or kategori like '%"
                    +txtCariProduk.getText()+"%' or ukuran like '%"
                    +txtCariProduk.getText()+"%' or motif like '%"
                    +txtCariProduk.getText()+"%' or harga_beli like '%"
                    +txtCariProduk.getText()+"%' or harga_jual like '%"
                    +txtCariProduk.getText()+"%' or stok like '%"
                    +txtCariProduk.getText()+"%' or barcode like '%"
                    +txtCariProduk.getText()+"%' ");
            modelproduk.getDataVector().removeAllElements();
            int a = 1;
            while(res.next()){
               Object[] obj = new Object[10];
               obj[0] = a++;
               obj[1] = res.getString(1);
               obj[2] = res.getString(2);
               obj[3] = res.getString(3);
               obj[4] = res.getString(4);
               obj[5] = res.getString(5);
               obj[6] = res.getString(6);
               obj[7] = res.getString(7);
               obj[8] = res.getString(8);
               obj[9] = res.getString(9);
               modelproduk.addRow(obj);
            }
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }

    private void cariDataPemesanan(){
        try{
            java.sql.Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/retnosari","root","");
            ResultSet res = cn.createStatement().executeQuery("Select * from pemesanan WHERE id_pemesanan like '%"
                    +txtCariPemesanan.getText()+"%' or nama_customer like '%"
                    +txtCariPemesanan.getText()+"%' or phone like '%"
                    +txtCariPemesanan.getText()+"%' or alamat like '%"
                    +txtCariPemesanan.getText()+"%' or tanggal_pemesanan like '%"
                    +txtCariPemesanan.getText()+"%' or total_harga like '%"
                    +txtCariPemesanan.getText()+"%' or status like '%"
                    +txtCariPemesanan.getText()+"%' ");
            modelpemesanan.getDataVector().removeAllElements();
            int a = 1;
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
//        String sql = "Select pemesanan.nama_customer, pemesanan.phone, pemesanan.alamat,"
//                + "pemesanan.tanggal_pemesanan, barangpesanan.id_barangPesanan, barangpesanan.motif, barangpesanan.warna,"
//                + "barangpesanan.panjangKain, barangpesanan.harga, detail_pemesanan.status from detail_pemesanan join pemesanan on "
//                + "detail_pemesanan.Id_pemesanan = pemesanan.Id_pemesanan join barangPesanan on detail_pemesanan.id_barangPesanan ="
//                + "barangPesanan.id_barangPesanan";
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

    private void cariDataKaryawan(){
        try{
            int b = 1;
            OOPCRUD a = new OOPCRUD();
            a.setcariKaryawan(txtCariKaryawan.getText());
            java.sql.Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/retnosari","root","");
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM karyawan WHERE id_karyawan like '%"
                    +a.getCariKaryawan()+"%' or password like '%"
                    +a.getCariKaryawan()+"%' or nama_karyawan like '%"
                    +a.getCariKaryawan()+"%' or alamat like '%"
                    +a.getCariKaryawan()+"%' or no_hp like '%"
                    +a.getCariKaryawan()+"%' ");
            modelkaryawan.getDataVector().removeAllElements();
            while(rs.next()){
            Object[] obj = new Object[6];
               obj[0] = b++;
               obj[1] = rs.getString("id_karyawan");
               obj[2] = rs.getString("password");
               obj[3] = rs.getString("nama_karyawan");
               obj[4] = rs.getString("no_hp");
               obj[5] = rs.getString("alamat");
               modelkaryawan.addRow(obj);
            }
        } catch (SQLException ex){
            System.err.println(ex.getMessage());
        }
    }

    private void cariDataSupplier(){
        try{
            int b = 1;
            OOPCRUD a = new OOPCRUD();
            a.setcariSupplier(txtCariSupplier.getText());
            java.sql.Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/retnosari","root","");
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM supplier WHERE nama_supplier like '%"
                    +a.getCariSupplier()+"%' or alamat like '%"
                    +a.getCariSupplier()+"%' or jenis_barang like '%"
                    +a.getCariSupplier()+"%'");
            modelsupplier.getDataVector().removeAllElements();
            while(rs.next()){
               Object[] obj = new Object[5];
               obj[0] = b++;
               obj[1] = rs.getString("nama_supplier");
               obj[2] = rs.getString("alamat");
               obj[3] = rs.getString("no_hp");
               obj[4] = rs.getString("jenis_barang");
            modelsupplier.addRow(obj);
            }
        } catch (SQLException ex){
            System.err.println(ex.getMessage());
        }
    }

    public void id_autoSupplier(){
        try{
            java.sql.Connection c = koneksi.getKoneksi();
            Statement stat= c.createStatement();
            String sql ="select max(right(id_supplier,4))as no from supplier";//query select data yang paling akhir
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()){
                if (rs.first()==false){
                    txtIdSup.setText("IDS0001");//jika data masih kosong maka akan menampilkan
                }else{
                    rs.last();//jika ada data maka membuat id baru
                    int set_id = rs.getInt(1)+1;
                    String no = String.valueOf(set_id);
                    int id_next = no.length();
                    for (int a=0; a<4-id_next; a++){
                        no = "0"+no;
                    }
                    txtIdSup.setText("IDS"+no);
                }
            }
        }catch (SQLException ex){
//            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void getDataKaryawan(){
        int a =1;
        modelkaryawan.getDataVector().removeAllElements();
        modelkaryawan.fireTableDataChanged();
        try{
        java.sql.Connection conn=(com.mysql.jdbc.Connection)koneksi.getKoneksi();
        String sql = "Select id_karyawan,password,nama_karyawan,no_hp,alamat from karyawan";
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet res = pst.executeQuery(sql);
           while(res.next()){
               Object[] obj = new Object[6];
               obj[0] = a++;
               obj[1] = res.getString("id_karyawan");
               obj[2] = res.getString("password");
               obj[3] = res.getString("nama_karyawan");
               obj[4] = res.getString("no_hp");
               obj[5] = res.getString("alamat");
               modelkaryawan.addRow(obj);
           }
        } catch(SQLException err){
             JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    }

    public void getDataSupplier(){
        int a = 1;
        modelsupplier.getDataVector().removeAllElements();
        modelsupplier.fireTableDataChanged();
        try{
        java.sql.Connection conn=(com.mysql.jdbc.Connection)koneksi.getKoneksi();
        String sql = "Select id_supplier,nama_supplier,alamat,no_hp,jenis_barang from supplier";
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet res = pst.executeQuery(sql);
           while(res.next()){
               Object[] obj = new Object[5];
               obj[0] = a++;
               obj[1] = res.getString("nama_supplier");
               obj[2] = res.getString("alamat");
               obj[3] = res.getString("no_hp");
               obj[4] = res.getString("jenis_barang");
               modelsupplier.addRow(obj);
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

    private void pemasukan(){
        
           try {
        java.sql.Connection conn=(com.mysql.jdbc.Connection)koneksi.getKoneksi();
        String sql = "SELECT SUM(total_bayar) as tbPenjualan FROM penjualan ";
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet res = pst.executeQuery(sql);
            while(res.next()){
               txt_pemasukan.setText(res.getString("tbPenjualan"));
            }
        } catch (Exception e) {
        }
        
        try {
        java.sql.Connection conn=(com.mysql.jdbc.Connection)koneksi.getKoneksi();
        String sql = "SELECT SUM(total_pembelian) as tbPembelian FROM pembelian";
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet res = pst.executeQuery(sql);
            while(res.next()){
               txt_pengeluaran.setText(res.getString("tbPembelian"));
            }
        } catch (Exception e) {
        }
        if (txt_pemasukan.getText()=="") {
            txt_pemasukan.setText("0");
        }
        if (txt_pengeluaran.getText()=="") {
            txt_pengeluaran.setText("0");
        }
        int a = Integer.parseInt(txt_pengeluaran.getText());
        int b = Integer.parseInt(txt_pemasukan.getText());
        txt_Keuntungan.setText((""+(b-a))); 
        
        
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
        MenuPanel = new javax.swing.JPanel();
        HomeMenu = new javax.swing.JPanel();
        ReportHome = new javax.swing.JLabel();
        PengaturanProdukHome = new javax.swing.JLabel();
        PembelianHome = new javax.swing.JLabel();
        PemesananHome = new javax.swing.JLabel();
        TransaksiHome = new javax.swing.JLabel();
        SupplierHome = new javax.swing.JLabel();
        KaryawanHome = new javax.swing.JLabel();
        namaTop = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        KaryawanMenu = new javax.swing.JPanel();
        SupplierKaryawan = new javax.swing.JLabel();
        HomeKaryawan = new javax.swing.JLabel();
        ReportKaryawan = new javax.swing.JLabel();
        TransaksiKaryawan = new javax.swing.JLabel();
        PemesananKaryawan = new javax.swing.JLabel();
        PembelianKaryawan = new javax.swing.JLabel();
        PengaturanProdukKaryawan = new javax.swing.JLabel();
        namaTop1 = new javax.swing.JLabel();
        Karyawan = new javax.swing.JLabel();
        SupplierMenu = new javax.swing.JPanel();
        ReportSupplier = new javax.swing.JLabel();
        HomeSupplier = new javax.swing.JLabel();
        KaryawanSupplier = new javax.swing.JLabel();
        TransaksiSupplier = new javax.swing.JLabel();
        PemesananSupplier = new javax.swing.JLabel();
        PembelianSupplier = new javax.swing.JLabel();
        PengaturanProdukSupplier = new javax.swing.JLabel();
        namaTop2 = new javax.swing.JLabel();
        Supplier = new javax.swing.JLabel();
        TransaksiMenu = new javax.swing.JPanel();
        ReportTransaksi = new javax.swing.JLabel();
        HomeTransaksi = new javax.swing.JLabel();
        KaryawanTransaksi = new javax.swing.JLabel();
        SupplierTransaksi = new javax.swing.JLabel();
        PemesananTransaksi = new javax.swing.JLabel();
        PembelianTransaksi = new javax.swing.JLabel();
        PengaturanProdukTransaksi = new javax.swing.JLabel();
        namaTop3 = new javax.swing.JLabel();
        Transaksi = new javax.swing.JLabel();
        PemesananMenu = new javax.swing.JPanel();
        ReportPemesanan = new javax.swing.JLabel();
        HomePemesanan = new javax.swing.JLabel();
        KaryawanPemesanan = new javax.swing.JLabel();
        SupplierPemesanan = new javax.swing.JLabel();
        TransaksiPemesanan = new javax.swing.JLabel();
        PembelianPemesanan = new javax.swing.JLabel();
        PengaturanProdukPemesanan = new javax.swing.JLabel();
        namaTop4 = new javax.swing.JLabel();
        Pemesanan = new javax.swing.JLabel();
        PembelianMenu = new javax.swing.JPanel();
        ReportPembelian = new javax.swing.JLabel();
        HomePembelian = new javax.swing.JLabel();
        KaryawanPembelian = new javax.swing.JLabel();
        SupplierPembelian = new javax.swing.JLabel();
        TransaksiPembelian = new javax.swing.JLabel();
        PemesananPembelian = new javax.swing.JLabel();
        PengaturanProdukPembelian = new javax.swing.JLabel();
        namaTop5 = new javax.swing.JLabel();
        Pembelian = new javax.swing.JLabel();
        PengaturanProdukMenu = new javax.swing.JPanel();
        ReportPP = new javax.swing.JLabel();
        HomePP = new javax.swing.JLabel();
        KaryawanPP = new javax.swing.JLabel();
        SupplierPP = new javax.swing.JLabel();
        TransaksiPP = new javax.swing.JLabel();
        PemesananPP = new javax.swing.JLabel();
        PembelianPP = new javax.swing.JLabel();
        namaTop6 = new javax.swing.JLabel();
        PengaturanProduk = new javax.swing.JLabel();
        ReportMenu = new javax.swing.JPanel();
        PengaturanProdukReport = new javax.swing.JLabel();
        HomeReport = new javax.swing.JLabel();
        KaryawanReport = new javax.swing.JLabel();
        SupplierReport = new javax.swing.JLabel();
        TransaksiReport = new javax.swing.JLabel();
        PemesananReport = new javax.swing.JLabel();
        PembelianReport = new javax.swing.JLabel();
        namaTop7 = new javax.swing.JLabel();
        Report = new javax.swing.JLabel();
        TopMenuPanel = new javax.swing.JPanel();
        btnDdLogOut = new javax.swing.JLabel();
        lblTopMenu = new javax.swing.JLabel();
        ContentPanel = new javax.swing.JPanel();
        HomePanel = new javax.swing.JPanel();
        CariTahunan = new javax.swing.JButton();
        CariBulanan = new javax.swing.JButton();
        CariHarian = new javax.swing.JButton();
        Jtahun = new javax.swing.JComboBox<>();
        Jbulan = new javax.swing.JComboBox<>();
        Jbulan1 = new javax.swing.JComboBox<>();
        Jminggu = new javax.swing.JComboBox<>();
        Jharian = new com.toedter.calendar.JDateChooser();
        btnAbout1 = new javax.swing.JLabel();
        btnLogOut1 = new javax.swing.JLabel();
        ddLogOut1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        txtTanggalHome = new javax.swing.JTextField();
        txt_pengeluaran = new javax.swing.JTextField();
        txt_Keuntungan = new javax.swing.JTextField();
        txt_pemasukan = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        KaryawanPanel = new javax.swing.JPanel();
        txtAlamatKar = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtFullname = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtIdkar = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JLabel();
        btnSimpanKaryawan = new javax.swing.JLabel();
        txtCariKaryawan = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        btnAbout2 = new javax.swing.JLabel();
        btnLogOut2 = new javax.swing.JLabel();
        ddLogOut2 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        SupplierPanel = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        txtNamSup = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtPhoneSup = new javax.swing.JTextField();
        txtJenisBrg = new javax.swing.JTextField();
        btnSimpanSup = new javax.swing.JLabel();
        btnUpdateSup = new javax.swing.JLabel();
        txtCariSupplier = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JLabel();
        btnAbout = new javax.swing.JLabel();
        ddLogOut = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdSup = new javax.swing.JTextField();
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
        jLabel4 = new javax.swing.JLabel();
        txtIdkarTrx = new javax.swing.JTextField();
        txtIdkarTrx1 = new javax.swing.JTextField();
        txtIdkarTrx2 = new javax.swing.JTextField();
        txt_hariPenjualan = new javax.swing.JTextField();
        txt_jamPenjualan = new javax.swing.JTextField();
        txt_bulanPenjualan = new javax.swing.JTextField();
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
        jLabel9 = new javax.swing.JLabel();
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
        jLabel10 = new javax.swing.JLabel();
        PesanPanel = new javax.swing.JPanel();
        PemesanaPanel = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        btnLogOut3 = new javax.swing.JLabel();
        btnAbout3 = new javax.swing.JLabel();
        ddLogOut3 = new javax.swing.JLabel();
        txtCariPemesanan = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtStokKp1 = new javax.swing.JTextField();
        txtStokKp = new javax.swing.JTextField();
        txtStokKp2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtIdbarps = new javax.swing.JTextField();
        txtKodebarPesan = new javax.swing.JTextField();
        txtKodebarPesan1 = new javax.swing.JTextField();
        txtKodebarPesan2 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        txtKodebarPesan3 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        PesanBarangPanel = new javax.swing.JPanel();
        txtPhone1 = new javax.swing.JTextField();
        txtAlamat1 = new javax.swing.JTextField();
        txtWarna = new javax.swing.JTextField();
        txtPanjang = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        txtNamaCus = new javax.swing.JTextField();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        btnLogOut6 = new javax.swing.JLabel();
        btnAbout6 = new javax.swing.JLabel();
        ddLogOut6 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        txtTotal = new javax.swing.JTextField();
        rpps = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtIdpsn = new javax.swing.JTextField();
        txtIdkarpesan = new javax.swing.JTextField();
        txtTanggal = new javax.swing.JTextField();
        txtMotif = new javax.swing.JTextField();
        txt_HargaJasa = new javax.swing.JTextField();
        txt_namaJasaa = new javax.swing.JTextField();
        txtIdBPes = new javax.swing.JTextField();
        txtharipemesanan = new javax.swing.JTextField();
        txtBulanpemesanan = new javax.swing.JTextField();
        txt_Hkain = new javax.swing.JTextField();
        txtJamPemesanan = new javax.swing.JTextField();
        txt_idkain = new javax.swing.JTextField();
        PembelianPanel = new javax.swing.JPanel();
        brgStok = new javax.swing.JPanel();
        btnBS = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        btnLogOut4 = new javax.swing.JLabel();
        btnAbout4 = new javax.swing.JLabel();
        ddLogOut4 = new javax.swing.JLabel();
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
        jLabel6 = new javax.swing.JLabel();
        txtIdresbs = new javax.swing.JTextField();
        txtIdbarbs = new javax.swing.JTextField();
        txtIdsupbs = new javax.swing.JTextField();
        txtIdkarbs = new javax.swing.JTextField();
        txtTanggalbs = new javax.swing.JTextField();
        txtIdkarbs1 = new javax.swing.JTextField();
        txt_Haribeli = new javax.swing.JTextField();
        txt_bulanbeli = new javax.swing.JTextField();
        txt_Jambeli = new javax.swing.JTextField();
        brgBaru = new javax.swing.JPanel();
        btnBP = new javax.swing.JLabel();
        cb_distributor = new javax.swing.JComboBox<>();
        cb_distributor1 = new javax.swing.JComboBox<>();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        btnLogOut5 = new javax.swing.JLabel();
        btnAbout5 = new javax.swing.JLabel();
        ddLogOut5 = new javax.swing.JLabel();
        txtTotalBB = new javax.swing.JTextField();
        rpbb = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
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
        txtIdkarBB = new javax.swing.JTextField();
        txtTanggalBB = new javax.swing.JTextField();
        txtKodebarBB = new javax.swing.JTextField();
        txtTanggalBBhari = new javax.swing.JTextField();
        txtTanggalBBbulan = new javax.swing.JTextField();
        txt_Idmotif = new javax.swing.JTextField();
        txtTanggalBBJam = new javax.swing.JTextField();
        PengaturanProdukPanel = new javax.swing.JPanel();
        Katalog = new javax.swing.JPanel();
        btnTambah = new javax.swing.JLabel();
        btnLogOut7 = new javax.swing.JLabel();
        btnAbout7 = new javax.swing.JLabel();
        ddLogOut7 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        txtCariProduk = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtGambar = new javax.swing.JTextField();
        View = new javax.swing.JPanel();
        btnEditView = new javax.swing.JLabel();
        btnLogOut8 = new javax.swing.JLabel();
        btnAbout8 = new javax.swing.JLabel();
        ddLogOut8 = new javax.swing.JLabel();
        PreviewImage = new javax.swing.JLabel();
        Txt_NamaBarang = new javax.swing.JTextField();
        Txt_Kategori = new javax.swing.JTextField();
        Txt_Motif = new javax.swing.JTextField();
        Txt_Ukuran = new javax.swing.JTextField();
        Txt_Stok = new javax.swing.JTextField();
        Txt_IdbarangB = new javax.swing.JTextField();
        Txt_HargaJual = new javax.swing.JTextField();
        FileName = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        DetailBarcode = new javax.swing.JTextField();
        PreviewKodeBarcode = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Txt_Kodebarcode = new javax.swing.JTextField();
        Txt_HargaBeli = new javax.swing.JTextField();
        Edit = new javax.swing.JPanel();
        btnCancelView = new javax.swing.JLabel();
        btnLogOut9 = new javax.swing.JLabel();
        btnAbout9 = new javax.swing.JLabel();
        ddLogOut9 = new javax.swing.JLabel();
        PreviewImage1 = new javax.swing.JLabel();
        Btn_HapusPreview = new javax.swing.JLabel();
        TambahnGambar = new javax.swing.JLabel();
        Txt_Idbarang1 = new javax.swing.JTextField();
        Txt_NamaBarang1 = new javax.swing.JTextField();
        Txt_Ukuran1 = new javax.swing.JTextField();
        Txt_HargaBeli1 = new javax.swing.JTextField();
        Txt_HargaJual1 = new javax.swing.JTextField();
        Txt_Stok1 = new javax.swing.JTextField();
        Txt_Kodebarcode1 = new javax.swing.JTextField();
        Kategori = new javax.swing.JComboBox<>();
        Btn_save = new javax.swing.JLabel();
        FileName1 = new javax.swing.JTextField();
        cb_distributor4 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        Txt_Motif1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        Edit1 = new javax.swing.JPanel();
        btnCancelView1 = new javax.swing.JLabel();
        btnLogOut14 = new javax.swing.JLabel();
        btnAbout14 = new javax.swing.JLabel();
        ddLogOut14 = new javax.swing.JLabel();
        PreviewImage2 = new javax.swing.JLabel();
        Txt_Idbarang2 = new javax.swing.JTextField();
        Txt_NamaBarang2 = new javax.swing.JTextField();
        Txt_Ukuran2 = new javax.swing.JTextField();
        Txt_HargaBeli2 = new javax.swing.JTextField();
        Txt_HargaJual2 = new javax.swing.JTextField();
        Txt_Stok2 = new javax.swing.JTextField();
        Kategori1 = new javax.swing.JComboBox<>();
        Btn_save1 = new javax.swing.JLabel();
        FileName2 = new javax.swing.JTextField();
        cb_distributor5 = new javax.swing.JComboBox<>();
        Btn_MasterBatik = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        Txt_Gambar = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        PanelPrintBarcode = new javax.swing.JPanel();
        DetailBarcode1 = new javax.swing.JTextField();
        PreviewKodeBarcode1 = new javax.swing.JLabel();
        DetailBarcode2 = new javax.swing.JTextField();
        PreviewKodeBarcode2 = new javax.swing.JLabel();
        PreviewKodeBarcode3 = new javax.swing.JLabel();
        DetailBarcode3 = new javax.swing.JTextField();
        PreviewKodeBarcode4 = new javax.swing.JLabel();
        DetailBarcode4 = new javax.swing.JTextField();
        DetailBarcode5 = new javax.swing.JTextField();
        PreviewKodeBarcode5 = new javax.swing.JLabel();
        PreviewKodeBarcode6 = new javax.swing.JLabel();
        DetailBarcode6 = new javax.swing.JTextField();
        PreviewKodeBarcode7 = new javax.swing.JLabel();
        DetailBarcode7 = new javax.swing.JTextField();
        DetailBarcode8 = new javax.swing.JTextField();
        PreviewKodeBarcode8 = new javax.swing.JLabel();
        PreviewKodeBarcode9 = new javax.swing.JLabel();
        DetailBarcode9 = new javax.swing.JTextField();
        PreviewKodeBarcode10 = new javax.swing.JLabel();
        DetailBarcode10 = new javax.swing.JTextField();
        DetailBarcode11 = new javax.swing.JTextField();
        PreviewKodeBarcode11 = new javax.swing.JLabel();
        DetailBarcode12 = new javax.swing.JTextField();
        PreviewKodeBarcode12 = new javax.swing.JLabel();
        PreviewKodeBarcode13 = new javax.swing.JLabel();
        DetailBarcode13 = new javax.swing.JTextField();
        DetailBarcode14 = new javax.swing.JTextField();
        PreviewKodeBarcode14 = new javax.swing.JLabel();
        DetailBarcode15 = new javax.swing.JTextField();
        PreviewKodeBarcode15 = new javax.swing.JLabel();
        PreviewKodeBarcode16 = new javax.swing.JLabel();
        DetailBarcode16 = new javax.swing.JTextField();
        DetailBarcode17 = new javax.swing.JTextField();
        PreviewKodeBarcode17 = new javax.swing.JLabel();
        DetailBarcode18 = new javax.swing.JTextField();
        PreviewKodeBarcode18 = new javax.swing.JLabel();
        PreviewKodeBarcode19 = new javax.swing.JLabel();
        DetailBarcode19 = new javax.swing.JTextField();
        DetailBarcode20 = new javax.swing.JTextField();
        PreviewKodeBarcode20 = new javax.swing.JLabel();
        DetailBarcode21 = new javax.swing.JTextField();
        PreviewKodeBarcode21 = new javax.swing.JLabel();
        PreviewKodeBarcode22 = new javax.swing.JLabel();
        DetailBarcode22 = new javax.swing.JTextField();
        PreviewKodeBarcode23 = new javax.swing.JLabel();
        DetailBarcode23 = new javax.swing.JTextField();
        DetailBarcode24 = new javax.swing.JTextField();
        PreviewKodeBarcode24 = new javax.swing.JLabel();
        DetailBarcode25 = new javax.swing.JTextField();
        PreviewKodeBarcode25 = new javax.swing.JLabel();
        PreviewKodeBarcode26 = new javax.swing.JLabel();
        DetailBarcode26 = new javax.swing.JTextField();
        DetailBarcode27 = new javax.swing.JTextField();
        PreviewKodeBarcode27 = new javax.swing.JLabel();
        PreviewKodeBarcode28 = new javax.swing.JLabel();
        DetailBarcode28 = new javax.swing.JTextField();
        PreviewKodeBarcode29 = new javax.swing.JLabel();
        DetailBarcode29 = new javax.swing.JTextField();
        DetailBarcode30 = new javax.swing.JTextField();
        PreviewKodeBarcode30 = new javax.swing.JLabel();
        PreviewKodeBarcode31 = new javax.swing.JLabel();
        DetailBarcode31 = new javax.swing.JTextField();
        PreviewKodeBarcode32 = new javax.swing.JLabel();
        DetailBarcode32 = new javax.swing.JTextField();
        PreviewKodeBarcode33 = new javax.swing.JLabel();
        DetailBarcode33 = new javax.swing.JTextField();
        DetailBarcode34 = new javax.swing.JTextField();
        PreviewKodeBarcode34 = new javax.swing.JLabel();
        DetailBarcode35 = new javax.swing.JTextField();
        PreviewKodeBarcode35 = new javax.swing.JLabel();
        DetailBarcode36 = new javax.swing.JTextField();
        PreviewKodeBarcode36 = new javax.swing.JLabel();
        DetailBarcode37 = new javax.swing.JTextField();
        PreviewKodeBarcode37 = new javax.swing.JLabel();
        DetailBarcode38 = new javax.swing.JTextField();
        PreviewKodeBarcode38 = new javax.swing.JLabel();
        DetailBarcode39 = new javax.swing.JTextField();
        PreviewKodeBarcode39 = new javax.swing.JLabel();
        PreviewKodeBarcode40 = new javax.swing.JLabel();
        DetailBarcode40 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
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
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
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
        Txt_TotalPengeluaran = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

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

        MenuPanel.setPreferredSize(new java.awt.Dimension(255, 720));
        MenuPanel.setLayout(new java.awt.CardLayout());

        HomeMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReportHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReportHomeMouseClicked(evt);
            }
        });
        HomeMenu.add(ReportHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 250, 30));

        PengaturanProdukHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PengaturanProdukHomeMouseClicked(evt);
            }
        });
        HomeMenu.add(PengaturanProdukHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 250, 40));

        PembelianHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PembelianHomeMouseClicked(evt);
            }
        });
        HomeMenu.add(PembelianHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 250, 40));

        PemesananHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PemesananHomeMouseClicked(evt);
            }
        });
        HomeMenu.add(PemesananHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 250, 30));

        TransaksiHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransaksiHomeMouseClicked(evt);
            }
        });
        HomeMenu.add(TransaksiHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 250, 40));

        SupplierHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupplierHomeMouseClicked(evt);
            }
        });
        HomeMenu.add(SupplierHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 250, 30));

        KaryawanHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KaryawanHomeMouseClicked(evt);
            }
        });
        HomeMenu.add(KaryawanHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 250, 40));

        namaTop.setBackground(new java.awt.Color(255, 255, 255));
        namaTop.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        namaTop.setForeground(new java.awt.Color(255, 255, 255));
        HomeMenu.add(namaTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 130, 30));

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/HomeAdmin.png"))); // NOI18N
        HomeMenu.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        MenuPanel.add(HomeMenu, "card2");

        KaryawanMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SupplierKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupplierKaryawanMouseClicked(evt);
            }
        });
        KaryawanMenu.add(SupplierKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 250, 30));

        HomeKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeKaryawanMouseClicked(evt);
            }
        });
        KaryawanMenu.add(HomeKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 250, 30));

        ReportKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReportKaryawanMouseClicked(evt);
            }
        });
        KaryawanMenu.add(ReportKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 250, 30));

        TransaksiKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransaksiKaryawanMouseClicked(evt);
            }
        });
        KaryawanMenu.add(TransaksiKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 250, 40));

        PemesananKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PemesananKaryawanMouseClicked(evt);
            }
        });
        KaryawanMenu.add(PemesananKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 250, 30));

        PembelianKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PembelianKaryawanMouseClicked(evt);
            }
        });
        KaryawanMenu.add(PembelianKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 250, 40));

        PengaturanProdukKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PengaturanProdukKaryawanMouseClicked(evt);
            }
        });
        KaryawanMenu.add(PengaturanProdukKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 250, 30));

        namaTop1.setBackground(new java.awt.Color(255, 255, 255));
        namaTop1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        namaTop1.setForeground(new java.awt.Color(255, 255, 255));
        KaryawanMenu.add(namaTop1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 130, 30));

        Karyawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/KaryawanAdmin.png"))); // NOI18N
        KaryawanMenu.add(Karyawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        MenuPanel.add(KaryawanMenu, "card3");

        SupplierMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReportSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReportSupplierMouseClicked(evt);
            }
        });
        SupplierMenu.add(ReportSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 250, 30));

        HomeSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeSupplierMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeSupplierMouseEntered(evt);
            }
        });
        SupplierMenu.add(HomeSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 250, 30));

        KaryawanSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KaryawanSupplierMouseClicked(evt);
            }
        });
        SupplierMenu.add(KaryawanSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 250, 40));

        TransaksiSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransaksiSupplierMouseClicked(evt);
            }
        });
        SupplierMenu.add(TransaksiSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 250, 40));

        PemesananSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PemesananSupplierMouseClicked(evt);
            }
        });
        SupplierMenu.add(PemesananSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 250, 30));

        PembelianSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PembelianSupplierMouseClicked(evt);
            }
        });
        SupplierMenu.add(PembelianSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 250, 40));

        PengaturanProdukSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PengaturanProdukSupplierMouseClicked(evt);
            }
        });
        SupplierMenu.add(PengaturanProdukSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 250, 40));

        namaTop2.setBackground(new java.awt.Color(255, 255, 255));
        namaTop2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        namaTop2.setForeground(new java.awt.Color(255, 255, 255));
        SupplierMenu.add(namaTop2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 130, 30));

        Supplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/SupplierAdmin.png"))); // NOI18N
        SupplierMenu.add(Supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        MenuPanel.add(SupplierMenu, "card4");

        TransaksiMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReportTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReportTransaksiMouseClicked(evt);
            }
        });
        TransaksiMenu.add(ReportTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 240, 30));

        HomeTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeTransaksiMouseClicked(evt);
            }
        });
        TransaksiMenu.add(HomeTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 240, 30));

        KaryawanTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KaryawanTransaksiMouseClicked(evt);
            }
        });
        TransaksiMenu.add(KaryawanTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 240, 40));

        SupplierTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupplierTransaksiMouseClicked(evt);
            }
        });
        TransaksiMenu.add(SupplierTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 240, 30));

        PemesananTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PemesananTransaksiMouseClicked(evt);
            }
        });
        TransaksiMenu.add(PemesananTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 240, 30));

        PembelianTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PembelianTransaksiMouseClicked(evt);
            }
        });
        TransaksiMenu.add(PembelianTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 240, 40));

        PengaturanProdukTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PengaturanProdukTransaksiMouseClicked(evt);
            }
        });
        TransaksiMenu.add(PengaturanProdukTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 240, 40));

        namaTop3.setBackground(new java.awt.Color(255, 255, 255));
        namaTop3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        namaTop3.setForeground(new java.awt.Color(255, 255, 255));
        TransaksiMenu.add(namaTop3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 130, 30));

        Transaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/TransaksiAdmin.png"))); // NOI18N
        TransaksiMenu.add(Transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        MenuPanel.add(TransaksiMenu, "card5");

        PemesananMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReportPemesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReportPemesananMouseClicked(evt);
            }
        });
        PemesananMenu.add(ReportPemesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 240, 30));

        HomePemesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomePemesananMouseClicked(evt);
            }
        });
        PemesananMenu.add(HomePemesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 244, 240, 40));

        KaryawanPemesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KaryawanPemesananMouseClicked(evt);
            }
        });
        PemesananMenu.add(KaryawanPemesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 240, 40));

        SupplierPemesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupplierPemesananMouseClicked(evt);
            }
        });
        PemesananMenu.add(SupplierPemesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 240, 30));

        TransaksiPemesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransaksiPemesananMouseClicked(evt);
            }
        });
        PemesananMenu.add(TransaksiPemesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 240, 40));

        PembelianPemesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PembelianPemesananMouseClicked(evt);
            }
        });
        PemesananMenu.add(PembelianPemesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 240, 40));

        PengaturanProdukPemesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PengaturanProdukPemesananMouseClicked(evt);
            }
        });
        PemesananMenu.add(PengaturanProdukPemesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 240, 40));

        namaTop4.setBackground(new java.awt.Color(255, 255, 255));
        namaTop4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        namaTop4.setForeground(new java.awt.Color(255, 255, 255));
        PemesananMenu.add(namaTop4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 130, 30));

        Pemesanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/PemesananAdmin.png"))); // NOI18N
        PemesananMenu.add(Pemesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        MenuPanel.add(PemesananMenu, "card6");

        PembelianMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReportPembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReportPembelianMouseClicked(evt);
            }
        });
        PembelianMenu.add(ReportPembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 240, 30));

        HomePembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomePembelianMouseClicked(evt);
            }
        });
        PembelianMenu.add(HomePembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 240, 30));

        KaryawanPembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KaryawanPembelianMouseClicked(evt);
            }
        });
        PembelianMenu.add(KaryawanPembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 240, 40));

        SupplierPembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupplierPembelianMouseClicked(evt);
            }
        });
        PembelianMenu.add(SupplierPembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 240, 30));

        TransaksiPembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransaksiPembelianMouseClicked(evt);
            }
        });
        PembelianMenu.add(TransaksiPembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 240, 40));

        PemesananPembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PemesananPembelianMouseClicked(evt);
            }
        });
        PembelianMenu.add(PemesananPembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 240, 30));

        PengaturanProdukPembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PengaturanProdukPembelianMouseClicked(evt);
            }
        });
        PembelianMenu.add(PengaturanProdukPembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 240, 40));

        namaTop5.setBackground(new java.awt.Color(255, 255, 255));
        namaTop5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        namaTop5.setForeground(new java.awt.Color(255, 255, 255));
        PembelianMenu.add(namaTop5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 130, 30));

        Pembelian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/PembelianAdmin.png"))); // NOI18N
        PembelianMenu.add(Pembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        MenuPanel.add(PembelianMenu, "card7");

        PengaturanProdukMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReportPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReportPPMouseClicked(evt);
            }
        });
        PengaturanProdukMenu.add(ReportPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 250, 30));

        HomePP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomePPMouseClicked(evt);
            }
        });
        PengaturanProdukMenu.add(HomePP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 240, 30));

        KaryawanPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KaryawanPPMouseClicked(evt);
            }
        });
        PengaturanProdukMenu.add(KaryawanPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 250, 40));

        SupplierPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupplierPPMouseClicked(evt);
            }
        });
        PengaturanProdukMenu.add(SupplierPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 250, 30));

        TransaksiPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransaksiPPMouseClicked(evt);
            }
        });
        PengaturanProdukMenu.add(TransaksiPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 250, 40));

        PemesananPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PemesananPPMouseClicked(evt);
            }
        });
        PengaturanProdukMenu.add(PemesananPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 250, 30));

        PembelianPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PembelianPPMouseClicked(evt);
            }
        });
        PengaturanProdukMenu.add(PembelianPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 250, 40));

        namaTop6.setBackground(new java.awt.Color(255, 255, 255));
        namaTop6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        namaTop6.setForeground(new java.awt.Color(255, 255, 255));
        PengaturanProdukMenu.add(namaTop6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 130, 30));

        PengaturanProduk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Pengaturan ProdukAdmin.png"))); // NOI18N
        PengaturanProdukMenu.add(PengaturanProduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        MenuPanel.add(PengaturanProdukMenu, "card8");

        ReportMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PengaturanProdukReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PengaturanProdukReportMouseClicked(evt);
            }
        });
        ReportMenu.add(PengaturanProdukReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 250, 40));

        HomeReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeReportMouseClicked(evt);
            }
        });
        ReportMenu.add(HomeReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 240, 30));

        KaryawanReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KaryawanReportMouseClicked(evt);
            }
        });
        ReportMenu.add(KaryawanReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 250, 40));

        SupplierReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupplierReportMouseClicked(evt);
            }
        });
        ReportMenu.add(SupplierReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 250, 30));

        TransaksiReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransaksiReportMouseClicked(evt);
            }
        });
        ReportMenu.add(TransaksiReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 250, 40));

        PemesananReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PemesananReportMouseClicked(evt);
            }
        });
        ReportMenu.add(PemesananReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 250, 30));

        PembelianReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PembelianReportMouseClicked(evt);
            }
        });
        ReportMenu.add(PembelianReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 250, 40));

        namaTop7.setBackground(new java.awt.Color(255, 255, 255));
        namaTop7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        namaTop7.setForeground(new java.awt.Color(255, 255, 255));
        ReportMenu.add(namaTop7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 130, 30));

        Report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ReportAdmin.png"))); // NOI18N
        ReportMenu.add(Report, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        MenuPanel.add(ReportMenu, "card9");

        TopMenuPanel.setPreferredSize(new java.awt.Dimension(1025, 43));
        TopMenuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDdLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDdLogOutMouseClicked(evt);
            }
        });
        TopMenuPanel.add(btnDdLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(978, 6, 30, 30));

        lblTopMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Top Menu.png"))); // NOI18N
        TopMenuPanel.add(lblTopMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ContentPanel.setPreferredSize(new java.awt.Dimension(1025, 677));
        ContentPanel.setLayout(new java.awt.CardLayout());

        HomePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomePanelMouseClicked(evt);
            }
        });
        HomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jTextField8.setBorder(null);
        jTextField8.setOpaque(false);
        HomePanel.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 650, 50, -1));

        jTextField9.setBorder(null);
        jTextField9.setOpaque(false);
        HomePanel.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 650, 50, -1));

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

        Jtahun.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Jtahun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        Jtahun.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Jtahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtahunActionPerformed(evt);
            }
        });
        HomePanel.add(Jtahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, 140, 30));

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

        chartMingguan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        chartMingguan.setLayout(new javax.swing.BoxLayout(chartMingguan, javax.swing.BoxLayout.LINE_AXIS));
        HomePanel.add(chartMingguan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 930, 400));

        btnAbout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAbout1MouseClicked(evt);
            }
        });
        HomePanel.add(btnAbout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 6, 130, 30));

        btnLogOut1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOut1MouseClicked(evt);
            }
        });
        HomePanel.add(btnLogOut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, 130, 30));

        ddLogOut1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DropDownTop.png"))); // NOI18N
        HomePanel.add(ddLogOut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 0, -1, 70));

        jComboBox2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TAHUN", "BULAN", "HARI" }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        HomePanel.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 90, 30));

        txtTanggalHome.setEditable(false);
        txtTanggalHome.setBackground(new java.awt.Color(255, 255, 255));
        txtTanggalHome.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtTanggalHome.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTanggalHome.setBorder(null);
        txtTanggalHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTanggalHomeActionPerformed(evt);
            }
        });
        HomePanel.add(txtTanggalHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 210, 20));

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
        txt_pemasukan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pemasukanActionPerformed(evt);
            }
        });
        HomePanel.add(txt_pemasukan, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 80, 40));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Home Panel.png"))); // NOI18N
        HomePanel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1025, 677));

        ContentPanel.add(HomePanel, "card2");

        KaryawanPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KaryawanPanelMouseClicked(evt);
            }
        });
        KaryawanPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAlamatKar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtAlamatKar.setBorder(null);
        txtAlamatKar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAlamatKarMouseClicked(evt);
            }
        });
        txtAlamatKar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlamatKarActionPerformed(evt);
            }
        });
        KaryawanPanel.add(txtAlamatKar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, 300, 30));

        txtPassword.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtPassword.setBorder(null);
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        KaryawanPanel.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 300, 20));

        jTable2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Karyawan", "Password", "Full Name", "Phone", "Akses"
            }
        ));
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable2.setGridColor(new java.awt.Color(197, 210, 197));
        jTable2.setRowHeight(25);
        jTable2.setSelectionBackground(new java.awt.Color(244, 171, 78));
        jTable2.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable2MouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        KaryawanPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 530, 400));

        txtFullname.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtFullname.setBorder(null);
        txtFullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullnameActionPerformed(evt);
            }
        });
        KaryawanPanel.add(txtFullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 300, 30));

        txtPhone.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtPhone.setBorder(null);
        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        KaryawanPanel.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, 300, 20));

        txtIdkar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtIdkar.setBorder(null);
        txtIdkar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdkarActionPerformed(evt);
            }
        });
        KaryawanPanel.add(txtIdkar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 300, 30));

        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });
        KaryawanPanel.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 610, 90, 40));

        btnSimpanKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSimpanKaryawanMouseClicked(evt);
            }
        });
        KaryawanPanel.add(btnSimpanKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 610, 80, 40));

        txtCariKaryawan.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtCariKaryawan.setBorder(null);
        txtCariKaryawan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCariKaryawanKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariKaryawanKeyReleased(evt);
            }
        });
        KaryawanPanel.add(txtCariKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 460, -1));

        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        KaryawanPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 460, 20));

        btnAbout2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAbout2MouseClicked(evt);
            }
        });
        KaryawanPanel.add(btnAbout2, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 6, 130, 30));

        btnLogOut2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOut2MouseClicked(evt);
            }
        });
        KaryawanPanel.add(btnLogOut2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, 130, 30));

        ddLogOut2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DropDownTop.png"))); // NOI18N
        KaryawanPanel.add(ddLogOut2, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 0, -1, 70));

        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel41MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel41MouseEntered(evt);
            }
        });
        KaryawanPanel.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 614, 90, 30));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Karyawan Panel.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        KaryawanPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ContentPanel.add(KaryawanPanel, "card3");

        SupplierPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupplierPanelMouseClicked(evt);
            }
        });
        SupplierPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Supplier", "Nama", "Alamat", "Phone"
            }
        ));
        jTable3.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable3.setGridColor(new java.awt.Color(197, 210, 197));
        jTable3.setRowHeight(25);
        jTable3.setSelectionBackground(new java.awt.Color(244, 171, 78));
        jTable3.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable3MouseReleased(evt);
            }
        });
        jScrollPane5.setViewportView(jTable3);

        SupplierPanel.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 530, 400));

        txtNamSup.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtNamSup.setBorder(null);
        txtNamSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamSupActionPerformed(evt);
            }
        });
        SupplierPanel.add(txtNamSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 300, 30));

        txtAlamat.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtAlamat.setBorder(null);
        txtAlamat.setOpaque(false);
        txtAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlamatActionPerformed(evt);
            }
        });
        SupplierPanel.add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 300, 40));

        txtPhoneSup.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtPhoneSup.setBorder(null);
        txtPhoneSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneSupActionPerformed(evt);
            }
        });
        SupplierPanel.add(txtPhoneSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 301, 300, 30));

        txtJenisBrg.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtJenisBrg.setBorder(null);
        txtJenisBrg.setOpaque(false);
        txtJenisBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJenisBrgActionPerformed(evt);
            }
        });
        SupplierPanel.add(txtJenisBrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 300, 40));

        btnSimpanSup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSimpanSupMouseClicked(evt);
            }
        });
        SupplierPanel.add(btnSimpanSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 610, 90, 40));

        btnUpdateSup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateSupMouseClicked(evt);
            }
        });
        SupplierPanel.add(btnUpdateSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 614, 80, 30));

        txtCariSupplier.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtCariSupplier.setBorder(null);
        txtCariSupplier.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCariSupplierKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariSupplierKeyReleased(evt);
            }
        });
        SupplierPanel.add(txtCariSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 460, 20));

        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        SupplierPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 460, 20));

        btnLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOutMouseClicked(evt);
            }
        });
        SupplierPanel.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, 130, 30));

        btnAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAboutMouseClicked(evt);
            }
        });
        SupplierPanel.add(btnAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 6, 130, 30));

        ddLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DropDownTop.png"))); // NOI18N
        SupplierPanel.add(ddLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 0, -1, 70));

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        SupplierPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 610, 90, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Supplier Panel.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        SupplierPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txtIdSup.setEditable(false);
        txtIdSup.setBackground(new java.awt.Color(255, 255, 255));
        txtIdSup.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtIdSup.setForeground(new java.awt.Color(255, 255, 255));
        txtIdSup.setBorder(null);
        txtIdSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdSupActionPerformed(evt);
            }
        });
        SupplierPanel.add(txtIdSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 590, 300, 30));

        ContentPanel.add(SupplierPanel, "card4");

        TransaksiPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransaksiPanelMouseClicked(evt);
            }
        });

        TransaksiScan.setPreferredSize(new java.awt.Dimension(480, 677));
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Panel Transaksi.png"))); // NOI18N
        TransaksiScan.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        txt_hariPenjualan.setEditable(false);
        txt_hariPenjualan.setBackground(new java.awt.Color(255, 255, 255));
        txt_hariPenjualan.setForeground(new java.awt.Color(255, 255, 255));
        txt_hariPenjualan.setBorder(null);
        txt_hariPenjualan.setOpaque(false);
        TransaksiScan.add(txt_hariPenjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 650, 100, -1));

        txt_jamPenjualan.setEditable(false);
        txt_jamPenjualan.setBackground(new java.awt.Color(255, 255, 255));
        txt_jamPenjualan.setForeground(new java.awt.Color(255, 255, 255));
        txt_jamPenjualan.setBorder(null);
        txt_jamPenjualan.setOpaque(false);
        TransaksiScan.add(txt_jamPenjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 650, 100, -1));

        txt_bulanPenjualan.setEditable(false);
        txt_bulanPenjualan.setBackground(new java.awt.Color(255, 255, 255));
        txt_bulanPenjualan.setForeground(new java.awt.Color(255, 255, 255));
        txt_bulanPenjualan.setBorder(null);
        txt_bulanPenjualan.setOpaque(false);
        TransaksiScan.add(txt_bulanPenjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 650, 100, -1));

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
        txtCariBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCariBTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCariBTMouseEntered(evt);
            }
        });
        txtCariBT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCariBTKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariBTKeyReleased(evt);
            }
        });
        Manual.add(txtCariBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 400, 30));

        txtCariBT1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtCariBT1.setBorder(null);
        txtCariBT1.setOpaque(false);
        txtCariBT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCariBT1MouseClicked(evt);
            }
        });
        txtCariBT1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariBT1KeyReleased(evt);
            }
        });
        Manual.add(txtCariBT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 400, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Manual Sch.png"))); // NOI18N
        Manual.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 545, -1));

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

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Transaksi Field.png"))); // NOI18N
        Field.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 545, -1));

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

        btnLogOut3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOut3MouseClicked(evt);
            }
        });
        PemesanaPanel.add(btnLogOut3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, 130, 30));

        btnAbout3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAbout3MouseClicked(evt);
            }
        });
        PemesanaPanel.add(btnAbout3, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 6, 130, 30));

        ddLogOut3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DropDownTop.png"))); // NOI18N
        PemesanaPanel.add(ddLogOut3, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 0, -1, 70));

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

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Barang Pesanan Panel.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        PemesanaPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txtIdbarps.setEditable(false);
        txtIdbarps.setBackground(new java.awt.Color(255, 255, 255));
        txtIdbarps.setForeground(new java.awt.Color(255, 255, 255));
        txtIdbarps.setBorder(null);
        PemesanaPanel.add(txtIdbarps, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 120, -1));

        txtKodebarPesan.setEditable(false);
        txtKodebarPesan.setBackground(new java.awt.Color(255, 255, 255));
        txtKodebarPesan.setForeground(new java.awt.Color(255, 255, 255));
        txtKodebarPesan.setBorder(null);
        txtKodebarPesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodebarPesanActionPerformed(evt);
            }
        });
        PemesanaPanel.add(txtKodebarPesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 120, -1));

        txtKodebarPesan1.setEditable(false);
        txtKodebarPesan1.setBackground(new java.awt.Color(255, 255, 255));
        txtKodebarPesan1.setForeground(new java.awt.Color(255, 255, 255));
        txtKodebarPesan1.setBorder(null);
        PemesanaPanel.add(txtKodebarPesan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 120, -1));

        txtKodebarPesan2.setEditable(false);
        txtKodebarPesan2.setBackground(new java.awt.Color(255, 255, 255));
        txtKodebarPesan2.setForeground(new java.awt.Color(255, 255, 255));
        txtKodebarPesan2.setBorder(null);
        PemesanaPanel.add(txtKodebarPesan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 120, -1));

        jTextField12.setForeground(new java.awt.Color(255, 255, 255));
        jTextField12.setBorder(null);
        jTextField12.setOpaque(false);
        PemesanaPanel.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 150, -1));

        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.setText("B0001");
        jTextField10.setBorder(null);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        PemesanaPanel.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 40, -1));

        txtKodebarPesan3.setEditable(false);
        txtKodebarPesan3.setBackground(new java.awt.Color(255, 255, 255));
        txtKodebarPesan3.setForeground(new java.awt.Color(255, 255, 255));
        txtKodebarPesan3.setBorder(null);
        PemesanaPanel.add(txtKodebarPesan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 120, -1));

        jTextField13.setForeground(new java.awt.Color(255, 255, 255));
        jTextField13.setBorder(null);
        jTextField13.setOpaque(false);
        PemesanaPanel.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 150, -1));

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
        PesanBarangPanel.add(txtPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 223, 200, 30));

        txtAlamat1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtAlamat1.setBorder(null);
        txtAlamat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlamat1ActionPerformed(evt);
            }
        });
        PesanBarangPanel.add(txtAlamat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 311, 200, 30));

        txtWarna.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtWarna.setBorder(null);
        txtWarna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWarnaActionPerformed(evt);
            }
        });
        PesanBarangPanel.add(txtWarna, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 223, 200, 30));

        txtPanjang.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtPanjang.setBorder(null);
        txtPanjang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPanjangMouseClicked(evt);
            }
        });
        txtPanjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPanjangActionPerformed(evt);
            }
        });
        txtPanjang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPanjangKeyReleased(evt);
            }
        });
        PesanBarangPanel.add(txtPanjang, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 395, 200, 30));

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
        PesanBarangPanel.add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 480, 150, 30));

        txtNamaCus.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtNamaCus.setBorder(null);
        txtNamaCus.setOpaque(false);
        txtNamaCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaCusActionPerformed(evt);
            }
        });
        PesanBarangPanel.add(txtNamaCus, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 200, 40));

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

        PesanBarangPanel.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 400, 410));

        btnLogOut6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOut6MouseClicked(evt);
            }
        });
        PesanBarangPanel.add(btnLogOut6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, 130, 30));
        PesanBarangPanel.add(btnAbout6, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 6, 130, 30));

        ddLogOut6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DropDownTop.png"))); // NOI18N
        PesanBarangPanel.add(ddLogOut6, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 0, -1, 70));

        jComboBox7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jComboBox7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });
        PesanBarangPanel.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 304, 230, 41));

        jComboBox6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jComboBox6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });
        PesanBarangPanel.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 390, 230, 41));

        jComboBox5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jComboBox5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        PesanBarangPanel.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 132, 230, 41));

        txtTotal.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtTotal.setBorder(null);
        PesanBarangPanel.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 550, 100, 30));

        rpps.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        rpps.setBorder(null);
        PesanBarangPanel.add(rpps, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, 30, 30));

        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel43MouseClicked(evt);
            }
        });
        PesanBarangPanel.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 130, 40));

        jLabel30.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel30.setText("Total :");
        PesanBarangPanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, -1, 30));

        jTextField11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField11.setText("Rp");
        jTextField11.setBorder(null);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        PesanBarangPanel.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 485, 30, 20));

        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        PesanBarangPanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 480, 30, 30));

        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });
        PesanBarangPanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 580, 80, 30));

        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });
        PesanBarangPanel.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 580, 80, 30));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Jasa.png"))); // NOI18N
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

        txtMotif.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtMotif.setBorder(null);
        txtMotif.setOpaque(false);
        txtMotif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMotifActionPerformed(evt);
            }
        });
        PesanBarangPanel.add(txtMotif, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 200, 40));

        txt_HargaJasa.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_HargaJasa.setForeground(new java.awt.Color(255, 255, 255));
        txt_HargaJasa.setBorder(null);
        txt_HargaJasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_HargaJasaActionPerformed(evt);
            }
        });
        PesanBarangPanel.add(txt_HargaJasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 540, 200, 30));

        txt_namaJasaa.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_namaJasaa.setForeground(new java.awt.Color(255, 255, 255));
        txt_namaJasaa.setBorder(null);
        txt_namaJasaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaJasaaActionPerformed(evt);
            }
        });
        PesanBarangPanel.add(txt_namaJasaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, 200, 30));

        txtIdBPes.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtIdBPes.setBorder(null);
        txtIdBPes.setOpaque(false);
        txtIdBPes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdBPesActionPerformed(evt);
            }
        });
        PesanBarangPanel.add(txtIdBPes, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 200, 40));

        txtharipemesanan.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtharipemesanan.setBorder(null);
        txtharipemesanan.setOpaque(false);
        txtharipemesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtharipemesananActionPerformed(evt);
            }
        });
        PesanBarangPanel.add(txtharipemesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 200, 40));

        txtBulanpemesanan.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtBulanpemesanan.setBorder(null);
        txtBulanpemesanan.setOpaque(false);
        txtBulanpemesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBulanpemesananActionPerformed(evt);
            }
        });
        PesanBarangPanel.add(txtBulanpemesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 200, 40));

        txt_Hkain.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_Hkain.setForeground(new java.awt.Color(255, 255, 255));
        txt_Hkain.setBorder(null);
        txt_Hkain.setOpaque(false);
        txt_Hkain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_HkainActionPerformed(evt);
            }
        });
        PesanBarangPanel.add(txt_Hkain, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, 200, 30));

        txtJamPemesanan.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtJamPemesanan.setBorder(null);
        txtJamPemesanan.setOpaque(false);
        txtJamPemesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJamPemesananActionPerformed(evt);
            }
        });
        PesanBarangPanel.add(txtJamPemesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 200, 40));

        txt_idkain.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_idkain.setForeground(new java.awt.Color(255, 255, 255));
        txt_idkain.setBorder(null);
        txt_idkain.setOpaque(false);
        txt_idkain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idkainActionPerformed(evt);
            }
        });
        PesanBarangPanel.add(txt_idkain, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, 200, 30));

        PesanPanel.add(PesanBarangPanel, "card4");

        ContentPanel.add(PesanPanel, "card11");

        PembelianPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PembelianPanelMouseClicked(evt);
            }
        });
        PembelianPanel.setLayout(new java.awt.CardLayout());

        brgStok.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBSMouseClicked(evt);
            }
        });
        brgStok.add(btnBS, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 84, 120, 40));

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

        btnLogOut4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOut4MouseClicked(evt);
            }
        });
        brgStok.add(btnLogOut4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, 130, 30));

        btnAbout4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAbout4MouseClicked(evt);
            }
        });
        brgStok.add(btnAbout4, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 6, 130, 30));

        ddLogOut4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DropDownTop.png"))); // NOI18N
        brgStok.add(ddLogOut4, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 0, -1, 70));

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
        brgStok.add(rpbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 530, 40, 30));

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
        cb_distributor2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb_distributor2MouseClicked(evt);
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

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/PembelianBS.png"))); // NOI18N
        jLabel6.setOpaque(true);
        brgStok.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txtIdresbs.setEditable(false);
        txtIdresbs.setBackground(new java.awt.Color(255, 255, 255));
        txtIdresbs.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtIdresbs.setForeground(new java.awt.Color(255, 255, 255));
        txtIdresbs.setBorder(null);
        brgStok.add(txtIdresbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 190, -1));

        txtIdbarbs.setForeground(new java.awt.Color(255, 255, 255));
        txtIdbarbs.setBorder(null);
        brgStok.add(txtIdbarbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 150, 30));

        txtIdsupbs.setForeground(new java.awt.Color(255, 255, 255));
        txtIdsupbs.setBorder(null);
        brgStok.add(txtIdsupbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 150, 30));

        txtIdkarbs.setForeground(new java.awt.Color(255, 255, 255));
        txtIdkarbs.setBorder(null);
        txtIdkarbs.setCaretColor(new java.awt.Color(255, 255, 255));
        txtIdkarbs.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        brgStok.add(txtIdkarbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 100, 30));

        txtTanggalbs.setForeground(new java.awt.Color(255, 255, 255));
        txtTanggalbs.setBorder(null);
        txtTanggalbs.setOpaque(false);
        brgStok.add(txtTanggalbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 140, 30));

        txtIdkarbs1.setForeground(new java.awt.Color(255, 255, 255));
        txtIdkarbs1.setBorder(null);
        txtIdkarbs1.setCaretColor(new java.awt.Color(255, 255, 255));
        txtIdkarbs1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        brgStok.add(txtIdkarbs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 160, 30));

        txt_Haribeli.setForeground(new java.awt.Color(255, 255, 255));
        txt_Haribeli.setBorder(null);
        txt_Haribeli.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_Haribeli.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        brgStok.add(txt_Haribeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 140, 30));

        txt_bulanbeli.setForeground(new java.awt.Color(255, 255, 255));
        txt_bulanbeli.setBorder(null);
        txt_bulanbeli.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_bulanbeli.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        brgStok.add(txt_bulanbeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 150, 30));

        txt_Jambeli.setForeground(new java.awt.Color(255, 255, 255));
        txt_Jambeli.setBorder(null);
        txt_Jambeli.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_Jambeli.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        brgStok.add(txt_Jambeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 140, 30));

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

        btnLogOut5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOut5MouseClicked(evt);
            }
        });
        brgBaru.add(btnLogOut5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, 130, 30));
        brgBaru.add(btnAbout5, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 6, 130, 30));

        ddLogOut5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DropDownTop.png"))); // NOI18N
        brgBaru.add(ddLogOut5, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 0, -1, 70));

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

        jComboBox4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        brgBaru.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 339, 211, 41));

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
        brgBaru.add(txtIdsup, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 620, 70, -1));

        txtIdkarBB.setBorder(null);
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

        txtTanggalBBhari.setForeground(new java.awt.Color(255, 255, 255));
        txtTanggalBBhari.setBorder(null);
        txtTanggalBBhari.setOpaque(false);
        txtTanggalBBhari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTanggalBBhariActionPerformed(evt);
            }
        });
        brgBaru.add(txtTanggalBBhari, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 620, 60, -1));

        txtTanggalBBbulan.setForeground(new java.awt.Color(255, 255, 255));
        txtTanggalBBbulan.setBorder(null);
        txtTanggalBBbulan.setOpaque(false);
        brgBaru.add(txtTanggalBBbulan, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 620, 60, -1));

        txt_Idmotif.setForeground(new java.awt.Color(255, 255, 255));
        txt_Idmotif.setBorder(null);
        txt_Idmotif.setOpaque(false);
        brgBaru.add(txt_Idmotif, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 80, -1));

        txtTanggalBBJam.setForeground(new java.awt.Color(255, 255, 255));
        txtTanggalBBJam.setBorder(null);
        txtTanggalBBJam.setOpaque(false);
        brgBaru.add(txtTanggalBBJam, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 620, 60, -1));

        PembelianPanel.add(brgBaru, "card3");

        ContentPanel.add(PembelianPanel, "card7");

        PengaturanProdukPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PengaturanProdukPanelMouseClicked(evt);
            }
        });
        PengaturanProdukPanel.setLayout(new java.awt.CardLayout());

        Katalog.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTambahMouseClicked(evt);
            }
        });
        Katalog.add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 100, 40, 30));

        btnLogOut7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOut7MouseClicked(evt);
            }
        });
        Katalog.add(btnLogOut7, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, 130, 30));

        btnAbout7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAbout7MouseClicked(evt);
            }
        });
        Katalog.add(btnAbout7, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 6, 130, 30));

        ddLogOut7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DropDownTop.png"))); // NOI18N
        Katalog.add(ddLogOut7, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 0, -1, 70));

        jTable10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTable10.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable10.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable10.setGridColor(new java.awt.Color(197, 210, 197));
        jTable10.setRowHeight(25);
        jTable10.setSelectionBackground(new java.awt.Color(244, 171, 78));
        jTable10.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable10MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable10MouseReleased(evt);
            }
        });
        jScrollPane12.setViewportView(jTable10);

        Katalog.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 940, 500));

        txtCariProduk.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtCariProduk.setBorder(null);
        txtCariProduk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCariProdukKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariProdukKeyReleased(evt);
            }
        });
        Katalog.add(txtCariProduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 780, 30));

        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });
        Katalog.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 104, 780, 20));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ProdukKatalog.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        Katalog.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 677));

        txtGambar.setEditable(false);
        txtGambar.setBackground(new java.awt.Color(255, 255, 255));
        txtGambar.setForeground(new java.awt.Color(255, 255, 255));
        txtGambar.setBorder(null);
        Katalog.add(txtGambar, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 40, 80, -1));

        PengaturanProdukPanel.add(Katalog, "card2");

        View.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEditView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditViewMouseClicked(evt);
            }
        });
        View.add(btnEditView, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 610, 90, 40));

        btnLogOut8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOut8MouseClicked(evt);
            }
        });
        View.add(btnLogOut8, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, 130, 30));
        View.add(btnAbout8, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 6, 130, 30));

        ddLogOut8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DropDownTop.png"))); // NOI18N
        View.add(ddLogOut8, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 0, -1, 70));
        View.add(PreviewImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 270, 260));

        Txt_NamaBarang.setEditable(false);
        Txt_NamaBarang.setBackground(new java.awt.Color(197, 210, 197));
        Txt_NamaBarang.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        Txt_NamaBarang.setBorder(null);
        View.add(Txt_NamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 790, 40));

        Txt_Kategori.setEditable(false);
        Txt_Kategori.setBackground(new java.awt.Color(255, 255, 255));
        Txt_Kategori.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Txt_Kategori.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Txt_Kategori.setBorder(null);
        Txt_Kategori.setOpaque(false);
        View.add(Txt_Kategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 360, 30));

        Txt_Motif.setEditable(false);
        Txt_Motif.setBackground(new java.awt.Color(255, 255, 255));
        Txt_Motif.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Txt_Motif.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Txt_Motif.setBorder(null);
        Txt_Motif.setOpaque(false);
        View.add(Txt_Motif, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 360, 30));

        Txt_Ukuran.setEditable(false);
        Txt_Ukuran.setBackground(new java.awt.Color(255, 255, 255));
        Txt_Ukuran.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Txt_Ukuran.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Txt_Ukuran.setBorder(null);
        Txt_Ukuran.setOpaque(false);
        View.add(Txt_Ukuran, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 360, 30));

        Txt_Stok.setEditable(false);
        Txt_Stok.setBackground(new java.awt.Color(255, 255, 255));
        Txt_Stok.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Txt_Stok.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Txt_Stok.setBorder(null);
        Txt_Stok.setOpaque(false);
        View.add(Txt_Stok, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 360, 30));

        Txt_IdbarangB.setEditable(false);
        Txt_IdbarangB.setBackground(new java.awt.Color(255, 255, 255));
        Txt_IdbarangB.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Txt_IdbarangB.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Txt_IdbarangB.setBorder(null);
        Txt_IdbarangB.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Txt_IdbarangB.setOpaque(false);
        View.add(Txt_IdbarangB, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 360, 30));

        Txt_HargaJual.setEditable(false);
        Txt_HargaJual.setBackground(new java.awt.Color(255, 255, 255));
        Txt_HargaJual.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Txt_HargaJual.setBorder(null);
        View.add(Txt_HargaJual, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 120, 50));

        FileName.setEditable(false);
        FileName.setBackground(new java.awt.Color(255, 255, 255));
        FileName.setForeground(new java.awt.Color(255, 255, 255));
        FileName.setBorder(null);
        View.add(FileName, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 430, 120, 40));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BtnCetakBarcode.png"))); // NOI18N
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel39MouseClicked(evt);
            }
        });
        View.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 510, 160, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        DetailBarcode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode.setBorder(null);
        DetailBarcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PreviewKodeBarcode, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(DetailBarcode)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DetailBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PreviewKodeBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        View.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 405, 220, 90));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Tindes.png"))); // NOI18N
        View.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 610, 40));

        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
        });
        View.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 610, 100, 40));

        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        View.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 40, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/View Produk.png"))); // NOI18N
        View.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 677));

        Txt_Kodebarcode.setEditable(false);
        Txt_Kodebarcode.setBackground(new java.awt.Color(255, 255, 255));
        Txt_Kodebarcode.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Txt_Kodebarcode.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Txt_Kodebarcode.setBorder(null);
        Txt_Kodebarcode.setOpaque(false);
        View.add(Txt_Kodebarcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 360, 40));

        Txt_HargaBeli.setEditable(false);
        Txt_HargaBeli.setBackground(new java.awt.Color(255, 255, 255));
        Txt_HargaBeli.setForeground(new java.awt.Color(255, 255, 255));
        Txt_HargaBeli.setBorder(null);
        View.add(Txt_HargaBeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 430, 120, 40));

        PengaturanProdukPanel.add(View, "card3");

        Edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancelView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelViewMouseClicked(evt);
            }
        });
        Edit.add(btnCancelView, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 610, 80, 30));

        btnLogOut9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOut9MouseClicked(evt);
            }
        });
        Edit.add(btnLogOut9, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, 130, 30));
        Edit.add(btnAbout9, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 6, 130, 30));

        ddLogOut9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DropDownTop.png"))); // NOI18N
        Edit.add(ddLogOut9, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 0, -1, 70));
        Edit.add(PreviewImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 260, 250));

        Btn_HapusPreview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_HapusPreviewMouseClicked(evt);
            }
        });
        Edit.add(Btn_HapusPreview, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 50, 40));

        TambahnGambar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TambahnGambarMouseClicked(evt);
            }
        });
        Edit.add(TambahnGambar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 50, 40));

        Txt_Idbarang1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        Txt_Idbarang1.setBorder(null);
        Txt_Idbarang1.setEnabled(false);
        Txt_Idbarang1.setOpaque(false);
        Edit.add(Txt_Idbarang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 250, -1));

        Txt_NamaBarang1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        Txt_NamaBarang1.setBorder(null);
        Txt_NamaBarang1.setOpaque(false);
        Edit.add(Txt_NamaBarang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 211, 250, 30));

        Txt_Ukuran1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        Txt_Ukuran1.setBorder(null);
        Txt_Ukuran1.setOpaque(false);
        Txt_Ukuran1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_Ukuran1ActionPerformed(evt);
            }
        });
        Edit.add(Txt_Ukuran1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 250, 30));

        Txt_HargaBeli1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        Txt_HargaBeli1.setBorder(null);
        Txt_HargaBeli1.setOpaque(false);
        Txt_HargaBeli1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_HargaBeli1ActionPerformed(evt);
            }
        });
        Edit.add(Txt_HargaBeli1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 240, -1));

        Txt_HargaJual1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        Txt_HargaJual1.setBorder(null);
        Edit.add(Txt_HargaJual1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 210, 240, 30));

        Txt_Stok1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        Txt_Stok1.setBorder(null);
        Edit.add(Txt_Stok1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, 250, -1));

        Txt_Kodebarcode1.setEditable(false);
        Txt_Kodebarcode1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Txt_Kodebarcode1.setBorder(null);
        Txt_Kodebarcode1.setOpaque(false);
        Edit.add(Txt_Kodebarcode1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, 250, 30));

        jcomboboxmotif.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jcomboboxmotif.setBorder(null);
        jcomboboxmotif.setOpaque(false);
        jcomboboxmotif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboboxmotifActionPerformed(evt);
            }
        });
        Edit.add(jcomboboxmotif, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 458, 270, 42));

        Kategori.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        Kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baju", "Kain", "Alat Batik" }));
        Kategori.setBorder(null);
        Kategori.setOpaque(false);
        Edit.add(Kategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 270, 40));

        Btn_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_saveMouseClicked(evt);
            }
        });
        Edit.add(Btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 610, 80, 30));

        FileName1.setEditable(false);
        FileName1.setBackground(new java.awt.Color(255, 255, 255));
        FileName1.setForeground(new java.awt.Color(255, 255, 255));
        FileName1.setBorder(null);
        Edit.add(FileName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 240, 20));

        cb_distributor4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cb_distributor4.setMaximumRowCount(5);
        cb_distributor4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- PILIH -" }));
        cb_distributor4.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cb_distributor4PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cb_distributor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_distributor4ActionPerformed(evt);
            }
        });
        Edit.add(cb_distributor4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, 270, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Edit Produk.png"))); // NOI18N
        Edit.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Txt_Motif1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        Txt_Motif1.setForeground(new java.awt.Color(255, 255, 255));
        Txt_Motif1.setBorder(null);
        Txt_Motif1.setOpaque(false);
        Edit.add(Txt_Motif1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, 250, 20));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setBorder(null);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        Edit.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 610, 130, -1));

        PengaturanProdukPanel.add(Edit, "card4");

        Edit1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancelView1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelView1MouseClicked(evt);
            }
        });
        Edit1.add(btnCancelView1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 610, 80, 30));

        btnLogOut14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOut14MouseClicked(evt);
            }
        });
        Edit1.add(btnLogOut14, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, 130, 30));
        Edit1.add(btnAbout14, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 6, 130, 30));

        ddLogOut14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DropDownTop.png"))); // NOI18N
        Edit1.add(ddLogOut14, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 0, -1, 70));
        Edit1.add(PreviewImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 98, 270, 260));

        Txt_Idbarang2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        Txt_Idbarang2.setBorder(null);
        Txt_Idbarang2.setEnabled(false);
        Txt_Idbarang2.setOpaque(false);
        Edit1.add(Txt_Idbarang2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 250, -1));

        Txt_NamaBarang2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        Txt_NamaBarang2.setBorder(null);
        Txt_NamaBarang2.setOpaque(false);
        Edit1.add(Txt_NamaBarang2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 211, 250, 30));

        Txt_Ukuran2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        Txt_Ukuran2.setBorder(null);
        Txt_Ukuran2.setOpaque(false);
        Txt_Ukuran2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_Ukuran2ActionPerformed(evt);
            }
        });
        Edit1.add(Txt_Ukuran2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 375, 250, 30));

        Txt_HargaBeli2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        Txt_HargaBeli2.setBorder(null);
        Txt_HargaBeli2.setOpaque(false);
        Txt_HargaBeli2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_HargaBeli2ActionPerformed(evt);
            }
        });
        Edit1.add(Txt_HargaBeli2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 240, -1));

        Txt_HargaJual2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        Txt_HargaJual2.setBorder(null);
        Txt_HargaJual2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_HargaJual2ActionPerformed(evt);
            }
        });
        Edit1.add(Txt_HargaJual2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 211, 240, 30));

        Txt_Stok2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        Txt_Stok2.setBorder(null);
        Txt_Stok2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_Stok2ActionPerformed(evt);
            }
        });
        Edit1.add(Txt_Stok2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, 250, -1));

        Kategori1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Kategori1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baju", "Kain", "Alat Batik" }));
        Kategori1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Kategori1.setOpaque(false);
        Kategori1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kategori1ActionPerformed(evt);
            }
        });
        Edit1.add(Kategori1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 270, 40));

        Btn_save1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_save1MouseClicked(evt);
            }
        });
        Edit1.add(Btn_save1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 610, 80, 30));

        FileName2.setEditable(false);
        FileName2.setBackground(new java.awt.Color(255, 255, 255));
        FileName2.setForeground(new java.awt.Color(255, 255, 255));
        FileName2.setBorder(null);
        Edit1.add(FileName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 240, -1));

        cb_distributor5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cb_distributor5.setMaximumRowCount(5);
        cb_distributor5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- PILIH -" }));
        cb_distributor5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cb_distributor5.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cb_distributor5PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cb_distributor5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_distributor5ActionPerformed(evt);
            }
        });
        Edit1.add(cb_distributor5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, 270, 40));

        jComboBox1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jComboBox1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        Edit1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 270, 40));

        Btn_MasterBatik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_MasterBatikMouseClicked(evt);
            }
        });
        Edit1.add(Btn_MasterBatik, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 550, 140, 40));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BarangBaru1.png"))); // NOI18N
        Edit1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setBorder(null);
        jTextField7.setOpaque(false);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        Edit1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 510, 270, -1));

        Txt_Gambar.setForeground(new java.awt.Color(255, 255, 255));
        Txt_Gambar.setBorder(null);
        Txt_Gambar.setOpaque(false);
        Edit1.add(Txt_Gambar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 170, -1));

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(255, 255, 255));
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setBorder(null);
        Edit1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 610, 130, -1));

        PengaturanProdukPanel.add(Edit1, "card4");

        PanelPrintBarcode.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DetailBarcode1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode1.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode1.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode1.setBorder(null);
        DetailBarcode1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode1ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 240, -1));
        PanelPrintBarcode.add(PreviewKodeBarcode1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 240, 80));

        DetailBarcode2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode2.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode2.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode2.setBorder(null);
        DetailBarcode2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode2ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 240, -1));
        PanelPrintBarcode.add(PreviewKodeBarcode2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 240, 80));
        PanelPrintBarcode.add(PreviewKodeBarcode3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 240, 80));

        DetailBarcode3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode3.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode3.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode3.setBorder(null);
        DetailBarcode3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode3ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 240, -1));
        PanelPrintBarcode.add(PreviewKodeBarcode4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 180, 240, 80));

        DetailBarcode4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode4.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode4.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode4.setBorder(null);
        DetailBarcode4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode4ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 150, 240, -1));

        DetailBarcode5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode5.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode5.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode5.setBorder(null);
        DetailBarcode5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode5ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 280, 240, -1));
        PanelPrintBarcode.add(PreviewKodeBarcode5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 310, 240, 80));
        PanelPrintBarcode.add(PreviewKodeBarcode6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 240, 80));

        DetailBarcode6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode6.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode6.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode6.setBorder(null);
        DetailBarcode6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode6ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 240, -1));
        PanelPrintBarcode.add(PreviewKodeBarcode7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 240, 80));

        DetailBarcode7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode7.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode7.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode7.setBorder(null);
        DetailBarcode7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode7ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 240, -1));

        DetailBarcode8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode8.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode8.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode8.setBorder(null);
        DetailBarcode8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode8ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 240, -1));
        PanelPrintBarcode.add(PreviewKodeBarcode8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 240, 80));
        PanelPrintBarcode.add(PreviewKodeBarcode9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 240, 80));

        DetailBarcode9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode9.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode9.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode9.setBorder(null);
        DetailBarcode9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode9ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 240, -1));
        PanelPrintBarcode.add(PreviewKodeBarcode10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 240, 80));

        DetailBarcode10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode10.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode10.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode10.setBorder(null);
        DetailBarcode10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode10ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 240, -1));

        DetailBarcode11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode11.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode11.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode11.setBorder(null);
        DetailBarcode11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode11ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 240, -1));
        PanelPrintBarcode.add(PreviewKodeBarcode11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 240, 80));

        DetailBarcode12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode12.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode12.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode12.setBorder(null);
        DetailBarcode12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode12ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode12, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 410, 240, -1));
        PanelPrintBarcode.add(PreviewKodeBarcode12, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 440, 240, 80));
        PanelPrintBarcode.add(PreviewKodeBarcode13, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 570, 240, 80));

        DetailBarcode13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode13.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode13.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode13.setBorder(null);
        DetailBarcode13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode13ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode13, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 540, 240, -1));

        DetailBarcode14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode14.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode14.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode14.setBorder(null);
        DetailBarcode14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode14ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode14, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 540, 240, -1));
        PanelPrintBarcode.add(PreviewKodeBarcode14, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 570, 240, 80));

        DetailBarcode15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode15.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode15.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode15.setBorder(null);
        DetailBarcode15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode15ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 240, -1));
        PanelPrintBarcode.add(PreviewKodeBarcode15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, 240, 80));
        PanelPrintBarcode.add(PreviewKodeBarcode16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, 240, 80));

        DetailBarcode16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode16.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode16.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode16.setBorder(null);
        DetailBarcode16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode16ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 240, -1));

        DetailBarcode17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode17.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode17.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode17.setBorder(null);
        DetailBarcode17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode17ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 680, 240, -1));
        PanelPrintBarcode.add(PreviewKodeBarcode17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 710, 240, 80));

        DetailBarcode18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode18.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode18.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode18.setBorder(null);
        DetailBarcode18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode18ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode18, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 680, 240, -1));
        PanelPrintBarcode.add(PreviewKodeBarcode18, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 710, 240, 80));
        PanelPrintBarcode.add(PreviewKodeBarcode19, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 710, 240, 80));

        DetailBarcode19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode19.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode19.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode19.setBorder(null);
        DetailBarcode19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode19ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode19, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 680, 240, -1));

        DetailBarcode20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode20.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode20.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode20.setBorder(null);
        DetailBarcode20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode20ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode20, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 680, 240, -1));
        PanelPrintBarcode.add(PreviewKodeBarcode20, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 710, 240, 80));

        DetailBarcode21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode21.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode21.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode21.setBorder(null);
        DetailBarcode21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode21ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode21, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 810, 240, -1));
        PanelPrintBarcode.add(PreviewKodeBarcode21, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 840, 240, 80));
        PanelPrintBarcode.add(PreviewKodeBarcode22, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 840, 240, 80));

        DetailBarcode22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode22.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode22.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode22.setBorder(null);
        DetailBarcode22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode22ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode22, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 810, 240, -1));
        PanelPrintBarcode.add(PreviewKodeBarcode23, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 840, 240, 80));

        DetailBarcode23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode23.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode23.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode23.setBorder(null);
        DetailBarcode23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode23ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode23, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 810, 240, -1));

        DetailBarcode24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode24.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode24.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode24.setBorder(null);
        DetailBarcode24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode24ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 810, 240, -1));
        PanelPrintBarcode.add(PreviewKodeBarcode24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 840, 240, 80));

        DetailBarcode25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode25.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode25.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode25.setBorder(null);
        DetailBarcode25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode25ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 940, 240, -1));
        PanelPrintBarcode.add(PreviewKodeBarcode25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 970, 240, 80));
        PanelPrintBarcode.add(PreviewKodeBarcode26, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 970, 240, 80));

        DetailBarcode26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode26.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode26.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode26.setBorder(null);
        DetailBarcode26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode26ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode26, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 940, 240, -1));

        DetailBarcode27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode27.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode27.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode27.setBorder(null);
        DetailBarcode27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode27ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode27, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 940, 240, -1));
        PanelPrintBarcode.add(PreviewKodeBarcode27, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 970, 240, 80));
        PanelPrintBarcode.add(PreviewKodeBarcode28, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 970, 240, 80));

        DetailBarcode28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode28.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode28.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode28.setBorder(null);
        DetailBarcode28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode28ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode28, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 940, 240, -1));
        PanelPrintBarcode.add(PreviewKodeBarcode29, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 1100, 240, 80));

        DetailBarcode29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode29.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode29.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode29.setBorder(null);
        DetailBarcode29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode29ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode29, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 1070, 240, -1));

        DetailBarcode30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode30.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode30.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode30.setBorder(null);
        DetailBarcode30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode30ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode30, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 1070, 240, -1));
        PanelPrintBarcode.add(PreviewKodeBarcode30, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 1100, 240, 80));
        PanelPrintBarcode.add(PreviewKodeBarcode31, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1100, 240, 80));

        DetailBarcode31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode31.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode31.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode31.setBorder(null);
        DetailBarcode31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode31ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode31, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1070, 240, -1));
        PanelPrintBarcode.add(PreviewKodeBarcode32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1100, 240, 80));

        DetailBarcode32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode32.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode32.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode32.setBorder(null);
        DetailBarcode32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode32ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1070, 240, -1));
        PanelPrintBarcode.add(PreviewKodeBarcode33, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1230, 240, 80));

        DetailBarcode33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode33.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode33.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode33.setBorder(null);
        DetailBarcode33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode33ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode33, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1200, 240, -1));

        DetailBarcode34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode34.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode34.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode34.setBorder(null);
        DetailBarcode34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode34ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode34, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1200, 240, -1));
        PanelPrintBarcode.add(PreviewKodeBarcode34, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1230, 240, 80));

        DetailBarcode35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode35.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode35.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode35.setBorder(null);
        DetailBarcode35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode35ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode35, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 1200, 240, -1));
        PanelPrintBarcode.add(PreviewKodeBarcode35, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 1230, 240, 80));

        DetailBarcode36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode36.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode36.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode36.setBorder(null);
        DetailBarcode36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode36ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode36, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 1200, 240, -1));
        PanelPrintBarcode.add(PreviewKodeBarcode36, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 1230, 240, 80));

        DetailBarcode37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode37.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode37.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode37.setBorder(null);
        DetailBarcode37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode37ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode37, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 1340, 240, -1));
        PanelPrintBarcode.add(PreviewKodeBarcode37, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 1370, 240, 80));

        DetailBarcode38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode38.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode38.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode38.setBorder(null);
        DetailBarcode38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode38ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode38, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 1340, 240, -1));
        PanelPrintBarcode.add(PreviewKodeBarcode38, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 1370, 240, 80));

        DetailBarcode39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode39.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode39.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode39.setBorder(null);
        DetailBarcode39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode39ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode39, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1340, 240, -1));
        PanelPrintBarcode.add(PreviewKodeBarcode39, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1370, 240, 80));
        PanelPrintBarcode.add(PreviewKodeBarcode40, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1370, 240, 80));

        DetailBarcode40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DetailBarcode40.setAlignmentX(CENTER_ALIGNMENT);
        DetailBarcode40.setAlignmentY(CENTER_ALIGNMENT);
        DetailBarcode40.setBorder(null);
        DetailBarcode40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBarcode40ActionPerformed(evt);
            }
        });
        PanelPrintBarcode.add(DetailBarcode40, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1340, 240, -1));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Groupppp.png"))); // NOI18N
        jLabel40.setText("jLabel40");
        PanelPrintBarcode.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 1180, -1));

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

        jDateChooser2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jDateChooser2MouseEntered(evt);
            }
        });
        rpPenjualan.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 190, 30));

        Btn_CariPemasukan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Btn_CariReport.png"))); // NOI18N
        Btn_CariPemasukan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_CariPemasukanMouseClicked(evt);
            }
        });
        rpPenjualan.add(Btn_CariPemasukan, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 90, 30));

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
        jlabelll.setBorder(null);
        rpPenjualan.add(jlabelll, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 550, 30, -1));

        Txt_TotalPemasukan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Txt_TotalPemasukan.setBorder(null);
        rpPenjualan.add(Txt_TotalPemasukan, new org.netbeans.lib.awtextra.AbsoluteConstraints(835, 550, 130, -1));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Analisisis.png"))); // NOI18N
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel42MouseClicked(evt);
            }
        });
        rpPenjualan.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 601, 100, 50));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Cetak.png"))); // NOI18N
        jLabel44.setText("jLabel44");
        rpPenjualan.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 605, 80, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ReportPemasukan.png"))); // NOI18N
        rpPenjualan.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
        rpPembelian.add(Btn_CariPengeluaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 90, 30));

        Txt_TotalPengeluaran.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Txt_TotalPengeluaran.setBorder(null);
        rpPembelian.add(Txt_TotalPengeluaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 550, 120, 20));

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField5.setText("Rp");
        jTextField5.setBorder(null);
        rpPembelian.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 550, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ReportPengeluaran.png"))); // NOI18N
        rpPembelian.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ReportPanel.add(rpPembelian, "card3");

        PanelPrintBarcode.add(ReportPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PengaturanProdukPanel.add(PanelPrintBarcode, "card6");

        ContentPanel.add(PengaturanProdukPanel, "card8");

        javax.swing.GroupLayout BodyPanelLayout = new javax.swing.GroupLayout(BodyPanel);
        BodyPanel.setLayout(BodyPanelLayout);
        BodyPanelLayout.setHorizontalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TopMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ContentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BodyPanelLayout.setVerticalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BodyPanelLayout.createSequentialGroup()
                        .addComponent(TopMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(ContentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void KaryawanHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KaryawanHomeMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();

        ContentPanel.add(KaryawanPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(KaryawanMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_KaryawanHomeMouseClicked

    private void SupplierHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierHomeMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();

        ContentPanel.add(SupplierPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(SupplierMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_SupplierHomeMouseClicked

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

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_TransaksiHomeMouseClicked

    private void PemesananHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PemesananHomeMouseClicked
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
        MenuPanel.add(PemesananMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_PemesananHomeMouseClicked

    private void PembelianHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PembelianHomeMouseClicked
        // TODO add your handling codte here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();

        ContentPanel.add(PembelianPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(PembelianMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_PembelianHomeMouseClicked

    private void PengaturanProdukHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PengaturanProdukHomeMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();

        ContentPanel.add(PengaturanProdukPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(PengaturanProdukMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_PengaturanProdukHomeMouseClicked

    private void ReportHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportHomeMouseClicked
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
        MenuPanel.add(ReportMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_ReportHomeMouseClicked

    private void HomeKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeKaryawanMouseClicked
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

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_HomeKaryawanMouseClicked

    private void SupplierKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierKaryawanMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();

        ContentPanel.add(SupplierPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(SupplierMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_SupplierKaryawanMouseClicked

    private void TransaksiKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransaksiKaryawanMouseClicked
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

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_TransaksiKaryawanMouseClicked

    private void PemesananKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PemesananKaryawanMouseClicked
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
        MenuPanel.add(PemesananMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_PemesananKaryawanMouseClicked

    private void PembelianKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PembelianKaryawanMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();

        ContentPanel.add(PembelianPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(PembelianMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_PembelianKaryawanMouseClicked

    private void PengaturanProdukKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PengaturanProdukKaryawanMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();

        ContentPanel.add(PengaturanProdukPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(PengaturanProdukMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_PengaturanProdukKaryawanMouseClicked

    private void ReportKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportKaryawanMouseClicked
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
        MenuPanel.add(ReportMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_ReportKaryawanMouseClicked

    private void HomeSupplierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeSupplierMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeSupplierMouseEntered

    private void HomeSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeSupplierMouseClicked
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

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_HomeSupplierMouseClicked

    private void KaryawanSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KaryawanSupplierMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();

        ContentPanel.add(KaryawanPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(KaryawanMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_KaryawanSupplierMouseClicked

    private void TransaksiSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransaksiSupplierMouseClicked
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

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_TransaksiSupplierMouseClicked

    private void PemesananSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PemesananSupplierMouseClicked
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
        MenuPanel.add(PemesananMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_PemesananSupplierMouseClicked

    private void PembelianSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PembelianSupplierMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();

        ContentPanel.add(PembelianPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(PembelianMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_PembelianSupplierMouseClicked

    private void PengaturanProdukSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PengaturanProdukSupplierMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();

        ContentPanel.add(PengaturanProdukPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(PengaturanProdukMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_PengaturanProdukSupplierMouseClicked

    private void ReportSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportSupplierMouseClicked
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
        MenuPanel.add(ReportMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_ReportSupplierMouseClicked

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

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_HomeTransaksiMouseClicked

    private void KaryawanTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KaryawanTransaksiMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();

        ContentPanel.add(KaryawanPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(KaryawanMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_KaryawanTransaksiMouseClicked

    private void SupplierTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierTransaksiMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();

        ContentPanel.add(SupplierPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(SupplierMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_SupplierTransaksiMouseClicked

    private void PemesananTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PemesananTransaksiMouseClicked
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
        MenuPanel.add(PemesananMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_PemesananTransaksiMouseClicked

    private void PembelianTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PembelianTransaksiMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();

        ContentPanel.add(PembelianPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(PembelianMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_PembelianTransaksiMouseClicked

    private void PengaturanProdukTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PengaturanProdukTransaksiMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();

        ContentPanel.add(PengaturanProdukPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(PengaturanProdukMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_PengaturanProdukTransaksiMouseClicked

    private void ReportTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportTransaksiMouseClicked
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
        MenuPanel.add(ReportMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_ReportTransaksiMouseClicked

    private void HomePemesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePemesananMouseClicked
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

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_HomePemesananMouseClicked

    private void KaryawanPemesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KaryawanPemesananMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();

        ContentPanel.add(KaryawanPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(KaryawanMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_KaryawanPemesananMouseClicked

    private void SupplierPemesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierPemesananMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();

        ContentPanel.add(SupplierPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(SupplierMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_SupplierPemesananMouseClicked

    private void TransaksiPemesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransaksiPemesananMouseClicked
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

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_TransaksiPemesananMouseClicked

    private void PembelianPemesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PembelianPemesananMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();

        ContentPanel.add(PembelianPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(PembelianMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_PembelianPemesananMouseClicked

    private void PengaturanProdukPemesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PengaturanProdukPemesananMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();

        ContentPanel.add(PengaturanProdukPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(PengaturanProdukMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_PengaturanProdukPemesananMouseClicked

    private void ReportPemesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportPemesananMouseClicked
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
        MenuPanel.add(ReportMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_ReportPemesananMouseClicked

    private void HomePembelianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePembelianMouseClicked
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

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_HomePembelianMouseClicked

    private void KaryawanPembelianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KaryawanPembelianMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();

        ContentPanel.add(KaryawanPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(KaryawanMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_KaryawanPembelianMouseClicked

    private void SupplierPembelianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierPembelianMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();

        ContentPanel.add(SupplierPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(SupplierMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_SupplierPembelianMouseClicked

    private void TransaksiPembelianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransaksiPembelianMouseClicked
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

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_TransaksiPembelianMouseClicked

    private void PemesananPembelianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PemesananPembelianMouseClicked
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
        MenuPanel.add(PemesananMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_PemesananPembelianMouseClicked

    private void PengaturanProdukPembelianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PengaturanProdukPembelianMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();

        ContentPanel.add(PengaturanProdukPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(PengaturanProdukMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_PengaturanProdukPembelianMouseClicked

    private void ReportPembelianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportPembelianMouseClicked
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
        MenuPanel.add(ReportMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_ReportPembelianMouseClicked

    private void HomePPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePPMouseClicked
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

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_HomePPMouseClicked

    private void KaryawanPPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KaryawanPPMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();

        ContentPanel.add(KaryawanPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(KaryawanMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_KaryawanPPMouseClicked

    private void SupplierPPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierPPMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();

        ContentPanel.add(SupplierPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(SupplierMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_SupplierPPMouseClicked

    private void TransaksiPPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransaksiPPMouseClicked
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

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_TransaksiPPMouseClicked

    private void PemesananPPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PemesananPPMouseClicked
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
        MenuPanel.add(PemesananMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_PemesananPPMouseClicked

    private void PembelianPPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PembelianPPMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();

        ContentPanel.add(PembelianPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(PembelianMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_PembelianPPMouseClicked

    private void ReportPPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportPPMouseClicked
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
        MenuPanel.add(ReportMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_ReportPPMouseClicked

    private void HomeReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeReportMouseClicked
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

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_HomeReportMouseClicked

    private void KaryawanReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KaryawanReportMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();

        ContentPanel.add(KaryawanPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(KaryawanMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_KaryawanReportMouseClicked

    private void SupplierReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierReportMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();

        ContentPanel.add(SupplierPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(SupplierMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_SupplierReportMouseClicked

    private void TransaksiReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransaksiReportMouseClicked
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

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_TransaksiReportMouseClicked

    private void PemesananReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PemesananReportMouseClicked
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
        MenuPanel.add(PemesananMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_PemesananReportMouseClicked

    private void PembelianReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PembelianReportMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();

        ContentPanel.add(PembelianPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(PembelianMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_PembelianReportMouseClicked

    private void PengaturanProdukReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PengaturanProdukReportMouseClicked
        // TODO add your handling code here:
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.removeAll();
        MenuPanel.repaint();
        MenuPanel.revalidate();

        ContentPanel.add(PengaturanProdukPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        MenuPanel.add(PengaturanProdukMenu);
        MenuPanel.repaint();
        MenuPanel.revalidate();

        id_autoSupplier();
        id_autoPembelian();
        id_autoPemesanan();
        id_autoBarang();
        id_autoBarangPesanan();
        id_autoPenjualan();
    }//GEN-LAST:event_PengaturanProdukReportMouseClicked

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

    private void btnTambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseClicked
        // TODO add your handling code here:
        PengaturanProdukPanel.removeAll();
        PengaturanProdukPanel.repaint();
        PengaturanProdukPanel.revalidate();

        PengaturanProdukPanel.add(Edit1);
        PengaturanProdukPanel.repaint();
        PengaturanProdukPanel.revalidate();
    }//GEN-LAST:event_btnTambahMouseClicked

    private void btnCancelViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelViewMouseClicked
        // TODO add your handling code here:
        PengaturanProdukPanel.removeAll();
        PengaturanProdukPanel.repaint();
        PengaturanProdukPanel.revalidate();

        PengaturanProdukPanel.add(Katalog);
        PengaturanProdukPanel.repaint();
        PengaturanProdukPanel.revalidate();
    }//GEN-LAST:event_btnCancelViewMouseClicked

    private void btnEditViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditViewMouseClicked
        // TODO add your handling code here:
        PengaturanProdukPanel.removeAll();
        PengaturanProdukPanel.repaint();
        PengaturanProdukPanel.revalidate();

        PengaturanProdukPanel.add(Edit);
        PengaturanProdukPanel.repaint();
        PengaturanProdukPanel.revalidate();

        Txt_HargaJual1.setText(Txt_HargaJual.getText());
        Txt_Idbarang1.setText(Txt_IdbarangB.getText());
        Kategori.setSelectedItem(Txt_Kategori.getText());
        Txt_Kodebarcode1.setText(Txt_Kodebarcode.getText());
        Txt_Motif1.setText(Txt_Motif.getText());
        Txt_NamaBarang1.setText(Txt_NamaBarang.getText());
        Txt_Stok1.setText(Txt_Stok.getText());
        Txt_Ukuran1.setText(Txt_Ukuran.getText());
        Txt_HargaBeli1.setText(Txt_HargaBeli.getText());
        FileName1.setText(FileName.getText());
        {
         }
         String newpath = "Uploads/ProfilImages";
        File directory = new File(newpath);
        {if(!directory.exists()){
        }
        ImageIcon imageiconn= new ImageIcon(newpath+"/"+FileName1.getText());
        Image image = imageiconn.getImage().getScaledInstance(260, 250, Image.SCALE_DEFAULT);
        ImageIcon imageIcon=new ImageIcon(image);
        PreviewImage1.setIcon(imageIcon);
        }
    }//GEN-LAST:event_btnEditViewMouseClicked

    private void btnBSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBSMouseClicked
        // TODO add your handling code here:
        PembelianPanel.removeAll();
        PembelianPanel.repaint();
        PembelianPanel.revalidate();

        PembelianPanel.add(brgBaru);
        PembelianPanel.repaint();
        PembelianPanel.revalidate();
    }//GEN-LAST:event_btnBSMouseClicked

    private void btnBPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBPMouseClicked
        // TODO add your handling code here:
        PembelianPanel.removeAll();
        PembelianPanel.repaint();
        PembelianPanel.revalidate();

        PembelianPanel.add(brgStok);
        PembelianPanel.repaint();
        PembelianPanel.revalidate();
    }//GEN-LAST:event_btnBPMouseClicked

    private void btnRpPembelianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRpPembelianMouseClicked
        // TODO add your handling code here:
        ReportPanel.removeAll();
        ReportPanel.repaint();
        ReportPanel.revalidate();

        ReportPanel.add(rpPembelian);
        ReportPanel.repaint();
        ReportPanel.revalidate();
    }//GEN-LAST:event_btnRpPembelianMouseClicked

    private void btnRpPenjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRpPenjualanMouseClicked
        // TODO add your handling code here:
        ReportPanel.removeAll();
        ReportPanel.repaint();
        ReportPanel.revalidate();

        ReportPanel.add(rpPenjualan);
        ReportPanel.repaint();
        ReportPanel.revalidate();
    }//GEN-LAST:event_btnRpPenjualanMouseClicked

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtFullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullnameActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void txtIdkarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdkarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdkarActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int baris = jTable2.getSelectedRow();
        if(baris!=-1){
            String row = jTable2.getValueAt(baris, 1).toString();
    txtIdkar.setText(row);
    if (jTable2.getValueAt(baris, 2)==null) {
        txtPassword.setText("");
    } else {
        txtPassword.setText(jTable2.getValueAt(baris, 2).toString());
    }
    if (jTable2.getValueAt(baris, 3)==null) {
        txtFullname.setText("");
    } else {
        txtFullname.setText(jTable2.getValueAt(baris, 3).toString());
    }
    if (jTable2.getValueAt(baris, 4)==null){
        txtPhone.setText("");
    } else {
        txtPhone.setText(jTable2.getValueAt(baris, 4).toString());
    }
    if (jTable2.getValueAt(baris, 5)==null){
        txtAlamatKar.setText("");
    } else {
        txtAlamatKar.setText(jTable2.getValueAt(baris, 5).toString());
    }
    }
    }//GEN-LAST:event_jTable2MouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        // TODO add your handling code here:
        try {
            OOPCRUD a = new OOPCRUD();
            a.setUsername(txtIdkar.getText());
            a.setPassword(txtPassword.getText());
            a.setFullname(txtFullname.getText());
            a.setPhone(txtPhone.getText());
            a.setAlamat(txtAlamatKar.getText());

            java.sql.Connection conn=(Connection)koneksi.getKoneksi();
            String sql1 = "UPDATE karyawan set nama_karyawan = "
                    + "? , password = ? , no_hp = ? , alamat = ? where id_karyawan = ?";
            java.sql.PreparedStatement pst1=conn.prepareStatement(sql1);

            pst1.setString(1, a.getFullname());
            pst1.setString(2, a.getPassword());
            pst1.setString(3, a.getPhone());
            pst1.setString(4, a.getAlamat());
            pst1.setString(5, a.getUsername());
            pst1.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil di Edit");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal "+e.getMessage());
        }
        txtIdkar.setText(null);
        txtFullname.setText(null);
        txtPassword.setText(null);
        txtPhone.setText(null);
        txtAlamatKar.setText(null);
        getDataKaryawan();
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnSimpanKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanKaryawanMouseClicked
        // TODO add your handling code here:
    OOPCRUD delete = new OOPCRUD();
    int barisSup = jTable2.getSelectedRow();
    delete.setUsername(jTable2.getValueAt(barisSup, 1).toString());
    WarningDeleteKaryawan p = new WarningDeleteKaryawan((JFrame) SwingUtilities.getWindowAncestor(this), delete.getUsername());
    p.setVisible(true);
    getDataKaryawan();
    txtIdkar.setText(null);
    txtFullname.setText(null);
    txtPassword.setText(null);
    txtPhone.setText(null);
    txtAlamatKar.setText(null);
    }//GEN-LAST:event_btnSimpanKaryawanMouseClicked

    private void txtIdSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdSupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdSupActionPerformed

    private void txtNamSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamSupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamSupActionPerformed

    private void txtAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlamatActionPerformed

    private void txtPhoneSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneSupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneSupActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
        int barisSup = jTable3.getSelectedRow();
    if(barisSup!=-1){
    String rowSup = jTable3.getValueAt(barisSup, 1).toString();
    txtNamSup.setText(rowSup);
    if (jTable3.getValueAt(barisSup, 2)==null) {
        txtAlamat.setText("");
    } else {
        txtAlamat.setText(jTable3.getValueAt(barisSup, 2).toString());
    }
    if (jTable3.getValueAt(barisSup, 3)==null) {
        txtPhoneSup.setText("");
    } else {
        txtPhoneSup.setText(jTable3.getValueAt(barisSup, 3).toString());
    }
    if (jTable3.getValueAt(barisSup, 4)==null){
        txtJenisBrg.setText("");
    } else {
        txtJenisBrg.setText(jTable3.getValueAt(barisSup, 4).toString());
    }
    }

    try{
            java.sql.Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/retnosari","root","");
            ResultSet rs = cn.createStatement().executeQuery("SELECT id_supplier from supplier WHERE nama_supplier like '%"
                    +jTable3.getValueAt(barisSup, 1).toString()+"%'");
            while(rs.next()){
               txtIdSup.setText(rs.getString("id_supplier"));
            }
        } catch (SQLException ex){
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_jTable3MouseClicked

    private void btnUpdateSupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateSupMouseClicked
        // TODO add your handling code here:
        try {
            OOPCRUD supplier = new OOPCRUD();
            supplier.setIdSup(txtIdSup.getText());
            supplier.setNamaSupplier(txtNamSup.getText());
            supplier.setAlamat(txtAlamat.getText());
            supplier.setPhone(txtPhoneSup.getText());
            supplier.setJenisBarang(txtJenisBrg.getText());

            java.sql.Connection conn=(Connection)koneksi.getKoneksi();
            String sql1 = "UPDATE supplier set nama_supplier = "
                    + "? , alamat = ? , no_hp = ? , jenis_barang = ? where id_supplier = ?";
            java.sql.PreparedStatement pst1=conn.prepareStatement(sql1);

            pst1.setString(1, supplier.getNamaSupplier());
            pst1.setString(2, supplier.getAlamat());
            pst1.setString(3, supplier.getPhone());
            pst1.setString(4, supplier.getJenisBarang());
            pst1.setString(5, supplier.getIdSup());
            pst1.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil di Edit");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal "+e.getMessage());
        }
        txtIdSup.setText(null);
        txtNamSup.setText(null);
        txtAlamat.setText(null);
        txtPhoneSup.setText(null);
        txtJenisBrg.setText(null);
        id_autoSupplier();
        getDataSupplier();
    }//GEN-LAST:event_btnUpdateSupMouseClicked

    private void btnSimpanSupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanSupMouseClicked
        // TODO add your handling code here:
        if(txtNamSup.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Nama Supplier belum diisi");
        } else if(txtAlamat.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Alamat belum diisi");
        } else if(txtPhoneSup.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Phone belum diisi");
        } else if(txtJenisBrg.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Jenis Barang belum diisi");
        } else {
            try {
                OOPCRUD supplier = new OOPCRUD();
                supplier.setIdSup(txtIdSup.getText());
                supplier.setNamaSupplier(txtNamSup.getText());
                supplier.setAlamat(txtAlamat.getText());
                supplier.setPhone(txtPhoneSup.getText());
                supplier.setJenisBarang(txtJenisBrg.getText());

                java.sql.Connection conn=(Connection)koneksi.getKoneksi();
                String sql1 = "INSERT INTO Supplier(id_supplier,nama_supplier,alamat,no_hp,jenis_barang) VALUES (?,?,?,?,?)";
                java.sql.PreparedStatement pst1=conn.prepareStatement(sql1);

                pst1.setString(1, supplier.getIdSup());
                pst1.setString(2, supplier.getNamaSupplier());
                pst1.setString(3, supplier.getAlamat());
                pst1.setString(4, supplier.getPhone());
                pst1.setString(5, supplier.getJenisBarang());
                pst1.executeUpdate();
                JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data sudah ada atau terlalu panjang");
            }
                txtIdSup.setText(null);
                txtNamSup.setText(null);
                txtAlamat.setText(null);
                txtPhoneSup.setText(null);
                txtJenisBrg.setText(null);
                id_autoSupplier();
                getDataSupplier();
       }
    }//GEN-LAST:event_btnSimpanSupMouseClicked

    private void txtJenisBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJenisBrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJenisBrgActionPerformed

    private void jTable2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseReleased
        // TODO add your handling code here:
//        if (evt.getButton()==MouseEvent.BUTTON3){
//            if(evt.isPopupTrigger()&& jTable2.getSelectedRowCount()!=0){
//                PopupMenu.show(evt.getComponent(),evt.getX(),evt.getY());
//            }
//        }
    }//GEN-LAST:event_jTable2MouseReleased

    private void jTable3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseReleased
        // TODO add your handling code here:
//        if (evt.getButton()==MouseEvent.BUTTON3){
//            if(evt.isPopupTrigger()&& jTable3.getSelectedRowCount()!=0){
//                PopupMenuSupplier.show(evt.getComponent(),evt.getX(),evt.getY());
//            }
//        }
    }//GEN-LAST:event_jTable3MouseReleased

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        txtCariKaryawan.setVisible(true);
        jLabel18.setVisible(false);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void txtCariKaryawanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKaryawanKeyPressed
        // TODO add your handling code here:
//        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
//            cariDataKaryawan();
//        }
    }//GEN-LAST:event_txtCariKaryawanKeyPressed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        txtCariSupplier.setVisible(true);
        jLabel19.setVisible(false);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void txtCariSupplierKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariSupplierKeyPressed
        // TODO add your handling code here:
//        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
//            cariDataSupplier();
//        }
    }//GEN-LAST:event_txtCariSupplierKeyPressed

    private void btnDdLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDdLogOutMouseClicked
        // TODO add your handling code here:
        ddLogOut.setVisible(true);
        btnLogOut.setVisible(true);
        btnAbout.setVisible(true);

        ddLogOut1.setVisible(true);
        btnLogOut1.setVisible(true);
        btnAbout1.setVisible(true);

        ddLogOut2.setVisible(true);
        btnLogOut2.setVisible(true);
        btnAbout2.setVisible(true);

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

        ddLogOut8.setVisible(true);
        btnLogOut8.setVisible(true);
        btnAbout8.setVisible(true);

        ddLogOut9.setVisible(true);
        btnLogOut9.setVisible(true);
        btnAbout9.setVisible(true);

        ddLogOut10.setVisible(true);
        btnLogOut10.setVisible(true);
        btnAbout10.setVisible(true);

        ddLogOut11.setVisible(true);
        btnLogOut11.setVisible(true);
        btnAbout11.setVisible(true);

        ddLogOut12.setVisible(true);
        btnLogOut12.setVisible(true);
        btnAbout12.setVisible(true);

        ddLogOut13.setVisible(true);
        btnLogOut13.setVisible(true);
        btnAbout13.setVisible(true);
    }//GEN-LAST:event_btnDdLogOutMouseClicked

    private void btnLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new LogIn().setVisible(true);
    }//GEN-LAST:event_btnLogOutMouseClicked

    private void btnLogOut1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOut1MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new LogIn().setVisible(true);
    }//GEN-LAST:event_btnLogOut1MouseClicked

    private void btnLogOut2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOut2MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new LogIn().setVisible(true);
    }//GEN-LAST:event_btnLogOut2MouseClicked

    private void btnLogOut3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOut3MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new LogIn().setVisible(true);
    }//GEN-LAST:event_btnLogOut3MouseClicked

    private void btnLogOut4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOut4MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new LogIn().setVisible(true);
    }//GEN-LAST:event_btnLogOut4MouseClicked

    private void btnLogOut5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOut5MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new LogIn().setVisible(true);
    }//GEN-LAST:event_btnLogOut5MouseClicked

    private void btnLogOut7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOut7MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new LogIn().setVisible(true);
    }//GEN-LAST:event_btnLogOut7MouseClicked

    private void btnLogOut8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOut8MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new LogIn().setVisible(true);
    }//GEN-LAST:event_btnLogOut8MouseClicked

    private void btnLogOut9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOut9MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new LogIn().setVisible(true);
    }//GEN-LAST:event_btnLogOut9MouseClicked

    private void btnLogOut10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOut10MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new LogIn().setVisible(true);
    }//GEN-LAST:event_btnLogOut10MouseClicked

    private void btnLogOut11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOut11MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new LogIn().setVisible(true);
    }//GEN-LAST:event_btnLogOut11MouseClicked

    private void HomePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePanelMouseClicked
        // TODO add your handling code here:
        ddLogOut.setVisible(false);
        btnLogOut.setVisible(false);
        btnAbout.setVisible(false);

        ddLogOut1.setVisible(false);
        btnLogOut1.setVisible(false);
        btnAbout1.setVisible(false);

        ddLogOut2.setVisible(false);
        btnLogOut2.setVisible(false);
        btnAbout2.setVisible(false);

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

        ddLogOut8.setVisible(false);
        btnLogOut8.setVisible(false);
        btnAbout8.setVisible(false);

        ddLogOut9.setVisible(false);
        btnLogOut9.setVisible(false);
        btnAbout9.setVisible(false);

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
    }//GEN-LAST:event_HomePanelMouseClicked

    private void KaryawanPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KaryawanPanelMouseClicked
        // TODO add your handling code here:

        ddLogOut.setVisible(false);
        btnLogOut.setVisible(false);
        btnAbout.setVisible(false);

        ddLogOut1.setVisible(false);
        btnLogOut1.setVisible(false);
        btnAbout1.setVisible(false);

        ddLogOut6.setVisible(false);
        btnLogOut6.setVisible(false);
        btnAbout6.setVisible(false);

        ddLogOut2.setVisible(false);
        btnLogOut2.setVisible(false);
        btnAbout2.setVisible(false);

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

        ddLogOut8.setVisible(false);
        btnLogOut8.setVisible(false);
        btnAbout8.setVisible(false);

        ddLogOut9.setVisible(false);
        btnLogOut9.setVisible(false);
        btnAbout9.setVisible(false);

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
    }//GEN-LAST:event_KaryawanPanelMouseClicked

    private void SupplierPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierPanelMouseClicked
        // TODO add your handling code here:
        ddLogOut.setVisible(false);
        btnLogOut.setVisible(false);
        btnAbout.setVisible(false);

        ddLogOut1.setVisible(false);
        btnLogOut1.setVisible(false);
        btnAbout1.setVisible(false);

        ddLogOut6.setVisible(false);
        btnLogOut6.setVisible(false);
        btnAbout6.setVisible(false);

        ddLogOut2.setVisible(false);
        btnLogOut2.setVisible(false);
        btnAbout2.setVisible(false);

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

        ddLogOut8.setVisible(false);
        btnLogOut8.setVisible(false);
        btnAbout8.setVisible(false);

        ddLogOut9.setVisible(false);
        btnLogOut9.setVisible(false);
        btnAbout9.setVisible(false);

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
    }//GEN-LAST:event_SupplierPanelMouseClicked

    private void TransaksiPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransaksiPanelMouseClicked
        // TODO add your handling code here:
        ddLogOut.setVisible(false);
        btnLogOut.setVisible(false);
        btnAbout.setVisible(false);

        ddLogOut1.setVisible(false);
        btnLogOut1.setVisible(false);
        btnAbout1.setVisible(false);

        ddLogOut6.setVisible(false);
        btnLogOut6.setVisible(false);
        btnAbout6.setVisible(false);

        ddLogOut2.setVisible(false);
        btnLogOut2.setVisible(false);
        btnAbout2.setVisible(false);

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

        ddLogOut8.setVisible(false);
        btnLogOut8.setVisible(false);
        btnAbout8.setVisible(false);

        ddLogOut9.setVisible(false);
        btnLogOut9.setVisible(false);
        btnAbout9.setVisible(false);

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
    }//GEN-LAST:event_TransaksiPanelMouseClicked

    private void PemesanaPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PemesanaPanelMouseClicked
        // TODO add your handling code here:
        ddLogOut.setVisible(false);
        btnLogOut.setVisible(false);
        btnAbout.setVisible(false);

        ddLogOut1.setVisible(false);
        btnLogOut1.setVisible(false);
        btnAbout1.setVisible(false);

        ddLogOut6.setVisible(false);
        btnLogOut6.setVisible(false);
        btnAbout6.setVisible(false);

        ddLogOut2.setVisible(false);
        btnLogOut2.setVisible(false);
        btnAbout2.setVisible(false);

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

        ddLogOut8.setVisible(false);
        btnLogOut8.setVisible(false);
        btnAbout8.setVisible(false);

        ddLogOut9.setVisible(false);
        btnLogOut9.setVisible(false);
        btnAbout9.setVisible(false);

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

    private void PembelianPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PembelianPanelMouseClicked
        // TODO add your handling code here:
        ddLogOut.setVisible(false);
        btnLogOut.setVisible(false);
        btnAbout.setVisible(false);

        ddLogOut1.setVisible(false);
        btnLogOut1.setVisible(false);
        btnAbout1.setVisible(false);

        ddLogOut2.setVisible(false);
        btnLogOut2.setVisible(false);
        btnAbout2.setVisible(false);

        ddLogOut3.setVisible(false);
        btnLogOut3.setVisible(false);
        btnAbout3.setVisible(false);

        ddLogOut4.setVisible(false);
        btnLogOut4.setVisible(false);
        btnAbout4.setVisible(false);

        ddLogOut6.setVisible(false);
        btnLogOut6.setVisible(false);
        btnAbout6.setVisible(false);

        ddLogOut5.setVisible(false);
        btnLogOut5.setVisible(false);
        btnAbout5.setVisible(false);

        ddLogOut7.setVisible(false);
        btnLogOut7.setVisible(false);
        btnAbout7.setVisible(false);

        ddLogOut8.setVisible(false);
        btnLogOut8.setVisible(false);
        btnAbout8.setVisible(false);

        ddLogOut9.setVisible(false);
        btnLogOut9.setVisible(false);
        btnAbout9.setVisible(false);

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
    }//GEN-LAST:event_PembelianPanelMouseClicked

    private void PengaturanProdukPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PengaturanProdukPanelMouseClicked
        // TODO add your handling code here:
        ddLogOut.setVisible(false);
        btnLogOut.setVisible(false);
        btnAbout.setVisible(false);

        ddLogOut1.setVisible(false);
        btnLogOut1.setVisible(false);
        btnAbout1.setVisible(false);

        ddLogOut2.setVisible(false);
        btnLogOut2.setVisible(false);
        btnAbout2.setVisible(false);

        ddLogOut6.setVisible(false);
        btnLogOut6.setVisible(false);
        btnAbout6.setVisible(false);

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

        ddLogOut8.setVisible(false);
        btnLogOut8.setVisible(false);
        btnAbout8.setVisible(false);

        ddLogOut9.setVisible(false);
        btnLogOut9.setVisible(false);
        btnAbout9.setVisible(false);

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
    }//GEN-LAST:event_PengaturanProdukPanelMouseClicked

    private void ReportPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportPanelMouseClicked
        // TODO add your handling code here:
        ddLogOut.setVisible(false);
        btnLogOut.setVisible(false);
        btnAbout.setVisible(false);

        ddLogOut1.setVisible(false);
        btnLogOut1.setVisible(false);
        btnAbout1.setVisible(false);

        ddLogOut2.setVisible(false);
        btnLogOut2.setVisible(false);
        btnAbout2.setVisible(false);

        ddLogOut6.setVisible(false);
        btnLogOut6.setVisible(false);
        btnAbout6.setVisible(false);

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

        ddLogOut8.setVisible(false);
        btnLogOut8.setVisible(false);
        btnAbout8.setVisible(false);

        ddLogOut9.setVisible(false);
        btnLogOut9.setVisible(false);
        btnAbout9.setVisible(false);

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
    }//GEN-LAST:event_ReportPanelMouseClicked

    private void btnLogOut12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOut12MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new LogIn().setVisible(true);
    }//GEN-LAST:event_btnLogOut12MouseClicked

    private void btnLogOut13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOut13MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new LogIn().setVisible(true);
    }//GEN-LAST:event_btnLogOut13MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        txtCariPemesanan.setVisible(true);
    }//GEN-LAST:event_jLabel21MouseClicked

    private void txtCariPemesananKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariPemesananKeyPressed
        // TODO add your handling code here:
//        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
//            cariDataPemesanan();
//        }
    }//GEN-LAST:event_txtCariPemesananKeyPressed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        txtCariPemesanan.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jTable4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseReleased
        // TODO add your handling code here:
        if (evt.getButton()==MouseEvent.BUTTON3){
            if(evt.isPopupTrigger()&& jTable4.getSelectedRowCount()!=0){
                PopupMenuPemesanan.show(evt.getComponent(),evt.getX(),evt.getY());
            }
        }
        
        
    }//GEN-LAST:event_jTable4MouseReleased

    private void txtTotalBBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalBBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalBBActionPerformed

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

    private void cb_distributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_distributorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_distributorActionPerformed

    private void cb_distributor1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cb_distributor1PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_distributor1PopupMenuWillBecomeInvisible

    private void cb_distributor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_distributor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_distributor1ActionPerformed

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

    private void cb_distributor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_distributor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_distributor2ActionPerformed

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

    private void cb_distributor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_distributor3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_distributor3ActionPerformed

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
            String sql="INSERT INTO pembelian (id_pembelian, id_supplier,id_karyawan, Hari_pembelian, tanggal_pembelian, BulanPembelian, JamPembelian) VALUES ('"
                    +txtIdres2.getText()
                    +"','"+txtIdsup.getText()
                    +"','"+txtIdkarBB.getText()
                    +"','"+txtTanggalBBhari.getText()
                    +"','"+txtTanggalBB.getText()
                    +"','"+txtTanggalBBbulan.getText()
                    +"','"+txtTanggalBBJam.getText()
                    +"')";
            java.sql.Connection conn=(Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_txtQtyBBMouseClicked

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
            String sql = "INSERT INTO barang (id_barang,nama_barang,kategori,ukuran,id_motif,harga_beli,id_supplier) VALUES ('"
            +txtIdbar2.getText()+"','"
            +txtNambarBB.getText()+" ("+jComboBox4.getSelectedItem()+") "+
                    "','"
            +cb_distributor1.getSelectedItem()+"','"
            +txtUkuranBB.getText()+"','"
            +txt_Idmotif.getText()+"','"
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
            barcode.setData(txtIdres2.getText());
            barcode.setI(11.0f);
            String fname = txtIdres2.getText();
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
        getDataBarang();
        getDataBarangTransaksi();
        dashboardchartbulanan();
        }
    }//GEN-LAST:event_jLabel24MouseClicked

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
        getDataBarang();
        getDataBarangTransaksi();
    }//GEN-LAST:event_jLabel25MouseClicked

    private void txtSubtoBBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSubtoBBMouseClicked
        // TODO add your handling code here:
//        try{
//            int harga = Integer.parseInt(txtHarbelBB.getText());
//            int qty = Integer.parseInt(txtQtyBB.getText());
//            txtSubtoBB.setText(""+(harga*qty));
//        }catch(NumberFormatException e){
////            txt_subtotal.setText("0");
//        }
    }//GEN-LAST:event_txtSubtoBBMouseClicked

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
////            txt_subtotal.setText("0");
//        }
    }//GEN-LAST:event_txtSubtobsMouseClicked

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
            getDataBarang();
            getDataBarangTransaksi();
            getDataReportPengeluaran();
//            pemasukan();
        }
       dashboardchartbulanan();
    }//GEN-LAST:event_jLabel27MouseClicked

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
        getDataBarang();
        getDataBarangTransaksi();
    }//GEN-LAST:event_jLabel28MouseClicked

    private void txtPhone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhone1ActionPerformed

    private void txtIdpsnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdpsnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdpsnActionPerformed

    private void txtAlamat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlamat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlamat1ActionPerformed

    private void txtMotifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMotifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMotifActionPerformed

    private void txtWarnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWarnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWarnaActionPerformed

    private void txtPanjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPanjangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPanjangActionPerformed

    private void txtHargaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHargaMouseClicked
        // TODO add your handling code here:
        

    }//GEN-LAST:event_txtHargaMouseClicked

    private void txtHargaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHargaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaMouseEntered

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void txtNamaCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaCusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaCusActionPerformed

    private void btnLogOut6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOut6MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new LogIn().setVisible(true);
    }//GEN-LAST:event_btnLogOut6MouseClicked

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
            String sql1 = "INSERT INTO barangpesanan (id_barangPesanan, id_motif,id_jasa,id_barang, warna, panjangKain, harga) VALUES ('"
            +txtIdBPes.getText()+"','"
            +txtMotif.getText()+"','"
            +txt_namaJasaa.getText()+"','"
            +txt_idkain.getText()+"','"
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
         //   JOptionPane.showMessageDialog(null, e.getMessage());
        }
        }
         id_autoBarangPesanan();
         
    }//GEN-LAST:event_jLabel31MouseClicked

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

    private void txtIdkarpesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdkarpesanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdkarpesanActionPerformed

    private void txtTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTanggalActionPerformed

    private void PesanBarangPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesanBarangPanelMouseClicked
        // TODO add your handling code here:
        ddLogOut.setVisible(false);
        btnLogOut.setVisible(false);
        btnAbout.setVisible(false);

        ddLogOut1.setVisible(false);
        btnLogOut1.setVisible(false);
        btnAbout1.setVisible(false);

        ddLogOut2.setVisible(false);
        btnLogOut2.setVisible(false);
        btnAbout2.setVisible(false);

        ddLogOut12.setVisible(false);
        btnLogOut12.setVisible(false);
        btnAbout12.setVisible(false);

        ddLogOut13.setVisible(false);
        btnLogOut13.setVisible(false);
        btnAbout13.setVisible(false);
    }//GEN-LAST:event_PesanBarangPanelMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    OOPCRUD delete = new OOPCRUD();
    delete.setIdSup(txtIdSup.getText());
    WarningDeleteSupplier a = new WarningDeleteSupplier((JFrame) SwingUtilities.getWindowAncestor(this), delete.getIdSup());
    a.setVisible(true);
    getDataSupplier();
    txtIdSup.setText(null);
    txtNamSup.setText(null);
    txtAlamat.setText(null);
    txtPhoneSup.setText(null);
    txtJenisBrg.setText(null);
    ComboBoxSupplier();
    }//GEN-LAST:event_jLabel1MouseClicked

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

        id_autoPemesanan();
        id_autoBarangPesanan();
    }//GEN-LAST:event_jLabel20MouseClicked

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

    private void rpbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rpbsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rpbsActionPerformed

    private void rpbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rpbbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rpbbActionPerformed

    private void txtIdBPesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdBPesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdBPesActionPerformed

    private void checkOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutActionPerformed
        // TODO add your handling code here:
        
    int barisSup = jTable4.getSelectedRow();
    String status = jTable4.getValueAt(barisSup, 7).toString();
    if(status.equalsIgnoreCase("Proses")){
            JOptionPane.showMessageDialog(null, "Barang belum selesai!");
    }if(status.equalsIgnoreCase("Diambil")){
            JOptionPane.showMessageDialog(null, "Barang sudah diterima pemesan!");
    }
    if(status.equalsIgnoreCase("Selesai")){
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();

        ContentPanel.add(TransaksiPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();

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

        try {
        String sql1 = "INSERT INTO detail_penjualan (id_penjualan, id_barang, sub_total, qty) VALUES ('"
            +txtKodebarPesan1.getText()+"','"
            +jTextField12.getText()+"','"
            +jTable4.getValueAt(barisSup, 6)+"','"+jTextField13.getText() +"')";
        java.sql.Connection conn=(com.mysql.jdbc.Connection)koneksi.getKoneksi();
        java.sql.PreparedStatement pst1=conn.prepareStatement(sql1);
        pst1.execute();
        } catch (Exception e) {
       // JOptionPane.showMessageDialog(null,e.getMessage());
        }

        qtyTrx.add(jTextField13.getText());
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
        txtCustomerF.setText(jTable4.getValueAt(barisSup, 2).toString());
        
    }    
    }//GEN-LAST:event_checkOutActionPerformed

    private void detailPesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailPesananActionPerformed
    // TODO add your handling code here:
    int barisSup = jTable4.getSelectedRow();
    String idBarang = jTable4.getValueAt(barisSup, 1).toString();
    PopUpDetailPesanan p = new PopUpDetailPesanan((JFrame) SwingUtilities.getWindowAncestor(this), idBarang);
    p.setVisible(true);
    getDataPemesanan();
    }//GEN-LAST:event_detailPesananActionPerformed

    private void jTable10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable10MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable10MouseReleased
private void ambillokasigambar(){
    try {
        String sql = "SELECT gambar FROM barang WHERE id_barang ="+Txt_IdbarangB.getText();
            java.sql.Connection conn=(Connection)koneksi.getKoneksi();
            java.sql.Statement  stm=conn.createStatement();
            java.sql.ResultSet rs=stm.executeQuery(sql);
            if(rs.next()){
          //    lokasigambar.setText(rs.getString(1));
            }
    } catch (Exception e) {
    }

}





    private void jTable10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable10MouseClicked
        // TODO add your handling code here:
        int baris = jTable10.rowAtPoint(evt.getPoint());
        Txt_Kodebarcode.setText((jTable10.getValueAt(baris, 1).toString()));
        try{
        java.sql.Connection conn=(com.mysql.jdbc.Connection)koneksi.getKoneksi();
        String sql = "SELECT motifbatik.gambar FROM barang JOIN motifbatik ON barang.id_motif = "
                + "motifbatik.id_motif WHERE id_barang = "
                + " '"+Txt_Kodebarcode.getText()+"'";
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet res = pst.executeQuery(sql);
           while(res.next()){
               FileName.setText(res.getString(1));
               
           }
        } catch(SQLException err){
             JOptionPane.showMessageDialog(null, err.getMessage() );
        }

        PengaturanProdukPanel.removeAll();
        PengaturanProdukPanel.repaint();
        PengaturanProdukPanel.revalidate();

        PengaturanProdukPanel.add(View);
        PengaturanProdukPanel.repaint();
        PengaturanProdukPanel.revalidate();

        String barang = jTable10.getValueAt(baris, 1).toString();
        Txt_IdbarangB.setText(barang);
        Txt_IdbarangB.disable();
        if(jTable10.getValueAt(baris, 2)== null){
            Txt_NamaBarang.setText("");
        }else{
            Txt_NamaBarang.setText(jTable10.getValueAt(baris, 2).toString());

//        } if(jTable10.getValueAt(baris, 4)== null){
//            Kategori.setSelectedItem(this);
//        }else{
//            Kategori.setSelectedItem(jTable10.getValueAt(baris, 4).toString());
        } if(jTable10.getValueAt(baris, 3)== null){
            Txt_Kategori.setText("");
        }else{
            Txt_Kategori.setText(jTable10.getValueAt(baris, 3).toString());

        }if(jTable10.getValueAt(baris, 4)== null){
            Txt_Ukuran.setText("");
        }else{
            Txt_Ukuran.setText(jTable10.getValueAt(baris, 4).toString());

        }if(jTable10.getValueAt(baris, 5)== null){
            Txt_Motif.setText("");
        }else{
            Txt_Motif.setText(jTable10.getValueAt(baris, 5).toString());

        }if(jTable10.getValueAt(baris, 6)== null){
            Txt_HargaBeli.setText("");
        }else{
            Txt_HargaBeli.setText(jTable10.getValueAt(baris, 6).toString());

        }if(jTable10.getValueAt(baris, 7)== null){
            Txt_HargaJual.setText("");
        }else{
            Txt_HargaJual.setText(jTable10.getValueAt(baris, 7).toString());

        if(jTable10.getValueAt(baris, 8)== null){
            Txt_Stok.setText("");
        }else{
            Txt_Stok.setText(jTable10.getValueAt(baris, 8).toString());
//        }
//        if(jTable10.getValueAt(baris, 9)== null){
//            Txt_Kodebarcode.setText("");
//        }else{
//            Txt_Kodebarcode.setText(jTable10.getValueAt(baris, 9).toString());





        
        String newpath = "Uploads/ProfilImages";
        File directory = new File(newpath);
        {if(!directory.exists()){
        }
        ImageIcon imageiconn= new ImageIcon(newpath+"/"+FileName.getText());
        Image image = imageiconn.getImage().getScaledInstance(270, 250, Image.SCALE_DEFAULT);
        ImageIcon imageIcon=new ImageIcon(image);
        PreviewImage.setIcon(imageIcon); 
        PreviewImage1.setIcon(imageIcon); 
        }
        {

        ImageIcon imageiconn= new ImageIcon("src/barcode/" + Txt_Kodebarcode.getText() + ".png");
        Image image = imageiconn.getImage().getScaledInstance(235, 70, Image.SCALE_DEFAULT);
        ImageIcon imageIcon=new ImageIcon(image);
        PreviewKodeBarcode.setIcon(imageIcon);
        PreviewKodeBarcode1.setIcon(imageIcon);
        PreviewKodeBarcode2.setIcon(imageIcon);
        PreviewKodeBarcode3.setIcon(imageIcon);
        PreviewKodeBarcode4.setIcon(imageIcon);
        PreviewKodeBarcode5.setIcon(imageIcon);
        PreviewKodeBarcode6.setIcon(imageIcon);
        PreviewKodeBarcode7.setIcon(imageIcon);
        PreviewKodeBarcode8.setIcon(imageIcon);
        PreviewKodeBarcode9.setIcon(imageIcon);
        PreviewKodeBarcode10.setIcon(imageIcon);
        PreviewKodeBarcode11.setIcon(imageIcon);
        PreviewKodeBarcode12.setIcon(imageIcon);
        PreviewKodeBarcode13.setIcon(imageIcon);
        PreviewKodeBarcode14.setIcon(imageIcon);
        PreviewKodeBarcode15.setIcon(imageIcon);
        PreviewKodeBarcode16.setIcon(imageIcon);
        PreviewKodeBarcode17.setIcon(imageIcon);
        PreviewKodeBarcode18.setIcon(imageIcon);
        PreviewKodeBarcode19.setIcon(imageIcon);
        PreviewKodeBarcode20.setIcon(imageIcon);
        PreviewKodeBarcode21.setIcon(imageIcon);
        PreviewKodeBarcode22.setIcon(imageIcon);
        PreviewKodeBarcode23.setIcon(imageIcon);
        PreviewKodeBarcode24.setIcon(imageIcon);
        PreviewKodeBarcode25.setIcon(imageIcon);
        PreviewKodeBarcode26.setIcon(imageIcon);
        PreviewKodeBarcode27.setIcon(imageIcon);
        PreviewKodeBarcode28.setIcon(imageIcon);
        PreviewKodeBarcode29.setIcon(imageIcon);
        PreviewKodeBarcode30.setIcon(imageIcon);
        PreviewKodeBarcode31.setIcon(imageIcon);
        PreviewKodeBarcode32.setIcon(imageIcon);
        PreviewKodeBarcode33.setIcon(imageIcon);
        PreviewKodeBarcode34.setIcon(imageIcon);
        PreviewKodeBarcode35.setIcon(imageIcon);
        PreviewKodeBarcode36.setIcon(imageIcon);
        PreviewKodeBarcode37.setIcon(imageIcon);
        PreviewKodeBarcode38.setIcon(imageIcon);
        PreviewKodeBarcode39.setIcon(imageIcon);
        PreviewKodeBarcode40.setIcon(imageIcon);




        DetailBarcode.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode1.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode2.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode3.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode4.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode5.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode6.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode7.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode8.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode9.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode10.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode11.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode12.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode13.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode14.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode15.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode16.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode17.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode18.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode19.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode20.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode21.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode22.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode23.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode24.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode25.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode26.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode27.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode28.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode29.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode30.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode31.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode32.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode33.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode34.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode35.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode36.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode37.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode38.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode39.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());
        DetailBarcode40.setText(Txt_NamaBarang.getText()+"    "+ Txt_HargaJual.getText());



        DetailBarcode.setHorizontalAlignment(jTextField1.CENTER);
         DetailBarcode1.setHorizontalAlignment(jTextField1.CENTER);
          DetailBarcode2.setHorizontalAlignment(jTextField1.CENTER);
           DetailBarcode3.setHorizontalAlignment(jTextField1.CENTER);
            DetailBarcode4.setHorizontalAlignment(jTextField1.CENTER);
             DetailBarcode5.setHorizontalAlignment(jTextField1.CENTER);
              DetailBarcode6.setHorizontalAlignment(jTextField1.CENTER);
               DetailBarcode7.setHorizontalAlignment(jTextField1.CENTER);
                DetailBarcode8.setHorizontalAlignment(jTextField1.CENTER);
                 DetailBarcode9.setHorizontalAlignment(jTextField1.CENTER);
                  DetailBarcode10.setHorizontalAlignment(jTextField1.CENTER);
                   DetailBarcode11.setHorizontalAlignment(jTextField1.CENTER);
                    DetailBarcode12.setHorizontalAlignment(jTextField1.CENTER);
                    DetailBarcode13.setHorizontalAlignment(jTextField1.CENTER);
                     DetailBarcode14.setHorizontalAlignment(jTextField1.CENTER);
                      DetailBarcode15.setHorizontalAlignment(jTextField1.CENTER);
                       DetailBarcode16.setHorizontalAlignment(jTextField1.CENTER);
                        DetailBarcode17.setHorizontalAlignment(jTextField1.CENTER);
                         DetailBarcode18.setHorizontalAlignment(jTextField1.CENTER);
                          DetailBarcode19.setHorizontalAlignment(jTextField1.CENTER);
                          DetailBarcode20.setHorizontalAlignment(jTextField1.CENTER);
                          DetailBarcode21.setHorizontalAlignment(jTextField1.CENTER);
                          DetailBarcode22.setHorizontalAlignment(jTextField1.CENTER);
                          DetailBarcode23.setHorizontalAlignment(jTextField1.CENTER);
                          DetailBarcode24.setHorizontalAlignment(jTextField1.CENTER);
                          DetailBarcode25.setHorizontalAlignment(jTextField1.CENTER);
                          DetailBarcode26.setHorizontalAlignment(jTextField1.CENTER);
                          DetailBarcode27.setHorizontalAlignment(jTextField1.CENTER);
                          DetailBarcode28.setHorizontalAlignment(jTextField1.CENTER);
                          DetailBarcode29.setHorizontalAlignment(jTextField1.CENTER);
                          DetailBarcode30.setHorizontalAlignment(jTextField1.CENTER);
                          DetailBarcode31.setHorizontalAlignment(jTextField1.CENTER);
                          DetailBarcode32.setHorizontalAlignment(jTextField1.CENTER);
                          DetailBarcode33.setHorizontalAlignment(jTextField1.CENTER);
                          DetailBarcode34.setHorizontalAlignment(jTextField1.CENTER);
                          DetailBarcode35.setHorizontalAlignment(jTextField1.CENTER);
                          DetailBarcode36.setHorizontalAlignment(jTextField1.CENTER);
                          DetailBarcode37.setHorizontalAlignment(jTextField1.CENTER);
                          DetailBarcode38.setHorizontalAlignment(jTextField1.CENTER);
                          DetailBarcode39.setHorizontalAlignment(jTextField1.CENTER);
                          DetailBarcode40.setHorizontalAlignment(jTextField1.CENTER);



        }

        }
        }
    }//GEN-LAST:event_jTable10MouseClicked



    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        clearbarang();
        PengaturanProdukPanel.removeAll();
        PengaturanProdukPanel.repaint();
        PengaturanProdukPanel.revalidate();

        PengaturanProdukPanel.add(Katalog);
        PengaturanProdukPanel.repaint();
        PengaturanProdukPanel.revalidate();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void Btn_HapusPreviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_HapusPreviewMouseClicked
        FileName.setText("");
        PreviewImage.setIcon(null);
    }//GEN-LAST:event_Btn_HapusPreviewMouseClicked

    private void TambahnGambarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TambahnGambarMouseClicked
        try {
            JFileChooser chooser= new JFileChooser();
            chooser.showOpenDialog(null);
            File f=chooser.getSelectedFile();
            Toolkit toolkit=Toolkit.getDefaultToolkit();
            Image image=toolkit.getImage(chooser.getSelectedFile().getAbsolutePath());
            Image imagedResized=image.getScaledInstance(270, 260, Image.SCALE_DEFAULT);
            ImageIcon imageIcon=new ImageIcon(imagedResized);
            PreviewImage1.setIcon(imageIcon);
            String filename = f.getAbsolutePath();
            filename=f.toString();
            FileName1.setText(f.getName());
            String newPath = "Uploads/ProfilImages";
            File directory = new File(newPath);
            if(!directory.exists()){
                directory.mkdirs();
            }
            File sourceFile = null;
            File DestinationFile = null;
            String Extension = filename.substring(filename.lastIndexOf('.')+1);
            sourceFile= new  File(filename);
            DestinationFile = new File(newPath+"/"+f.getName());
            Files.copy(sourceFile.toPath(), DestinationFile.toPath());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_TambahnGambarMouseClicked

    private void Txt_Ukuran1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_Ukuran1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_Ukuran1ActionPerformed

    private void Txt_HargaBeli1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_HargaBeli1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_HargaBeli1ActionPerformed

    private void Btn_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_saveMouseClicked

        if(jTextField4.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Silahkan pilih Supplier terlebih dahulu");
        } else {
            try {
            String sql2 ="UPDATE barang "
            + "SET nama_barang = '"+Txt_NamaBarang1.getText()+
            "', kategori = '"+Kategori.getSelectedItem()+
            "', ukuran = '"+Txt_Ukuran1.getText()+
            "', id_motif = '"+Txt_Motif1.getText()+
            "', harga_beli = '"+Txt_HargaBeli1.getText()+
            "', harga_jual = '"+Txt_HargaJual1.getText()+
            "', stok = '"+Txt_Stok1.getText()+
            "', id_supplier = '"+jTextField4.getText()+
            "'WHERE id_barang = '"+Txt_Idbarang1.getText()+"'";
            java.sql.Connection conn2=(com.mysql.jdbc.Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst2=conn2.prepareStatement(sql2);
            pst2.execute();
            PengaturanProdukPanel.removeAll();
            PengaturanProdukPanel.repaint();
            PengaturanProdukPanel.revalidate();
            PengaturanProdukPanel.add(Katalog);
            PengaturanProdukPanel.repaint();
            PengaturanProdukPanel.revalidate();
            JOptionPane.showMessageDialog(null, "Data Berhasil di Edit");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"
            +e.getMessage());
        }

        try{
            Linear barcode = new Linear();
            barcode.setType(Linear.CODE128B);
            barcode.setData(Txt_Kodebarcode1.getText());
            barcode.setI(11.0f);
            String fname = Txt_Kodebarcode1.getText();
            barcode.renderBarcode("src/barcode/" + fname + ".png");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        clearbarang();
        id_autoBarang();
        getDataBarang();
        getDataBarangTransaksi();
//        ComboBoxBarang();
        }

    }//GEN-LAST:event_Btn_saveMouseClicked

    private void btnCancelView1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelView1MouseClicked
        // TODO add your handling code here:
        clearbarang();
        PengaturanProdukPanel.removeAll();
        PengaturanProdukPanel.repaint();
        PengaturanProdukPanel.revalidate();

        PengaturanProdukPanel.add(Katalog);
        PengaturanProdukPanel.repaint();
        PengaturanProdukPanel.revalidate();
    }//GEN-LAST:event_btnCancelView1MouseClicked

    private void btnLogOut14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOut14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogOut14MouseClicked

    private void Txt_Ukuran2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_Ukuran2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_Ukuran2ActionPerformed

    private void Txt_HargaBeli2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_HargaBeli2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_HargaBeli2ActionPerformed

    private void Btn_save1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_save1MouseClicked
        // TODO add your handling code here:
        String Hb = Txt_HargaBeli2.getText();
        int Hbb = Integer.parseInt(Hb);
        String Hj = Txt_HargaJual2.getText();
        int Hjj = Integer.parseInt(Hj);

        if(Txt_Idbarang2.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field ID Barang belum diisi");
        } else if(Txt_NamaBarang2.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Nama Barang belum diisi");
        } else if(Txt_Stok2.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Stok belum diisi");
        } else if(jTextField7.getText().isEmpty()==true){
           JOptionPane.showMessageDialog(null, "Field Motif belum diisi");
        } else if(Hjj < Hbb ==true){
           JOptionPane.showMessageDialog(null, "Harga Jual Harus lebih Tinggi");
        } else if(jTextField6.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Silahkan pilih Supplier terlebih dahulu");
        } else {
            try {
                            String sql1 ="INSERT INTO barang VALUES('"
                            +Txt_Idbarang2.getText()+
                            "','"+Txt_NamaBarang2.getText()+" ("+jComboBox1.getSelectedItem()+") "+
                            "','"+Kategori1.getSelectedItem()+
                            "','"+Txt_Ukuran2.getText()+
                            "','"+jTextField7.getText()+
                            "','"+Txt_HargaBeli2.getText()+
                            "','"+Txt_HargaJual2.getText()+
                            "','"+Txt_Stok2.getText()+
//                            "','"+Txt_KodebarcodeEdit.getText()+
                            
                            "','"+jTextField6.getText()+"')";
                            java.sql.Connection conn1 = (Connection)koneksi.getKoneksi();
                            java.sql.PreparedStatement pst1= conn1.prepareStatement(sql1);
                            pst1.execute();
                            PengaturanProdukPanel.removeAll();
        PengaturanProdukPanel.repaint();
        PengaturanProdukPanel.revalidate();

        PengaturanProdukPanel.add(Katalog);
        PengaturanProdukPanel.repaint();
        PengaturanProdukPanel.revalidate();
                            JOptionPane.showMessageDialog(null, "Data Berhasil di Tambahkan");

                        } catch (SQLException e) {
                               JOptionPane.showMessageDialog(this, e.getMessage());
                        }

    try{
            Linear barcode = new Linear();
            barcode.setType(Linear.CODE128B);
            barcode.setData(Txt_Idbarang2.getText());
            barcode.setI(11.0f);
            String fname = Txt_Idbarang2.getText();
            barcode.renderBarcode("src/barcode/" + fname + ".png");
    }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
    }

    clearbarang();
    getDataBarang();
    getDataBarangTransaksi();
//    ComboBoxBarang();
    id_autoBarang();
        }

    }//GEN-LAST:event_Btn_save1MouseClicked

    private void Txt_HargaJual2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_HargaJual2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_HargaJual2ActionPerformed

    private void Txt_Stok2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_Stok2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_Stok2ActionPerformed

    private void jTable10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable10MouseEntered

    }//GEN-LAST:event_jTable10MouseEntered

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
    String idBarang = Txt_IdbarangB.getText();
    WarningDeleteProduk d = new WarningDeleteProduk((JFrame) SwingUtilities.getWindowAncestor(this), idBarang);
    d.setVisible(true);
    getDataBarang();
    getDataBarangTransaksi();
    clearbarang();
    id_autoBarang();
        PengaturanProdukPanel.removeAll();
        PengaturanProdukPanel.repaint();
        PengaturanProdukPanel.revalidate();

        PengaturanProdukPanel.add(Katalog);
        PengaturanProdukPanel.repaint();
        PengaturanProdukPanel.revalidate();
        JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
//        ComboBoxBarang();
    }//GEN-LAST:event_jLabel38MouseClicked


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

    private void txtSubtotalFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSubtotalFMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubtotalFMouseEntered

    private void txtSubtotalFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSubtotalFMouseClicked
        String Hb = Txt_HargaBeli2.getText();
        int Hbb = Integer.parseInt(Hb);
        String Hj = Txt_HargaJual2.getText();
        int Hjj = Integer.parseInt(Hj);

        if(Txt_Idbarang2.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field ID Barang belum diisi");
        } else if(Txt_NamaBarang2.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Nama Barang belum diisi");
        } else if(Txt_Stok2.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Stok belum diisi");
        } else if(jTextField7.getText().isEmpty()==true){
           JOptionPane.showMessageDialog(null, "Field Motif belum diisi");
        } else if(Hjj < Hbb ==true){
           JOptionPane.showMessageDialog(null, "Harga Jual Harus lebih Tinggi");
        } else if(jTextField6.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Silahkan pilih Supplier terlebih dahulu");
        } else {
        }
    }//GEN-LAST:event_txtSubtotalFMouseClicked

    private void btnCancel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancel1MouseClicked
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
        getDataBarang();
    }//GEN-LAST:event_btnPay1MouseClicked

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
int baris = jTable4.getSelectedRow();
        try {
            String sql = "SELECT DISTINCT barangpesanan.id_barang FROM barangpesanan JOIN "
                    + "detail_pemesanan ON barangpesanan.id_barangPesanan = detail_pemesanan.id_barangPesanan "
                    + "JOIN pemesanan ON pemesanan.Id_pemesanan = detail_pemesanan.Id_pemesanan WHERE "
                    + "pemesanan.Id_pemesanan = '"+ jTable4.getValueAt(baris, 1).toString() +"'";
            java.sql.Connection conn =(Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet res = pst.executeQuery();
            while (res.next()) {                
                jTextField12.setText(res.getString(1));
            }
        } catch (Exception e) {
            
        }        
        try {
            String sql = "select  SUM(barangPesanan.panjangKain) from detail_pemesanan JOIN barangPesanan "
                    + "on detail_pemesanan.id_barangPesanan=barangPesanan.id_barangPesanan JOIN motifbatik "
                    + "ON barangpesanan.id_motif = motifbatik.id_motif where id_pemesanan = '"+ jTable4.getValueAt(baris, 1).toString() +"'";
            java.sql.Connection conn =(Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet res = pst.executeQuery();
            while (res.next()) {                
                jTextField13.setText(res.getString(1));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jTable4MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        
        int baris = jTable1.getSelectedRow();
        try {
        int a = Integer.parseInt(jTable1.getValueAt(baris, 2).toString());
        int b = Integer.parseInt(txt_pemasukan.getText(baris, 6));
        int c = b-a; 
            if (c<0) {
                JOptionPane.showMessageDialog(null, "Stok Kain Tidak Mencukupi");
            }
        } catch (Exception e) {
        }
        
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
//        pemasukan();
        getDataReportPemasukan();
        getDataPemesanan();
        dashboardchartbulanan();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        // TODO add your handling code here:
        txtCariProduk.setVisible(true);
    }//GEN-LAST:event_jLabel35MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        txtCariProduk.setVisible(false);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void txtCariProdukKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariProdukKeyPressed
        // TODO add your handling code here:
//        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
//            cariDataProduk();
//        }
    }//GEN-LAST:event_txtCariProdukKeyPressed

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

    private void Btn_CariPengeluaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_CariPengeluaranMouseClicked
       cariDataPengeluaran();
        JumlahPengeluaran();

    }//GEN-LAST:event_Btn_CariPengeluaranMouseClicked

    private void Btn_CariPemasukanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_CariPemasukanMouseClicked
        cariDataPemasukan();
        //getDataReportPemasukan();
        JumlahPemasukan();
    }//GEN-LAST:event_Btn_CariPemasukanMouseClicked

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

    private void jLabel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseClicked
        Printrecord(PanelPrintBarcode);
    }//GEN-LAST:event_jLabel39MouseClicked

    private void DetailBarcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcodeActionPerformed

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

//        try {
//            String sql = "INSERT INTO barang (id_barang,nama_barang,kategori,harga_jual,stok) VALUES ('"
//            +txtIdbarps.getText()+"','"
//            +"Kain Pesanan "+jTable4.getValueAt(barisSup, 1)+" "+jTable4.getValueAt(barisSup, 2)+"','"
//            +"Pesanan"+"','"
//            +jTable4.getValueAt(barisSup, 6)+"','"
//            +"','1')";
//            java.sql.Connection conn=(Connection)koneksi.getKoneksi();
//            java.sql.PreparedStatement pst1=conn.prepareStatement(sql);
//            pst1.execute();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
        }if(status.equalsIgnoreCase("Selesai")){
            JOptionPane.showMessageDialog(null, "Barang Sudah Selesai!");
        }if(status.equalsIgnoreCase("Diambil")){
            JOptionPane.showMessageDialog(null, "Barang sudah diterima pemesan!");
        }
        getDataPemesanan();
    }//GEN-LAST:event_TandaiSelesaiActionPerformed

    private void cancelPemesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelPemesananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelPemesananActionPerformed

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

    private void txtCariBTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariBTKeyReleased
        
        CariBarangTransaksi();
    }//GEN-LAST:event_txtCariBTKeyReleased

    private void txtTPFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTPFKeyReleased
        // TODO add your handling code here:
        int totalBayar = Integer.parseInt(txtSubtotalF.getText());
        int jumlahBayar = Integer.parseInt(txtTPF.getText());
        txtReturn.setText(""+(jumlahBayar-totalBayar));
    }//GEN-LAST:event_txtTPFKeyReleased

    private void txtCariKaryawanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKaryawanKeyReleased
        // TODO add your handling code here:
        cariDataKaryawan();
    }//GEN-LAST:event_txtCariKaryawanKeyReleased

    private void txtCariSupplierKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariSupplierKeyReleased
        // TODO add your handling code here:
        cariDataSupplier();
    }//GEN-LAST:event_txtCariSupplierKeyReleased

    private void txtCariPemesananKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariPemesananKeyReleased
        // TODO add your handling code here:
        cariDataPemesanan();
    }//GEN-LAST:event_txtCariPemesananKeyReleased

    private void txtCariProdukKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariProdukKeyReleased
        // TODO add your handling code here:
        cariDataProduk();
    }//GEN-LAST:event_txtCariProdukKeyReleased

    private void txtAlamatKarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlamatKarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlamatKarActionPerformed

    private void txtAlamatKarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAlamatKarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlamatKarMouseClicked

    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked
        // TODO add your handling code here:
        if(txtIdkar.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Username belum diisi");
        } else if(txtPassword.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Password belum diisi");
        } else if(txtFullname.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Full Name belum diisi");
        } else if(txtPhone.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Phone belum diisi");
        } else if(txtAlamatKar.getText().isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Field Alamat belum diisi");
        } else {
            try {
                OOPCRUD a = new OOPCRUD();
                a.setUsername(txtIdkar.getText());
                a.setPassword(txtPassword.getText());
                a.setFullname(txtFullname.getText());
                a.setPhone(txtPhone.getText());
                a.setAlamat(txtAlamatKar.getText());

                java.sql.Connection conn=(Connection)koneksi.getKoneksi();
                String sql1 = "INSERT INTO karyawan(id_karyawan,password,nama_karyawan,no_hp,alamat) VALUES (?,?,?,?,?)";
                java.sql.PreparedStatement pst1=conn.prepareStatement(sql1);

                pst1.setString(1, a.getUsername());
                pst1.setString(2, a.getPassword());
                pst1.setString(3, a.getFullname());
                pst1.setString(4, a.getPhone());
                pst1.setString(5, a.getAlamat());
                pst1.executeUpdate();
                JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data sudah ada atau Field terlalu panjang");
            }
                txtIdkar.setText(null);
                txtFullname.setText(null);
                txtPassword.setText(null);
                txtPhone.setText(null);
                txtAlamatKar.setText(null);
                getDataKaryawan();
       }

    }//GEN-LAST:event_jLabel41MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        txtCariKaryawan.setVisible(false);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void cb_distributor4PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cb_distributor4PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        String tmp =(String)cb_distributor4.getSelectedItem();
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
                jTextField4.setText(add);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cb_distributor4PopupMenuWillBecomeInvisible

    private void cb_distributor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_distributor4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_distributor4ActionPerformed

    private void cb_distributor5PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cb_distributor5PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        String tmp =(String)cb_distributor5.getSelectedItem();
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
                jTextField6.setText(add);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cb_distributor5PopupMenuWillBecomeInvisible

    private void cb_distributor5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_distributor5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_distributor5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        txtCariSupplier.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void cb_distributor2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_distributor2MouseClicked
        // TODO add your handling code here:
//        ComboBoxBarang();
    }//GEN-LAST:event_cb_distributor2MouseClicked

    private void txtQtybsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtybsKeyReleased
         //TODO add your handling code here:
        try{
            int harga = Integer.parseInt(txtHarbelbs.getText());
            int qty = Integer.parseInt(txtQtybs.getText());
            txtSubtobs.setText(""+(harga*qty));
        }catch(NumberFormatException e){
            //            txt_subtotal.setText("0");
        }

//        PolymorphysmSubtotal subtotalrestok = new PolymorphysmSubtotal();
//        PolyRestok pR = new PolyRestok(Integer.parseInt(txtHarbelbs.getText()) * Integer.parseInt(txtQtybs.getText()));
//        Integer.parseInt(txtSubtobs.setText(pR));
    }//GEN-LAST:event_txtQtybsKeyReleased

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

    private void jLabel41MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel41MouseEntered

    private void jDateChooser2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser2MouseClicked

    }//GEN-LAST:event_jDateChooser2MouseClicked

    private void jDateChooser2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser2MouseEntered

    }//GEN-LAST:event_jDateChooser2MouseEntered

    private void btnAbout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbout1MouseClicked
        new About().setVisible(true);
        btnAbout1.setVisible(false);
        btnLogOut1.setVisible(false);
        ddLogOut1.setVisible(false);
    }//GEN-LAST:event_btnAbout1MouseClicked

    private void btnAbout2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbout2MouseClicked
        new About().setVisible(true);
        btnAbout2.setVisible(false);
        btnLogOut2.setVisible(false);
        ddLogOut2.setVisible(false);
    }//GEN-LAST:event_btnAbout2MouseClicked

    private void btnAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAboutMouseClicked
        new About().setVisible(true);
        btnAbout.setVisible(false);
        btnLogOut.setVisible(false);
        ddLogOut.setVisible(false);
    }//GEN-LAST:event_btnAboutMouseClicked

    private void btnAbout12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbout12MouseClicked
        new About().setVisible(true);
        btnAbout12.setVisible(false);
        btnLogOut12.setVisible(false);
        ddLogOut12.setVisible(false);
    }//GEN-LAST:event_btnAbout12MouseClicked

    private void btnAbout3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbout3MouseClicked
        new About().setVisible(true);
        btnAbout3.setVisible(false);
        btnLogOut3.setVisible(false);
        ddLogOut3.setVisible(false);
    }//GEN-LAST:event_btnAbout3MouseClicked

    private void btnAbout4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbout4MouseClicked
        new About().setVisible(true);
        btnAbout4.setVisible(false);
        btnLogOut4.setVisible(false);
        ddLogOut4.setVisible(false);
    }//GEN-LAST:event_btnAbout4MouseClicked

    private void btnAbout7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbout7MouseClicked
        new About().setVisible(true);
        btnAbout7.setVisible(false);
        btnLogOut7.setVisible(false);
        ddLogOut7.setVisible(false);
    }//GEN-LAST:event_btnAbout7MouseClicked

    private void btnAbout10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbout10MouseClicked
        new About().setVisible(true);
        btnAbout10.setVisible(false);
        btnLogOut10.setVisible(false);
        ddLogOut10.setVisible(false);
    }//GEN-LAST:event_btnAbout10MouseClicked

    private void DetailBarcode1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode1ActionPerformed

    private void DetailBarcode2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode2ActionPerformed

    private void DetailBarcode3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode3ActionPerformed

    private void DetailBarcode4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode4ActionPerformed

    private void DetailBarcode5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode5ActionPerformed

    private void DetailBarcode6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode6ActionPerformed

    private void DetailBarcode7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode7ActionPerformed

    private void DetailBarcode8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode8ActionPerformed

    private void DetailBarcode9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode9ActionPerformed

    private void DetailBarcode10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode10ActionPerformed

    private void DetailBarcode11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode11ActionPerformed

    private void DetailBarcode12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode12ActionPerformed

    private void DetailBarcode13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode13ActionPerformed

    private void DetailBarcode14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode14ActionPerformed

    private void DetailBarcode15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode15ActionPerformed

    private void DetailBarcode16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode16ActionPerformed

    private void DetailBarcode17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode17ActionPerformed

    private void DetailBarcode18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode18ActionPerformed

    private void DetailBarcode19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode19ActionPerformed

    private void DetailBarcode20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode20ActionPerformed

    private void DetailBarcode21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode21ActionPerformed

    private void DetailBarcode22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode22ActionPerformed

    private void DetailBarcode23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode23ActionPerformed

    private void DetailBarcode24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode24ActionPerformed

    private void DetailBarcode25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode25ActionPerformed

    private void DetailBarcode26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode26ActionPerformed

    private void DetailBarcode27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode27ActionPerformed

    private void DetailBarcode28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode28ActionPerformed

    private void DetailBarcode29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode29ActionPerformed

    private void DetailBarcode30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode30ActionPerformed

    private void DetailBarcode31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode31ActionPerformed

    private void DetailBarcode32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode32ActionPerformed

    private void DetailBarcode33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode33ActionPerformed

    private void DetailBarcode34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode34ActionPerformed

    private void DetailBarcode35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode35ActionPerformed

    private void DetailBarcode36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode36ActionPerformed

    private void DetailBarcode37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode37ActionPerformed

    private void DetailBarcode38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode38ActionPerformed

    private void DetailBarcode39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode39ActionPerformed

    private void DetailBarcode40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBarcode40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailBarcode40ActionPerformed

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
        String tampilan = "yyyy-MM-dd";
    SimpleDateFormat fm = new SimpleDateFormat(tampilan);
    String tanggal = String.valueOf(fm.format(jDateChooser2.getDate()));
    String tanggal1 = String.valueOf(fm.format(jDateChooser3.getDate()));
        try{
            InputStream nota = getClass().getResourceAsStream("report4.jasper");
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
    }//GEN-LAST:event_jLabel42MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        try {
            String sql = "SELECT id_motif, gambar FROM motifbatik WHERE Motif = '"+jComboBox1.getSelectedItem()+"'";
            java.sql.Connection conn = (Connection)koneksi.getKoneksi();
            java.sql.Statement stm= conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                jTextField7.setText(res.getString(1));
                Txt_Gambar.setText(res.getString(2));
            }
        } catch (Exception e) {
        }
        String newpath = "Uploads/ProfilImages";
        File directory = new File(newpath);
        {if(!directory.exists()){
        }
        ImageIcon imageiconn= new ImageIcon(newpath+"/"+Txt_Gambar.getText());
        Image image = imageiconn.getImage().getScaledInstance(270, 250, Image.SCALE_DEFAULT);
        ImageIcon imageIcon=new ImageIcon(image);
        PreviewImage2.setIcon(imageIcon); 
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void Kategori1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kategori1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Kategori1ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed

    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked

    }//GEN-LAST:event_jComboBox1MouseClicked

    private void Btn_MasterBatikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_MasterBatikMouseClicked
        new Mastermotif().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_MasterBatikMouseClicked

    private void txt_pemasukanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pemasukanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pemasukanActionPerformed

    private void txtTanggalHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTanggalHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTanggalHomeActionPerformed

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

    private void JharianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JharianMouseClicked
        
    }//GEN-LAST:event_JharianMouseClicked

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

    private void CariHarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CariHarianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CariHarianActionPerformed

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

    private void JbulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbulanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JbulanActionPerformed

    private void CariHarianMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CariHarianMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_CariHarianMouseEntered

    private void txtTanggalBBhariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTanggalBBhariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTanggalBBhariActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        try {
            String sql = "SELECT id_motif FROM motifbatik WHERE motifbatik.Motif = '"+jComboBox4.getSelectedItem()+"'";
            java.sql.Connection conn = (Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet res = pst.executeQuery();
            while (res.next()) {                
                txt_Idmotif.setText(res.getString(1));
            }
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void txtCariBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCariBTMouseClicked
        txtCariBT.setText("");
    }//GEN-LAST:event_txtCariBTMouseClicked

    private void jcomboboxmotifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboboxmotifActionPerformed
        try {
            String sql = "SELECT id_motif FROM motifbatik WHERE motifbatik.Motif = '"+jcomboboxmotif.getSelectedItem()+"'";
            java.sql.Connection conn = (Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet res = pst.executeQuery();
            while (res.next()) {                
                Txt_Motif1.setText(res.getString(1));
            }
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_jcomboboxmotifActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
       try {
            String sql = "SELECT id_motif FROM motifbatik WHERE motifbatik.Motif = '"+jComboBox5.getSelectedItem()+"'";
            java.sql.Connection conn = (Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet res = pst.executeQuery();
            while (res.next()) {                
                txtMotif.setText(res.getString(1));
            }
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void txtPanjangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPanjangKeyReleased
       try{
            int harga = Integer.parseInt(txt_HargaJasa.getText());
            int hargakain = Integer.parseInt(txt_Hkain.getText());
            int qty = Integer.parseInt(txtPanjang.getText());
            txtHarga.setText(""+(harga+qty*hargakain));
            
        }catch(NumberFormatException e){

        }if (txtPanjang.getText().toString().equals("")) {
               txtHarga.setText("");
           }
    }//GEN-LAST:event_txtPanjangKeyReleased

    private void jLabel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseClicked
        new MasterJasa().setVisible(true);
    }//GEN-LAST:event_jLabel43MouseClicked

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        try {
            String sql = "SELECT id_jasa,harga  FROM jasa WHERE nama_jasa = '"+jComboBox6.getSelectedItem()+"'";
            java.sql.Connection conn = (Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet res = pst.executeQuery();
            while (res.next()) {                
                txt_namaJasaa.setText(res.getString(1));
                txt_HargaJasa.setText(res.getString(2));
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void txt_namaJasaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaJasaaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaJasaaActionPerformed

    private void txt_HargaJasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_HargaJasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_HargaJasaActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        try {
            String sql = "SELECT id_barang, barang.harga_jual FROM barang WHERE barang.nama_barang = '"+jComboBox7.getSelectedItem()+"'";
            java.sql.Connection conn = (Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet res = pst.executeQuery();
            while (res.next()) {                
                
                txt_Hkain.setText(res.getString(2));
                txt_idkain.setText(res.getString(1));
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void txtharipemesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtharipemesananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtharipemesananActionPerformed

    private void txtBulanpemesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBulanpemesananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBulanpemesananActionPerformed

    private void txtJamPemesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJamPemesananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJamPemesananActionPerformed

    private void txtPanjangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPanjangMouseClicked
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
            String sql="INSERT INTO pemesanan (Id_pemesanan,id_karyawan,nama_customer,phone,Hari_pemesanan,alamat,BulanPemesanan,Jam_Pemesanan,tanggal_pemesanan) VALUES ('"
            +txtIdpsn.getText()
            +"','"+txtIdkarpesan.getText()
            +"','"+txtNamaCus.getText()
            +"','"+txtPhone1.getText()
            +"','"+txtharipemesanan.getText()
            +"','"+txtAlamat1.getText()
            +"','"+txtBulanpemesanan.getText()
            +"','"+txtJamPemesanan.getText()
            +"','"+txtTanggal.getText()+"')";
            java.sql.Connection conn=(Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
        //   JOptionPane.showMessageDialog(null, e.getMessage());
        }
        }
    }//GEN-LAST:event_txtPanjangMouseClicked

    private void txt_HkainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_HkainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_HkainActionPerformed

    private void txtKodebarPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodebarPesanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodebarPesanActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void txtCariBT1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCariBT1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariBT1MouseClicked

    private void txtCariBT1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariBT1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariBT1KeyReleased

    private void txt_idkainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idkainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idkainActionPerformed

    private void txtCariBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCariBTMouseEntered
       
    }//GEN-LAST:event_txtCariBTMouseEntered

    private void txtCariBTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariBTKeyPressed
        
    }//GEN-LAST:event_txtCariBTKeyPressed

private void Printrecord(JPanel panel){
    MessageFormat header = new MessageFormat("Laporan Pemasukan RBT Retnosari");
        MessageFormat footer = new MessageFormat("");

    PrinterJob job = PrinterJob.getPrinterJob();
        job.setJobName("Print Barcode");
        job.setPrintable(new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
              //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

                if(pageIndex >0 ){
                    return Printable.NO_SUCH_PAGE;
                }
                Graphics2D graphic = (Graphics2D)graphics;
                graphic.translate(pageFormat.getImageableX()*2, pageFormat.getImageableY()*2);
                graphic.scale(0.5, 0.5);
                panel.paint(graphic);
                return Printable.PAGE_EXISTS;

            }

            });
     boolean returnresult = job.printDialog();
     if (returnresult){
         try {

             job.print();
         } catch (PrinterException e) {
         JOptionPane.showMessageDialog(this, "Print Error : "+e.getMessage());
         }
     }
}



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
            java.util.logging.Logger.getLogger(DbAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DbAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DbAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DbAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new DbAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JLabel Btn_CariPemasukan;
    private javax.swing.JLabel Btn_CariPengeluaran;
    private javax.swing.JLabel Btn_HapusPreview;
    private javax.swing.JLabel Btn_MasterBatik;
    private javax.swing.JLabel Btn_PrintExcelPemasukan;
    private javax.swing.JLabel Btn_PrintExcelpengeluaran;
    private javax.swing.JLabel Btn_PrintPDFpengeluaran;
    private javax.swing.JLabel Btn_save;
    private javax.swing.JLabel Btn_save1;
    private javax.swing.JButton CariBulanan;
    private javax.swing.JButton CariHarian;
    private javax.swing.JButton CariTahunan;
    public static javax.swing.JPanel ContentPanel;
    private javax.swing.JTextField DetailBarcode;
    private javax.swing.JTextField DetailBarcode1;
    private javax.swing.JTextField DetailBarcode10;
    private javax.swing.JTextField DetailBarcode11;
    private javax.swing.JTextField DetailBarcode12;
    private javax.swing.JTextField DetailBarcode13;
    private javax.swing.JTextField DetailBarcode14;
    private javax.swing.JTextField DetailBarcode15;
    private javax.swing.JTextField DetailBarcode16;
    private javax.swing.JTextField DetailBarcode17;
    private javax.swing.JTextField DetailBarcode18;
    private javax.swing.JTextField DetailBarcode19;
    private javax.swing.JTextField DetailBarcode2;
    private javax.swing.JTextField DetailBarcode20;
    private javax.swing.JTextField DetailBarcode21;
    private javax.swing.JTextField DetailBarcode22;
    private javax.swing.JTextField DetailBarcode23;
    private javax.swing.JTextField DetailBarcode24;
    private javax.swing.JTextField DetailBarcode25;
    private javax.swing.JTextField DetailBarcode26;
    private javax.swing.JTextField DetailBarcode27;
    private javax.swing.JTextField DetailBarcode28;
    private javax.swing.JTextField DetailBarcode29;
    private javax.swing.JTextField DetailBarcode3;
    private javax.swing.JTextField DetailBarcode30;
    private javax.swing.JTextField DetailBarcode31;
    private javax.swing.JTextField DetailBarcode32;
    private javax.swing.JTextField DetailBarcode33;
    private javax.swing.JTextField DetailBarcode34;
    private javax.swing.JTextField DetailBarcode35;
    private javax.swing.JTextField DetailBarcode36;
    private javax.swing.JTextField DetailBarcode37;
    private javax.swing.JTextField DetailBarcode38;
    private javax.swing.JTextField DetailBarcode39;
    private javax.swing.JTextField DetailBarcode4;
    private javax.swing.JTextField DetailBarcode40;
    private javax.swing.JTextField DetailBarcode5;
    private javax.swing.JTextField DetailBarcode6;
    private javax.swing.JTextField DetailBarcode7;
    private javax.swing.JTextField DetailBarcode8;
    private javax.swing.JTextField DetailBarcode9;
    private javax.swing.JPanel Edit;
    private javax.swing.JPanel Edit1;
    private javax.swing.JPanel Field;
    private javax.swing.JTextField FileName;
    private javax.swing.JTextField FileName1;
    private javax.swing.JTextField FileName2;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel HomeKaryawan;
    private javax.swing.JPanel HomeMenu;
    private javax.swing.JLabel HomePP;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JLabel HomePembelian;
    private javax.swing.JLabel HomePemesanan;
    private javax.swing.JLabel HomeReport;
    private javax.swing.JLabel HomeSupplier;
    private javax.swing.JLabel HomeTransaksi;
    private javax.swing.JComboBox<String> Jbulan;
    private javax.swing.JComboBox<String> Jbulan1;
    private com.toedter.calendar.JDateChooser Jharian;
    private javax.swing.JComboBox<String> Jminggu;
    private javax.swing.JComboBox<String> Jtahun;
    private javax.swing.JLabel Karyawan;
    private javax.swing.JLabel KaryawanHome;
    private javax.swing.JPanel KaryawanMenu;
    private javax.swing.JLabel KaryawanPP;
    private javax.swing.JPanel KaryawanPanel;
    private javax.swing.JLabel KaryawanPembelian;
    private javax.swing.JLabel KaryawanPemesanan;
    private javax.swing.JLabel KaryawanReport;
    private javax.swing.JLabel KaryawanSupplier;
    private javax.swing.JLabel KaryawanTransaksi;
    private javax.swing.JPanel Katalog;
    private javax.swing.JComboBox<String> Kategori;
    private javax.swing.JComboBox<String> Kategori1;
    private javax.swing.JPanel Manual;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JPanel PanelPrintBarcode;
    private javax.swing.JLabel Pembelian;
    private javax.swing.JLabel PembelianHome;
    private javax.swing.JLabel PembelianKaryawan;
    private javax.swing.JPanel PembelianMenu;
    private javax.swing.JLabel PembelianPP;
    private javax.swing.JPanel PembelianPanel;
    private javax.swing.JLabel PembelianPemesanan;
    private javax.swing.JLabel PembelianReport;
    private javax.swing.JLabel PembelianSupplier;
    private javax.swing.JLabel PembelianTransaksi;
    public static javax.swing.JPanel PemesanaPanel;
    private javax.swing.JLabel Pemesanan;
    private javax.swing.JLabel PemesananHome;
    private javax.swing.JLabel PemesananKaryawan;
    private javax.swing.JPanel PemesananMenu;
    private javax.swing.JLabel PemesananPP;
    private javax.swing.JLabel PemesananPembelian;
    private javax.swing.JLabel PemesananReport;
    private javax.swing.JLabel PemesananSupplier;
    private javax.swing.JLabel PemesananTransaksi;
    private javax.swing.JLabel PengaturanProduk;
    private javax.swing.JLabel PengaturanProdukHome;
    private javax.swing.JLabel PengaturanProdukKaryawan;
    private javax.swing.JPanel PengaturanProdukMenu;
    private javax.swing.JPanel PengaturanProdukPanel;
    private javax.swing.JLabel PengaturanProdukPembelian;
    private javax.swing.JLabel PengaturanProdukPemesanan;
    private javax.swing.JLabel PengaturanProdukReport;
    private javax.swing.JLabel PengaturanProdukSupplier;
    private javax.swing.JLabel PengaturanProdukTransaksi;
    public static javax.swing.JPanel PesanBarangPanel;
    private javax.swing.JPanel PesanPanel;
    private javax.swing.JLabel PopUpQty;
    private javax.swing.JPopupMenu PopupMenuPemesanan;
    private javax.swing.JLabel PreviewImage;
    private javax.swing.JLabel PreviewImage1;
    private javax.swing.JLabel PreviewImage2;
    private javax.swing.JLabel PreviewKodeBarcode;
    private javax.swing.JLabel PreviewKodeBarcode1;
    private javax.swing.JLabel PreviewKodeBarcode10;
    private javax.swing.JLabel PreviewKodeBarcode11;
    private javax.swing.JLabel PreviewKodeBarcode12;
    private javax.swing.JLabel PreviewKodeBarcode13;
    private javax.swing.JLabel PreviewKodeBarcode14;
    private javax.swing.JLabel PreviewKodeBarcode15;
    private javax.swing.JLabel PreviewKodeBarcode16;
    private javax.swing.JLabel PreviewKodeBarcode17;
    private javax.swing.JLabel PreviewKodeBarcode18;
    private javax.swing.JLabel PreviewKodeBarcode19;
    private javax.swing.JLabel PreviewKodeBarcode2;
    private javax.swing.JLabel PreviewKodeBarcode20;
    private javax.swing.JLabel PreviewKodeBarcode21;
    private javax.swing.JLabel PreviewKodeBarcode22;
    private javax.swing.JLabel PreviewKodeBarcode23;
    private javax.swing.JLabel PreviewKodeBarcode24;
    private javax.swing.JLabel PreviewKodeBarcode25;
    private javax.swing.JLabel PreviewKodeBarcode26;
    private javax.swing.JLabel PreviewKodeBarcode27;
    private javax.swing.JLabel PreviewKodeBarcode28;
    private javax.swing.JLabel PreviewKodeBarcode29;
    private javax.swing.JLabel PreviewKodeBarcode3;
    private javax.swing.JLabel PreviewKodeBarcode30;
    private javax.swing.JLabel PreviewKodeBarcode31;
    private javax.swing.JLabel PreviewKodeBarcode32;
    private javax.swing.JLabel PreviewKodeBarcode33;
    private javax.swing.JLabel PreviewKodeBarcode34;
    private javax.swing.JLabel PreviewKodeBarcode35;
    private javax.swing.JLabel PreviewKodeBarcode36;
    private javax.swing.JLabel PreviewKodeBarcode37;
    private javax.swing.JLabel PreviewKodeBarcode38;
    private javax.swing.JLabel PreviewKodeBarcode39;
    private javax.swing.JLabel PreviewKodeBarcode4;
    private javax.swing.JLabel PreviewKodeBarcode40;
    private javax.swing.JLabel PreviewKodeBarcode5;
    private javax.swing.JLabel PreviewKodeBarcode6;
    private javax.swing.JLabel PreviewKodeBarcode7;
    private javax.swing.JLabel PreviewKodeBarcode8;
    private javax.swing.JLabel PreviewKodeBarcode9;
    private javax.swing.JLabel Report;
    private javax.swing.JLabel ReportHome;
    private javax.swing.JLabel ReportKaryawan;
    private javax.swing.JPanel ReportMenu;
    private javax.swing.JLabel ReportPP;
    private javax.swing.JPanel ReportPanel;
    private javax.swing.JLabel ReportPembelian;
    private javax.swing.JLabel ReportPemesanan;
    private javax.swing.JLabel ReportSupplier;
    private javax.swing.JLabel ReportTransaksi;
    private javax.swing.JLabel Supplier;
    private javax.swing.JLabel SupplierHome;
    private javax.swing.JLabel SupplierKaryawan;
    private javax.swing.JPanel SupplierMenu;
    private javax.swing.JLabel SupplierPP;
    public static javax.swing.JPanel SupplierPanel;
    private javax.swing.JLabel SupplierPembelian;
    private javax.swing.JLabel SupplierPemesanan;
    private javax.swing.JLabel SupplierReport;
    private javax.swing.JLabel SupplierTransaksi;
    private javax.swing.JLabel TambahnGambar;
    private javax.swing.JMenuItem TandaiSelesai;
    private javax.swing.JPanel TopMenuPanel;
    private javax.swing.JLabel Transaksi;
    private javax.swing.JLabel TransaksiHome;
    private javax.swing.JLabel TransaksiKaryawan;
    private javax.swing.JPanel TransaksiManual;
    private javax.swing.JPanel TransaksiMenu;
    private javax.swing.JLabel TransaksiPP;
    private javax.swing.JPanel TransaksiPanel;
    private javax.swing.JLabel TransaksiPembelian;
    private javax.swing.JLabel TransaksiPemesanan;
    private javax.swing.JLabel TransaksiReport;
    private javax.swing.JPanel TransaksiScan;
    private javax.swing.JLabel TransaksiSupplier;
    private javax.swing.JTextField Txt_Gambar;
    private javax.swing.JTextField Txt_HargaBeli;
    private javax.swing.JTextField Txt_HargaBeli1;
    private javax.swing.JTextField Txt_HargaBeli2;
    private javax.swing.JTextField Txt_HargaJual;
    private javax.swing.JTextField Txt_HargaJual1;
    private javax.swing.JTextField Txt_HargaJual2;
    private javax.swing.JTextField Txt_Idbarang1;
    private javax.swing.JTextField Txt_Idbarang2;
    private javax.swing.JTextField Txt_IdbarangB;
    private javax.swing.JTextField Txt_Kategori;
    private javax.swing.JTextField Txt_Kodebarcode;
    private javax.swing.JTextField Txt_Kodebarcode1;
    private javax.swing.JTextField Txt_Motif;
    private javax.swing.JTextField Txt_Motif1;
    private javax.swing.JTextField Txt_NamaBarang;
    private javax.swing.JTextField Txt_NamaBarang1;
    private javax.swing.JTextField Txt_NamaBarang2;
    private javax.swing.JTextField Txt_Stok;
    private javax.swing.JTextField Txt_Stok1;
    private javax.swing.JTextField Txt_Stok2;
    private javax.swing.JTextField Txt_TotalPemasukan;
    private javax.swing.JTextField Txt_TotalPengeluaran;
    private javax.swing.JTextField Txt_Ukuran;
    private javax.swing.JTextField Txt_Ukuran1;
    private javax.swing.JTextField Txt_Ukuran2;
    private javax.swing.JPanel View;
    private javax.swing.JPanel brgBaru;
    private javax.swing.JPanel brgStok;
    public static javax.swing.JLabel btnAbout;
    public static javax.swing.JLabel btnAbout1;
    public static javax.swing.JLabel btnAbout10;
    public static javax.swing.JLabel btnAbout11;
    private javax.swing.JLabel btnAbout12;
    private javax.swing.JLabel btnAbout13;
    public static javax.swing.JLabel btnAbout14;
    public static javax.swing.JLabel btnAbout2;
    public static javax.swing.JLabel btnAbout3;
    public static javax.swing.JLabel btnAbout4;
    public static javax.swing.JLabel btnAbout5;
    public static javax.swing.JLabel btnAbout6;
    public static javax.swing.JLabel btnAbout7;
    public static javax.swing.JLabel btnAbout8;
    public static javax.swing.JLabel btnAbout9;
    private javax.swing.JLabel btnBP;
    private javax.swing.JLabel btnBS;
    private javax.swing.JLabel btnCancel;
    private javax.swing.JLabel btnCancel1;
    private javax.swing.JLabel btnCancelView;
    private javax.swing.JLabel btnCancelView1;
    private javax.swing.JLabel btnDdLogOut;
    private javax.swing.JLabel btnEditView;
    public static javax.swing.JLabel btnLogOut;
    public static javax.swing.JLabel btnLogOut1;
    public static javax.swing.JLabel btnLogOut10;
    public static javax.swing.JLabel btnLogOut11;
    private javax.swing.JLabel btnLogOut12;
    private javax.swing.JLabel btnLogOut13;
    public static javax.swing.JLabel btnLogOut14;
    public static javax.swing.JLabel btnLogOut2;
    public static javax.swing.JLabel btnLogOut3;
    public static javax.swing.JLabel btnLogOut4;
    public static javax.swing.JLabel btnLogOut5;
    public static javax.swing.JLabel btnLogOut6;
    public static javax.swing.JLabel btnLogOut7;
    public static javax.swing.JLabel btnLogOut8;
    public static javax.swing.JLabel btnLogOut9;
    private javax.swing.JLabel btnPay;
    private javax.swing.JLabel btnPay1;
    private javax.swing.JLabel btnRpPembelian;
    private javax.swing.JLabel btnRpPenjualan;
    private javax.swing.JLabel btnSimpanKaryawan;
    private javax.swing.JLabel btnSimpanSup;
    private javax.swing.JLabel btnTambah;
    private javax.swing.JLabel btnUpdate;
    private javax.swing.JLabel btnUpdateSup;
    private javax.swing.JLabel btn_PrintPDFPemasukan;
    private javax.swing.JMenuItem cancelPemesanan;
    private javax.swing.JComboBox<String> cb_distributor;
    private javax.swing.JComboBox<String> cb_distributor1;
    private javax.swing.JComboBox<String> cb_distributor2;
    private javax.swing.JComboBox<String> cb_distributor3;
    private javax.swing.JComboBox<String> cb_distributor4;
    private javax.swing.JComboBox<String> cb_distributor5;
    public static final javax.swing.JPanel chartMingguan = new javax.swing.JPanel();
    private javax.swing.JMenuItem checkOut;
    public static javax.swing.JLabel ddLogOut;
    public static javax.swing.JLabel ddLogOut1;
    public static javax.swing.JLabel ddLogOut10;
    public static javax.swing.JLabel ddLogOut11;
    private javax.swing.JLabel ddLogOut12;
    private javax.swing.JLabel ddLogOut13;
    public static javax.swing.JLabel ddLogOut14;
    public static javax.swing.JLabel ddLogOut2;
    public static javax.swing.JLabel ddLogOut3;
    public static javax.swing.JLabel ddLogOut4;
    public static javax.swing.JLabel ddLogOut5;
    public static javax.swing.JLabel ddLogOut6;
    public static javax.swing.JLabel ddLogOut7;
    public static javax.swing.JLabel ddLogOut8;
    public static javax.swing.JLabel ddLogOut9;
    private javax.swing.JMenuItem detailPesanan;
    private javax.swing.JMenuItem hapus;
    public static final javax.swing.JComboBox<String> jComboBox1 = new javax.swing.JComboBox<>();
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    public static final javax.swing.JTable jTable4 = new javax.swing.JTable();
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    public static final javax.swing.JTextField jTextField8 = new javax.swing.JTextField();
    public static final javax.swing.JTextField jTextField9 = new javax.swing.JTextField();
    public static final javax.swing.JComboBox<String> jcomboboxmotif = new javax.swing.JComboBox<>();
    private javax.swing.JTextField jlabelll;
    private javax.swing.JLabel lblTopMenu;
    public static javax.swing.JLabel namaTop;
    public static javax.swing.JLabel namaTop1;
    public static javax.swing.JLabel namaTop2;
    public static javax.swing.JLabel namaTop3;
    public static javax.swing.JLabel namaTop4;
    public static javax.swing.JLabel namaTop5;
    public static javax.swing.JLabel namaTop6;
    public static javax.swing.JLabel namaTop7;
    private javax.swing.JPanel rpPembelian;
    private javax.swing.JPanel rpPenjualan;
    private javax.swing.JTextField rpbb;
    private javax.swing.JTextField rpbs;
    private javax.swing.JTextField rpps;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtAlamat1;
    private javax.swing.JTextField txtAlamatKar;
    public static javax.swing.JTextField txtBulanpemesanan;
    private javax.swing.JTextField txtCariBT;
    public static final javax.swing.JTextField txtCariBT1 = new javax.swing.JTextField();
    private javax.swing.JTextField txtCariKaryawan;
    private javax.swing.JTextField txtCariPemesanan;
    private javax.swing.JTextField txtCariProduk;
    private javax.swing.JTextField txtCariSupplier;
    private javax.swing.JTextField txtCustomerF;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtGambar;
    private javax.swing.JTextField txtHarbelBB;
    private javax.swing.JTextField txtHarbelbs;
    private javax.swing.JTextField txtHarga;
    public static javax.swing.JTextField txtIdBPes;
    private javax.swing.JTextField txtIdPenjualan;
    private javax.swing.JTextField txtIdSup;
    private javax.swing.JTextField txtIdbar2;
    private javax.swing.JTextField txtIdbarbs;
    private javax.swing.JTextField txtIdbarps;
    private javax.swing.JTextField txtIdkar;
    public static javax.swing.JTextField txtIdkarBB;
    public static javax.swing.JTextField txtIdkarTrx;
    public static javax.swing.JTextField txtIdkarTrx1;
    public static javax.swing.JTextField txtIdkarTrx2;
    public static javax.swing.JTextField txtIdkarbs;
    public static javax.swing.JTextField txtIdkarbs1;
    public static javax.swing.JTextField txtIdkarpesan;
    private javax.swing.JTextField txtIdpsn;
    private javax.swing.JTextField txtIdres2;
    private javax.swing.JTextField txtIdresbs;
    public static javax.swing.JTextField txtIdsup;
    private javax.swing.JTextField txtIdsupbs;
    public static javax.swing.JTextField txtJamPemesanan;
    private javax.swing.JTextField txtJenisBrg;
    private javax.swing.JTextField txtKodebarBB;
    private javax.swing.JTextField txtKodebarPesan;
    private javax.swing.JTextField txtKodebarPesan1;
    public static javax.swing.JTextField txtKodebarPesan2;
    private javax.swing.JTextField txtKodebarPesan3;
    private javax.swing.JTextField txtMotif;
    private javax.swing.JTextField txtMotifBB;
    private javax.swing.JTextField txtNamSup;
    private javax.swing.JTextField txtNamaCus;
    private javax.swing.JTextField txtNambarBB;
    private javax.swing.JTextField txtPanjang;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPhone1;
    private javax.swing.JTextField txtPhoneSup;
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
    private javax.swing.JTextField txt_HargaJasa;
    public static javax.swing.JTextField txt_Haribeli;
    private javax.swing.JTextField txt_Hkain;
    private javax.swing.JTextField txt_Idmotif;
    public static javax.swing.JTextField txt_Jambeli;
    private javax.swing.JTextField txt_Keuntungan;
    public static javax.swing.JTextField txt_bulanPenjualan;
    public static javax.swing.JTextField txt_bulanbeli;
    public static javax.swing.JTextField txt_hariPenjualan;
    private javax.swing.JTextField txt_idkain;
    public static javax.swing.JTextField txt_jamPenjualan;
    private javax.swing.JTextField txt_namaJasaa;
    private javax.swing.JTextField txt_pemasukan;
    private javax.swing.JTextField txt_pengeluaran;
    public static javax.swing.JTextField txtharipemesanan;
    // End of variables declaration//GEN-END:variables

    private void dataset(Connection connection, String query) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
