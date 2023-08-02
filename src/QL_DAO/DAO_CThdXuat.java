/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_DAO;

import QL_POJO.cthdXuat;

/**
 *
 * @author NEC
 */
public class DAO_CThdXuat {
    public static boolean themcthdn(cthdXuat cthdx) {
          boolean kq = false;
            String sql = String.format("insert into cthdXuat values (%d,%d,%d,%d);",
                    cthdx.getMaHDXuat(), cthdx.getMaSp(), cthdx.getSoLuongXuat(),cthdx.getDonGiaXuat());
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
