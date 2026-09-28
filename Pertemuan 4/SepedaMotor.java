/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package TugasModul5;

/**
 *
 * @author pathan
 */
public class SepedaMotor extends KendaraanDarat {

    String jenisMesin;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}