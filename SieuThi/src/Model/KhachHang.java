/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class KhachHang implements Serializable{
    private int maKH;
    private String hoTen,diaChi;
    private int sDT;
    private static int lastMaKH=10000;
    public KhachHang() {
    }

    public KhachHang(String hoTen, String diaChi, int sDT) {
        this.maKH = ++lastMaKH;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sDT = sDT;
    }

    public int getMaKH() {
        return maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getsDT() {
        return sDT;
    }

    public int getLastMaKH() {
        return lastMaKH;
    }

    public void setLastMaKH(int maKH) {
        this.lastMaKH = maKH;
    }
    
    
}
