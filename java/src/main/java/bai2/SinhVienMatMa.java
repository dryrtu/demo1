/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.io.Serializable;
/**
 *
 * @author 7550
 */
public class SinhVienMatMa extends SinhVien implements Serializable{
    private String luong;
    private String donvi;

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }
    public String toString(){
        return("masv"+this.getMasv()+"hoten"+this.getHoten()+"ngaysinh"+this.getNgaysinh()+"gioitinh"+this.getGioitinh()+"diemtrungbinh"+this.getDiemtrungbinh()+"donvi"+this.getDonvi()+"luong"+this.getLuong());
    }
}
