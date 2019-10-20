import abilities.ISneakAttack;
import abilities.IPunch;
import org.junit.Before;
import org.junit.Test;
import playerTypes.Assassin;
import weapons.IShoot;

import static org.junit.Assert.*;

public class AssassinTest {
    private Assassin assassin;
    private IPunch punch;
    private ISneakAttack sneakAttack;
    private IShoot shoot;

    @Before
    public void setUp() {
        assassin = new Assassin("The Razor", 100, punch, sneakAttack, shoot);
    }

    @Test
    public void getName() {
        assertEquals("The Razor", assassin.getName());
    }

    @Test
    public void canSneakAttack() {
        assertEquals(25, assassin.sneakAttack());
    }

}