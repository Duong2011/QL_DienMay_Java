/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_POJO;

/**
 *
 * @author NEC
 */
public class SanPham {
    int maSp;
    String tenSp;
    int LoaiSp;
    String Mausp;
    String doiSp;
    int soluongcon;
    int dongia;
    String TinhTrang;

    public SanPham() {
    }

    public SanPham(int maSp, String tenSp, int LoaiSp, String Mausp, String doiSp, int soluongcon, int dongia, String TinhTrang) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.LoaiSp = LoaiSp;
        this.Mausp = Mausp;
        this.doiSp = doiSp;
        this.soluongcon = soluongcon;
        this.dongia = dongia;
        this.TinhTrang = TinhTrang;
    }

    public int getMaSp() {
        return maSp;
    }

    public void setMaSp(int maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public int getLoaiSp() {
        return LoaiSp;
    }

    public void setLoaiSp(int LoaiSp) {
        this.LoaiSp = LoaiSp;
    }

    public String getMausp() {
        return Mausp;
    }

    public void setMausp(String Mausp) {
        this.Mausp = Mausp;
    }

    public String getDoiSp() {
        return doiSp;
    }

    public void setDoiSp(String doiSp) {
        this.doiSp = doiSp;
    }

    public int getSoluongcon() {
        return soluongcon;
    }

    public void setSoluongcon(int soluongcon) {
        this.soluongcon = soluongcon;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }
    
}
