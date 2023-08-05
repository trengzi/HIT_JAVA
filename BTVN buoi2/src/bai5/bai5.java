/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author NGUYEN TRANG
 */
public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chanh: ");
        int a = sc.nextInt();
        System.out.println("nhap tao: ");
        int b = sc.nextInt();
        System.out.println("nhap le: ");
        int c = sc.nextInt();
        int i = 0;
        while(i>=0){
            if(i>a){
                break;
            }
            if(2*i>b){
                break;
               
            }
            if(4*i>c){
                break;
            }
            i++;
        }
        int tong = 7*i;
        System.out.println("tong= "+ tong);
        
    }
    
}
