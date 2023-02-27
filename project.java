import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

import Clases.Bandit;
import Clases.BasicHero;
import Clases.Monk;
import Clases.Peasant;
import Clases.Sniper;
import Clases.Spearman;
import Clases.Wizard;
import Clases.Сrossbowman;


public class project {

    private static String getName(){
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name;
    }

    public static void main(String[] args) {

        ArrayList<BasicHero> team1 = newTeam(10, true);
        ArrayList<BasicHero> team2 = newTeam(10, false);
        ArrayList<BasicHero> tmpTeam = new ArrayList<>();
        tmpTeam.addAll(team1);
        tmpTeam.addAll(team2);
        sortByRS(tmpTeam);

        Scanner user_input = new Scanner(System.in);
        
        for (BasicHero bh : tmpTeam) {  
            System.out.println(bh.getInfo()); 
        }

        while (true){
            user_input.nextLine();
            for (BasicHero bh : tmpTeam) {
                if (team1.contains(bh)) bh.step(team1, team2); 
                else bh.step(team2, team1); 
            }
            sortByRS(team1);
            sortByRS(team2);
            for (BasicHero bh : team1) { System.out.println(bh.getInfo());}
            for (BasicHero bh : team2) { System.out.println(bh.getInfo());}
        }
        
          
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

    public static void sortByRS (ArrayList<BasicHero> team) {
        team.sort(new Comparator<BasicHero>() {
            @Override
            public int compare(BasicHero o1, BasicHero o2) {
                if(o1.getSpeed() == o2.getSpeed()) return o1.getHp() - o2.getHp();
                else return o1.getSpeed() - o2.getSpeed();
            }
        });
    }
    
}


