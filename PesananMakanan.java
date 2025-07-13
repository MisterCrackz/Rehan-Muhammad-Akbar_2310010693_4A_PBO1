package pbo1.uas;

public class PesananMakanan extends MenuItem {
    private int jumlah;

    public PesananMakanan(String namaMakanan, int harga, int jumlah) {
        super(namaMakanan, harga);
        this.jumlah = jumlah;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int hitungTotalHarga() {
        return harga * jumlah;
    }

    @Override
    public String deskripsi() {
        return jumlah + " x " + nama + " = Rp" + hitungTotalHarga();
    }
}
