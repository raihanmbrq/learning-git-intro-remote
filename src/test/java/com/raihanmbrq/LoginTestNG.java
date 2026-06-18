package com.raihanmbrq;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestNG {
    WebDriver driver; // Deklarasikan di luar agar bisa diakses semua metode

    @BeforeMethod
    public void setupBrowser() {
        System.out.println("TESTNG SETUP: Membuka browser Chrome...");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testSkenarioValidLogin() {
        System.out.println("TESTNG SKENARIO: Jalankan tes login dengan akun valid...");
        driver.get("https://www.wikipedia.org");
        // Di sini nanti tempat menaruh findElement().click() dll bray
    }

    @AfterMethod
    public void teardownBrowser() {
        System.out.println("TESTNG CLEANUP: Menutup browser dengan bersih.");
        if (driver != null) {
            driver.quit();
        }
    }
}
