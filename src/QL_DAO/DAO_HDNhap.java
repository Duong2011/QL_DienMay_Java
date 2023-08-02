/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_DAO;

import QL_POJO.HDNhap;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NEC
 */
public class DAO_HDNhap {

    public static boolean them(HDNhap hdnhap) {
        boolean kq = false;
        String sql = String.format("insert into hdNhap values ('%s','%s','%tD',%d);",
                hdnhap.getMaNCC(), hdnhap.getMaNV(), hdnhap.getNgaynhap(), hdnhap.getTongtienhdnhap());
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
            String sql = "select Max(maHDNhap) from HDNhap";
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
