
# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah aplikasi simulasi pemesanan makanan cepat saji (`QuickMeal`) menggunakan bahasa pemrograman Java. Program ini merupakan tugas akhir dari mata kuliah **Pemrograman Berbasis Objek 1**.

## Deskripsi

Aplikasi ini memungkinkan pengguna untuk memesan makanan dari daftar menu yang tersedia. Program menerima input berupa data menu, jumlah pesanan, dan menghitung total harga pembelian. Program ini menerapkan konsep OOP seperti **Class**, **Object**, **Encapsulation**, **Constructor**, **Array**, **Perulangan**, **Input/Output**, dan **Error Handling**.

## Struktur Kode

### 1. `MenuItem` Class
Mewakili item makanan pada menu.

```java
public class MenuItem {
    private String nama;
    private double harga;
    ...
}
```

### 2. `PesananMakanan` Class
Mewakili pesanan pengguna (jumlah dan menu yang dipilih).

```java
public class PesananMakanan {
    private MenuItem item;
    private int jumlah;
    ...
}
```

### 3. `Transaksi` Class
Mengelola satu transaksi lengkap (bisa terdiri dari beberapa `PesananMakanan`).

```java
public class Transaksi {
    private String namaPelanggan;
    private PesananMakanan[] daftarPesanan;
    ...
}
```

### 4. `QuickMealMain` (Main Program)
Menjalankan aplikasi: menampilkan menu, menerima input, memproses pesanan, dan menampilkan ringkasan transaksi.

```java
public class QuickMealMain {
    public static void main(String[] args) {
        ...
    }
}
```

## Konsep OOP yang Digunakan

| Konsep OOP       | Implementasi                                                                 |
|------------------|------------------------------------------------------------------------------|
| **Class & Object**   | `MenuItem`, `PesananMakanan`, `Transaksi`, `QuickMealMain`                      |
| **Atribut**          | Semua class memiliki atribut `private` seperti `nama`, `harga`, `jumlah`, dsb.  |
| **Constructor**      | Semua class memiliki constructor untuk inisialisasi data.                       |
| **Encapsulation**    | Atribut disembunyikan menggunakan `private` dan diakses lewat getter/setter.    |
| **Mutator & Accessor** | Disediakan setter dan getter pada setiap class.                                |
| **Array**            | Array digunakan untuk menyimpan daftar pesanan dan menu.                        |
| **Perulangan**       | Digunakan saat menampilkan menu, input pesanan, dan total transaksi.            |
| **IO Sederhana**     | Menggunakan `Scanner` untuk input dan `System.out.println` untuk output.        |
| **Error Handling**   | Menggunakan `try-catch` untuk menangani input yang tidak valid.                 |

## Fitur Utama

- Menampilkan daftar menu makanan
- Memilih item makanan dan jumlahnya
- Menampilkan detail pesanan dan total harga
- Menangani input tidak valid dengan baik

## Catatan

> Program **belum menerapkan** konsep **Inheritance**, **Polymorphism**, dan **Seleksi (if/switch)** secara eksplisit. Fitur seperti kategori makanan, tipe pelanggan, atau logika diskon dapat ditambahkan untuk meningkatkan kompleksitas dan mencakup materi tambahan.

## Usulan Penilaian

| No  | Materi         | Nilai |
|:--:|----------------|:-----:|
| 1  | Class          |   5   |
| 2  | Object         |   5   |
| 3  | Atribut        |   5   |
| 4  | Constructor    |   5   |
| 5  | Mutator        |   5   |
| 6  | Accessor       |   5   |
| 7  | Encapsulation  |   5   |
| 8  | Inheritance    |   0   |
| 9  | Polymorphism   |   0   |
| 10 | Seleksi        |   0   |
| 11 | Perulangan     |   5   |
| 12 | IO Sederhana   |  10   |
| 13 | Array          |  15   |
| 14 | Error Handling |  15   |
|    | **TOTAL**      | **95**|

## Pembuat

Nama: Rehan Muhammad Akbar  
NPM: 2310010693
