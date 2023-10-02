/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap;

import java.io.Serializable;

/**
 *
 * @author Hello
 */
public class Student extends Person implements Serializable{
    private String MaSv;
    private String email;
    
    public Student(String MaSv, String email,String HoTen, String NgaySinh, String DiaChi, String GioiTinh){
     
        this.MaSv = MaSv;
        this.email = email;
        
    }

    public Student(){
        
    }   
    
    public String getMaSv(){
        return MaSv;
    }
    public void setMaSv(String MaSv){
        this.MaSv = MaSv;
    }
      public String getemail(){
        return email;
    }
    public void setemail(String email){
        this.email = email;
    }
public String toString(){
  
        return ("HoTen : " + this.getHoTen() + "NgaySinh : " + this.getNgaySinh() + "DiaChi: " + this.getDiaChi() + "GioiTinh : " + this.getGioiTinh() + "MaSV : " + this.getMaSv() + "email : " + this.getemail());
  
}
   
      
}