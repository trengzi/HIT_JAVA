/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author NGUYEN TRANG
 */
public class HangHoaGiaDung extends HangHoa{
    private String chucNang;

    public HangHoaGiaDung() {
    }

    public String getChucNang() {
        return chucNang;
    }

    public void setChucNang(String chucNang) {
        this.chucNang = chucNang;
    }
    @Override
    public void inPut(){
        super.inPut();
        System.out.println(" chuc nang");
        chucNang = sc.nextLine();
    }
    @Override
    public void outPut(){
        System.out.printf("%25s", chucNang);
        super.outPut();
        
    }
}
