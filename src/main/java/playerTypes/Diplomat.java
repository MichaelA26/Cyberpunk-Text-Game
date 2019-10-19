package playerTypes;

import abilities.IPunch;
import characters.Player;

public class Diplomat extends Player implements IPunch {
    public Diplomat(String name) {
        super(name);
    }

    public String punch() {
        return "Sha-bang!";
    }
}