package Clases;
//разбойник и Копейщик
public class Spearman extends BasicHero{

    
    public Spearman(String name, int hp, int attack, int def, int speed, int[] damage, int x, int y) {
        super(name, hp, attack, def, speed, damage, x, y);
        
    }

    public Spearman(String name, int x, int y){
        super(name, 10, 4, 5, 4, new int[] {1, 3}, x, y);
    }
    



    @Override
    public String getInfo() {
        return String.format("Я Копейщик - %s", super.getInfo());
    }
}
