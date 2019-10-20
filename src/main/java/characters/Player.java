package characters;

public abstract class Player {

    private String name;
    private int HP;
    private int attackDamage;

    public Player(String name, int HP){
        this.name = name;
        this.HP = 100;
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
