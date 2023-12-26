/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.api.LokasiApi;
import java.sql.SQLException;
import java.util.Map;

/**
 *
 * @author ZADO
 */
public class Lokasi {

    private int idLokasi;
    private String namaLokasi;
    private double latitude;
    private double longitude;

    public Lokasi(String namaLokasi) throws SQLException {
        this.namaLokasi = namaLokasi;
        Map<String, Object> data = new LokasiApi().findByLokasi(namaLokasi).getFirst();
        getData(data);
    }

    public Lokasi(Lokasi lokasi1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void getData(Map<String, Object> data) {
        if (data.containsKey("idlokasi")) {
            this.idLokasi = (int) data.get("idlokasi");
        }

        if (data.containsKey("nama_lokasi")) {
            this.namaLokasi = (String) data.get("nama_lokasi");
        }

        if (data.containsKey("latitude")) {
            this.latitude = (float) data.get("latitude");
        }

        if (data.containsKey("longitude")) {
            this.longitude = (float) data.get("longitude");
        }
    }

    public int getIdLokasi() {
        return idLokasi;
    }

    public void setIdLokasi(int idLokasi) {
        this.idLokasi = idLokasi;
    }

    public String getNamaLokasi() {
        return namaLokasi;
    }

    public void setNamaLokasi(String namaLokasi) {
        this.namaLokasi = namaLokasi;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lokasi{");
        sb.append("idLokasi=").append(idLokasi);
        sb.append(", namaLokasi=").append(namaLokasi);
        sb.append(", latitude=").append(latitude);
        sb.append(", longitude=").append(longitude);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) throws SQLException {
        Lokasi loc = new Lokasi("Depok");
        System.out.println(loc);
    }

}
