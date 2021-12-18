/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import control.control_supplier;
import control.Masterbarang;
import control.menuut;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Suppliers extends javax.swing.JFrame {
menuut ut;
control_supplier su;
    /**
     * Creates new form Barang
     */
    public Suppliers() {
        initComponents();
        setLocationRelativeTo(this);
        setResizable(false);
        ut = new menuut();
        su = new control_supplier();
        tampil();
    }
    
    public void tampil(){
        tabel.setModel(su.model);
        su.tampil();
    }
    
    public void clear(){
        txtid.setText(null);
        txtnama.setText(null);
        txtalamat.setText(null);
        txtno.setText(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kiri = new javax.swing.JPanel();
        judul = new javax.swing.JLabel();
        kode = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        nama = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        stok = new javax.swing.JLabel();
        txtalamat = new javax.swing.JTextField();
        harga = new javax.swing.JLabel();
        txtno = new javax.swing.JTextField();
        btnbaru = new javax.swing.JLabel();
        kanan = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        btnback = new javax.swing.JLabel();
        btnsimpan = new javax.swing.JLabel();
        btnhapus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kiri.setBackground(new java.awt.Color(255, 255, 255));
        kiri.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judul.setBackground(new java.awt.Color(0, 0, 102));
        judul.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 60)); // NOI18N
        judul.setForeground(new java.awt.Color(0, 0, 102));
        judul.setText("Data Suppliers");
        kiri.add(judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        kode.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        kode.setForeground(new java.awt.Color(0, 0, 102));
        kode.setText("ID Supplier");
        kiri.add(kode, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        txtid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtid.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtid.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(0, 0, 102)));
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        txtid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidKeyTyped(evt);
            }
        });
        kiri.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 390, 30));

        nama.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        nama.setForeground(new java.awt.Color(0, 0, 102));
        nama.setText("Nama Supplier");
        kiri.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        txtnama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnama.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtnama.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(0, 0, 102)));
        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        kiri.add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 390, 30));

        stok.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        stok.setForeground(new java.awt.Color(0, 0, 102));
        stok.setText("Alamat Supplier");
        kiri.add(stok, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        txtalamat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtalamat.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtalamat.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(0, 0, 102)));
        txtalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalamatActionPerformed(evt);
            }
        });
        kiri.add(txtalamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 390, 30));

        harga.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        harga.setForeground(new java.awt.Color(0, 0, 102));
        harga.setText("Nomor Telepon Supplier");
        kiri.add(harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        txtno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtno.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtno.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(0, 0, 102)));
        txtno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnoActionPerformed(evt);
            }
        });
        kiri.add(txtno, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 390, 30));

        btnbaru.setBackground(new java.awt.Color(255, 255, 255));
        btnbaru.setForeground(new java.awt.Color(0, 0, 102));
        btnbaru.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnbaru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_new_copy_40px.png"))); // NOI18N
        btnbaru.setText("Baru");
        btnbaru.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        btnbaru.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbaru.setOpaque(true);
        btnbaru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbaruMouseClicked(evt);
            }
        });
        kiri.add(btnbaru, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 110, 50));

        getContentPane().add(kiri, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 580));

        kanan.setBackground(new java.awt.Color(153, 204, 255));
        kanan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        tabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tabel.setForeground(new java.awt.Color(0, 0, 102));
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Supplier", "Nama Supplier", "Alamat Supplier", "Nomer Telpon Supplier"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel.setGridColor(new java.awt.Color(153, 204, 255));
        tabel.setRowHeight(19);
        tabel.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        kanan.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 900, 480));

        btnback.setBackground(new java.awt.Color(255, 255, 255));
        btnback.setForeground(new java.awt.Color(0, 0, 102));
        btnback.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_back_40px.png"))); // NOI18N
        btnback.setText("Kembali");
        btnback.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        btnback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnback.setOpaque(true);
        btnback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbackMouseClicked(evt);
            }
        });
        kanan.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 510, 110, 50));

        btnsimpan.setBackground(new java.awt.Color(255, 255, 255));
        btnsimpan.setForeground(new java.awt.Color(0, 0, 102));
        btnsimpan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_save_40px.png"))); // NOI18N
        btnsimpan.setText("Simpan");
        btnsimpan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        btnsimpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsimpan.setOpaque(true);
        btnsimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsimpanMouseClicked(evt);
            }
        });
        kanan.add(btnsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 110, 50));

        btnhapus.setBackground(new java.awt.Color(255, 255, 255));
        btnhapus.setForeground(new java.awt.Color(0, 0, 102));
        btnhapus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_40px.png"))); // NOI18N
        btnhapus.setText("Hapus");
        btnhapus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        btnhapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnhapus.setOpaque(true);
        btnhapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnhapusMouseClicked(evt);
            }
        });
        kanan.add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 110, 50));

        getContentPane().add(kanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 920, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void txtnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnoActionPerformed

    private void txtidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidKeyTyped

    private void btnbaruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbaruMouseClicked
        txtid.setEditable(true);
        txtnama.setEditable(true);
        txtalamat.setEditable(true);
        txtno.setEditable(true);
        btnsimpan.setEnabled(true);
        btnback.setEnabled(true);
        btnbaru.setEnabled(false);
        txtid.requestFocus();
    }//GEN-LAST:event_btnbaruMouseClicked

    private void txtalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalamatActionPerformed

    private void btnhapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhapusMouseClicked
        String id = txtid.getText();
        try{
            su.hapus(id);
            JOptionPane.showMessageDialog(rootPane, "Data Berhasil Dihapus");
            tampil();
            clear();
        }catch (SQLException ex){
            Logger.getLogger(Suppliers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnhapusMouseClicked
boolean edit = false;
    private void btnsimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpanMouseClicked
                if(edit==true){
            String id = txtid.getText();
            String nama = txtnama.getText();
            String alamat = txtalamat.getText();
            String no = txtno.getText();
            
            try{
                su.edit(id, nama, alamat, no);
                JOptionPane.showMessageDialog(rootPane, "Data Berhasil Diupdate");
                tampil();
                clear();
                txtalamat.setEditable(false);
                txtnama.setEditable(false);
                txtno.setEditable(false);
                btnsimpan.setEnabled(false);
                btnback.setEnabled(true);
                btnbaru.setEnabled(true);
            }catch (SQLException ex){
                Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
                     String id = txtid.getText();
            String nama = txtnama.getText();
            String alamat = txtalamat.getText();
            String no = txtno.getText();
            try{
                su.simpan(id, nama, alamat, no);
                JOptionPane.showMessageDialog(rootPane, "Data berhasil disimpan");
                tampil();
                
                clear();
                btnsimpan.setEnabled(false);
                btnback.setEnabled(true);
                btnbaru.setEnabled(true);
                txtnama.setEditable(false);
                txtalamat.setEditable(false);
                txtno.setEditable(false);
                btnsimpan.setEnabled(false);
                btnbaru.setEnabled(true);
                btnback.setEnabled(true);
            }catch(SQLException ex){
                Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
    }//GEN-LAST:event_btnsimpanMouseClicked

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        int row = tabel.getSelectedRow();
        txtid.setText(tabel.getValueAt(row, 0).toString());
        txtnama.setText(tabel.getValueAt(row, 1).toString());
        txtalamat.setText(tabel.getValueAt(row, 2).toString());
        txtno.setText(tabel.getValueAt(row, 3).toString());
        btnsimpan.setEnabled(true);
        btnhapus.setEnabled(true);
        btnback.setEnabled(true);
    }//GEN-LAST:event_tabelMouseClicked

    private void btnbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseClicked
        this.setVisible(false);
        new MenuUtama().setVisible(true);
    }//GEN-LAST:event_btnbackMouseClicked

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
            java.util.logging.Logger.getLogger(Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Suppliers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnback;
    private javax.swing.JLabel btnbaru;
    private javax.swing.JLabel btnhapus;
    private javax.swing.JLabel btnsimpan;
    private javax.swing.JLabel harga;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel judul;
    private javax.swing.JPanel kanan;
    private javax.swing.JPanel kiri;
    private javax.swing.JLabel kode;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel stok;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtno;
    // End of variables declaration//GEN-END:variables
}