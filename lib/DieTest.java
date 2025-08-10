package lib;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DieTest {

    @Test
    public void testDieRollsWithinRange() {
        Die die = new Die();
        for (int i = 0; i < 120; i++) {
            die.roll();
            int value = die.getLastRoll();
            assertTrue(value >= 1 && value <= 6);
        }
    }

    @Test
    public void testDieValueChanges() {
        Die die = new Die();
        int initialRoll = die.getLastRoll();
        boolean hasChanged = false;
        for (int i = 0; i < 12; i++) {
            die.roll();
            if (die.getLastRoll() != initialRoll) {
                hasChanged = true;
                break;
            }
        }
        assertTrue(hasChanged);
    }
}
