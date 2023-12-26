/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.api.PelangganResiApi;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ZADO
 */
public class PelangganResi {

    private String username;
    private ArrayList<DataPelangganResi> listPelangganResi = new ArrayList<>();

    public PelangganResi(String username) throws SQLException {
        this.username = username;
        List<Map<String, Object>> data = new PelangganResiApi().findByUsername(username);
        getData(data);
    }

    private void getData(List<Map<String, Object>> data) {

        for (Map<String, Object> map : data) {
            DataPelangganResi hasil;
            hasil = new DataPelangganResi(username);
            if (map.containsKey("resi")) {
                hasil.setResi((int) map.get("resi"));
            }
            listPelangganResi.add(hasil);
        }

    }

    public ArrayList<DataPelangganResi> getListPelangganResi() {
        return listPelangganResi;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public static void main(String[] args) throws SQLException {
        PelangganResi p = new PelangganResi("zadobp");
        for (DataPelangganResi pelangganResi : p.getListPelangganResi()) {
            // Lakukan sesuatu dengan pelangganResi
            System.out.println(pelangganResi);
        }
    }

}
