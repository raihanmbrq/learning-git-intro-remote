package com.raihanmbrq;

public class Latihan1 {
    public static void main(String[] args) {
        // 1. Menyimpan data produk (Tipe Data String)
        String productName = "Apple iPhone 15 Pro";

        // 2. Menyimpan harga produk (Tipe Data double karena ada desimal)
        double productPrice = 999.99;

        // 3. Menyimpan jumlah item yang dibeli (Tipe Data int)
        int quantity = 2;

        // 4. Menyimpan status kupon diskon (Tipe Data boolean)
        boolean isCouponApplied = true;

        // Melakukan kalkulasi total harga menggunakan Arithmetic Operator (*)
        double totalCost = productPrice * quantity;

        // Menampilkan data ke console (Log output)
        System.out.println("Nama Produk: " + productName);
        System.out.println("Total Pembayaran: $" + totalCost);
        System.out.println("Apakah Diskon Aktif? " + isCouponApplied);
    }
}
