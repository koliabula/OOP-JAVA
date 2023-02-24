import java.util.ArrayList;
import java.util.Comparator;
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
 * Атака защита у всех!
 * выстрелы только у лучников
 * крестьянин 1 ход принести 1 стрелу
 * повреждения интервал(3-5)
 * скорость (очерёдность хода персонажа)
 * координаты
 * 
 * задание 1:
 * 2 списка:
 *      1 Крестьянин	Разбойник	Снайпер	Колдун
        2 крестьянин    копейщик	арбалетчик	монах
    вывести в консоль персонажей с учётом скорости

    10 героев в команде

 */
public class project {

    private static String getName(){
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name;
    }

    public static void main(String[] args) {

        ArrayList<BasicHero> team1 = newTeam(10, true);
        ArrayList<BasicHero> team2 = newTeam(10, false);
        ArrayList<BasicHero> tmpTeam = team1;
        tmpTeam.addAll(team2);
        sortByRS(tmpTeam);
        for (BasicHero bh : team1) {  System.out.println(bh.getInfo()); }

        
          
    }


    public static ArrayList<BasicHero> newTeam(int size, boolean frac) { 
        ArrayList<BasicHero> team = new ArrayList<>();
        int coordX;
        if (frac) {coordX = 1;}
        else {coordX = 10;}
    
        for (int i = 1; i < size + 1; i++) {
            switch (new Random().nextInt(1, 5)) {
                case (1):
                    if (frac) team.add(new Сrossbowman(getName(), coordX, i+1));
                    else team.add(new Sniper(getName(), coordX, i+1));
                    break;
                case (2):
                    if (frac) team.add(new Monk(getName(), coordX, i+1));
                    else team.add(new Wizard(getName(), coordX, i+1));
                    break;
                case (3):
                    team.add(new Peasant(getName(), coordX, i+1));
                    break;
                case (4):
                    if (frac) team.add(new Spearman(getName(), coordX, i+1));
                    else team.add(new Bandit(getName(), coordX, i+1));
                    break;
            }
        }
        return team;
    }

    public static void sortByRS (ArrayList team) {
        team.sort(new Comparator<BasicHero>() {
            @Override
            public int compare(BasicHero o1, BasicHero o2) {
                return o1.getSpeed() - o2.getSpeed();
            }
        });
    }
    
}


