package playerTypes;

import abilities.IHack;
import abilities.IPunch;
import org.junit.Before;
import org.junit.Test;
import weapons.IShoot;

import static org.junit.Assert.*;

public class HackerTest {
    private Hacker hacker;
    private IPunch punch;
    private IHack hack;
    private IShoot shoot;

    @Before
    public void setUp() {
        hacker = new Hacker("Ruby Deckard", 100, punch, hack, shoot);
    }

    @Test
    public void getName() {
        assertEquals("Ruby Deckard", hacker.getName());
    }

    @Test
    public void canHack() {
        assertEquals(25, hacker.hack());
    }
}