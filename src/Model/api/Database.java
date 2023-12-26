/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.api;

/**
 *
 * @author ZADO
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Database {
    final String DB_URL = "jdbc:mysql://localhost/tubes";
    final String DB_USER = "root";
    final String DB_PASS = "z4d0s44d1";
    Connection conn;
    Statement stmt;
    ResultSet rs;
    
    
    public Database() throws SQLException{
        try{
            conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
            stmt = conn.createStatement();
            System.out.println("Connected");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,""+e.getMessage(),"ConnectionError", JOptionPane.WARNING_MESSAGE);
            throw e;
        }
    }
    public ResultSet getData(String SQLString){
        try{
            rs = stmt.executeQuery(SQLString);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error :"+e.getMessage(),"Communication Error",JOptionPane.WARNING_MESSAGE);
        }return rs;
    }
    
   
    public void query (String SQLString){
       try{
        stmt.executeUpdate(SQLString);
        }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,"Error :"+e.getMessage(),"Communication Error", JOptionPane.WARNING_MESSAGE);
       }
    }
    
    public PreparedStatement prepareStatement(String SQLString, Object[] parameters) {
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(SQLString);

            // Set parameters in the PreparedStatement
            for (int i = 0; i < parameters.length; i++) {
                preparedStatement.setObject(i + 1, parameters[i]);
            }
            
            return preparedStatement;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "PreparedStatement Error", JOptionPane.WARNING_MESSAGE);
            return null;
        }
}
}