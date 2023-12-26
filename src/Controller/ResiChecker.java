/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Pengiriman;
import Model.Produk;
import java.sql.SQLException;

/**
 *
 * @author ZADO
 */
public class ResiChecker {

    Pengiriman kirim;
    Produk produk;

    public ResiChecker(int resi) throws SQLException {
        this.kirim = new Pengiriman(resi);
        this.produk = new Produk(kirim.getIdProduk());
    }

    public Pengiriman getKirim() {
        return kirim;
    }

    public Produk getProduk() {
        return produk;
    }

}
