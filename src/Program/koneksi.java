/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Daffa Afifi Syahrony
 */
public class koneksi {
    private static Connection koneksi;
    public static Connection getKoneksi(){
        if(koneksi==null){
            try{
                String url=new String();
                String user=new String();
                String password=new String();
                url="jdbc:mysql://localhost:3306/retnosari";
                user="root";
                password="";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi=DriverManager.getConnection(url, user, password);
                System.out.println("KONEKSI BERHASIL");
            }catch(SQLException e){
            }
        }return koneksi;
    }
}
