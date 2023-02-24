package Clases;
//Снайпер 
public class Sniper extends Shooters{

    
    public Sniper(String name, int hp, int attack, int def, int speed, int[] damage, int cartridges, int x, int y) {
        super(name, hp, attack, def, speed, damage, cartridges, x, y);
    }
    
    public Sniper(String name, int x, int y){
        super(name, 15, 12, 9, 9, new int[] {8, 10}, 32, x, y);
    }


    @Override
    public String getInfo() {
        return String.format("Я Снайпер! - %s ", super.getInfo());
    }
}
