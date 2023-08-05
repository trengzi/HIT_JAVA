/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HIT_bai2;

import java.util.Scanner;

/**
 *
 * @author NGUYEN TRANG
 */
public class bai2 {
    public static void main(String[] args) {
        // cau a
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n1: ");
        int n1 = sc.nextInt();
        float tong=0;
        for(int i=1;i<=n1;i++){
            tong +=(1/(float)i);
        }
        System.out.println("tong cua cau a la: ");
        System.out.println(tong);
        
        //cau b
        int luyThua = 1;
        int tong2 = 0;
        System.out.println("Nhap n2: ");
        int n2 = sc.nextInt();
        for(int j=1;j<=n2;j++){
            for(int k=1;k<=j;k++){
                 luyThua *= k;
            }
            tong2 += luyThua;
            luyThua = 1;
        }
        System.out.println("dap an cua cau b la: ");
        System.out.println(tong2);
        
    }
}
