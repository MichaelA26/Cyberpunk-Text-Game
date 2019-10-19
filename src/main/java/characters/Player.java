package characters;

import abilities.*;

public abstract class Player {

    private String name;
    private int HP;
    private IPunch punch;

    public Player(String name, int HP, IPunch punch){
        this.name = name;
        this.HP = 100;
        this.punch = punch;
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return HP;
    }
}