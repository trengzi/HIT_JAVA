
package bai1;

import java.util.Scanner;

public class animal {
    
    private String name;
    private Byte age;
    private float weight;
    Scanner sc= new Scanner(System.in);

    public animal() {
    }

    public animal(String name, Byte ege, float weight) {
        this.name = name;
        this.age = ege;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public Byte getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    public void inPut(){
        System.out.println("name: ");
        name = sc.nextLine();
        System.out.println("age: ");
        age = sc.nextByte();
        System.out.println("weight: ");
        weight = sc.nextFloat();
        
    }
    public void outPut(){
        System.out.printf("%25s %25d %25f", name, age ,weight);
        
    }
    public void tiengKeu(){
        
    }


    
}
