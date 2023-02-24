package Clases;
public class Wizard extends Magi{

    public Wizard(String name, int hp, int attack, int def, int speed, int[] damage, int magic, int x, int y) {
        super(name, hp, attack, def, speed, damage, magic, x, y);
    }

    public Wizard(String name, int x, int y){
        super(name, 30, 17, 12, 9, new int []{-5, -5}, 1, x, y);
    }

    

    @Override
    public String getInfo() {
        return String.format("Я Маг - %s ", super.getInfo());
    }


    

    
}