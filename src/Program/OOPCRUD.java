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
public class OOPCRUD {
        private String Username="";
        private String Password="";
        private String Fullname="";
        private String Phone="";
        private String Alamat="";
        private String NamaSupplier="";
        private String JenisBarang="";
        private String IdSup="";
        private String CariKaryawan="";
        private String CariSupplier="";
        
        public void setcariSupplier(String CariSupplier){
            this.CariSupplier = CariSupplier;
        }
        public String getCariSupplier(){
            return CariSupplier;
        }
        
        public void setcariKaryawan(String CariKaryawan){
            this.CariKaryawan = CariKaryawan;
        }
        public String getCariKaryawan(){
            return CariKaryawan;
        }
        
        public void setIdSup(String IdSup){
            this.IdSup = IdSup;
        }
        public String getIdSup(){
            return IdSup;
        }
        
        public void setNamaSupplier(String NamaSupplier){
            this.NamaSupplier = NamaSupplier;
        }
        public String getNamaSupplier(){
            return NamaSupplier;
        }
        
        public void setJenisBarang(String JenisBarang){
            this.JenisBarang = JenisBarang;
        }
        public String getJenisBarang(){
            return JenisBarang;
        }
        
        public void setUsername(String Username){
            this.Username = Username;
        }
        public String getUsername(){
            return Username;
        }
        
        public void setPassword(String Password){
            this.Password = Password;
        }
        public String getPassword(){
            return Password;
        }
        
        public void setFullname(String Fullname){
            this.Fullname = Fullname;
        }
        public String getFullname(){
            return Fullname;
        }
        
        public void setPhone(String Phone){
            this.Phone = Phone;
        }
        public String getPhone(){
            return Phone;
        }
        
        public void setAlamat(String Alamat){
            this.Alamat = Alamat;
        }
        public String getAlamat(){
            return Alamat;
        }
}
