package characters;

public class Enemy {

    String name;
    int HP;

    public Enemy(String name){
        this.name = name;
        this.HP = 50;
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return HP;
    }
}