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
public class oopPemesanan {
        private String idPemesanan="";
        private String idKaryawan="";
        private String customer="";
        private String phone="";
        private String alamat="";
        private String tglPemesanan="";
        private String idBarangPesanan="";
        private String motif="";
        private String warna="";
        private String panjangKain="";
        private String harga="";
        private String totalHarga="";
        
        public void setidPemesanan(String idPemesanan){
            this.idPemesanan = idPemesanan;
        }
        public String getidPemesanan(){
            return idPemesanan;
        }
        
        public void setidKaryawan(String idKaryawan){
            this.idKaryawan = idKaryawan;
        }
        public String getidKaryawan(){
            return idKaryawan;
        }
        
        public void settglPemesanan(String tglPemesanan){
            this.tglPemesanan = tglPemesanan;
        }
        public String gettglPemesanan(){
            return tglPemesanan;
        }
        
        public void setidBarangPesanan(String idBarangPesanan){
            this.idBarangPesanan = idBarangPesanan;
        }
        public String getidBarangPesanan(){
            return idBarangPesanan;
        }
        
        public void setphone(String phone){
            this.phone = phone;
        }
        public String getphone(){
            return phone;
        }
        
        public void setalamat(String alamat){
            this.alamat = alamat;
        }
        public String getalamat(){
            return alamat;
        }
        
        public void setcustomer(String customer){
            this.customer = customer;
        }
        public String getcustomer(){
            return customer;
        }
        
        public void settotalHarga(String totalHarga){
            this.totalHarga = totalHarga;
        }
        public String gettotalHarga(){
            return totalHarga;
        }
        
        public void setmotif(String motif){
            this.motif = motif;
        }
        public String getmotif(){
            return motif;
        }
        
        public void setwarna(String warna){
            this.warna = warna;
        }
        public String getwarna(){
            return warna;
        }
        
        public void setpanjangKain(String panjangKain){
            this.panjangKain = panjangKain;
        }
        public String getpanjangKain(){
            return panjangKain;
        }
        
        public void setharga(String harga){
            this.harga = harga;
        }
        public String getharga(){
            return harga;
        }
}
