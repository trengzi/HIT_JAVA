
package bai1;

import java.util.Scanner;

/**
 *
 * @author NGUYEN TRANG
 */
public class sach {
    
    private String maS;
    private String tenS;
    private String tenTG;
    private String nhaXB;
    protected int namXB;     
    
    Scanner sc= new Scanner(System.in);


    public sach() {
    }

    public sach(String maS, String tenS, String tenTG, String nhaXB, int namXB) {
        this.maS = maS;
        this.tenS = tenS;
        this.tenTG = tenTG;
        this.nhaXB = nhaXB;
        this.namXB = namXB;
    }

    public String getMaS() {
        return maS;
    }

    public String getTenS() {
        return tenS;
    }

    public String getTenTG() {
        return tenTG;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public int getNamXB() {
        return namXB;
    }

    public void setMaS(String maS) {
        this.maS = maS;
    }

    public void setTenS(String tenS) {
        this.tenS = tenS;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }
    
    public void nhap(){
        System.out.println("nhap ma sach: ");
        maS = sc.nextLine();
        System.out.println("ten sach: ");
        tenS = sc.nextLine();
        System.out.println("nhap ten giac gia: ");
        tenTG = sc.nextLine();
        System.out.println("nha xuat ban: ");
        nhaXB = sc.nextLine();
        System.out.println("nam xuat ban: ");
        namXB = sc.nextInt();
    }
    public void inThongTin(){
     
        
        System.out.printf("%25s %25s %25s %25s %25d ", getMaS(), getTenS(), getTenTG(),getNhaXB(), namXB);
        System.out.println();
    }
    

    
}
