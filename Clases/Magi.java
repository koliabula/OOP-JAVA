package Clases;

import java.util.ArrayList;

public abstract class Magi extends BasicHero {
    private int magic;

    

    public Magi(String name, int hp, int attack, int def, int speed, int[] damage, int magic, int x, int y) {
        super(name, hp, attack, def, speed, damage, x, y);
        this.magic = magic;
    }



    
}
