import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class GameTest {
    @Test
    public void testRoll() {
        Dice dice = new Dice();
        int oneResult = dice.throwDice();
        assertTrue(oneResult >= 1 && oneResult <= 6);
    }
}