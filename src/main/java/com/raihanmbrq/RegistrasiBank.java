package com.raihanmbrq;

public class RegistrasiBank {
    public static void main(String[] args) {
        // 1. Deklarasikan variabel untuk Nama Lengkap (John Doe)
        String NamaLengkap = "John Doe";

        // 2. Deklarasikan variabel untuk Umur (27)
        int umur = 27;

        // 3. Deklarasikan variabel untuk Saldo Awal Deposit (500000.75)
        double SaldoAwal = 500000.75;

        // 4. Deklarasikan variabel untuk Status Nasabah Baru (true)
        boolean NasabahBaru = true;

        // 5. Buat variabel boolean 'isEligibleForBonus'
        // yang membandingkan: Apakah umur lebih besar dari 25?
        boolean isEligibleForBonus = umur > 25;

        // 6. Cetak semua variabel ke terminal menggunakan System.out.println()
        System.out.println("Nama Lengkap: " + NamaLengkap);
        System.out.println("Umur : " + umur);
        System.out.println("Saldo Awal : " + SaldoAwal);
        System.out.println("Apakah " + NamaLengkap + "adalah nasabah baru? " + NasabahBaru);
        System.out.println("Apakah menerima bonus? " + isEligibleForBonus);
    }
}
