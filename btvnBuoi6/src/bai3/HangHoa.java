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
public class HangHoa {

    private String maHang;
    private String tenHang;
    private float soLuong;
    private float donGia;
    private VatLieu[] dsVL;

    Scanner sc = new Scanner(System.in);

    public HangHoa() {
    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public VatLieu[] getDsVL() {
        return dsVL;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public void setDsVL(VatLieu[] dsVL) {
        this.dsVL = dsVL;
    }

    public void inPut() {
        System.out.println("ma hang: ");
        maHang = sc.nextLine();
        System.out.println("ten hang: ");
        tenHang = sc.nextLine();
        System.out.println("so luong: ");
        soLuong = sc.nextFloat();
        System.out.println("don gia: ");
        donGia = sc.nextFloat();
        System.out.print("Nhập số lượng vật liệu: ");
        int a = sc.nextInt();
        sc.nextLine();
        dsVL = new VatLieu[a];
        for (int i = 0; i < a; i++) {
            System.out.println("Nhập thông tin vật liệu thứ " + (i + 1) + ": ");
            dsVL[i] = new VatLieu();
            dsVL[i].inPut();
        }

    }

    public void outPut() {
        System.out.printf("%25s %25s %25f %25f %25f", maHang, tenHang, soLuong, donGia, tongTien());
        System.out.println();
        for (int i = 0; i < dsVL.length; i++) {
            System.out.println("Thông tin vật liệu thứ " + (i + 1) + ": ");
            dsVL[i].outPut();
        }
    }

    public float tongTien() {
        return soLuong * donGia;
    }
}
