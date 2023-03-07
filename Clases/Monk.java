package Clases;

import java.util.ArrayList;

public class Monk extends Magi{

    public Monk(String name, int hp, int attack, int def, int speed, int[] damage, int magic, int x, int y) {
        super(name, hp, attack, def, speed, damage, magic, x, y);
    }
    
    public Monk(String name, int x, int y){
        super(name, 300, 12, 7, 5, new int []{-4, -4}, 1, x ,y);
    }

    

    

    @Override
    public String getInfo() {
        return String.format("Монах -      %s ", super.getInfo());
    }

    @Override
    public void step(ArrayList <BasicHero> list1, ArrayList <BasicHero> list2) {
        if (state.equals("Die")) return;   
        // super.poiskSvoego(list2);
    }

}
