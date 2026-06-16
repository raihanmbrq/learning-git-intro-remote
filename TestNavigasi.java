import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNavigasi {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.manage().window().maximize();

            // 1. Buka Halaman Utama Beranda
            System.out.println("QA Otomasi: Membuka Beranda Toko...");
            driver.get("https://www.wikipedia.org"); // Menggunakan wiki sebagai contoh sandbox privat

            // 2. Berpindah ke halaman lain menggunakan navigate().to() agar riwayat
            // tersimpan
            System.out.println("QA Otomasi: Pindah ke halaman Donasi...");
            driver.navigate().to("https://donate.wikipedia.org");
            Thread.sleep(2000); // Jeda sementara untuk pengamatan visual

            // 3. Skenario Uji: Klik BACK untuk kembali ke Beranda utama
            System.out.println("Skenario QA: Mengetes tombol BACK...");
            driver.navigate().back();
            System.out.println("Verifikasi: URL saat ini seharusnya kembali ke awal -> " + driver.getCurrentUrl());
            Thread.sleep(2000);

            // 4. Skenario Uji: Klik REFRESH untuk memuat ulang halaman
            System.out.println("Skenario QA: Mengetes fungsi REFRESH halaman...");
            driver.navigate().refresh();
            Thread.sleep(2000);

        } catch (Exception e) {
            System.out.println("Terjadi kendala: " + e.getMessage());
        } finally {
            System.out.println("QA Log: Sesi selesai, mematikan browser.");
            driver.quit();
        }
    }
}