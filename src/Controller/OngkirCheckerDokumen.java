/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author ZADO
 */
public class OngkirCheckerDokumen extends OngkirChecker {

    public OngkirCheckerDokumen(int berat, String lokasi1, String lokasi2, int fragile) {
        super(berat, lokasi1, lokasi2, fragile);
    }

    @Override
    public Ongkir hitung() {
        return new OngkirDokumen();
    }

}
