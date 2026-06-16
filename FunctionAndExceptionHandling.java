public class FunctionAndExceptionHandling {

    // 1. Membuat Method Reusable untuk simulasi klik tombol
    public static void klikTombol(String namaTombol) {
        try {
            System.out.println("Mencoba mengklik tombol: " + namaTombol);

            // Simulasi kondisi: Jika tombol yang dicari adalah "Tombol Ghaib", anggap error
            // terjadi
            if (namaTombol.equals("Tombol Ghaib")) {
                throw new Exception("ElementNotVisibleException: Elemen tidak ditemukan di halaman!");
            }

            // Jika tidak ada error
            System.out.println("SUKSES: Tombol '" + namaTombol + "' berhasil diklik.");

        } catch (Exception e) {
            // Menangkap error agar program tidak crash
            System.out.println("PROSES QA GAGAL: Terjadi error saat klik -> " + e.getMessage());
            System.out.println("Sistem QA: Mengambil screenshot halaman untuk laporan bug...");
        }
        System.out.println("------------------------------------------------");
    }

    public static void main(String[] args) {
        // Memanggil fungsi klik untuk skenario normal
        klikTombol("Login");

        // Memanggil fungsi klik untuk skenario yang memicu error
        klikTombol("Tombol Ghaib");

        klikTombol("Asik");

        // Membuktikan bahwa program TIDAK crash dan tetap bisa berjalan sampai baris
        // akhir
        System.out.println("Selesai: Seluruh rangkaian eksekusi test selesai dieksekusi.");
    }
}