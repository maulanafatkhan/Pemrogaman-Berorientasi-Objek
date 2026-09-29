/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Tugas;

/**
 *
 * @author pathan
 */
import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {

    private List<Produk> daftarProduk;

    public KeranjangBelanja() {
        daftarProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

    public double hitungTotal() {

        double total = 0;

        for (Produk produk : daftarProduk) {
            double hargaSetelahDiskon =
                    produk.getHarga() - produk.hitungDiskon();

            total += hargaSetelahDiskon;
        }

        return total;
    }

    String hitungTotalSetelahDiskon() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}