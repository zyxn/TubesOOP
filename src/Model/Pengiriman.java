/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.api.PengirimanApi;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Map;

/**
 *
 * @author ZADO
 */
public class Pengiriman {

    private String resi;
    private int harga;
    private Date tanggalPengiriman;
    private String alamatTujuan;
    private String alamatPengiriman;
    private int berat;
    private String status;
    private int fragile;
    private int idProduk;
    private String nama;
    private String telepon;

    public Pengiriman(int resi) throws SQLException {
        Map<String, Object> data = new PengirimanApi().findByResi(resi).getFirst();
        Map<String, Object> data2 = new PengirimanApi().findNamaTelp(resi).getFirst();
        this.resi = "" + resi;
        getData(data);
        getData2(data2);
    }

    private void getData(Map<String, Object> data) {

        if (data.containsKey("harga")) {
            this.harga = (int) data.get("harga");
        }

        if (data.containsKey("tanggal_pengiriman")) {
            this.tanggalPengiriman = (Date) data.get("tanggal_pengiriman");
        }

        if (data.containsKey("alamat_tujuan")) {
            this.alamatTujuan = (String) data.get("alamat_tujuan");
        }
        if (data.containsKey("alamat_pengiriman")) {
            this.alamatPengiriman = (String) data.get("alamat_pengiriman");
        }

        if (data.containsKey("berat")) {
            this.berat = (int) (double) data.get("berat");
        }

        if (data.containsKey("status")) {
            this.status = (String) data.get("status");
        }

        if (data.containsKey("fragile")) {
            this.fragile = (int) data.get("fragile");
        }

        if (data.containsKey("id_produk")) {
            this.idProduk = (int) data.get("id_produk");
        }
    }

    private void getData2(Map<String, Object> data) {

        if (data.containsKey("nama")) {
            this.nama = (String) data.get("nama");
        }

        if (data.containsKey("telepon")) {
            this.telepon = (String) data.get("telepon");
        }

    }

    public String getNama() {
        return nama;
    }

    public String getTelepon() {
        return telepon;
    }

    public String getAlamatPengiriman() {
        return alamatPengiriman;
    }

    public void setAlamatPengiriman(String alamatPengiriman) {
        this.alamatPengiriman = alamatPengiriman;
    }

    public String getResi() {
        return resi;
    }

    public void setResi(String resi) {
        this.resi = resi;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public Date getTanggalPengiriman() {
        return tanggalPengiriman;
    }

    public void setTanggalPengiriman(Date tanggalPengiriman) {
        this.tanggalPengiriman = tanggalPengiriman;
    }

    public String getAlamatTujuan() {
        return alamatTujuan;
    }

    public void setAlamatTujuan(String alamatTujuan) {
        this.alamatTujuan = alamatTujuan;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getFragile() {
        return fragile;
    }

    public void setFragile(int fragile) {
        this.fragile = fragile;
    }

    public int getIdProduk() {
        return idProduk;
    }

    public void setIdProduk(int idProduk) {
        this.idProduk = idProduk;
    }

    @Override
    public String toString() {
        return "Pengiriman{" + "resi=" + resi + ", harga=" + harga + ", tanggalPengiriman=" + tanggalPengiriman + ", alamatTujuan=" + alamatTujuan + ", alamatPengiriman=" + alamatPengiriman + ", berat=" + berat + ", status=" + status + ", fragile=" + fragile + ", idProduk=" + idProduk + ", nama=" + nama + ", telepon=" + telepon + '}';
    }

    public static void main(String[] args) throws SQLException {
        Pengiriman p = new Pengiriman(2);
        System.out.println(p);
    }
}
