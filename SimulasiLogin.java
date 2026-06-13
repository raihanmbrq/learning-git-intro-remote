public class SimulasiLogin {
    public static void main(String[] args) {
        int maksimumPercobaan = 3;

        // Simulasi perulangan user memasukkan PIN yang salah dari percobaan ke-1 sampai ke-3
        for (int percobaan = 1; percobaan <= maksimumPercobaan; percobaan++) {
            System.out.println("User memasukkan PIN salah. Percobaan ke-" + percobaan);

            // Jika percobaan sudah mencapai batas maksimal (3), maka akun diblokir
            if (percobaan == maksimumPercobaan) {
                System.out.println("VERIFIKASI QA: Akun berhasil TERBLOKIR demi keamanan.");
            } else {
                System.out.println("Sistem: PIN salah. Silakan coba lagi. Sisa kesempatan: " + (maksimumPercobaan - percobaan));
            }
            System.out.println("------------------------------------------------");
        }
    }
}