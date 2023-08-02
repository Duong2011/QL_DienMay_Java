/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_DAO;

import QL_POJO.NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NEC
 */
public class DAO_nhanVien {
     SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public static ArrayList<NhanVien> layDanhSachNV() {
        ArrayList<NhanVien> dsNV = new ArrayList<NhanVien>();
        try {
            String sql = "select * from NhanVien";
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while (resultSet.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNV(resultSet.getInt(1));
                nv.setHoTenNV(resultSet.getString(2));
                nv.setGioiTinh(resultSet.getString(3));
                nv.setNamSinh(resultSet.getDate(4));
                nv.setChucVu(resultSet.getString(5));
                nv.setLuongCB(resultSet.getInt(6));
                nv.setNgaycong(resultSet.getInt(7));
                nv.setTienluong(resultSet.getInt(8));
                dsNV.add(nv);
            }
            provider.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_nhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsNV;
    }
    
    public static boolean sua(NhanVien nv) {
            boolean kq = false;
            String sql = String.format("update NhanVien set hoTenNV=N'%s',gioiTinh=N'%s',namSinh='%tD',chucVu=N'%s',luongCB='%d',NgayCong='%d',TIENLUONG='' where maNV=%d;",
                     nv.getHoTenNV(), nv.getGioiTinh(), nv.getNamSinh(), nv.getChucVu(),nv.getLuongCB(),nv.getNgaycong(),nv.getMaNV());
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();
            int k = provider.executeUpdate(sql);
            if (k != -1) {
                kq = true;
            }
            provider.close();
        
        return kq;
    }

    public static boolean them(NhanVien nv) {
        boolean kq = false;
            String sql = String.format("insert into NhanVien values (N'%s',N'%s','%tD',N'%s','%d','%d','');",
                nv.getHoTenNV(), nv.getGioiTinh(),nv.getNamSinh() , nv.getChucVu(), nv.getLuongCB(), nv.getNgaycong(),"");
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();
            int k = provider.executeUpdate(sql);
            if (k != -1) {
                kq = true;
            }
            provider.close();
        return kq;
    }

    public static boolean kiemTramadatontai(int manv) {
        boolean kq = true;
        try {
            String sqlkiemtra = String.format("Select * from NhanVien Where maNV=%d;", manv);
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sqlkiemtra);
            if (resultSet.next() == false) {
                kq = false;
            }
            provider.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_nhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

        return kq;
    }

    public static boolean xoaNV(int manv) {
        boolean kq = false;
        String sql = String.format("delete from NhanVien where maNV=%d", manv);
        SQLSeverDataProvider provider = new SQLSeverDataProvider();
        provider.open();
        int n = provider.executeUpdate(sql);
        if (n == 1) {
            kq = true;
        }
        provider.close();
        return kq;
    }
    public static String laytenNV(int manv) {
        String kq="" ;
        try {
            String sql = "select hoTenNV from NhanVien where maNV="+manv+"";
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while (resultSet.next()) {
                kq = resultSet.getString(1);
            }
            provider.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_HDNhap.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;

    }
}
