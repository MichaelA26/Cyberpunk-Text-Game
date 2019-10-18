import enemyTypes.Android;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AndroidTest {
    Android android;

    @Before
    public void before(){
        android = new Android("TK 421");
    }

    @Test
    public void hasName(){
        assertEquals("TK 421", android.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(50, android.getHP());
    }
}