/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author NGUYEN TRANG
 */
public class bai4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap he so a: ");
        double a = scanner.nextDouble();

        System.out.print("nhap he so b: ");
        double b = scanner.nextDouble();

        System.out.print("nhap he so c: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("day khong phai chuog trinh bac 4 trung phuong.");
        } else if (delta > 0) {
            double sqrtDelta = Math.sqrt(delta);
            double x1 = (-b + sqrtDelta) / (2 * a);
            double x2 = (-b - sqrtDelta) / (2 * a);
            System.out.println("phuong trinh co 4 nghiem thuc:");
            System.out.println("x1 = " + x1 + ", x2 = " + (-x1) + ", x3 = " + x2 + ", x4 = " + (-x2));
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("phuong trinh co 2 nghiem thuc kep:");
            System.out.println("x1 = x2 = " + x);
        } else {
            double phanThuc = -b / (2 * a);
            double phanAo = Math.sqrt(-delta) / (2 * a);
            System.out.println("Phuong trinh co 4 nghiem phuc:");
            System.out.println("x1 = " + phanThuc + " + " + phanAo + "i");
            System.out.println("x2 = " + phanThuc + " - " + phanAo + "i");
            System.out.println("x3 = " + (-phanThuc) + " + " + phanAo + "i");
            System.out.println("x4 = " + (-phanThuc) + " - " + phanAo + "i");
        }

        scanner.close();
    }

}
