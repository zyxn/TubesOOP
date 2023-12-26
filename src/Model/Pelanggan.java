/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.api.PelangganApi;
import java.sql.SQLException;
import java.util.Map;

/**
 *
 * @author ZADO
 */
public class Pelanggan {

    private String username;
    private String password;
    private String nama;
    private String alamat;
    private String telepon;
    private String email;

    /**
     *
     * @param username
     * @param password
     * @throws SQLException
     */
    public Pelanggan(String username, String password) throws SQLException {
        this.username = username;
        this.password = password;
        Map<String, Object> data;
        data = new PelangganApi().findByUsernamePassword(username, password).getFirst();
        getData(data);

    }

    public Pelanggan(String username, String password, String nama, String alamat, String telepon, String email) {
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.email = email;
    }

    private void getData(Map<String, Object> data) {
        if (data.containsKey("username")) {
            this.username = (String) data.get("username");
        }

        if (data.containsKey("password")) {
            this.password = (String) data.get("password");
        }

        if (data.containsKey("nama")) {
            this.nama = (String) data.get("nama");
        }

        if (data.containsKey("alamat")) {
            this.alamat = (String) data.get("alamat");
        }

        if (data.containsKey("telepon")) {
            Object teleponObj = data.get("telepon");
            if (teleponObj instanceof String) {
                this.telepon = (String) "0" + teleponObj;
            } else if (teleponObj instanceof Integer) {
                this.telepon = "0" + Integer.toString((int) teleponObj);
            }
        }

        if (data.containsKey("email")) {
            this.email = (String) data.get("email");
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addPelanggan() throws SQLException {
        Object[] parameters = {nama, username, telepon, alamat, email, password};
        new PelangganApi().addPelanggan(parameters);
    }

    @Override
    public String toString() {
        return "Pelanggan{" + "username=" + username + ", password=" + password + ", nama=" + nama + ", alamat=" + alamat + ", telepon=" + telepon + ", email=" + email + '}';
    }

    public static void main(String[] args) throws SQLException {
        Pelanggan p = new Pelanggan("nawuy", "987654321");
        System.out.println(p);
    }

}
