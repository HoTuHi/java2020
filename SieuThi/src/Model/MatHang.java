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
public class MatHang  implements Serializable{
    private int maHang;
    private String tenHang,nhomHang;
    private int giaBan;
    private static int lastMaHang=10000;
    
    public MatHang() {
    }

    public MatHang( String tenHang, String nhomHang, int giaBan) {
        this.maHang = ++lastMaHang;
        this.tenHang = tenHang;
        this.nhomHang = nhomHang;
        this.giaBan = giaBan;
    }

    public int getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public String getNhomHang() {
        return nhomHang;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public int getLastMaHang() {
        return lastMaHang;
    }

    public void setLastMaHang(int lastMaHang) {
        this.lastMaHang = lastMaHang;
    }
    
    
    
}
