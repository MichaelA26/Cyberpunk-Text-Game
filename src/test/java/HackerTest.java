import playerTypes.Hacker;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HackerTest {
    Hacker hacker;

    @Test
    public void hasName(){
        assertEquals("Ruby Deckard", hacker.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(100, hacker.getHP());
    }

    @Test
    public void canPunch(){
        assertEquals(hacker.punch(),"Sha-bang!");
    }

    @Test
    public void canHack(){
        assertEquals(hacker.hack(),"I'm in, time for data extraction.");
    }
}