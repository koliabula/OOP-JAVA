package Clases;

import java.util.Random;


public abstract class BasicHero implements GameInterface{
    protected static int number;
    protected static Random r;

    protected String name;
    private int hp;
    private int maxHp;
    protected int attack;
    protected int def;

    public BasicHero(String name, int hp, int attack, int def) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.attack = attack;
        this.def = def;
    }

    public int getHp() {  return hp;  }
    public int getMaxHp() {    return maxHp; }
    



    @Override
    public String getInfo(){
        return String.format("%s; | hp:  %d; | at: %d; | def: %d;" , 
                                this.name, this.hp, this.attack, this.def);

    }
    @Override
    public void step() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }


}
