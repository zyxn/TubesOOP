/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author ZADO
 */
public class OngkirCheckerMakanan extends OngkirChecker {

    /**
     *
     * @param berat
     * @param lokasi1
     * @param lokasi2
     * @param fragile
     */
    public OngkirCheckerMakanan(int berat, String lokasi1, String lokasi2, int fragile) {
        super(berat, lokasi1, lokasi2, fragile);
    }

    @Override
    public Ongkir hitung() {
        return new OngkirMakanan();
    }

}
