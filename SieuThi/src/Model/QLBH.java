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
public class QLBH  implements Serializable{
    private KhachHang khach;
    private MatHang hang;
    private int soLuong;
    public QLBH() {
    }
    
    public QLBH(KhachHang khach, MatHang hang,int soLuong) {
        this.khach = khach;
        this.hang = hang;
        this.soLuong = soLuong;
    }

    public KhachHang getKhach() {
        return khach;
    }

    public MatHang getHang() {
        return hang;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    public int getSoLuong() {
        return soLuong;
    }
    
    
    
}
