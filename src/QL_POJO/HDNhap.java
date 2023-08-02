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
public class HDNhap {
    int maHDNhap;
    int maNCC;
    int maNV;
    Date ngaynhap;
    int tongtienhdnhap;

    public HDNhap() {
    }

    public HDNhap(int maHDNhap, int maNCC, int maNV, Date ngaynhap, int tongtienhdnhap) {
        this.maHDNhap = maHDNhap;
        this.maNCC = maNCC;
        this.maNV = maNV;
        this.ngaynhap = ngaynhap;
        this.tongtienhdnhap = tongtienhdnhap;
    }

    public int getMaHDNhap() {
        return maHDNhap;
    }

    public void setMaHDNhap(int maHDNhap) {
        this.maHDNhap = maHDNhap;
    }

    public int getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(int maNCC) {
        this.maNCC = maNCC;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public Date getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(Date ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public int getTongtienhdnhap() {
        return tongtienhdnhap;
    }

    public void setTongtienhdnhap(int tongtienhdnhap) {
        this.tongtienhdnhap = tongtienhdnhap;
    }
    
}
