/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ResponsiPBO;

/**
 *
 * @author pathan
 */
public class Produk {
    // atribut dikunci private (enkapsulasi)
    private String namaProduk;
    private int harga;

    // constructor: jalan otomatis pas new Produk(...)
    public Produk(String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    // getter: buat baca nilai
    public String getNamaProduk() {
        return namaProduk;
    }

    public int getHarga() {
        return harga;
    }

    // setter: buat ubah nilai
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    // metode buat nampilin data
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
    }
}
