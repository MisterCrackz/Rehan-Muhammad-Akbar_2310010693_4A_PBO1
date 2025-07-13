package pbo1.uas;

import java.util.ArrayList;
import java.util.Scanner;

public class QuickMealMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<PesananMakanan> daftarPesanan = new ArrayList<>();

        System.out.println("=== Selamat datang di QuickMeal ===");

        while (true) {
            System.out.print("\nNama Makanan (ketik 'selesai' untuk berhenti): ");
            String nama = input.nextLine();
            if (nama.equalsIgnoreCase("selesai")) {
                break;
            }

            try {
                System.out.print("Harga: ");
                int harga = Integer.parseInt(input.nextLine());

                System.out.print("Jumlah: ");
                int jumlah = Integer.parseInt(input.nextLine());

                PesananMakanan pesanan = new PesananMakanan(nama, harga, jumlah);
                daftarPesanan.add(pesanan);
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid! Harus angka. Silakan coba lagi.");
            }
        }

        int totalHarga = 0;
        System.out.println("\n=== Daftar Pesanan ===");
        for (PesananMakanan pesanan : daftarPesanan) {
            System.out.println(pesanan.deskripsi());
            totalHarga += pesanan.hitungTotalHarga();
        }

        int bayar = 0;
        while (true) {
            try {
                System.out.print("\nTotal Harga: Rp" + totalHarga + "\nUang Dibayar: Rp");
                bayar = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka. Silakan coba lagi.");
            }
        }

        Transaksi transaksi = new Transaksi(totalHarga, bayar);
        int kembalian = transaksi.hitungKembalian();

        if (kembalian >= 0) {
            System.out.println("Kembalian: Rp" + kembalian);
            System.out.println("\n=== Terima kasih telah memesan di QuickMeal! ===");
        } else {
            System.out.println("Uang tidak cukup! Transaksi dibatalkan.");
        }

        input.close();
    }
}
