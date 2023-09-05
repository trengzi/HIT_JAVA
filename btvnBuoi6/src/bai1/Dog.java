
package bai1;

/**
 *
 * @author NGUYEN TRANG
 */
public class Dog extends animal{
    private String character;


    public Dog(String character, String name, Byte ege, float weight) {
        super(name, ege, weight);
        this.character = character;
    }

    Dog() {
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }
    
    @Override
    public void inPut(){
        super.inPut();
        sc.nextLine();
        System.out.println("character: ");
        character = sc.nextLine();
        
    }
    @Override
    public void outPut(){
        super.outPut();
        System.out.printf("%25s", character);
    }
    @Override
    public void tiengKeu(){
        System.out.println("gow gow");
    }
}
