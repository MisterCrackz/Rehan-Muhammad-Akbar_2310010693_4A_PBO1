// Superclass
class User {
    protected String nama;
    protected String alamat;

    public User(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
}

// Subclass Customer
class Customer extends User {
    public Customer(String nama, String alamat) {
        super(nama, alamat);
    }

    public void tampilkanProfil() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
    }
}

// Class Makanan
class Makanan {
    private String nama;
    private int harga;
    private int stok;

    public Makanan(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void kurangiStok() {
        if (stok > 0) {
            stok--;
        }
    }
}

// Class Pesanan
class Pesanan {
    private Makanan[] daftarPesanan;
    private int total;
    private int index;

    public Pesanan() {
        daftarPesanan = new Makanan[10];
        index = 0;
        total = 0;
    }

    public void tambahMakanan(Makanan mkn) {
        if (mkn.getStok() > 0) {
            daftarPesanan[index++] = mkn;
            total += mkn.getHarga();
            mkn.kurangiStok();
            System.out.println(mkn.getNama() + " ditambahkan ke pesanan.");
        } else {
            System.out.println("Maaf, " + mkn.getNama() + " sedang habis.");
        }
    }

    public void tampilkanPesanan() {
        System.out.println("\n=== Ringkasan Pesanan Anda ===");
        for (int i = 0; i < index; i++) {
            System.out.println("- " + daftarPesanan[i].getNama() + " : Rp" + daftarPesanan[i].getHarga());
        }
        System.out.println("Total Bayar: Rp" + total);
    }
}
