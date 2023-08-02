/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_DAO;

import QL_POJO.SanPham;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NEC
 */
public class DAO_SanPham {
     public static ArrayList<SanPham> layDanhSachSP(int maloaisp) {
        ArrayList<SanPham> dsSP = new ArrayList<SanPham>();
        try {
            String sql = "select * from SanPham where maloaiSP="+maloaisp+" ";
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while (resultSet.next()) {
                SanPham sp = new SanPham();
                sp.setMaSp(resultSet.getInt(1));
                sp.setTenSp(resultSet.getString(2));
                sp.setLoaiSp(resultSet.getInt(3));
                sp.setMausp(resultSet.getString(4));
                sp.setDoiSp(resultSet.getString(5));
                sp.setSoluongcon(resultSet.getInt(6));
                sp.setDongia(resultSet.getInt(7));
                sp.setTinhTrang(resultSet.getString(8));
                dsSP.add(sp);

            }
            provider.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_nhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsSP;
    }
}
