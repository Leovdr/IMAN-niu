/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mochammad enrique ft IMAN Crew
 */
public class control_laporan extends koneksi{
    public control_laporan(){
        super.setKoneksi();
    }
    
    public DefaultTableModel modellaporan = new DefaultTableModel();
    
    public void tampil() {
        try{
            String sqli = "SELECT * FROM tbl_keuangan";
            String [] kolom = {"Tanggal", "Pemasukkan", "Pengeluaran", "Keuntungan"};
            modellaporan.setColumnIdentifiers(kolom);
            rs = st.executeQuery(sqli);
            while(rs.next()){
                Object[]data = new Object[4];
                data[0] = rs.getString("tanggal");
                data[1] = rs.getString("pemasukkan");
                data[2] = rs.getString("pengeluaran");
                data[3] = rs.getString("laba");

                modellaporan.addRow(data);
            }
        }catch (SQLException ex) {
            Logger.getLogger(Masterbarang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
