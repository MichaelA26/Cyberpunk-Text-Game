import playerTypes.Diplomat;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiplomatTest {
    Diplomat diplomat;

    @Test
    public void hasName(){
        assertEquals("Hans Gruber", diplomat.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(100, diplomat.getHP());
    }

    @Test
    public void canPunch(){
        assertEquals(diplomat.punch(),"Sha-bang!");
    }

    @Test
    public void canHack(){
        assertEquals(diplomat.coerce(),"This is not the outcome you're looking for.");
    }
}