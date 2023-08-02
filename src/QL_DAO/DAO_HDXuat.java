/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_DAO;

import QL_POJO.HDXuat;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NEC
 */
public class DAO_HDXuat {
     public static boolean them(HDXuat hdx) {
        boolean kq = false;
        String sql = String.format("insert into HDXuat values ('%s','%s','%tD',%d);",
                hdx.getMaKH(), hdx.getMaNV(), hdx.getNgayban(), hdx.gettongtienhdxuat());
        SQLSeverDataProvider provider = new SQLSeverDataProvider();
        provider.open();
        int k = provider.executeUpdate(sql);
        provider.close();
        if (k != -1) {
            kq = true;
        }
        provider.close();

        return kq;
    }

    public static int laymaHD() {
        int kq = 0;
        try {
            String sql = "select Max(maHDXuat) from HDXuat";
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while (resultSet.next()) {
                kq = resultSet.getInt(1);
            }
            provider.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_HDNhap.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;

    }
}
