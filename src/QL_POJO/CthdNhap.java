/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_POJO;

/**
 *
 * @author NEC
 */
public class CthdNhap {
    int maHDNhap;
    int maSp;
    int soLuongNhap;
    int donGia;

    public CthdNhap() {
    }

    public CthdNhap(int maHDNhap, int maSp, int soLuongNhap, int donGia) {
        this.maHDNhap = maHDNhap;
        this.maSp = maSp;
        this.soLuongNhap = soLuongNhap;
        this.donGia = donGia;
    }

    public int getMaHDNhap() {
        return maHDNhap;
    }

    public void setMaHDNhap(int maHDNhap) {
        this.maHDNhap = maHDNhap;
    }

    public int getMaSp() {
        return maSp;
    }

    public void setMaSp(int maSp) {
        this.maSp = maSp;
    }

    public int getSoLuongNhap() {
        return soLuongNhap;
    }

    public void setSoLuongNhap(int soLuongNhap) {
        this.soLuongNhap = soLuongNhap;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    
}
