/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_DAO;
import QL_POJO.nhaCC;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NEC
 */
public class DAO_nhaCC {
     public static ArrayList<nhaCC> layDanhSachnhaCC() {
        ArrayList<nhaCC> dsnhaCC = new ArrayList<nhaCC>();
        try {
            String sql = "select * from nhaCC";
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while (resultSet.next()) {
                nhaCC nhaCC = new nhaCC();
                nhaCC.setMaNCC(resultSet.getInt(1));
                nhaCC.setTenNCC(resultSet.getString(2));
                dsnhaCC.add(nhaCC);
            }
            provider.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_nhaCC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsnhaCC;
    }
     public static String laytennhaCC(int manhaCC) {
        String kq="" ;
        try {
            String sql = "select tenNCC from nhaCC where maNCC="+manhaCC+"";
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while (resultSet.next()) {
                kq = resultSet.getString(1);
            }
            provider.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_nhaCC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;

    }
}
