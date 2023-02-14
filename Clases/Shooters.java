package Clases;
public abstract class Shooters extends BasicHero{
    protected int accuracy; // меткость
    private int cartridges;//патроны
    protected int range;

    public Shooters(String name, int hp, int attack, int def, int accuracy, int cartridges, int range) {
        super(name, hp, attack, def);
        this.accuracy = accuracy;
        this.cartridges = cartridges;
        this.range = range;
    }   

    public int getCartridges() {
        return cartridges;
    }

    @Override
    public String getInfo() {
        return String.format("%s | мет: %d; | снар: %d; | range: %d", 
                                super.getInfo(), accuracy, cartridges, range);
    }
    
}
