/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap;

/**
 *
 * @author 7550
 */
public class Person {
   private String HoTen;
   private String NgaySinh;
   private String DiaChi;
   private String GioiTinh;
   
   public String getHoTen(){
       return HoTen;
   }
   public void setHoTen(String Hoten){
       this.HoTen = Hoten;
   }
    public String getNgaySinh(){
       return NgaySinh;
   }
   public void setNgaySinh(String NgaySinh){
       this.NgaySinh=NgaySinh;
   }
    public String getDiaChi(){
       return DiaChi;
   }
   public void setDiaChi(String DiaChi){
       this.DiaChi=DiaChi;
   }
    public String getGioiTinh(){
       return GioiTinh;
   }
   public void setGioiTinh(String GioiTinh){
       this.GioiTinh=GioiTinh;
   }
   
   public String toString(){
       return ("HoTen : " + this.getHoTen() + "NgaySinh : " + this.NgaySinh + "DiaChi : " + this.DiaChi + "GioiTinh : " + this.GioiTinh);
       
       
   }
   
   
    
    
}


