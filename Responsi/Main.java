/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ResponsiPBO;

/**
 *
 * @author pathan
 */
public class Main {
    public static void main(String[] args) {

        // 1. Output Produk
        System.out.println("1. Output Produk");
        Produk produk1 = new Elektronik("iPhone", 15000000, 2);
        produk1.tampilkanInfo();
        System.out.println();

        // 2. Output Pegawai
        System.out.println("2. Output Pegawai");
        Pegawai pegawai1 = new PegawaiTetap("Maul", 5000000, 1000000);
        pegawai1.tampilkanInfo();
        System.out.println();

        // 3. Output Polimorfisme
        System.out.println("3. Output Polimorfisme");
        Produk produk2 = new Makanan("Cipak", 5000, "2026-09-30");
        Pegawai pegawai2 = new PegawaiKontrak("Pathan", 3000000, 12);
        produk2.tampilkanInfo();
        pegawai2.tampilkanInfo();
    }
}