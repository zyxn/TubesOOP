/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author sitis
 */
public class PaketinAja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String sql = "SELECT tubes.pengiriman.resi, tubes.pelanggan_resi.username, tubes.pelanggan.nama, tubes.pelanggan.telepon "
                + "FROM tubes.pengiriman "
                + "RIGHT JOIN tubes.pelanggan_resi ON tubes.pengiriman.resi = tubes.pelanggan_resi.resi "
                + "LEFT JOIN tubes.pelanggan ON tubes.pelanggan_resi.username = tubes.pelanggan.username "
                + "WHERE tubes.pelanggan_resi.resi = ?";
        System.out.println(sql);
    }

}
