package Clases;
//Снайпер 
public class Sniper extends Shooters{

    public Sniper(String name, int hp, int attack, int def, int accuracy, int cartridges, int range) {
        super(name, hp, attack, def, accuracy, cartridges, range);
    }
    
    public Sniper(String name){
        super(name, 150, 9, 4, 100, 20, 5);
    }

    @Override
    public String getInfo() {
        return String.format("Я Снайпер! - %s ", super.getInfo());
    }
}
