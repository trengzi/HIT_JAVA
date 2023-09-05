/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author NGUYEN TRANG
 */
public class main {
    public static void main(String[] args) {
       
        cat cat = new cat();
        Dog dog = new Dog();
        System.out.println("cat information ");
        cat.inPut();
        System.out.println("dog information");
        dog.inPut();
        System.out.println("in thong tin: ");
        System.out.println("cat");
        cat.outPut();
        System.out.println();
        System.out.println("dog");
        dog.outPut();
    }
    
}
