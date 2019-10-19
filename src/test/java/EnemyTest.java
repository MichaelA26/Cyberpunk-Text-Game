import characters.Enemy;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EnemyTest {
    Enemy enemy;

    @Before
    public void setUp() {
        enemy = new Enemy("Benjamin Redditwarrior", 50, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Benjamin Redditwarrior", enemy.getName());
    }

    @Test
    public void hasHP() {
        assertEquals(50, enemy.getHP());
    }

    @Test
    public void attack() {
        assertEquals(10, enemy.attack());
    }
}