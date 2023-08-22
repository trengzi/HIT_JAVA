/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author NGUYEN TRANG
 */
public class main {
    static SinhVien sv[];
    
    static void nhapMain(){
        sv = new SinhVien[5];
        for(int i=0;i<5;i++){
            sv[i]=new SinhVien();
            sv[i].nhap();
        }
    }
    static void inTT(){
        System.out.printf("%25s %25s %25s", "ma sinh vien", "ho ten", "diemTB");
        System.out.println();
        for(int i=0;i<5;i++){
            sv[i].xuat();
        }
    }
    public static void main(String[] args) {
       nhapMain();
       inTT();
    }
}
