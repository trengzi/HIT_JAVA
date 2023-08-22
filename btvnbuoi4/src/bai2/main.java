/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author NGUYEN TRANG
 */
public class main {
    public static void main(String[] args) {
        HCN hcn = new HCN();
        hcn.nhap();
        System.out.println("chu vi: "+ hcn.chuVi());
        System.out.println("dien tich: "+ hcn.dienTich());
        System.out.println("hinh ve ");
        hcn.veHCN();
    }
}
