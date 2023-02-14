import java.util.ArrayList;
import java.util.Random;

import Clases.Bandit;
import Clases.BasicHero;
import Clases.Monk;
import Clases.Peasant;
import Clases.Sniper;
import Clases.Spearman;
import Clases.Wizard;
import Clases.Сrossbowman;

// Крестьянин   (Имя, Здоровье, Маскировка, Помощь)

// Разбойник    (Имя, Здоровье, Атака, Защита, Уклонение, Умение)
// копейщик     (Имя, Здоровье, Атака, Защита, Уклонение, Умение)

// Снайпfcdghbер      (Имя, Здоровье, Атака, Защита, меткость, Патроны, Маскировка)
// арбалетчик   (Имя, Здоровье, Атака, Защита, меткость, Патроны, Маскировка)

// Колдун       (Имя, Здоровье, Защита, Мана, Магия)
// монах        (Имя, Здоровье, Защита, Мана, Магия)
  
/**
 * project
 */
public class project {

    private static String getName(){
        String name= String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name;
    }

    public static void main(String[] args) {

        ArrayList<BasicHero> list = new ArrayList<>();
        for (int index = 0; index < 10; index++) { 
            list.add(new Bandit(getName()));
            list.add(new Peasant(getName()));
            list.add(new Wizard(getName()));
            list.add(new Monk(getName()));
            list.add(new Spearman(getName()));
            list.add(new Sniper(getName()));
            list.add(new Сrossbowman(getName()));
        }


        for (BasicHero bh : list) {
            System.out.println(bh.getInfo());
            
        }
            

        Bandit b1 = new Bandit(getName());
        

        // System.out.println(p1.getInfo());

        // Wizard w1 = new Wizard(getName());
        // System.out.println(w1.getInfo());

        // Monk m1 = new Monk(getName());
        // System.out.println(m1.getInfo());

        // Spearman s1 = new Spearman(getName());
        // System.out.println(s1.getInfo());

        // Sniper sn1 = new Sniper(getName());
        // System.out.println(sn1.getInfo());
        
        // Сrossbowman cr1 = new Сrossbowman(getName());
        // System.out.println(cr1.getInfo());    
    }
}
