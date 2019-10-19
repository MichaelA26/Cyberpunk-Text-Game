package playerTypes;

import abilities.IPunch;
import abilities.ISneakAttack;
import characters.Player;

public class Stealth extends Player implements IPunch, ISneakAttack {
    public Stealth(String name) {
        super(name);
    }

    public String punch() {
        return "Sha-bang!";
    }

    public String sneakAttack() {
        return "Silent take-down.";
    }

}