package Clases;

import java.util.ArrayList;

/**
 * game
 */
public interface GameInterface {

    void step(ArrayList <BasicHero> list1, ArrayList <BasicHero> list2);

    String getInfo();

    
    
    
}