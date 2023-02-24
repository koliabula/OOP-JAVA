package Clases;

import java.util.ArrayList;
import java.util.Random;


public abstract class BasicHero implements GameInterface{
    protected static int number;
    protected static Random r;

    protected String name;
    private int hp, maxHp, speed;
    protected int attack, def;
    protected int[] damage = new int [2];
    protected Vector2D vector2d;
   

    public BasicHero(String name, int hp, int attack, int def, int speed, int[] damage, int x, int y) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.attack = attack;
        this.def = def;
        this.speed = speed;
        this.damage = damage;
        this.vector2d = new Vector2D (x, y);

    }

    

    public int getHp() {  
        return hp;  
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getMaxHp() {    return maxHp; }
    public Vector2D getVector2d() {    return vector2d;  }


    public int poiskVraga(ArrayList<BasicHero> vragi) {
        double dist, distMin = 100;
        int index = -1;
        for (BasicHero item : vragi) {
            if(item.getHp() > 0){
                dist = vector2d.distance(item.vector2d);
                if (vector2d.distance(item.vector2d) < distMin){    
                    distMin = dist;
                    index = vragi.indexOf(item);
                }
            }
        }
        return index;
    }

    public void attack(BasicHero bh){
        bh.setHp(getHp() - (attack - bh.def));
    }

    // public void poiskPeasant(ArrayList <BasicHero> list2){
        
    //     for (BasicHero bH : list2) {
    //         if()
    //     }
    // }


    @Override
    public String getInfo(){
        return String.format("%s; | hp:  %d; | at: %d; | def: %d; |speed: %d;| %s" , 
                                this.name, this.hp, this.attack, this.def, this.speed, this.vector2d.getX() );

    }
    @Override
    public void step(ArrayList <BasicHero> list1, ArrayList <BasicHero> list2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }

    public int getSpeed() {
        return speed;
    }


}
