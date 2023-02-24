package Clases;
//Снайпер и Арбалетчик
public class Сrossbowman extends Shooters{

    
    
    public Сrossbowman(String name, int hp, int attack, int def, int speed, int[] damage, int cartridges, int x, int y) {
        super(name, hp, attack, def, speed, damage, cartridges, x, y);
    }

    public Сrossbowman(String name, int x, int y){
        super(name, 10, 6, 3, 4, new int[] {2, 3}, 16,x ,y);
    }
    @Override
    public String getInfo() {
        return String.format("Я Арбалетчик! - %s ", super.getInfo());
    }
}
