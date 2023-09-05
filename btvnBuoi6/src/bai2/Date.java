/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author NGUYEN TRANG
 */
public class Date {
    private Byte year;
    private Byte month;
    private byte day;

    Scanner sc = new Scanner(System.in);

    public Date() {
    }

    public Byte getYear() {
        return year;
    }

    public Byte getMonth() {
        return month;
    }

    public byte getDay() {
        return day;
    }

    public void setYear(Byte year) {
        this.year = year;
    }

    public void setMonth(Byte month) {
        this.month = month;
    }

    public void setDay(byte day) {
        this.day = day;
    }
    
    public void inPut(){
        System.out.println("year: ");
        year= sc.nextByte();
        System.out.println("month: ");
        month = sc.nextByte();
        System.out.println("day");
        day = sc.nextByte();
        
    }
    public void outPut(){
        System.out.printf("%25d %25d %25d ", year,month, day);
        
    }
}
