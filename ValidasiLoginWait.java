import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

public class ValidasiLoginWait {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            String targetUrl = "https://www.wikipedia.org";
            driver.get(targetUrl);

            WebDriverWait tunggu = new WebDriverWait(driver, Duration.ofSeconds(12));

            System.out.println("Menunggu hingga elemen input pencarian muncul...");

            WebElement searchInput = tunggu.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchInput")));

            System.out.println("Elemen input pencarian ditemukan. Melanjutkan eksekusi...");

            searchInput.sendKeys("Automation Testing");

            WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));

            searchButton.click();

            tunggu.until(ExpectedConditions.or(
                    ExpectedConditions.urlContains("search=Automation+Testing"),
                    ExpectedConditions.urlContains("Test_automation"),
                    ExpectedConditions.titleContains("Automation Testing")));

            String currentUrl = driver.getCurrentUrl();
            System.out.println("QA Log: URL halaman saat ini adalah -> " + currentUrl);

            if (currentUrl.contains("search=Automation+Testing") || currentUrl.contains("Test_automation")
                    || currentUrl.contains("Automation_Testing")) {
                System.out.println("QA Log: Pencarian berhasil. Halaman hasil pencarian terbuka.");
            } else {
                throw new AssertionError("Halaman hasil pencarian tidak terbuka dengan benar: " + currentUrl);
            }
            Thread.sleep(2000); // Jeda sementara untuk pengamatan visual

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
