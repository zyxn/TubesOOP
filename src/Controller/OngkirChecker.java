/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author ZADO
 */
public abstract class OngkirChecker {

    private final int berat;
    private final String lokasi1;
    private final String lokasi2;
    private final int fragile;

    public OngkirChecker(int berat, String lokasi1, String lokasi2, int fragile) {
        this.berat = berat;
        this.lokasi1 = lokasi1;
        this.lokasi2 = lokasi2;
        this.fragile = fragile;
    }

    public Ongkir orderChecker() {
        Ongkir ongkir = hitung();
        ongkir.hitungOngkir(berat, lokasi1, lokasi2, fragile);
        return ongkir;
    }

    public abstract Ongkir hitung();
}
