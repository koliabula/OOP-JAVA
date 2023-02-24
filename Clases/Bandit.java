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
        super(name, 10, 8, 3, 6, new int []{2, 4},x,y);
        this.evasion = 10;
    }
    

    


    @Override
    public String getInfo() {
        return String.format("Я Разбойник - %s", super.getInfo());
    }

    @Override
    public void step(ArrayList<BasicHero> list1, ArrayList<BasicHero> list2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }


    



}
