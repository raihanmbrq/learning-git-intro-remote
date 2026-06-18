import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class UjiFormAdvanced {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            driver.get("https://www.wikipedia.org");

            Thread.sleep(2000); // Tunggu sebentar untuk memastikan halaman sudah dimuat

            // Cek current dropdown value sebelum memilih Bahasa Indonesia
            WebElement languageDropdown = driver.findElement(By.id("searchLanguage"));
            Select select = new Select(languageDropdown);

            String currentLanguage = select.getFirstSelectedOption().getText();
            System.out.println("Current selected language: " + currentLanguage);

            select.selectByValue("id");

            if (select.getFirstSelectedOption().getText().equals("Bahasa Indonesia")) {
                System.out.println("Dropdown berhasil dipilih: Bahasa Indonesia");
            } else {
                System.out.println("Gagal memilih dropdown: Bahasa Indonesia");
            }

            Thread.sleep(3000); // Tunggu sebentar untuk melihat perubahan

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
