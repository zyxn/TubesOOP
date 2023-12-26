/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author ZADO
 */
public class Haversine {

    private static final double R = 6371.01; // Jari-jari bumi dalam kilometer

    /**
     * Menghitung jarak antara dua titik menggunakan rumus Haversine.
     *
     * @param slat Lintang titik awal dalam derajat desimal.
     * @param slon Bujur titik awal dalam derajat desimal.
     * @param elat Lintang titik akhir dalam derajat desimal.
     * @param elon Bujur titik akhir dalam derajat desimal.
     * @return Jarak antara dua titik dalam kilometer.
     */
    public static double jarak(double slat, double slon, double elat, double elon) {
        double dlon = Math.toRadians(elon - slon);
        double dlat = Math.toRadians(elat - slat);

        double a = Math.sin(dlat / 2) * Math.sin(dlat / 2)
                + Math.cos(Math.toRadians(slat)) * Math.cos(Math.toRadians(elat))
                * Math.sin(dlon / 2) * Math.sin(dlon / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return R * c;
    }

    public static void
            main(String[] args) {

        // Lintang dan bujur Jakarta
        double slat = -6.175031;
        double slon = 106.827119;

        // Lintang dan bujur Bandung
        double elat = -6.909869;
        double elon = 107.616981;

        // Menghitung jarak
        double jarak = Haversine.jarak(slat, slon, elat, elon);

        // Menampilkan hasil
        System.out.println("Jarak Jakarta-Bandung: " + jarak + " km");
    }
}
