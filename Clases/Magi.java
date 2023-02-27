package Clases;

import java.util.ArrayList;

public abstract class Magi extends BasicHero {
    private int magic;

    

    public Magi(String name, int hp, int attack, int def, int speed, int[] damage, int magic, int x, int y) {
        super(name, hp, attack, def, speed, damage, x, y);
        this.magic = magic;
    }



    @Override
    public void step(ArrayList <BasicHero> list1, ArrayList <BasicHero> list2) {
        if (state.equals("Die")) return;   
        super.poiskSvoego(list1);
    } 
}
