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
    public String state;
   

    public BasicHero(String name, int hp, int attack, int def, int speed, int[] damage, int x, int y) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.attack = attack;
        this.def = def;
        this.speed = speed;
        this.damage = damage;
        this.vector2d = new Vector2D (x, y);
        state = "Stand";

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


    public void poiskSvoego(ArrayList<BasicHero> svoi) {
        for (BasicHero item : svoi) {
            if(item.hp < item.maxHp && !item.state.equals("Die")){
                item.getDamage(this.damage[0]);
                return;
            }
        }
    }

    public void attack(BasicHero bh){
        float d = (bh.def - attack > 0) ? damage[0]:(bh.def - attack < 0) ? damage[1] : (damage[1]+damage[0])/2;
        bh.getDamage(d);

    }


    protected void getDamage(float damage){
        hp -= damage;
        if (hp > maxHp) hp = maxHp;
        if (hp < 0) {
            state = "Die";
            hp = 0;
        }
    }

    public int poiskHero(ArrayList <BasicHero> list, String name){
        for (BasicHero bh : list) {  
            if(bh.getInfo().contains(name) && bh.state.equals("Stand")){
                return list.indexOf(bh);
            }  
        }
        return -1;
    }


    @Override
    public String getInfo(){
        return String.format("%s; | state = %s | hp:  %d; | at: %d; | def: %d; |speed: %d;| %s" , 
                                this.name, this.state, this.hp, this.attack, this.def, this.speed, this.vector2d.getX() );

    }
    @Override
    public void step(ArrayList <BasicHero> list1, ArrayList <BasicHero> list2) {

    }

    public int getSpeed() {
        return speed;
    }


}
