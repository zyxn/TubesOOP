/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Lokasi;
import Model.Produk;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ZADO
 */
public class OngkirMakanan implements Ongkir {

    private String total;

    /**
     *
     * @param berat
     * @param lokasi1
     * @param lokasi2
     * @param fragile
     */
    @Override
    public void hitungOngkir(int berat, String lokasi1, String lokasi2, int fragile) {
        try {
            Lokasi loc1 = new Lokasi(lokasi1);
            Lokasi loc2 = new Lokasi(lokasi2);
            float HargaKg;
            HargaKg = new Produk(1).getHargaSatuan();
            float fragilePercentage = (float) 1.1;
            boolean fragileBool = (fragile == 1);
            double jarak = Haversine.jarak(loc1.getLatitude(), loc1.getLongitude(), loc2.getLatitude(), loc2.getLongitude());
            if (fragileBool) {
                if (jarak <= 50) {
                    this.total = "" + HargaKg * fragilePercentage;
                } else {
                    double jarakFix = jarak - 50;
                    float hargaJarak = (float) (HargaKg + (jarakFix / 25) * 750);
                    float hargaTotal = (float) ((hargaJarak * berat) * fragilePercentage);
                    this.total = "" + hargaTotal;
                }
            } else {
                if (jarak <= 50) {
                    this.total = "" + HargaKg;
                } else {
                    double jarakFix = jarak - 50;
                    float hargaJarak = (float) (HargaKg + (jarakFix / 25) * 750);
                    float hargaTotal = (float) ((hargaJarak * berat));
                    this.total = "" + hargaTotal;
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(OngkirBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getTotal() {
        return total;
    }

}
