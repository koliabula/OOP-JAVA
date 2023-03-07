package Clases;
//Снайпер и Арбалетчик
public class Crossbowman extends Shooters{

    
    
    public Crossbowman(String name, int hp, int attack, int def, int speed, int[] damage, int cartridges, int x, int y) {
        super(name, hp, attack, def, speed, damage, cartridges, x, y);
    }

    public Crossbowman(String name, int x, int y){
        super(name, 100, 6, 3, 4, new int[] {2, 3}, 16,x ,y);
    }
    @Override
    public String getInfo() {
        return String.format("Арбалетчик - %s ", super.getInfo());
    }
}
