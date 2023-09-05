/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NGUYEN TRANG
 */
public class main {

    static void nhapMain() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap so hang hoa ");
        n = sc.nextInt();
        sc.nextLine();
        ArrayList<HangHoaGiaDung> dsGiaDung = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            HangHoaGiaDung gd = new HangHoaGiaDung();
            System.out.println("Nhập thông tin hàng hoá gia dung thu " + (i + 1) + ": ");
            gd.inPut();
            dsGiaDung.add(gd);
        }

        ArrayList<HangHoaDienTu> dsDienTu = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            HangHoaDienTu dt = new HangHoaDienTu();
            System.out.println("Nhập thông tin hàng hoá dien tu thứ " + (i + 1) + ": ");
            dt.inPut();
            dsDienTu.add(dt);
        }
        System.out.println("Danh sách hàng hoá gia dụng: ");
        for (HangHoaGiaDung gd : dsGiaDung) {
            gd.outPut();
        }

        System.out.println("Danh sách hàng hoá điện tử: ");
        for (HangHoaDienTu dt : dsDienTu) {
            dt.outPut();
        }
    }

    public static void main(String[] args) {
        nhapMain();
    }
}
