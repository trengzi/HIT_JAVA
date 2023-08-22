
package bai2;

import java.util.Scanner;

/**
 *
 * @author NGUYEN TRANG
 */

public class HCN {
    private float D;
    private float R;
    
   Scanner sc = new Scanner(System.in);

    public HCN() {
    }

    public HCN(float D, float R) {
        this.D = D;
        this.R = R;
    }

    public float getD() {
        return D;
    }

    public float getR() {
        return R;
    }

    public void setD(int D) {
        this.D = D;
    }

    public void setR(int R) {
        this.R = R;
    }
    
    public void nhap(){
        System.out.println("chieu dai: ");
        D= sc.nextInt();
        System.out.println("chieu rong");
        R= sc.nextInt();
    }
    public void veHCN(){
        for (int i = 0; i < R; i++) {
            if (i == 0 || i == R - 1) {
                for (int j = 0; j < D; j++) {
                    System.out.print("*");
                }

            } else {

                for (int k = 0; k < D; k++) {
                    if (k == 0 || k == D - 2) {
                        System.out.print("*");
                    }
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
    public float chuVi(){
        return (R+D)*2;
    }
    public float dienTich(){
        return R*D;
    }
}
