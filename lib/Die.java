package lib;

import java.util.Random;

public class Die {
    private int lastRoll;
    private Random rand;

    public Die() {
        this.rand = new Random();
    }

    public int roll() { // Roll die (1-6)
        lastRoll = rand.nextInt(6) + 1;
        return lastRoll;
    }

    public int getLastRoll() {
        return lastRoll;
    }

    public void setLastRoll(int value) { // For testing
        this.lastRoll = value;
    }
}
