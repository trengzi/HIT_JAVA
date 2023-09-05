
package bai3;

import java.util.Scanner;

/**
 *
 * @author NGUYEN TRANG
 */
public class VatLieu {
    private String ten;
    private String mauSac;
    private int doCung;
    Scanner sc = new Scanner(System.in);


    public VatLieu() {
    }

    public String getTen() {
        return ten;
    }

    public String getMauSac() {
        return mauSac;
    }

    public int getDoCung() {
        return doCung;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public void setDoCung(int doCung) {
        this.doCung = doCung;
    }
    
    public void inPut(){
        System.out.println("ten: ");
        ten = sc.nextLine();
        System.out.println("mau sac: ");
        mauSac = sc.nextLine();
        System.out.println("do cung: ");
        doCung = sc.nextInt();
    }
    public void outPut(){
        System.out.printf("%25s %25s %25d", ten, mauSac, doCung);
        System.out.println();
        
    }
    
}
