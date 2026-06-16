import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigasiUji {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();

            String targetUrl = "https://www.google.com";
            driver.get(targetUrl);
            String actualTitle = driver.getTitle();
            String expectedTitle = "Google";
            System.out.println("QA Log: Judul halaman saat ini adalah -> " + actualTitle);
            Thread.sleep(2000); // Jeda sementara untuk pengamatan visual

            driver.navigate().to("https://www.wikipedia.org");
            System.out.println("QA Log: Navigasi ke Wikipedia, judul halaman saat ini adalah -> " + driver.getTitle());
            Thread.sleep(2000); // Jeda sementara untuk pengamatan visual

            driver.navigate().back();
            System.out.println("QA Log: Navigasi BACK, judul halaman saat ini adalah -> " + driver.getTitle());
            Thread.sleep(2000); // Jeda sementara untuk pengamatan visual

        } catch (Exception e) {
            System.out.println("Terjadi error saat inisialisasi WebDriver: " + e.getMessage());
        } finally {
            System.out.println("QA Log: NavigasiUji selesai.");
            if (driver != null) {
                driver.quit();
            }
        }
    }
}