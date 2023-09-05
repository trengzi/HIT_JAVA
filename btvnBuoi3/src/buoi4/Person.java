package buoi4;

/**
 *
 * @author NGUYEN TRANG
 */
public class Person {

    private String name;
    private int tuoi;
    private int id;

    public Person(String name, int tuoi) {
        this.name = name;
        this.tuoi = tuoi;
        this.id = id;

    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public void setId(int id){
        if(id>100) return;
        else{
            this.id = id;
        }
    }
    

    public void di() {
        System.out.println("co the di");
    }

    public static void main(String[] args) {
        Person p1 = new Person("trang", 20);
        Person p2 = new Person();
        p2.name = "trang";
        p1.di();
        p1.setName("van la trang");
        System.out.println(p1.getName());
    }

}
