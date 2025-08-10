package lib;

import java.util.ArrayList;

public class Dice {

    private ArrayList<Die> diceList; // List of dice
    private static final int DEFAULT_MAX_DICE = 2; // Default 2 dice

    public Dice() {
        diceList = new ArrayList<>();
    }

    public Dice(boolean autoAddDefaultDice) { // Optionally add default dice
        diceList = new ArrayList<>();
        if (autoAddDefaultDice) {
            for (int i = 0; i < DEFAULT_MAX_DICE; i++) {
                addDie(new Die());
            }
        }
    }

    public void addDie(Die die) {
        diceList.add(die);
    }

    public int roll() { // Roll all dice
        int total = 0;
        for (Die die : diceList) {
            die.roll();
            total += die.getLastRoll();
        }
        return total;
    }

    public int getTotalValue() { // Get sum of dice values
        int total = 0;
        for (Die die : diceList) {
            total += die.getLastRoll();
        }
        return total;
    }

    public Die dieAt(int index) { // Get die at index
        return (index >= 0 && index < diceList.size()) ? diceList.get(index) : null;
    }

    public boolean allSame() { // Check if all dice are equal
        if (diceList.isEmpty()) return false;
        int firstRoll = diceList.get(0).getLastRoll();
        for (Die die : diceList) {
            if (die.getLastRoll() != firstRoll) return false;
        }
        return true;
    }

    public int getLastRollTotal() {
        return getTotalValue();
    }
}
