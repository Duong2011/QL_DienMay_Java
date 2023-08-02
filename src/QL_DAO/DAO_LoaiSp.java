/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_DAO;
import QL_POJO.LoaiSP;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NEC
 */
public class DAO_LoaiSp {
    public static ArrayList<LoaiSP> layDanhSachLoaiSP() {
        ArrayList<LoaiSP> dsloaisp = new ArrayList<LoaiSP>();
        try {
            String sql = "select * from LoaiSP";
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
             
            while (resultSet.next()) {
                LoaiSP loaisp = new LoaiSP();
                loaisp.setMaloaiSP(resultSet.getInt(1));
                loaisp.setTenloaiSP(resultSet.getString(2));
                dsloaisp.add(loaisp);
            }
            provider.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_LoaiSp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsloaisp;
    }
}
