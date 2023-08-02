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
public class HDXuat {
     int maHDXuat;
    int maKH;
    int maNV;
    Date ngayban;
    int tongtienhdxuat;

    public HDXuat() {
    }

    public HDXuat(int maHDXuat, int maKH, int maNV, Date ngayban, int tongtienhdxuat) {
        this.maHDXuat = maHDXuat;
        this.maKH = maKH;
        this.maNV = maNV;
        this.ngayban = ngayban;
        this.tongtienhdxuat = tongtienhdxuat;
    }

    public int getMaHDXuat() {
        return maHDXuat;
    }

    public void setMaHDXuat(int maHDXuat) {
        this.maHDXuat = maHDXuat;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public Date getNgayban() {
        return ngayban;
    }

    public void setNgayban(Date ngayban) {
        this.ngayban = ngayban;
    }

    public int gettongtienhdxuat() {
        return tongtienhdxuat;
    }

    public void settongtienhdxuat(int tongtienhdxuat) {
        this.tongtienhdxuat = tongtienhdxuat;
    }
    
    
}
