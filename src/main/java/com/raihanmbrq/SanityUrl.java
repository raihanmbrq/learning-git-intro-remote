package com.raihanmbrq;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SanityUrl {
    public static void main(String[] args) {
        WebDriver driver = null;
        try {
            driver = new ChromeDriver();

            String targetUrl = "https://www.wikipedia.org";
            System.out.println("QA Otomasi: Menuju ke " + targetUrl);
            driver.get(targetUrl);

            String actualTitle = driver.getTitle();
            String expectedTitle = "Wikipedia";

            System.out.println("QA Log: Judul halaman saat ini adalah -> " + actualTitle);

            if (actualTitle.equals(expectedTitle)) {
                System.out.println("QA Log: Sanity test berhasil. Judul sesuai.");
            } else {
                System.out.println("QA Log: Sanity test gagal. Judul tidak sesuai.");
            }

        } catch (Exception e) {
            System.out.println("Terjadi error saat sanity test: " + e.getMessage());
        } finally {
            System.out.println("QA Log: Sanity test selesai.");
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
