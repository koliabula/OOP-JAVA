package Clases;

import java.util.ArrayList;

// Разбойник    (Имя, Здоровье, Атака, Защита, Уклонение)
//разбойник 
public class Bandit extends BasicHero{
    protected int evasion;

    public Bandit(String name, int hp, int attack, int def, int speed, int[] damage, int evasion, int x, int y) {
        super(name, hp, attack, def, speed, damage,x,y);
        this.evasion = evasion;
    }

    public Bandit(String name, int x, int y) {
        super(name, 100, 8, 3, 6, new int []{2, 4},x,y);
        this.evasion = 10;
    }
    

    


    @Override
    public String getInfo() {
        return String.format("Разбойник -  %s", super.getInfo());
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
