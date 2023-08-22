/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author NGUYEN TRANG
 */
public class SinhVien {
    private String maSV;
    private String hoTen;
    private float diemToan;
    private float diemLy;
    private float diemHoa;
    
    Scanner sc= new Scanner(System.in);

    public SinhVien() {
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    
    
    public void nhap(){
        System.out.println("nhap ma sinh vien: ");
        maSV = sc.nextLine();
        System.out.println("ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("diem toan ");
        diemToan= sc.nextFloat();
        System.out.println("diem ly ");
        diemLy = sc.nextFloat();
        System.out.println("diem hoa: ");
        diemHoa = sc.nextFloat();
    }
    public float diemTB(){
        return (diemToan + diemLy + diemHoa)/3;
    }
    public void xuat(){
        System.out.printf("%25s %25s %25f", getMaSV(), getHoTen(), diemTB());
        System.out.println();
    }
}
