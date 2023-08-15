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
public class bai2 {
    static void HienThi(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void Them(int[] arr, int n, int viTri, int giaTri) {
        if (viTri < 0 || viTri > n) {
            System.out.println("Vị trí không hợp lệ");
            return;
        }
        for (int i = n - 1; i >= viTri; i--) {
            arr[i + 1] = arr[i];
        }
        arr[viTri] = giaTri;
        System.out.print("Kết quả: ");
        HienThi(arr, n + 1);
    }

    static void xoa(int[] arr, int n, int viTri) {
        if (viTri < 0 || viTri >= n) {
            System.out.println("Vị trí không hợp lệ");
            return;
        }
        for (int i = viTri; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.print("Kết quả: ");
        HienThi(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[100];
        System.out.print("Nhập mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Nhập vị trí cần thêm/xóa phần tử: ");
        int position = sc.nextInt();

        if (position < 0 || position > n) {
            System.out.println("Vị trí không hợp lệ");
            return;
        }

        System.out.print("Bạn muốn thêm hay xóa? (1: Thêm, 2: Xóa): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Nhập giá trị phần tử mới: ");
            int value = sc.nextInt();
            Them(arr, n, position, value);
        } else if (choice == 2) {
            xoa(arr, n, position);
        } else {
            System.out.println("Lựa chọn không hợp lệ");
        }
    }
}
