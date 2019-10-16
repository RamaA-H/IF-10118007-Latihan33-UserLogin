/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg1.pkg10118007.latihan33.user.login;

/**
 * Nama      : Rama Al Halik
 * Kelas     : IF-1
 * NIM       : 10118007
 * Deskripsi : Masuk akun
 * @author Rama
 */
public class User {
    
    private String username;
    private String password;
    private boolean status;

    private boolean cekAkun(String parUsername, String parPassword) {
        username = "RizkiAdam";
        password = "terbaikselalu";

        status = parUsername.equals(username) && parPassword.equals(password);
        return status;
    }

    private void hasilLogin(boolean status, String parUsername) {
        if (status == true) {
            System.out.printf("\n******Hallo %s******", parUsername.toUpperCase());
            System.out.println("\nSelamat datang di aplikasi ini");
        } else {
            System.out.println("\nOoops, username atau password anda salah");
        }
    }
    
    public void pengecekkanLogin(String parUsername, String parPassword){
        cekAkun(parUsername, parPassword);
        hasilLogin(status, parUsername);
    }
}
