package Clases;

import java.util.ArrayList;

//разбойник и Копейщик
public class Spearman extends BasicHero{

    
    public Spearman(String name, int hp, int attack, int def, int speed, int[] damage, int x, int y) {
        super(name, hp, attack, def, speed, damage, x, y);
        
    }

    public Spearman(String name, int x, int y){
        super(name, 100, 4, 5, 4, new int[] {1, 3}, x, y);
    }
    



    @Override
    public String getInfo() {
        return String.format("Копейщик -   %s", super.getInfo());
    }

    
    @Override
    public void step(ArrayList<BasicHero> list1, ArrayList<BasicHero> list2) {
        if (state.equals("Die")) return;
            
        int index = super.poiskVraga(list2);
        if (index >= 0 && super.coords.distance(list2.get(index).coords) < 2){
            attack(list2.get(index));
            return;

        }else if (index >= 0) { 
            go(list2.get(index), list1, list2);
            return;
        }else {
            System.out.println("Game Over");
            System. exit(0);
        }
    }
}
