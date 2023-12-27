/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.DataPelangganResi;
import Model.Pelanggan;
import Model.PelangganResi;
import Model.Pengiriman;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ZADO
 */
public class Profile {

    Pelanggan user;
    PelangganResi allResi;
    ArrayList<Pengiriman> kirim;

    public Profile(String nama, String Password) throws SQLException {
        this.kirim = new ArrayList<>();
        this.user = new Pelanggan(nama, Password);
        try {
            this.allResi = new PelangganResi(nama);
            addPengiriman();
        } catch (Exception e) {
            this.kirim = null;
        }
    }

    private void addPengiriman() throws SQLException {
        ArrayList<DataPelangganResi> list;
        list = allResi.getListPelangganResi();
        for (DataPelangganResi data : list) {
            kirim.add(new Pengiriman(data.getResi()));
        }
    }

    public ArrayList<Pengiriman> getPengiriman() {
        return kirim;
    }

    public Pelanggan getUser() {
        return user;
    }

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws SQLException {
        Profile p = new Profile("Username", "katasabndi");
        System.out.println(p.getUser());;
    }

}
