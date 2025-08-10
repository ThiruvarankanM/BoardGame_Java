package lib;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {

    @Test
    public void testDiceInitialization() {
        Dice dice = new Dice();
        dice.addDie(new Die());
        dice.addDie(new Die());
        assertNotNull(dice.dieAt(0));
        assertNotNull(dice.dieAt(1));
    }

    @Test
    public void testRollReturnsValueInRange() {
        Dice dice = new Dice();
        dice.addDie(new Die());
        dice.addDie(new Die());
        int total = dice.roll();
        assertTrue(total >= 2 && total <= 12);
    }

    @Test
    public void testDieAtReturnsCorrectDie() {
        Dice dice = new Dice();
        dice.addDie(new Die());
        dice.addDie(new Die());
        assertNotNull(dice.dieAt(0));
        assertNotNull(dice.dieAt(1));
        assertNull(dice.dieAt(2));
    }

    @Test
    public void testAllSame() {
        Dice dice = new Dice();
        Die die1 = new Die();
        Die die2 = new Die();
        die1.setLastRoll(4);
        die2.setLastRoll(4);
        dice.addDie(die1);
        dice.addDie(die2);
        assertTrue(dice.allSame());
        die2.setLastRoll(5);
        assertFalse(dice.allSame());
    }

    @Test
    public void testGetLastRollTotal() {
        Dice dice = new Dice();
        Die die1 = new Die();
        Die die2 = new Die();
        die1.setLastRoll(2);
        die2.setLastRoll(3);
        dice.addDie(die1);
        dice.addDie(die2);
        assertEquals(5, dice.getLastRollTotal());
    }
}
