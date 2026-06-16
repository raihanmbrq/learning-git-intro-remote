public class ValidasiAsersi {
    public static void validasiTeks(String actual, String expected) {
        try {
            if (actual.equals(expected)) {
                System.out.println("[PASS] Validasi Cocok: Teks aktual '" + actual
                        + "' sesuai dengan teks yang diharapkan '" + expected + "'.");
            } else {
                throw new Exception("Teks aktual '" + actual + "' tidak sesuai dengan teks yang diharapkan '"
                        + expected + "'.");
            }
        } catch (Exception e) {
            System.out.println("[FAIL] Test Gagal Karena: " + e.getMessage());
        }
        System.out.println("------------------------------------------------");
    }

    public static void main(String[] args) {
        // Contoh validasi teks yang benar
        validasiTeks("Dashboard", "Dashboard");

        // Contoh validasi teks yang salah
        validasiTeks("Profile Menu", "Edit Profile");

        System.out.println("Selesai: Seluruh rangkaian eksekusi test selesai dieksekusi.");
    }
}
