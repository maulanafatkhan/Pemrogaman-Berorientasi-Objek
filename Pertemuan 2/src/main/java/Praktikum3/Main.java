/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Praktikum3;

/**
 *
 * @author pathan
 */
public class Main {
    public static void main(String[] args) {

        Mobil mobil1 = new Mobil("Toyota", "Xenia", 2022);
        Mobil mobil2 = new Mobil("Honda", "Alphard", 2023);

        mobil1.setWarna("Hitam");
        mobil2.setWarna("Putih");

        mobil1.displayInfo();
        mobil1.startEngine();

        mobil2.displayInfo();
        mobil2.startEngine();
    }
}
