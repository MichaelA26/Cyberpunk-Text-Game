import playerTypes.Diplomat;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiplomatTest {
    Diplomat diplomat;

    @Before
    public void before(){
        diplomat = new Diplomat("Hans Gruber");
    }

    @Test
    public void hasName(){
        assertEquals("Hans Gruber", diplomat.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(100, diplomat.getHP());
    }
}