
package buoi3;

import java.util.Scanner;

/**
 *
 * @author NGUYEN TRANG
 */
public class bai1 {
    
    static void demDS(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            boolean KTTrung = false;
            for (int k = i - 1; k >= 0; k--) {
                if (arr[i] == arr[k]) {
                    KTTrung = true;
                    break;
                }
            }
            if (!KTTrung) {
                System.out.println("Số " + arr[i] + " xuất hiện " + count + " lần");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        demDS(arr);
    }
}
