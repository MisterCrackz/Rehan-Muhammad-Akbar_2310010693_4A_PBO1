import java.util.Scanner;

public class GrabfoodMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Aplikasi GrabFood ===");

        // Input user
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();
        System.out.print("Masukkan alamat Anda: ");
        String alamat = input.nextLine();

        Customer cust = new Customer(nama, alamat);
        System.out.println("\n=== Profil Pelanggan ===");
        cust.tampilkanProfil();
        
        Makanan[] daftarMakanan = {
            new Makanan("Nasi Goreng", 15000, 5),
            new Makanan("Mie Ayam", 12000, 3),
            new Makanan("Sate Ayam", 20000, 2),
            new Makanan("Soto Banjar", 18000, 4),
            new Makanan("Mie Habang", 14000, 3)
    };


        Pesanan pesanan = new Pesanan();

        while (true) {
            System.out.println("\n=== Menu Makanan GrabFood ===");
            for (int i = 0; i < daftarMakanan.length; i++) {
                System.out.println((i + 1) + ". " + daftarMakanan[i].getNama() + " - Rp" +
                    daftarMakanan[i].getHarga() + " [Stok: " + daftarMakanan[i].getStok() + "]");
            }

            System.out.print("Pilih nomor makanan (0 untuk selesai): ");
            int pilih;

            try {
                pilih = input.nextInt();

                if (pilih == 0) break;
                if (pilih > 0 && pilih <= daftarMakanan.length) {
                    pesanan.tambahMakanan(daftarMakanan[pilih - 1]);
                } else {
                    System.out.println("Pilihan tidak valid.");
                }

            } catch (Exception e) {
                System.out.println("Input salah, masukkan angka!");
                input.nextLine(); // Bersihkan buffer
            }
        }

        pesanan.tampilkanPesanan();
        System.out.println("Terima kasih telah menggunakan GrabFood!");
    }
}

      