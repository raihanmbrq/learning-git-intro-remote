package com.raihanmbrq;

// 1. PARENT CLASS: Berisi fungsi global browser yang bisa dipakai bersama
class BasePage {
    String browserUrl = "https://app.com";

    public void bukaBrowser() {
        System.out.println("Sistem: Membuka Google Chrome...");
        System.out.println("Sistem: Menuju URL -> " + browserUrl);
    }
}

// 2. CHILD CLASS: Mewarisi semua fungsi dari BasePage menggunakan kata
// 'extends'
class LoginPage extends BasePage {
    // Sifat khusus milik LoginPage saja
    String inputUsername = "admin";

    public void lakukanLogin() {
        System.out.println("Otomasi: Mengisi field username dengan: " + inputUsername);
        System.out.println("Otomasi: Menekan Tombol Submit.");
    }
}

// 3. MAIN CLASS: Tempat mengeksekusi program
public class MainOOP {
    public static void main(String[] args) {
        // Membuat Object dari Child Class
        LoginPage login = new LoginPage();

        // Memanggil fungsi dari Parent Class (Padahal tidak ditulis di dalam
        // LoginPage!)
        login.bukaBrowser();

        // Memanggil fungsi asli dari objek itu sendiri
        login.lakukanLogin();
    }
}
