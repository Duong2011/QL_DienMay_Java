/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_DAO;
import QL_POJO.CthdNhap;

/**
 *
 * @author NEC
 */
public class DAO_CThdNhap {
   public static boolean themcthdn(CthdNhap cthdNhap) {
          boolean kq = false;
            String sql = String.format("insert into cthdNhap values (%d,%d,%d,%d);",
                    cthdNhap.getMaHDNhap(), cthdNhap.getMaSp(), cthdNhap.getSoLuongNhap(),cthdNhap.getDonGia());
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
}
