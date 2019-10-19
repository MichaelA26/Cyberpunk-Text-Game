import enemyTypes.Android;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AndroidTest {
    Android android;

    @Before
    public void before(){
        android = new Android("TK 421", 50, 10);
    }

    @Test
    public void hasName(){
        Assert.assertEquals("TK 421", android.getName());
    }

    @Test
    public void hasHP() {
        Assert.assertEquals(50, android.hasHP());
    }

    @Test
    public void canDefend() {
        Assert.assertEquals("Android defence systems online.", android.defend());
    }

    @Test
    public void decreaseHP() {
        android.decreaseHP(1);
        Assert.assertEquals(49, android.hasHP());
    }

    @Test
    public void attack() {
        Assert.assertEquals(10, android.attack());
    }

}