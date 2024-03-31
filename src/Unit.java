public class Unit {

    private String name;
    private int health;
    private int strength;
    private int range;
    private int defence;
    private int movement;
    private int cost;

    public Unit(String name, int health, int strength, int range, int defence, int movement, int cost) {
        super();
    }

    @Override
    public String toString() {
        return "Название: " + name + ", здоровье: " + health + ", сила: " + strength + ", дальность атаки: " + range +
                ", защита: " + defence + ", перемещение: " + movement + ", стоимость: " + cost + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getMovement() {
        return movement;
    }

    public void setMovement(int movement) {
        this.movement = movement;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

}
