package Clases;

import java.util.ArrayList;

public class Wizard extends Magi{

    public Wizard(String name, int hp, int attack, int def, int speed, int[] damage, int magic, int x, int y) {
        super(name, hp, attack, def, speed, damage, magic, x, y);
    }

    public Wizard(String name, int x, int y){
        super(name, 300, 17, 12, 9, new int []{-5, -5}, 1, x, y);
    }

    

    @Override
    public String getInfo() {
        return String.format("Волшебник -    %s ", super.getInfo());
    }

    @Override
    public void step(ArrayList <BasicHero> list1, ArrayList <BasicHero> list2) {
        if (state.equals("Die")) return;   
        // super.poiskSvoego(list1);
    }
    

    
}