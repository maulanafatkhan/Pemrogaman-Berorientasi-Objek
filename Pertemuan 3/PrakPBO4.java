/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Praktikum4;

/**
 *
 * @author pathan
 */
public class PrakPBO4 {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Avanza", 180, "Bensin", 4);
        mobil.tampilkanInfoKendaraan();
        mobil.tampilkanInfoMobil();

        mobil.setNama("Innova");
        System.out.println("Nama baru: " + mobil.getNama());

        mobil.jenisMesin = "Diesel";
        System.out.println("Jenis mesin baru: " + mobil.jenisMesin);
    }
}
