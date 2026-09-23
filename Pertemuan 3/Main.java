/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Praktikum4;

/**
 *
 * @author pathan
 */
public class Main {
    public static void main(String[] args) {
        Pekerja p = new Pekerja("Pathan", 99, "PNS", 8000000);
        System.out.println(p.toString());

        p.setNama("Jefri");
        System.out.println(p.toString());
        
        //System.out.println(p.nama);
        //System.out.println(p.usia);
        //System.out.println(p.gaji);
    }
}