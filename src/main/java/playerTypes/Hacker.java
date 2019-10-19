package playerTypes;

import abilities.IHack;
import abilities.IPunch;
import characters.Player;

public class Hacker extends Player implements IHack, IPunch {
    public Hacker(String name, int HP, IPunch punch) {
        super(name, HP, punch);
    }

    public String punch() {
        return "Sha-bang!";
    }

    public String hack() {
        return "I'm in, time for data extraction.";
    }
}