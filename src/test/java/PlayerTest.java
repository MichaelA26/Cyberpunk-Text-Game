import characters.Player;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlayerTest {

    Player player;

    @Test
    public void hasName(){
        assertEquals("Jason Grimes", player.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(100, player.getHP());
    }
}
