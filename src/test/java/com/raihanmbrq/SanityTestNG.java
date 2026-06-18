package com.raihanmbrq;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

public class SanityTestNG {

    WebDriver driver; // Deklarasikan di luar agar bisa diakses semua metode

    @BeforeMethod
    public void bukaAplikasi() {
        System.out.println("TESTNG SETUP: Membuka aplikasi...");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
    }

    @Test
    public void cekJudulGoogle() {
        driver.getTitle();
        System.out.println("TESTNG SKENARIO: Cek judul halaman Google...");
        System.out.println("Judul halaman: " + driver.getTitle());
    }

    @AfterMethod
    public void tutupAplikasi() {
        System.out.println("TESTNG CLEANUP: Menutup aplikasi...");
        if (driver != null) {
            driver.quit();
        }
    }

}
