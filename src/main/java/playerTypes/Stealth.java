package playerTypes;

import abilities.IPunch;
import characters.Player;

public class Stealth extends Player implements IPunch {
    public Stealth(String name) {
        super(name);
    }

    public String punch() {
        return "Sha-bang!";
    }
}