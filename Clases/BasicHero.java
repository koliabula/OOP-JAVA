package Clases;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.text.StyledEditorKit.ForegroundAction;


public abstract class BasicHero implements GameInterface{
    protected static int number;
    protected static Random r;

    protected String name;
    private int hp, maxHp, speed;
    protected int attack, def;
    protected int[] damage = new int [2];
    protected Vector2D coords;
    public String state;
   

    public BasicHero(String name, int hp, int attack, int def, int speed, int[] damage, int x, int y) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.attack = attack;
        this.def = def;
        this.speed = speed;
        this.damage = damage;
        this.coords = new Vector2D (x, y);
        state = "Stand";

    }

    public int[] getCoords() {return new int[]{coords.x, coords.y};}

    public int getHp() {  
        return hp;  
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getMaxHp() {    return maxHp; }


    public int poiskVraga(ArrayList<BasicHero> vragi) {
        double dist, distMin = 100;
        int index = -1;
        for (BasicHero item : vragi) {
            if(item.getHp() > 0){
                dist = coords.distance(item.coords);
                if (coords.distance(item.coords) < distMin){    
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
        if (hp <= 0) {
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

    public void go(BasicHero vrag, ArrayList <BasicHero> list1, ArrayList <BasicHero> list2) {
        int distX = vrag.coords.x - this.coords.x;
        int distY = vrag.coords.y - this.coords.y;
        ArrayList<int[]> listCoords = new ArrayList<>();
        for (BasicHero bh : list1) {
            if(bh.state != "Die"){
                listCoords.add(bh.getCoords()); 
            } 
        }
        for (BasicHero bh : list2) {
            if(bh.state != "Die"){
                listCoords.add(bh.getCoords()); 
            }   
        }

        if (distX >= 0){
            if(distY >= 0){
                if (distX > distY && !listCoords.contains(new int[] {coords.x+1, coords.y}))        this.coords.x++;
                else if(!listCoords.contains(new int[] {coords.x, coords.y+1}))                     this.coords.y++;

            }
            if(distY < 0){
                if (distX > Math.abs(distY) && !listCoords.contains(new int[] {coords.x+1, coords.y}))  this.coords.x++;
                else if(!listCoords.contains(new int[] {coords.x, coords.y-1}))                         this.coords.y--;
            }
        }else{
            if(distY >= 0){
                if (Math.abs(distX) > distY && !listCoords.contains(new int[] {coords.x-1, coords.y}))  this.coords.x--;
                else if(!listCoords.contains(new int[] {coords.x, coords.y+1}))                         this.coords.y++;

            }
            if(distY < 0){
                if (Math.abs(distX) > Math.abs(distY) && !listCoords.contains(new int[] {coords.x-1, coords.y}))  this.coords.x--;
                else if(!listCoords.contains(new int[] {coords.x, coords.y-1}))                         this.coords.y--;
            }
        }
    }


    @Override
    public String getInfo(){
        return String.format("%10s; | state = %5s | hp:  %2d; | at: %2d; | def: %2d; |speed: %1d;| x:%1s; | y:%1s" , 
                                this.name, this.state, this.hp, this.attack, this.def, this.speed, this.coords.getX(), this.coords.getY() );

    }
    @Override
    public void step(ArrayList <BasicHero> list1, ArrayList <BasicHero> list2) {

    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return name +
                " H:" + Math.round(hp) +
                " D:" + def +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damage[0]+damage[1])/2)) +" "+
                state;
    }

}
