package enemyTypes;

import abilities.IDefend;
import characters.Enemy;

public class Android extends Enemy implements IDefend {

    private int HP;
    private int attackDamage;

    public Android(String name, int HP, int attackDamage) {
        super(name, HP, attackDamage);
        this.HP = 50;
        this.attackDamage = 10;
    }

    public String defend() {
        return "Android defence systems online.";
    }

    public int hasHP() {
        return HP;
    }

    public void decreaseHP(int value) {
        HP -= value;
    }

    public int attack() {
        return attackDamage;
    }
}