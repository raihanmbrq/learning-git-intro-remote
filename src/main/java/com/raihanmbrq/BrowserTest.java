package com.raihanmbrq;


// Melakukan import library Selenium WebDriver
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
    public static void main(String[] args) {
        // 1. Inisialisasi WebDriver untuk Chrome (Otomatis membuka browser Chrome
        // kosong)
        WebDriver driver = new ChromeDriver();

        try {
            // 2. Maksimalkan ukuran layar browser
            driver.manage().window().maximize();

            // 3. Navigasi ke URL target pengujian
            String urlTarget = "https://www.google.com";
            System.out.println("QA Otomasi: Menuju ke " + urlTarget);
            driver.get(urlTarget);

            // 4. Mengambil Judul Halaman (Actual Result) untuk Asersi QA
            String actualTitle = driver.getTitle();
            String expectedTitle = "Google";

            System.out.println("QA Log: Judul halaman saat ini adalah -> " + actualTitle);

            // Logika Verifikasi (Asersi Dasar)
            if (actualTitle.equals(expectedTitle)) {
                System.out.println("[PASS] Verifikasi Judul Halaman Sesuai!");
            } else {
                System.out.println("[FAIL] Verifikasi Gagal! Judul aslinya: " + actualTitle);
            }

        } catch (Exception e) {
            System.out.println("Terjadi error saat otomatisasi: " + e.getMessage());
        } finally {
            // 5. Wajib Menutup Browser dan membersihkan memori RAM
            System.out.println("QA Log: Menutup browser...");
            driver.quit();
        }
    }
}
