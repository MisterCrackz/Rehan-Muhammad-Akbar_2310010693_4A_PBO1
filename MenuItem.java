/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo1.uas;
public class MenuItem {
    protected String nama;
    protected int harga;

    public MenuItem(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    // Polymorphism: method bisa dioverride
    public String deskripsi() {
        return nama + " seharga Rp" + harga;
    }
}
