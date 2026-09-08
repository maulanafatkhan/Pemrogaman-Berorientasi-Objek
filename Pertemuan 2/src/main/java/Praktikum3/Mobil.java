/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Praktikum3;

/**
 *
 * @author pathan
 */
public class Mobil {
    private String merk;
    private String model;
    private int tahun;
    private String warna;

    public Mobil(String merk, String model, int tahun) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    void displayInfo() {
        System.out.println("Merk  : " + merk);
        System.out.println("Model : " + model);
        System.out.println("Tahun : " + tahun);
        System.out.println("Warna : " + warna);
    }

    void startEngine() {
        System.out.println("Mesin mobil " + merk + " menyala");
    }
}