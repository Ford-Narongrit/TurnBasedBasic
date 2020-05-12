public class Weapon {
    private double damage;

    public Weapon(double level) {
        this.damage = 3.5*level;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
}
