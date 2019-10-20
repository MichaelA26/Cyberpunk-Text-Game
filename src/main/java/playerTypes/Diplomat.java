package playerTypes;

import characters.Player;
import abilities.ICoerce;
import abilities.IPunch;
import weapons.IShoot;

public class Diplomat extends Player implements ICoerce, IShoot {

    private final ICoerce coerce;
    private final IShoot shoot;

    public Diplomat(String name, int HP, IPunch punch, ICoerce coerce, IShoot shoot) {
        super(name, 100);
        this.coerce = coerce;
        this.shoot = shoot;
    }

    public int coerce() {
        return 25;
    }

    public int shoot() {
        return 15;
    }
}