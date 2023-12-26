/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ZADO
 */
public class DataPelangganResi {

    private String username;
    private int resi;

    public DataPelangganResi(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getResi() {
        return resi;
    }

    public void setResi(int resi) {
        this.resi = resi;
    }

    @Override
    public String toString() {
        return "dataPelangganResi{" + "username=" + username + ", resi=" + resi + '}';
    }

    public static void main(String[] args) {
        System.out.println("a");
    }

}
