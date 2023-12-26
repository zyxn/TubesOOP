/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.api.ProdukApi;
import java.sql.SQLException;
import java.util.Map;

/**
 *
 * @author ZADO
 */
public class Produk {

    private int idProduk;
    private String tipeProduk;
    private float hargaSatuan;

    public Produk(int idProduk) throws SQLException {
        this.idProduk = idProduk;
        Map<String, Object> data = new ProdukApi().findByIdProduk(idProduk).getFirst();
        getData(data);

    }

    private void getData(Map<String, Object> data) {
        if (data.containsKey("tipe_produk")) {
            this.tipeProduk = (String) data.get("tipe_produk");
        }

        if (data.containsKey("harga_satuan_kg")) {
            this.hargaSatuan = (float) data.get("harga_satuan_kg");
        }
    }

    public int getIdProduk() {
        return idProduk;
    }

    public void setIdProduk(int idProduk) {
        this.idProduk = idProduk;
    }

    public String getTipeProduk() {
        return tipeProduk;
    }

    public void setTipeProduk(String tipeProduk) {
        this.tipeProduk = tipeProduk;
    }

    public void setHargaSatuan(float hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    public float getHargaSatuan() {
        return hargaSatuan;
    }

    @Override
    public String toString() {
        return "Produk{" + "idProduk=" + idProduk + ", tipeProduk=" + tipeProduk + ", hargaSatuan=" + hargaSatuan + '}';
    }

    public static void main(String[] args) throws SQLException {
        Produk p = new Produk(1);
        System.out.println(p);
    }
}
