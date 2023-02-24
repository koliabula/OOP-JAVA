package Clases;

import java.util.ArrayList;

public class Vector2D implements GameInterface{
    protected int x, y;

    public Vector2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
public double distance(Vector2D v) {
    return Math.sqrt(Math.pow(x - v.x, 2) + Math.pow(y-v.y, 2));
}
    

    @Override
    public String getInfo(){
        return String.format("|coord: x:%d, y:%d" , 
                               this.x, this.y);

    }

    public String getInfo1(){
        return String.format("|coord: x:%d, y:%d" , 
                               this.x, this.y);
    }

    @Override
    public void step(ArrayList <BasicHero> list1, ArrayList <BasicHero> list2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    
}
