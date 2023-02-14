package Clases;

// Разбойник    (Имя, Здоровье, Атака, Защита, Уклонение)
//разбойник 
public class Bandit extends BasicHero{
    protected int evasion;


    public Bandit(String name, int hp, int attack, int protection, int evasion) {
        super(name, hp, attack, protection);
        this.evasion = evasion;
    }

    public Bandit(String name) {
        super(name, 200, 10, 5);
        this.evasion = 10;
    }


    @Override
    public String getInfo() {
        return String.format("Я Разбойник - %s", super.getInfo());
    }


    
}
