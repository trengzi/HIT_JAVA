/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NGUYEN TRANG
 */
public class main {
     

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap so student");
        int n = sc.nextInt();
        ArrayList<Student> studentList = new ArrayList<Student>(n);
        
        for(int i=0;i<n;i++){
            System.out.println("nhap tt student thu "+ (i+1));
            Student st = new Student();
            st.inPut();
            studentList.add(st);
        }
        System.out.println("danh sach tt student ");
        for(Student st : studentList){
            
            st.outPut();
            System.out.println();
        }
    }
    
}
