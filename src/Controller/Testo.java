/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author ZADO
 */
public class Testo {

    public static void main(String[] args) {
        OngkirChecker cekOngkirChecker = new OngkirCheckerBarang(3, "Bandung", "Kediri", 1);
        Ongkir tipeBarangOngkir = cekOngkirChecker.orderChecker();
        System.out.println("" + tipeBarangOngkir.getTotal());

        OngkirChecker cekOngkirChecker2 = new OngkirCheckerMakanan(1, "Bandung", "Jakarta", 0);
        Ongkir tipeBarangOngkir2 = cekOngkirChecker2.orderChecker();
        System.out.println("" + tipeBarangOngkir2.getTotal());

        OngkirChecker cekOngkirChecker3 = new OngkirCheckerDokumen(1, "Bandung", "Jakarta", 1);
        Ongkir tipeBarangOngkir3 = cekOngkirChecker3.orderChecker();
        System.out.println("" + tipeBarangOngkir3.getTotal());

    }
}
