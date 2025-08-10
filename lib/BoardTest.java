package lib;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    @Test
    public void testAddTileAndRetrieve() {
        Board board = new Board();
        assertEquals(10, board.getTiles().size());
        Tile firstTile = board.getStartTile();
        assertEquals(1, firstTile.getNumber());
        Tile secondTile = firstTile.getNext();
        assertNotNull(secondTile);
        assertEquals(2, secondTile.getNumber());
    }

    @Test
    public void testPlayerMovement() {
        Board board = new Board();
        Player player = new Player("Charlie");
        board.addPlayer(player, board.getStartTile());
        board.movePlayer(player, 3);
        Tile expectedTile = board.getTile(3);
        assertEquals(4, expectedTile.getNumber());
        assertTrue(expectedTile.getPlayers().contains(player));
    }
}
