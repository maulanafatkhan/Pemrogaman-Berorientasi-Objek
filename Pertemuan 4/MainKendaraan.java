/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package TugasModul5;

/**
 *
 * @author pathan
 */
public class MainKendaraan {

    public static void main(String[] args) {

        System.out.println("=== MOBIL ===");

        Mobil mobil = new Mobil();
        mobil.nama = "Toyota Xenia";
        mobil.kecepatan = 500;
        mobil.jumlahRoda = 4;
        mobil.jumlahPintu = 4;

        mobil.tampilkanInfo();

        System.out.println();

        System.out.println("=== SEPEDA MOTOR ===");

        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Yamaha Vario";
        motor.kecepatan = 250;
        motor.jumlahRoda = 2;
        motor.jenisMesin = "4Cylinder";

        motor.tampilkanInfo();
    }
}
