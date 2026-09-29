/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Tugas;

/**
 *
 * @author pathan
 */
public class Main {

    public static void main(String[] args) {

        Buku buku = new Buku("LeMinerale", 100000);

        Elektronik elektronik =
                new Elektronik("LEGION", 300000);

        Pakaian pakaian =
                new Pakaian("Sarung", 200000);

        KeranjangBelanja keranjang =
                new KeranjangBelanja();

        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);

        System.out.println("Nama Produk dan Diskon");
        System.out.println("----------------------");

        System.out.println(
                buku.getNama() + " : Rp" +
                buku.hitungDiskon()
        );

        System.out.println(
                elektronik.getNama() + " : Rp" +
                elektronik.hitungDiskon()
        );

        System.out.println(
                pakaian.getNama() + " : Rp" +
                pakaian.hitungDiskon()
        );

        System.out.println("----------------------");

        System.out.println(
                "Total setelah diskon : Rp" +
                keranjang.hitungTotal()
        );
    }
}