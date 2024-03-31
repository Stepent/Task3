public class Rider extends Unit {

    private double swamp_penalty = 2.2;
    private double hills_penalty = 1.2;
    private double tree_penalty = 1.5;

    public Rider(String name, int health, int strength, int range, int defence, int movement, int cost) {
        super(name, health, strength, range, defence, movement, cost);
    }

    @Override
    public String toString() {
        return "Тип: Всадник, название: " + getName() + ", здоровье: " + getHealth() + ", сила: " + getStrength() + ", дальность атаки: " + getRange() +
                ", защита: " + getDefence() + ", перемещение: " + getMovement() + ", стоимость: " + getCost() + "\n";
    }

    public double getSwamp_penalty() {
        return swamp_penalty;
    }

    public void setSwamp_penalty(double swamp_penalty) {
        this.swamp_penalty = swamp_penalty;
    }

    public double getHills_penalty() {
        return hills_penalty;
    }

    public void setHills_penalty(double hills_penalty) {
        this.hills_penalty = hills_penalty;
    }

    public double getTree_penalty() {
        return tree_penalty;
    }

    public void setTree_penalty(double tree_penalty) {
        this.tree_penalty = tree_penalty;
    }
}
