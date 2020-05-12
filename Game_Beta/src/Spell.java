public class Spell {
    private double damage;

    public Spell(double level) {
        this.damage = 2.1*level;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
}
