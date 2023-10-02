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
public class SinhVienATTT extends SinhVien implements Serializable{
    private String hocphi;

    public String getHocphi() {
        return hocphi;
    }

    public void setHocphi(String hocphi) {
        this.hocphi = hocphi;
    }
    
    public SinhVienATTT(){
        
    }
    
    public SinhVienATTT(String hoten,String ngaysinh,String gioitinh,int diemtrungbinh,String hocphi){
        this.hocphi=hocphi;
    }
    
    public String toString(){
        return("masv"+this.getMasv()+"hoten"+this.getHoten()+"ngaysinh"+this.getNgaysinh()+"gioitinh"+this.getGioitinh()+"diemtrungbinh"+this.getDiemtrungbinh()+"hocphi"+this.getHocphi());
    }
}
