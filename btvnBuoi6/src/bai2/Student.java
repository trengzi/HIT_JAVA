/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author NGUYEN TRANG
 */
public class Student extends Person {
    private String id;
    private String lop;
    private String school;

    public Student(String id, String Class, String school, String name, Byte age, String address, Date birthDay) {
        super(name, age, address, birthDay);
        this.id = id;
        this.lop = Class;
        this.school = school;
    }

    public Student() {
        super();
    }

    public String getId() {
        return id;
    }

    public String getLop() {
        return lop;
    }

    public String getSchool() {
        return school;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    
    @Override
    public void inPut(){
        super.inPut();
        System.out.println("id");
        id = sc.nextLine();
        System.out.println("class");
        lop = sc.nextLine();
        System.out.println("school");
        school = sc.nextLine();
    }
    @Override
    public void outPut(){
        super.outPut();
        System.out.printf("%25s %25s %25s ", id, lop, school);
    }
    
}
