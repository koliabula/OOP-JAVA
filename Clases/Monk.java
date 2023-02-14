package Clases;
public class Monk extends Magi{

    public Monk(String name, int hp, int attack, int def, int mana) {
        super(name, hp, attack, def, mana);
    }

    public Monk(String name){
        super(name, 200, 10, 5, 200);
    }

    @Override
    public String getInfo() {
        return String.format("Я Монах - %s ", super.getInfo());
    }

}
