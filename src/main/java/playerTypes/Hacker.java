package playerTypes;

import characters.Player;
import abilities.IHack;
import abilities.IPunch;
import weapons.IShoot;

public class Hacker extends Player implements IHack, IShoot {

    private final IHack hack;

    public Hacker(String name, int HP, IPunch punch, IHack hack, IShoot shoot) {
        super(name, 100);
        this.hack = hack;
    }

    public int hack() {
        return 25;
    }

    public int shoot() {
        return 15;
    }
}