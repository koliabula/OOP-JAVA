package Clases;
//разбойник и Копейщик
public class Spearman extends BasicHero{
    int pike;

    public Spearman(String name, int hp, int attack, int def, int pike) {
        super(name, hp, attack, def);
        this.pike = pike;
    }

    public Spearman(String name){
        super(name, 200, 10, 5);
        this.pike = 10;
    }
    
    @Override
    public String getInfo() {
        return String.format("Я Копейщик - %s", super.getInfo());
    }
}
