/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import control.Masterbarang;
import control.control_user;
import control.menuut;
import java.sql.SQLException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Users extends javax.swing.JFrame {
menuut ut;
control_user ur;
    /**
     * Creates new form Barang
     */
    public Users() {
        initComponents();
        setLocationRelativeTo(this);
        setResizable(false);
        ut = new menuut();
        ur = new control_user();
        tampil();
    }
    
    public void tampil(){
        tabel.setModel(ur.model);
        ur.model.setRowCount(0);
        ur.tampil();
    }
    
    public void clear(){
        txtnama.setText(null);
        txtuser.setText(null);
        txtpass.setText(null);
        tabel.clearSelection();
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
        txtuser = new javax.swing.JTextField();
        harga = new javax.swing.JLabel();
        txtpass = new javax.swing.JTextField();
        btnbaru = new javax.swing.JLabel();
        kode1 = new javax.swing.JLabel();
        txtlevel = new javax.swing.JTextField();
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
        judul.setText("Data Pengguna");
        kiri.add(judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        kode.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        kode.setForeground(new java.awt.Color(0, 0, 102));
        kode.setText("ID");
        kiri.add(kode, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        txtid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtid.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtid.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(0, 0, 102)));
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        kiri.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 390, 30));

        nama.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        nama.setForeground(new java.awt.Color(0, 0, 102));
        nama.setText("Nama Pengguna");
        kiri.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        txtnama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnama.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtnama.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(0, 0, 102)));
        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        kiri.add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 390, 30));

        stok.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        stok.setForeground(new java.awt.Color(0, 0, 102));
        stok.setText("Username Pengguna");
        kiri.add(stok, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, 20));

        txtuser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtuser.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtuser.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(0, 0, 102)));
        kiri.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 390, 30));

        harga.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        harga.setForeground(new java.awt.Color(0, 0, 102));
        harga.setText("Password Pengguna");
        kiri.add(harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        txtpass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtpass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtpass.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(0, 0, 102)));
        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });
        kiri.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 390, 30));

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
        kiri.add(btnbaru, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 110, 50));

        kode1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        kode1.setForeground(new java.awt.Color(0, 0, 102));
        kode1.setText("Level Pengguna");
        kiri.add(kode1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        txtlevel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtlevel.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtlevel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(0, 0, 102)));
        txtlevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlevelActionPerformed(evt);
            }
        });
        kiri.add(txtlevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 390, 30));

        getContentPane().add(kiri, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 580));

        kanan.setBackground(new java.awt.Color(153, 204, 255));
        kanan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        tabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tabel.setForeground(new java.awt.Color(0, 0, 102));
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Level Pengguna", "Nama Pengguna", "Username Pengguna", "Password Pengguna"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
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

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

    private void txtlevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlevelActionPerformed

    private void btnhapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhapusMouseClicked
        String id = txtid.getText();
        try{
            ur.hapus(id, id);
            JOptionPane.showMessageDialog(rootPane, "Data berhasil dihapus");
            tampil();
            clear();
        }catch (SQLException ex){
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnhapusMouseClicked

    private void btnbaruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbaruMouseClicked
        String id = txtid.getText();
            String level = txtlevel.getText();
            String nama = txtnama.getText();
            String user = txtuser.getText();
            String pass = txtpass.getText();
            try{
                ur.simpan(user, user, level, nama, user, pass);
                JOptionPane.showMessageDialog(rootPane, "Data berhasil disimpan");
                tampil();
                
                clear();
                btnsimpan.setEnabled(false);
                btnback.setEnabled(true);
                btnbaru.setEnabled(true);
                txtuser.setEditable(false);
                txtpass.setEditable(false);
                txtnama.setEditable(false);
                btnsimpan.setEnabled(false);
                btnbaru.setEnabled(true);
                btnback.setEnabled(true);
            }catch(SQLException ex){
                Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btnbaruMouseClicked
boolean edit = false;
    private void btnsimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpanMouseClicked
        if(edit==true){
            String id = txtid.getText();
            String level = txtlevel.getText();
            String nama = txtnama.getText();
            String user = txtuser.getText();
            String pass = txtpass.getText();
            
            try{
                ur.edit(user, user, level, nama, user, pass);
                JOptionPane.showMessageDialog(rootPane, "Data Berhasil Diupdate");
                tampil();
                clear();
                txtuser.setEditable(false);
                txtpass.setEditable(false);
                txtnama.setEditable(false);
                btnsimpan.setEnabled(false);
                btnback.setEnabled(true);
                btnbaru.setEnabled(true);
            }catch (SQLException ex){
                Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnsimpanMouseClicked

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        int row = tabel.getSelectedRow();
        txtid.setText(tabel.getValueAt(row, 0).toString());
        txtlevel.setText(tabel.getValueAt(row, 1).toString());
        txtnama.setText(tabel.getValueAt(row, 2).toString());
        txtuser.setText(tabel.getValueAt(row, 3).toString());
        txtpass.setText(tabel.getValueAt(row, 4).toString());
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
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Users().setVisible(true);
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
    private javax.swing.JLabel kode1;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel stok;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtlevel;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
