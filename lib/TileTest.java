package lib;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TileTest {

    @Test
    public void testTileInitialization() {
        Tile tile = new Tile(1);
        assertEquals(1, tile.getNumber());
        assertEquals("Tile 1", tile.getName());
        assertTrue(tile.getPlayers().isEmpty());
        assertNull(tile.getNext());
    }

    @Test
    public void testAddPlayer() {
        Tile tile = new Tile(2);
        Player player = new Player("Alice");
        tile.addPlayer(player);
        assertTrue(tile.getPlayers().contains(player));
        assertEquals("Alice", tile.getPlayerNames());
    }

    @Test
    public void testRemovePlayer() {
        Tile tile = new Tile(3);
        Player player = new Player("Bob");
        tile.addPlayer(player);
        tile.removePlayer(player);
        assertFalse(tile.getPlayers().contains(player));
        assertEquals("none", tile.getPlayerNames());
    }

    @Test
    public void testSetNext() {
        Tile tile1 = new Tile(4);
        Tile tile2 = new Tile(5);
        tile1.setNext(tile2);
        assertEquals(tile2, tile1.getNext());
    }
}
