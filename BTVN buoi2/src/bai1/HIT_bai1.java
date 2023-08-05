/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hit_bai1;

import java.util.Scanner;

/**
 *
 * @author NGUYEN TRANG
 */
public class HIT_bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }

            } else {

                for (int k = 0; k < n; k++) {
                    if (k == 0 || k == n - 2) {
                        System.out.print("*");
                    }
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }
}
