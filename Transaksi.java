package pbo1.uas;

public class Transaksi {
    private int totalHarga;
    private int bayar;

    public Transaksi(int totalHarga, int bayar) {
        this.totalHarga = totalHarga;
        this.bayar = bayar;
    }

    public int hitungKembalian() {
        return bayar - totalHarga;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public int getBayar() {
        return bayar;
    }
}

