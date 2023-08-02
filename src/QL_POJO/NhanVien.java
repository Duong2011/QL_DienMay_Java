/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_POJO;

import java.util.Date;

/**
 *
 * @author NEC
 */
public class NhanVien {
        int maNV ;
	String hoTenNV ;
	String gioiTinh ;
	Date namSinh ;
	String chucVu ;
	int luongCB;
        int ngaycong;
        int tienluong;

    public NhanVien() {
    }

    public NhanVien(int maNV, String hoTenNV, String gioiTinh, Date namSinh, String chucVu, int luongCB, int ngaycong, int tienluong) {
        this.maNV = maNV;
        this.hoTenNV = hoTenNV;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.chucVu = chucVu;
        this.luongCB = luongCB;
        this.ngaycong = ngaycong;
        this.tienluong = tienluong;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getHoTenNV() {
        return hoTenNV;
    }

    public void setHoTenNV(String hoTenNV) {
        this.hoTenNV = hoTenNV;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Date namSinh) {
        this.namSinh = namSinh;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public int getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(int luongCB) {
        this.luongCB = luongCB;
    }

    public int getNgaycong() {
        return ngaycong;
    }

    public void setNgaycong(int ngaycong) {
        this.ngaycong = ngaycong;
    }

    public int getTienluong() {
        return tienluong;
    }

    public void setTienluong(int tienluong) {
        this.tienluong = tienluong;
    }
        
}
