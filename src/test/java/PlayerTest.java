import characters.Player;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlayerTest {

    Player player;

    @Before
    public void before(){
        player = new Player("Jason Grimes");
    }

    @Test
    public void hasName(){
        assertEquals("Jason Grimes", player.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(100, player.getHP());
    }
}
