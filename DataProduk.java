import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataProduk {
    public static void main(String[] args) {
        Map<String, String> productDetail = new HashMap<>();
        productDetail.put("nama", "Laptop AMD Ryzen 5");
        productDetail.put("harga", "Rp 8.500.000");
        productDetail.put("stok", "Tersedia");

        System.out.println("[INFO PRODUK] Nama Barang: " + productDetail.get("nama"));
        System.out.println("[INFO PRODUK] Harga Produk: " + productDetail.get("harga"));
        System.out.println("[INFO PRODUK] Stok Produk: " + productDetail.get("stok"));
    }
}
