package Clases;
public class Peasant extends BasicHero{
    protected int disguise; // маскировка
    protected int help;//лечение
 
    

    public Peasant(String name, int hp, int attack, int protection, int disguise, int help) {
        super(name, hp, attack, protection);
        this.disguise = disguise;
        this.help = help;
    }
    public Peasant(String name){
        super(name, 100, 1, 1);
        this.disguise = 1;
        this.help = 10; 
    }

    



    public int get_disquise() {
        return 0;
    }
    public int get_help() {
        return 0;
    }
    @Override
    public void step() {
        System.out.println();
    }
    @Override
    public String getInfo() {
        return String.format("Я Фермер - %s", super.getInfo());
    }
}
