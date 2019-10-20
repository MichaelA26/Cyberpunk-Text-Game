package playerTypes;

import characters.Player;
import abilities.IHack;
import abilities.IPunch;

public class Hacker extends Player implements IHack{

    private final IHack hack;

    public Hacker(String name, int HP, IPunch punch, IHack hack) {
        super(name, 100);
        this.hack = hack;
    }

    public int hack() {
        return 25;
    }
}