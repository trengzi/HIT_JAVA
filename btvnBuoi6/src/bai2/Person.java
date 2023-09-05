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
public class Person {
    private String name;
    private Byte age;
    private String address;
    private Date birthDay;
    
    Scanner sc =new Scanner(System.in);

    public Person(String name, Byte age, String address, Date birthDay) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.birthDay = birthDay;
    }

    public Person() {
        birthDay = new Date();
    }

    public String getName() {
        return name;
    }

    public Byte getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
    
    public void inPut(){
        System.out.println("name ");
        name = sc.nextLine();
        System.out.println("age");
        age = sc.nextByte();
        sc.nextLine();
        System.out.println("address");
        address = sc.nextLine();
        System.out.println("birthday");
        birthDay.inPut();
        
    }
    public void outPut(){
        System.out.printf("%25s %25d %25s ", name , age, address);
        System.out.print("    ");
        birthDay.outPut();
    }
    
}
