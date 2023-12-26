/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.api;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ZADO
 */
public class PengirimanApi {

    private final Database db;

    public PengirimanApi() throws SQLException {
        this.db = new Database();
    }

    public List<Map<String, Object>> findByResi(int resi) throws SQLException {
        String sql = "SELECT * FROM pengiriman WHERE resi = ? ";
        Object[] parameters = {resi};

        List<Map<String, Object>> resultList = new ArrayList<>();

        try (PreparedStatement statement = db.prepareStatement(sql, parameters); ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Map<String, Object> row = new HashMap<>();
                ResultSetMetaData metaData = resultSet.getMetaData();
                int columnCount = metaData.getColumnCount();

                for (int i = 1; i <= columnCount; i++) {
                    String columnName = metaData.getColumnName(i);
                    Object value = resultSet.getObject(i);
                    row.put(columnName, value);
                }

                resultList.add(row);
            }
        }

        return resultList.isEmpty() ? null : resultList;
    }

    public List<Map<String, Object>> convertResultSetToList(ResultSet resultSet) throws SQLException {
        List<Map<String, Object>> resultList = new ArrayList<>();

        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();

        while (resultSet.next()) {
            Map<String, Object> row = new HashMap<>();
            for (int i = 1; i <= columnCount; i++) {
                String columnName = metaData.getColumnName(i);
                Object value = resultSet.getObject(i);
                row.put(columnName, value);
            }
            resultList.add(row);
        }

        return resultList;
    }

    public static void main(String[] args) throws SQLException {
        PengirimanApi api = new PengirimanApi();
        List<Map<String, Object>> hasil = api.findByResi(1);
        System.out.println("" + hasil.toString());

        for (Map<String, Object> data : hasil) {
            for (Map.Entry<String, Object> entry : data.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();

                // Cek tipe data setiap value
                System.out.println("Key: " + key + ", Value: " + value + ", Type: " + value.getClass().getSimpleName());
            }
        }

    }

    public List<Map<String, Object>> findNamaTelp(int resi) throws SQLException {
        String sql = "SELECT tubes.pengiriman.resi, tubes.pelanggan_resi.username, tubes.pelanggan.nama, tubes.pelanggan.telepon "
                + "FROM tubes.pengiriman "
                + "RIGHT JOIN tubes.pelanggan_resi ON tubes.pengiriman.resi = tubes.pelanggan_resi.resi "
                + "LEFT JOIN tubes.pelanggan ON tubes.pelanggan_resi.username = tubes.pelanggan.username "
                + "WHERE tubes.pelanggan_resi.resi = ?";
        Object[] parameters = {resi};

        List<Map<String, Object>> resultList = new ArrayList<>();

        try (PreparedStatement statement = db.prepareStatement(sql, parameters); ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Map<String, Object> row = new HashMap<>();
                ResultSetMetaData metaData = resultSet.getMetaData();
                int columnCount = metaData.getColumnCount();

                for (int i = 1; i <= columnCount; i++) {
                    String columnName = metaData.getColumnName(i);
                    Object value = resultSet.getObject(i);
                    row.put(columnName, value);
                }

                resultList.add(row);
            }
        }

        return resultList.isEmpty() ? null : resultList;
    }

}
