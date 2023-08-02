/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_DAO;
import QL_POJO.KhachHang;
import java.awt.List;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NEC
 */
public class DAO_KhachHang {
    public static ArrayList<KhachHang> layDStenKH() {
        ArrayList<KhachHang> dstenKH = new ArrayList<KhachHang>();
        try {
            String sql = "select hoTenKH from KhachHang";
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while (resultSet.next()) {
                KhachHang KH = new KhachHang();
                KH.setHoTenKH(resultSet.getString(1));
                dstenKH.add(KH);
            }
            provider.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_nhaCC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dstenKH;
    }
    public static ArrayList<KhachHang> layDSKH() {
        ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
        try {
            String sql = "select * from KhachHang";
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while (resultSet.next()) {
                KhachHang KH = new KhachHang();
                KH.setMaKH(resultSet.getInt(1));
                KH.setHoTenKH(resultSet.getString(2));
                KH.setGioiTinh(resultSet.getString(3));
                KH.setDiaChi(resultSet.getString(4));
                KH.setSdt(resultSet.getString(5));
                dsKH.add(KH);
            }
            provider.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_nhaCC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsKH;
    }
     public static ArrayList<KhachHang> layDSKHtheomaKH(int makh) {
        ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
        try {
            String sql = "select * from KhachHang where maKH="+makh+"";
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while (resultSet.next()) {
                KhachHang KH = new KhachHang();
                KH.setMaKH(resultSet.getInt(1));
                KH.setHoTenKH(resultSet.getString(2));
                KH.setGioiTinh(resultSet.getString(3));
                KH.setDiaChi(resultSet.getString(4));
                KH.setSdt(resultSet.getString(5));
                dsKH.add(KH);
            }
            provider.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_nhaCC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsKH;
    }
    public static ArrayList<Integer> laymaKH(String tenKH) {
         ArrayList<Integer> dsmaKH = new ArrayList<Integer>();
        try {
            String sql = "select maKH from KhachHang where hoTenKH=N'"+tenKH+"'";
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while (resultSet.next()) {
                dsmaKH.add(resultSet.getInt(1));
            }
            provider.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_KhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsmaKH;

    }
    
}
