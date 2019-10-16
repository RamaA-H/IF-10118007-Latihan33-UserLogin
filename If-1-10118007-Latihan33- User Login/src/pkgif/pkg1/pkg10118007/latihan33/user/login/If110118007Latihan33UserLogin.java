/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg1.pkg10118007.latihan33.user.login;
import java.util.Scanner;
/**
 * Nama      : Rama Al Halik
 * Kelas     : IF-1
 * NIM       : 10118007
 * Deskripsi : Masuk Akun
 * @author Rama
 */
public class If110118007Latihan33UserLogin {
private static String uname;
    private static String pass;
    public static void main(String[] args) {
        User login = new User();
        Scanner masuk = new Scanner(System.in);
        
        System.out.print("Masukkan Usernama anda\t= ");
        uname = masuk.next();
        System.out.print("Masukkan Password\t= ");
        pass = masuk.next();
        
        login.pengecekkanLogin(uname, pass);
    
    }
    
}
