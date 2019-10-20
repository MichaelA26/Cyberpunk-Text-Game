import abilities.ICoerce;
import abilities.IPunch;
import org.junit.Before;
import org.junit.Test;
import playerTypes.Diplomat;
import weapons.IShoot;

import static org.junit.Assert.*;

public class DiplomatTest {
    private Diplomat diplomat;
    private IPunch punch;
    private ICoerce coerce;
    private IShoot shoot;

    @Before
    public void setUp() {
        diplomat = new Diplomat("Hannibal Flame", 100, punch, coerce, shoot);
    }

    @Test
    public void getName() {
        assertEquals("Hannibal Flame", diplomat.getName());
    }

    @Test
    public void canCoerce() {
        assertEquals(25, diplomat.coerce());
    }

}