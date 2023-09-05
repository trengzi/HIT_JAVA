
package bai1;

/**
 *
 * @author NGUYEN TRANG
 */
public class cat extends animal{
    private String color;
    private String preferences;
    private String ownerName;

    public cat() {
    }


    public cat(String color, String preferences, String ownerName, String name, Byte ege, float weight) {
        super(name, ege, weight);
        this.color = color;
        this.preferences = preferences;
        this.ownerName = ownerName;
    }

    public String getColor() {
        return color;
    }

    public String getPreferences() {
        return preferences;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    
    @Override
    public void inPut(){
        super.inPut();
        sc.nextLine();
        System.out.println("color: ");
        color = sc.nextLine();
        System.out.println("preferences: ");
        preferences= sc.nextLine();
        System.out.println("ower name: ");
        ownerName = sc.nextLine();
        
    }
    @Override
    public void outPut(){
        super.outPut();
        System.out.printf("%25s %25s %25s", color, preferences, ownerName);
        
    }
    @Override
    public void tiengKeu(){
        System.out.println("meow meow");
    }
}
