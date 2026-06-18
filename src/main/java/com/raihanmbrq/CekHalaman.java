package com.raihanmbrq;

public class CekHalaman {
    public static void main(String[] args) {
        int maksimumCek = 6;

        for (int percobaan = 1; percobaan <= maksimumCek; percobaan++) {
            if (percobaan == maksimumCek) {
                System.out.println("Validasi Seluruh Data Telah Dilakukan.");
            } else {
                System.out.println("Memeriksa data pada halaman ke -" + percobaan);
            }
        }
    }
}
