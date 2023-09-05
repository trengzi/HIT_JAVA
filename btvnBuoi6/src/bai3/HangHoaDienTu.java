/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author NGUYEN TRANG
 */
public class HangHoaDienTu extends HangHoa{
    private int thoigianBaoHanh;
    private int congSuat;

    public HangHoaDienTu() {
    }

    public int getThoigianBaoHanh() {
        return thoigianBaoHanh;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setThoigianBaoHanh(int thoigianBaoHanh) {
        this.thoigianBaoHanh = thoigianBaoHanh;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }
    
    @Override
    public void inPut(){
        super.inPut();
        System.out.println("thoi gian bao hanh: ");
        thoigianBaoHanh = sc.nextInt();
        System.out.println("cong suat ");
        congSuat = sc.nextInt();
        
    }
    @Override
    public void outPut(){
        System.out.printf("%25d %25d ", thoigianBaoHanh, congSuat);
        super.outPut();
        
    }
}
