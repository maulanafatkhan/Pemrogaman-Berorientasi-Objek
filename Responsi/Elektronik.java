/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ResponsiPBO;

/**
 *
 * @author pathan
 */
public class Elektronik extends Produk {
    private int garansi; // dalam tahun

    public Elektronik(String namaProduk, int harga, int garansi) {
        super(namaProduk, harga); // ngirim data ke kelas induk
        this.garansi = garansi;
    }

    public int getGaransi() {
        return garansi;
    }

    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // jalanin punya induk dulu (nama + harga)
        System.out.println("Garansi: " + garansi + " tahun");
    }
}
