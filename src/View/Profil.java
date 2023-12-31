package View;

import Controller.Profile;
import Model.Pengiriman;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP
 */
public class Profil extends javax.swing.JFrame {

    private Profile user;

    /**
     * Creates new form Profil
     */
    public Profil(Profile user) throws SQLException {
        this.user = user;
        initComponents();
        labelUsername.setText(user.getUser().getUsername());
        labelTelp.setText("0" + user.getUser().getTelepon());
        labelAlamat.setText(user.getUser().getAlamat());
        try {
            populateTable();
        } catch (Exception e) {
        }
        tableResi.setDefaultEditor(Object.class, null);

    }

    private void populateTable() {
        // Assuming you have a DefaultTableModel for your JTable
        DefaultTableModel model = (DefaultTableModel) tableResi.getModel();

        // Assuming listPengiriman is your list of Pengiriman objects
        for (Pengiriman pengiriman : user.getPengiriman()) {
            // Convert each Pengiriman object to an array of objects
            Object[] row = {
                pengiriman.getResi(),
                pengiriman.getAlamatTujuan(), // Replace with the actual getter for the product name
                pengiriman.getTanggalPengiriman(),
                pengiriman.getStatus(),};

            // Add the row to the DefaultTableModel
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelUsername = new javax.swing.JLabel();
        labelTelp = new javax.swing.JLabel();
        labelAlamat = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableResi = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        labelUsername.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelUsername.setText("Username");
        jPanel1.add(labelUsername);
        labelUsername.setBounds(360, 80, 355, 44);

        labelTelp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelTelp.setText("Nomor Telepon");
        jPanel1.add(labelTelp);
        labelTelp.setBounds(360, 140, 355, 29);

        labelAlamat.setForeground(new java.awt.Color(153, 153, 153));
        labelAlamat.setText("Alamat");
        jPanel1.add(labelAlamat);
        labelAlamat.setBounds(360, 190, 312, 16);

        jPanel2.setBackground(new java.awt.Color(226, 226, 226));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tableResi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nomor Resi", "Alamat  Tujuan", "Tanggal Pengiriman", "Status"
            }
        ));
        tableResi.setRowHeight(50);
        jScrollPane1.setViewportView(tableResi);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(360, 280, 810, 370);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/home.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1110, 20, 60, 60);

        jPanel3.setBackground(new java.awt.Color(237, 178, 96));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/profil.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(38, 38, 38))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel5)
                .addContainerGap(445, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 330, 780);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Aplikasi().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Assuming you have a username from somewhere (e.g., after a successful login)

        try {
            // Retrieve user data by username
            Profile user = new Profile("zadobp", "12345678");
            if (user != null) {
                // If user data is found, create and display the Profil JFrame
                java.awt.EventQueue.invokeLater(() -> {
                    try {
                        new Profil(user).setVisible(true);
                    } catch (SQLException ex) {
                        Logger.getLogger(Profil.class.getName()).log(Level.SEVERE, null, ex);
                    }
                });
            } else {
                // Handle the case where the user data is not found
                System.out.println("User not found");
            }
        } catch (SQLException e) {
            // Handle the SQL exception appropriately
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelTelp;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JTable tableResi;
    // End of variables declaration//GEN-END:variables

    void setVisible(Login aThis, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
