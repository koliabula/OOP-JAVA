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
        if (state.equals("Die") || cartridges == 0) return;
            
        int index = super.poiskVraga(list2);
        if (index >= 0){
            attack(list2.get(index));
        } else {
            System.out.println("Game Over");
            System. exit(0);
        }
        
        if(poiskHero(list1, "Фермер - ") != -1){
            list1.get(poiskHero(list1, "Фермер - ")).state = "Buzy";
            return;
        }
        cartridges--;
    } 
}
