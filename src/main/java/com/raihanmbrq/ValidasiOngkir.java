package com.raihanmbrq;

public class ValidasiOngkir {
    public static void main(String[] args) {
        double totalBelanja = 350000.0;
        double ongkir;
        if (totalBelanja < 500000) {
            ongkir = 20000;
        } else {
            ongkir = 0;
        }
        double Subtotal = totalBelanja + ongkir;

        System.out.println("Total Belanja: " + totalBelanja);
        System.out.println("Ongkir yang dikenakan: " + ongkir);
        System.out.println("Subtotal Transaksi: " + Subtotal);
    }
}
