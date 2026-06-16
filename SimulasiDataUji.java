import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimulasiDataUji {
    public static void main(String[] args) {
        // SCENARIO 1: Menyimpan daftar menu Navbar yang harus divalidasi (List)
        List<String> expectedMenus = new ArrayList<>();
        expectedMenus.add("Home");
        expectedMenus.add("Products");
        expectedMenus.add("Cart");

        System.out.println("QA Log: Total menu yang harus dicek: " + expectedMenus.size());
        System.out.println("Menu pertama wajib bernilai: " + expectedMenus.get(0));
        System.out.println("----------------------------------------");

        // SCENARIO 2: Menyimpan data kredensial login akun QA (Map)
        Map<String, String> testData = new HashMap<>();
        testData.put("url", "https://kancil-bank.com/login");
        testData.put("username", "raihan_qa");
        testData.put("status", "Active");

        // Cara QA mengambil data spesifik untuk dimasukkan ke form simulator
        System.out.println("Otomasi: Navigasi ke URL -> " + testData.get("url"));
        System.out.println("Otomasi: Input field username -> " + testData.get("username"));
        System.out.println("QA Verifikasi: Status akun target -> " + testData.get("status"));
    }
}