/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tugas10;

/**
 *
 * @author pathan
 */
// Kelas Main
// Kelas Main
public class Main {

    public static void main(String[] args) {

        // Membuat objek Elektronik
        Pembayaran elektronik = new Elektronik();
        double pajakElektronik = elektronik.hitungPajak(1000000);

        // Membuat objek Makanan
        Pembayaran makanan = new Makanan();
        double pajakMakanan = makanan.hitungPajak(100000);

        // Menampilkan hasil perhitungan pajak
        System.out.println("Pajak Elektronik: Rp" + pajakElektronik);
        System.out.println("Pajak Makanan: Rp" + pajakMakanan);
    }
}