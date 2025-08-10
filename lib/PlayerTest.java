package lib;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void testPlayerInitialization() {
        Player player = new Player("A");
        assertEquals("A", player.getName());
        assertNull(player.getCurrentTile());
    }

    @Test
    public void testSetAndGetCurrentTile() {
        Player player = new Player("B");
        Tile tile = new Tile(1);
        player.setCurrentTile(tile);
        assertEquals(tile, player.getCurrentTile());
    }
}
