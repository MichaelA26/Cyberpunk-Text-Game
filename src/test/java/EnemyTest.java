import characters.Enemy;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EnemyTest {
    Enemy enemy;

    @Before
    public void before() {
        enemy = new Enemy("Benjamin Redditwarrior");
    }

    @Test
    public void hasName() {
        assertEquals("Benjamin Redditwarrior", enemy.getName());
    }

    @Test
    public void hasHP() {
        assertEquals(50, enemy.getHP());
    }
}