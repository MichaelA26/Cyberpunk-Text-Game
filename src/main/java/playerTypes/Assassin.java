package playerTypes;

import characters.Player;
import abilities.ISneakAttack;
import abilities.IPunch;
import weapons.IShoot;

public class Assassin extends Player implements ISneakAttack, IShoot {

    private final ISneakAttack sneakAttack;
    private final IShoot shoot;

    public Assassin(String name, int HP, IPunch punch, ISneakAttack sneakAttack, IShoot shoot) {
        super(name, 100);
        this.sneakAttack = sneakAttack;
        this.shoot = shoot;
    }

    public int sneakAttack() {
        return 25;
    }

    public int shoot() {
        return 15;
    }
}