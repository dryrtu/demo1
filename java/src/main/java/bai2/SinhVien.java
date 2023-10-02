/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author 7550
 */
public class SinhVien {
    
    private String masv;
    private String hoten;
    private String ngaysinh;
    private String gioitinh;
    private String diemtrungbinh;
    
    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiemtrungbinh() {
        return diemtrungbinh;
    }

    public void setDiemtrungbinh(String diemtrungbinh) {
        this.diemtrungbinh = diemtrungbinh;
    }
    public String toString(){
        return("masv"+this.getMasv()+"hoten"+this.getHoten()+"ngaysinh"+this.getNgaysinh()+"gioitinh"+this.getGioitinh()+"diemtrungbinh"+this.getDiemtrungbinh());
    }
}
