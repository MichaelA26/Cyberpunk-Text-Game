import abilities.IPunch;
import abilities.Punch;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PunchTest {

    private IPunch punch;

    @Before
    public void setUp() {
        punch = new Punch();
    }

    @Test
    public void canPunch() {
        assertEquals(10, punch.punch());
    }
}