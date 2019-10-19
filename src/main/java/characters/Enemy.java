package characters;

public class Enemy {

    String name;
    int HP;
    int attackDamage;

    public Enemy(String name, int HP, int attackDamage){
        this.name = name;
        this.HP = HP;
        this.attackDamage = attackDamage;
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return HP;
    }

    public int attack() {
        return attackDamage;
    }
}