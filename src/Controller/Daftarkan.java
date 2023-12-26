/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Pelanggan;
import java.sql.SQLException;

/**
 *
 * @author ZADO
 */
public class Daftarkan {

    private final String username;
    private final String password;
    private final String nama;
    private final String alamat;
    private final String telepon;
    private final String email;

    /**
     *
     * @param username
     * @param password
     * @param nama
     * @param alamat
     * @param telepon
     * @param email
     * @throws SQLException
     */
    public Daftarkan(String username, String password, String nama, String alamat, String telepon, String email) throws SQLException {
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.email = email;
        addPelanggan();
    }

    private void addPelanggan() throws SQLException {
        Pelanggan user = new Pelanggan(username, password, nama, alamat, telepon, email);
        user.addPelanggan();
    }

}
