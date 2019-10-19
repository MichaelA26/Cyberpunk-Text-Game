package playerTypes;

import abilities.ICoerce;
import abilities.IPunch;
import characters.Player;

public class Diplomat extends Player implements IPunch, ICoerce {
    public Diplomat(String name) {
        super(name);
    }

    public String punch() {
        return "Sha-bang!";
    }

    public String coerce() {
        return "This is not the outcome you're looking for.";
    }

}