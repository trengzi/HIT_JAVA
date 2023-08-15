/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvnbuoi3;

import java.util.Scanner;

/**
 *
 * @author NGUYEN TRANG
 */
public class bonus {

    static String fomat(String ten) {
        String[] words = ten.trim().split("\\s+");
        StringBuilder fomatTen = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                String formatTu = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                fomatTen.append(formatTu).append(" ");
            }
        }

        return fomatTen.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        String ten = sc.nextLine();

        String formattedName = fomat(ten);
        System.out.println("Kết quả: " + formattedName);
    }
}
