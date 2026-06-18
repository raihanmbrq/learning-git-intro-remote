import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

public class TestLoginFail {
    public static void main(String[] args) {
        WebDriver driver = null;
        try {
            driver = new ChromeDriver();
            driver.manage().window().maximize();

            String targetUrl = "https://edujob-fe-stg-0743.up.railway.app/jobseeker";
            System.out.println("QA Otomasi: Menuju ke " + targetUrl);
            driver.get(targetUrl);

            // Verifikasi halaman login terbuka
            String actualTitle = driver.getTitle();
            String expectedTitle = "Edukasi Jobs";

            System.out.println("QA Log: Judul halaman saat ini adalah -> " + actualTitle);

            WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(),'Log In')]"));
            loginButton.click();
            Thread.sleep(2000); // Jeda sementara untuk pengamatan visual

            WebElement emailInput = driver.findElement(By.id("email"));
            emailInput.sendKeys("hansjobseeker4@yopmail.com");
            WebElement passwordInput = driver.findElement(By.id("password"));
            passwordInput.sendKeys("rules122");
            Thread.sleep(2000); // Jeda sementara untuk pengamatan visual

            WebElement submitButton = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
            submitButton.click();
            Thread.sleep(5000); // Jeda sementara untuk pengamatan visual

            WebElement errorMessage = driver
                    .findElement(By.xpath("//span[contains(text(),'Incorrect email or password')]"));
            Thread.sleep(2000); // Jeda sementara untuk pengamatan visual
            if (errorMessage.isDisplayed()) {
                System.out.println("QA Log: Login gagal seperti yang diharapkan. Pesan error ditampilkan.");
            } else {
                System.out.println("QA Log: Login tidak gagal seperti yang diharapkan. Pesan error tidak ditemukan.");
            }

        } catch (Exception e) {
            System.out.println("Terjadi error saat otomatisasi: " + e.getMessage());
        } finally {
            System.out.println("QA Log: Otomatisasi selesai.");
            if (driver != null) {
                driver.quit();
            }
        }
    }
}