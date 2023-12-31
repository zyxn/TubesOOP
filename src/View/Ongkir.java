/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.OngkirChecker;
import Controller.OngkirCheckerBarang;
import Controller.OngkirCheckerDokumen;
import Controller.OngkirCheckerMakanan;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;

/**
 *
 * @author sitis
 */
public class Ongkir extends javax.swing.JFrame {

    private boolean barang;
    private boolean makanan;
    private boolean dokumen;
    private int fragile;

    /**
     * Creates new form Ongkir
     */
    public Ongkir() {
        initComponents();
        ButtonGroup tipePilihan = new ButtonGroup();
        tipePilihan.add(btnBarang);
        tipePilihan.add(btnMakanan);
        tipePilihan.add(btnDokumen);

        ItemListener checkBoxListener = (ItemEvent e) -> {
            if (e.getSource() == jCheckBox1 && jCheckBox1.isSelected()) {
                jCheckBox2.setSelected(false);
                Ongkir.this.fragile = 1;
            } else if (e.getSource() == jCheckBox2 && jCheckBox2.isSelected()) {
                jCheckBox1.setSelected(false);
                Ongkir.this.fragile = 0;
            }
        };

        jCheckBox1.addItemListener(checkBoxListener);
        jCheckBox2.addItemListener(checkBoxListener);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lokasi1 = new javax.swing.JTextField();
        Lokasi2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnBarang = new javax.swing.JRadioButton();
        btnDokumen = new javax.swing.JRadioButton();
        btnMakanan = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("    Rp. 000,00");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(880, 560, 180, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/grup ongkir.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(740, 450, 440, 230);

        jPanel1.setBackground(new java.awt.Color(226, 226, 226));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 699));

        lokasi1.setForeground(new java.awt.Color(204, 204, 204));
        lokasi1.setText(" Masukkan lokasi saat ini ");
        lokasi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lokasi1ActionPerformed(evt);
            }
        });

        Lokasi2.setForeground(new java.awt.Color(204, 204, 204));
        Lokasi2.setText(" Masukkan lokasi tujuan");
        Lokasi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lokasi2ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Group 6907.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Group 6910.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Group 6909.png"))); // NOI18N

        btnBarang.setText("Barang");
        btnBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarangActionPerformed(evt);
            }
        });

        btnDokumen.setText("Dokumen");
        btnDokumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDokumenActionPerformed(evt);
            }
        });

        btnMakanan.setText("Makanan");
        btnMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakananActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(btnBarang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(btnDokumen))
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMakanan, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(34, 34, 34))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBarang)
                    .addComponent(btnDokumen)
                    .addComponent(btnMakanan))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lokasi2)
                    .addComponent(lokasi1))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lokasi1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(Lokasi2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(50, 50, 670, 590);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/grup cek ongkir.png"))); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(780, 400, 370, 57);

        jPanel4.setBackground(new java.awt.Color(226, 226, 226));

        jLabel10.setText("Berat");

        jTextField3.setForeground(new java.awt.Color(204, 204, 204));
        jTextField3.setText(" 1                                 kg");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel10))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(30, 30, 30)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(780, 250, 360, 130);

        jPanel5.setBackground(new java.awt.Color(226, 226, 226));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Fragile1.png"))); // NOI18N

        jCheckBox1.setBackground(new java.awt.Color(226, 226, 226));
        jCheckBox1.setText("Yes");

        jCheckBox2.setBackground(new java.awt.Color(226, 226, 226));
        jCheckBox2.setText("No");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5);
        jPanel5.setBounds(780, 100, 360, 130);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/home.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(1110, 20, 60, 60);

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(790, 400, 350, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lokasi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lokasi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lokasi1ActionPerformed

    private void Lokasi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lokasi2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Lokasi2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Aplikasi().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarangActionPerformed
        // TODO add your handling code here:
        this.makanan = false;
        this.dokumen = false;
        this.barang = true;
    }//GEN-LAST:event_btnBarangActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int berat = Integer.parseInt(jTextField3.getText());
        if (barang) {
            OngkirChecker cekOngkirChecker = new OngkirCheckerBarang(berat, lokasi1.getText(), Lokasi2.getText(), fragile);
            Controller.Ongkir tipeBarangOngkir = cekOngkirChecker.orderChecker();
            jLabel2.setText("Rp. " + tipeBarangOngkir.getTotal());
        } else if (makanan) {
            OngkirChecker cekOngkirChecker2 = new OngkirCheckerMakanan(berat, lokasi1.getText(), Lokasi2.getText(), fragile);
            Controller.Ongkir tipeBarangOngkir2 = cekOngkirChecker2.orderChecker();
            jLabel2.setText("Rp. " + tipeBarangOngkir2.getTotal());
        } else if (dokumen) {
            OngkirChecker cekOngkirChecker3 = new OngkirCheckerDokumen(berat, lokasi1.getText(), Lokasi2.getText(), fragile);
            Controller.Ongkir tipeBarangOngkir3 = cekOngkirChecker3.orderChecker();
            jLabel2.setText("Rp. " + tipeBarangOngkir3.getTotal());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnDokumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDokumenActionPerformed
        // TODO add your handling code here:
        this.makanan = false;
        this.barang = false;
        this.dokumen = true;
    }//GEN-LAST:event_btnDokumenActionPerformed

    private void btnMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakananActionPerformed
        // TODO add your handling code here:
        this.dokumen = false;
        this.barang = false;
        this.makanan = true;
    }//GEN-LAST:event_btnMakananActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ongkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ongkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ongkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ongkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ongkir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Lokasi2;
    private javax.swing.JRadioButton btnBarang;
    private javax.swing.JRadioButton btnDokumen;
    private javax.swing.JRadioButton btnMakanan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField lokasi1;
    // End of variables declaration//GEN-END:variables
}
