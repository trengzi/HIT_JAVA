
package bai1;
import java.util.Scanner;
/**
 *
 * @author NGUYEN TRANG
 */
public class main {
    static sach sach[];
    
    static void nhapMain(){
        Scanner sc= new Scanner(System.in);
        sach = new sach[5];
        for(int i=0;i<5;i++){
            System.out.println("nhap sach thu "+ (i+1));
            sach[i]= new sach();
            sach[i].nhap();
        }
    }
    static void inDL(){
        for(int i=0;i<5;i++){
            sach[i].inThongTin();
        }
    }
    static void inTieuDe() {
        System.out.printf("%25s %25s %25s %25s %25s","ma sach","ten sach","tac gia","nha xuat ban","nam xuat ban");
        System.out.println();
    }

    public static void main(String[] args) {
        nhapMain();
        inTieuDe();
        inDL();
    }
}
