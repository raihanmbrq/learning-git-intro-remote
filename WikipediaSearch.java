import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaSearch {
    public static void main(String[] args) {
        WebDriver driver = null;
        try {
            driver = new ChromeDriver();
            driver.manage().window().maximize();

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

            // Melakukan pencarian di Wikipedia
            WebElement searchInput = driver.findElement(By.id("searchInput"));
            searchInput.sendKeys("Software testing");
            searchInput.sendKeys(org.openqa.selenium.Keys.ENTER);
            Thread.sleep(5000); // Tunggu sebentar untuk hasil pencarian muncul

            // Verifikasi hasil pencarian
            String searchResultTitle = driver.getTitle();
            String expectedSearchResultTitle = "Software testing - Wikipedia";

            System.out.println("QA Log: Judul halaman hasil pencarian adalah -> " + searchResultTitle);

            if (searchResultTitle.equals(expectedSearchResultTitle)) {
                System.out.println("QA Log: Pencarian berhasil. Judul hasil pencarian sesuai.");
            } else {
                System.out.println("QA Log: Pencarian gagal. Judul hasil pencarian tidak sesuai.");
            }

        } catch (Exception e) {
            System.out.println("Terjadi error saat otomatisasi: " + e.getMessage());
        } finally {
            System.out.println("QA Log: Otomatisasi selesai.");
            driver.quit(); // Uncomment this line if you want to close the browser at the
            // end
        }
    }
}
