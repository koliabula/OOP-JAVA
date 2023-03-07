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
import Clases.Crossbowman;


public class project {

    public static ArrayList<BasicHero> team1 = new ArrayList<>();
    public static ArrayList<BasicHero> team2 = new ArrayList<>();
    public static ArrayList<BasicHero> allTeam = new ArrayList<>();
    private static String getName(){
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name;
    }

    public static void main(String[] args) {

        team1 = newTeam(10, true);
        team2 = newTeam(10, false);
        allTeam.addAll(team1);
        allTeam.addAll(team2);
        sortByRS(allTeam);

        Scanner user_input = new Scanner(System.in);
        
        for (BasicHero bh : allTeam) {  
            System.out.println(bh.getInfo()); 
        }

        while (true){
            View.view();
            user_input.nextLine();
            for (BasicHero bh : allTeam) {
                if (team1.contains(bh)) bh.step(team1, team2); 
                else bh.step(team2, team1); 
            }
        }
    }



    public static ArrayList<BasicHero> newTeam(int size, boolean frac) { 
        ArrayList<BasicHero> team = new ArrayList<>();
        int coordY;
        if (frac) {coordY = 1;}
        else {coordY = 10;}
    
        for (int i = 1; i < size + 1; i++) {
            switch (new Random().nextInt(1, 5)) {
                case (1):
                    if (frac) team.add(new Crossbowman(getName(), i, coordY));
                    else team.add(new Sniper(getName(), i, coordY));
                    break;
                case (2):
                    if (frac) team.add(new Monk(getName(), i, coordY));
                    else team.add(new Wizard(getName(), i, coordY));
                    break;
                case (3):
                    team.add(new Peasant(getName(), i, coordY));
                    break;
                case (4):
                    if (frac) team.add(new Spearman(getName(), i, coordY));
                    else team.add(new Bandit(getName(), i, coordY));
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
