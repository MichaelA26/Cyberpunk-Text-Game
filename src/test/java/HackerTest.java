package playerTypes;

import abilities.IHack;
import abilities.IPunch;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HackerTest {
    private Hacker hacker;
    private IPunch punch;
    private IHack hack;

    @Before
    public void setUp() {
        hacker = new Hacker("Ruby Deckard", 100, punch, hack);
    }

    @Test
    public void getName() {
        assertEquals("Ruby Deckard", hacker.getName());
    }

    @Test
    public void canHack() {
        assertEquals(25, hack.hack());
    }
}