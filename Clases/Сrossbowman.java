package Clases;
//Снайпер и Арбалетчик
public class Сrossbowman extends Shooters{

    public Сrossbowman(String name, int hp, int attack, int def, int accuracy, int cartridges, int range) {
        super(name, hp, attack, def, accuracy, cartridges, range);
    }
    
    public Сrossbowman(String name){
        super(name, 150, 12, 4, 85, 10, 3);
    }
    @Override
    public String getInfo() {
        return String.format("Я Арбалетчик! - %s ", super.getInfo());
    }
}
