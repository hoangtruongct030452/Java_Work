/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_tai__so_5;

/**
 *
 * @author phuon
 */
public class khachHang {
    private int maKhachHang;
    private String hoTen;
    private int Tuoi;
    private int CMND;
    private int SDT;
    private String phuongThucThanhToan;

    public khachHang(int maKhachHang, String hoTen, int Tuoi, int CMND, int SDT, String phuongThucThanhToan) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.Tuoi = Tuoi;
        this.CMND = CMND;
        this.SDT = SDT;
        this.phuongThucThanhToan = phuongThucThanhToan;
    }

    public khachHang() {
    }

  
   

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public int getCMND() {
        return CMND;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public String getPhuongThucThanhToan() {
        return phuongThucThanhToan;
    }

    public void setPhuongThucThanhToan(String phuongThucThanhToan) {
        this.phuongThucThanhToan = phuongThucThanhToan;
    }
    
}
