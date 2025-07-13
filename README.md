# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah aplikasi sederhana simulasi pemesanan makanan *QuickMeal* yang dibuat menggunakan bahasa pemrograman Java. Program ini merupakan tugas akhir dari mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama pelanggan, status member (ya/tidak), detail pesanan makanan (nama item, jumlah, harga satuan), dan akan menampilkan detail transaksi termasuk total harga dan diskon (jika berlaku).

Program ini menerapkan beberapa konsep utama dalam Pemrograman Berbasis Objek (OOP) seperti Class, Object, Atribut, Constructor, Mutator (setter), Accessor (getter), Encapsulation, Array, Perulangan, IO sederhana, Seleksi (if), dan Error Handling.

## Struktur Kode

### 1. Class

Terdapat tiga class utama:
- `PesananMakanan`: merepresentasikan satu item makanan.
- `Transaksi`: menyimpan detail transaksi pengguna, termasuk apakah pengguna adalah member.
- `QuickMealMain`: class `main` yang menjalankan seluruh alur aplikasi.

### 2. Object

Object `PesananMakanan` dibuat untuk setiap item yang dipesan dan disimpan dalam array. Object `Transaksi` menyimpan seluruh data pemesanan dan status member.

### 3. Atribut

Contoh atribut pada `PesananMakanan`:

```java
private String namaItem;
private int jumlah;
private double harga;
```

Contoh atribut pada `Transaksi`:

```java
private String namaPelanggan;
private boolean isMember;
private PesananMakanan[] daftarPesanan;
```

### 4. Constructor

Digunakan untuk inisialisasi object:

```java
public PesananMakanan(String namaItem, int jumlah, double harga) { ... }
public Transaksi(String namaPelanggan, boolean isMember, PesananMakanan[] daftarPesanan) { ... }
```

### 5. Mutator (Setter) & 6. Accessor (Getter)

Setiap class memiliki method getter dan setter untuk setiap atribut.

### 7. Encapsulation

Semua atribut diset `private` dan diakses melalui getter/setter, menerapkan prinsip encapsulation.

### 8. Perulangan

Perulangan digunakan untuk input data pesanan dan mencetak output:

```java
for (int i = 0; i < jumlahPesanan; i++) {
    ...
}
```

### 9. Input Output Sederhana

Menggunakan `Scanner` untuk input data:

```java
Scanner input = new Scanner(System.in);
System.out.print("Nama Pelanggan: ");
String nama = input.nextLine();
```

### 10. Seleksi (If)

Digunakan untuk pengecekan status member dan pemberian diskon:

```java
if (isMember) {
    return total * 0.9; // Diskon 10%
}
```

### 11. Array

Array digunakan untuk menyimpan beberapa pesanan:

```java
PesananMakanan[] daftarPesanan = new PesananMakanan[jumlahPesanan];
```

### 12. Error Handling

Menggunakan try-catch untuk validasi input numerik:

```java
try {
    harga = input.nextDouble();
} catch (InputMismatchException e) {
    System.out.println("Input harga tidak valid.");
}
```

## Catatan

> Program ini belum menggunakan konsep **Inheritance** dan **Polymorphism**. Konsep ini dapat diterapkan di versi lanjutan, seperti membuat subclass `MemberTransaksi` atau `NonMemberTransaksi` untuk diskon spesifik.

## Usulan Nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    0    |
|  9  | Polymorphism   |    0    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Rehan Muhammad Akbar  
NPM: 2310010693
