package Clases;

import java.util.ArrayList;

public abstract class Shooters extends BasicHero implements GameInterface{
    private int cartridges;//патроны

        public Shooters(String name, int hp, int attack, int def, int speed, int[] damage, int cartridges, int x, int y) {
        super(name, hp, attack, def, speed, damage, x, y);
        this.cartridges = cartridges;
    }

    public int getCartridges() {
        return cartridges;
    }

    @Override
    public String getInfo() {
        return String.format("%s | снар: %d; ", 
                                super.getInfo(), cartridges);
    }
    
    
    
    @Override
    public void step(ArrayList <BasicHero> list1, ArrayList <BasicHero> list2) {
        if ( super.getHp() != 0 && cartridges != 0){
            int index = super.poiskVraga(list2);
            attack(list2.get(index));
            // poiskPeasant(list2); 
        }
    } 
}
