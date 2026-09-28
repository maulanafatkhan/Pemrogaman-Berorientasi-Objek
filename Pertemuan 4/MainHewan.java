/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package TugasModul5;

/**
 *
 * @author pathan
 */
public class MainHewan {

    public static void main(String[] args) {

        Kucing kucing = new Kucing();
        kucing.nama = "Supri";
        kucing.jenis = "Kucing Jawa";

        System.out.println("=== KUCING ===");
        kucing.tampilkanInfo();
        kucing.suara();

        System.out.println();

        Anjing anjing = new Anjing();
        anjing.nama = "Rois";
        anjing.jenis = "Golden Retriever";

        System.out.println("=== ANJING ===");
        anjing.tampilkanInfo();
        anjing.suara();
    }
}
