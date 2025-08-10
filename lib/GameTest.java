package lib;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

    @Test
    public void testPlayTurnMovesPlayer() {
        Board board = new Board();
        Dice diceStub = new Dice() {
            @Override
            public int roll() {
                return 4;
            }
        };
        Game game = new Game(board, diceStub);
        Player player = new Player("TestPlayer");
        game.addPlayer(player);
        game.playTurn(player);
        assertEquals(5, player.getCurrentTile().getNumber());
    }
}
