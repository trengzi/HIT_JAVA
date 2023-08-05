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
public class bai3 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("nhap n ");
         int n = sc.nextInt();
         boolean isPrime = true;
        
        if (n <= 1) {
            isPrime = false;
        }
        
        for (int i = 2; i * i <= n; i++) {
            if (n% i == 0) {
                isPrime = false;
                break;
            }
        }
        
        if (isPrime) {
            System.out.println(n + " la so nguyen to.");
        } else {
            System.out.println(n + " khong la so nguyen to.");
        }
        
        sc.close();

    }
    
}
