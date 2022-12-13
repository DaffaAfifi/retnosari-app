/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

/**
 *
 * @author Daffa Afifi Syahrony
 */
public class oopTransaksi {
        private String idPenjualan="";
        private String idKaryawan="";
        private String tglPenjualan="";
        private String idBarang="";
        private String subTotal="";
        private String qty="";
        private String customer="";
        private String totalbayar="";
        private String tunai="";
        private String kembalian="";
        
        public void setidPenjualan(String idPenjualan){
            this.idPenjualan = idPenjualan;
        }
        public String getidPenjualan(){
            return idPenjualan;
        }
        
        public void setidKaryawan(String idKaryawan){
            this.idKaryawan = idKaryawan;
        }
        public String getidKaryawan(){
            return idKaryawan;
        }
        
        public void settglPenjualan(String tglPenjualan){
            this.tglPenjualan = tglPenjualan;
        }
        public String gettglPenjualan(){
            return tglPenjualan;
        }
        
        public void setidBarang(String idBarang){
            this.idBarang = idBarang;
        }
        public String getidBarang(){
            return idBarang;
        }
        
        public void setsubTotal(String subTotal){
            this.subTotal = subTotal;
        }
        public String getsubTotal(){
            return subTotal;
        }
        
        public void setqty(String qty){
            this.qty = qty;
        }
        public String getqty(){
            return qty;
        }
        
        public void setcustomer(String customer){
            this.customer = customer;
        }
        public String getcustomer(){
            return customer;
        }
        
        public void settotalBayar(String totalBayar){
            this.totalbayar = totalBayar;
        }
        public String gettotalBayar(){
            return totalbayar;
        }
        
        public void settunai(String tunai){
            this.tunai = tunai;
        }
        public String gettunai(){
            return tunai;
        }
        
        public void setkembalian(String kembalian){
            this.kembalian = kembalian;
        }
        public String getkembalian(){
            return kembalian;
        }
}
