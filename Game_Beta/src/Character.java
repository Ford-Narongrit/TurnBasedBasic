

public class Character {
    private String name;
    private double lifepoint;
    private double maxLifepoint;
    private double armor;
    private int level;
    private double exp;
    private double maxExp;



    public Character(String name, int level) {
        this.name = name;
        this.lifepoint = level * 10;
        this.armor = Helper.round (level * 1.1);
        this.level = level;
        this.maxLifepoint = level * 10;
        this.exp = 0;
        this.maxExp = level * 10; //
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLifepoint() {
        return lifepoint;
    }


    public int getLevel() {
        return level;
    }

    public double getArmor() {
        return armor;
    }

    public void levelUp() {
        level = level + 1;
        armor = Helper.round( armor + 4.5);
        maxLifepoint = maxLifepoint + 10;
    }


    public void attack(Character opponent, char type) {
        if (type == 's') {
            opponent.lifepoint = Helper.round(opponent.lifepoint - level * 2.1);
        } else if (type == 'w') {
            double damage = level * 4.5 - opponent.armor;
            if (damage >= 0)
                opponent.lifepoint = Helper.round(opponent.lifepoint - damage);
        }
    }

    public void refresh() {
        lifepoint = maxLifepoint;
    }

    public boolean isDead() {
        return lifepoint <= 0;
    }

    public void plusExp() {

    }

    @Override
    public String toString() {
        return name +
                ", LP =" + lifepoint +
                " /" + maxLifepoint +
                ", armor=" + armor +
                ", level=" + level;
    }
}
