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
public class LokasiApi {

    private final Database db;

    public LokasiApi() throws SQLException {
        this.db = new Database();
    }

    public List<Map<String, Object>> findByLokasi(String Lokasi) throws SQLException {
        String sql = "SELECT * FROM lokasi WHERE nama_lokasi = ?";
        Object[] parameters = {Lokasi};

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
        LokasiApi api = new LokasiApi();
        List<Map<String, Object>> hasil = api.findByLokasi("Bandung");
        System.out.println("" + hasil.toString());
    }

}
