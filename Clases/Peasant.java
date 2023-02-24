package Clases;

import java.util.ArrayList;

public class Peasant extends BasicHero{
    protected int disguise; // маскировка
    protected int delivery;//доставка
 
    

    public Peasant(String name, int hp, int attack, int def, int speed, int[] damage, int disguise, int help, int x, int y) {
        super(name, hp, attack, def, speed, damage, x, y);
        this.disguise = disguise;
        this.delivery = delivery;
    }
    public Peasant(String name, int x, int y){
        super(name, 1, 1, 1, 3, new int[]{1, 1},x,y);
        this.disguise = 1;
        this.delivery = 1; 
    }

    



    
    public int get_disquise() {
        return 0;
    }
    public int get_help() {
        return 0;
    }
    @Override
    public void step(ArrayList <BasicHero> list1, ArrayList <BasicHero> list2) {
        System.out.println();
    }
    @Override
    public String getInfo() {
        return String.format("Я Фермер - %s", super.getInfo());
    }
}
