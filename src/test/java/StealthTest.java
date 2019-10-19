import playerTypes.Stealth;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StealthTest {
    Stealth stealth;

    @Before
    public void before(){
        stealth = new Stealth("The Raptor");
    }

    @Test
    public void hasName(){
        assertEquals("The Raptor", stealth.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(100, stealth.getHP());
    }

    @Test
    public void canPunch(){
        assertEquals(stealth.punch(),"Sha-bang!");
    }

    @Test
    public void canSneakAttack(){
        assertEquals(stealth.sneakAttack(),"Silent take-down.");
    }

}