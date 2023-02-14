package Clases;
public abstract class Magi extends BasicHero {
    private int mana, maxMana;

    public Magi(String name, int hp, int attack, int def, int mana) {
        super(name, hp, attack, def);
        this.mana = mana;
        this.maxMana = mana;
    }

    public int getMana() {return mana;}

    public int getMaxMana() {return maxMana;}

    @Override
    public String getInfo(){
        return String.format(" %s | mana: %d;",super.getInfo(), mana);

    }

    
}
