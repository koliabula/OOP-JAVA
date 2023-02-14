package Clases;
public class Wizard extends Magi{

    public Wizard(String name, int hp, int attack, int def, int mana) {
        super(name, hp, attack, def, mana);
    }

    public Wizard(String name){
        super(name, 200, 10, 5, 200);
    }

    @Override
    public String getInfo() {
        return String.format("Я Маг - %s ", super.getInfo());
    }


    

    
}