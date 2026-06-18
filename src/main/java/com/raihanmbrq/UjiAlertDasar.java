package com.raihanmbrq;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;

public class UjiAlertDasar {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            driver.get("https://demoqa.com/alerts");

            Thread.sleep(2000); // Tunggu sebentar untuk memastikan halaman sudah dimuat
            driver.findElement(By.id("alertButton")).click();

            Thread.sleep(3000); // Tunggu sebentar untuk melihat perubahan

            Alert alert = driver.switchTo().alert();

            String alertText = alert.getText();
            System.out.println("Alert text: " + alertText);

            alert.accept(); // Klik tombol OK pada alert

            Thread.sleep(3000); // Tunggu sebentar untuk melihat perubahan

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
