package lib;

import java.util.ArrayList;

public class Board {
    private ArrayList<Tile> tiles; // Board tiles

    public Board() {
        tiles = new ArrayList<>();
        Tile previous = null;
        for (int i = 1; i <= 10; i++) { // Create and link 10 tiles
            Tile tile = new Tile(i + "", i);
            tiles.add(tile);
            if (previous != null) previous.setNext(tile);
            previous = tile;
        }
    }

    public Tile getStartTile() { // First tile
        return tiles.get(0);
    }

    public ArrayList<Tile> getTiles() {
        return tiles;
    }

    public void printBoard() { // Print board status
        for (Tile tile : tiles) {
            System.out.println("Tile No." + tile.getNumber() + " - Name: \"" + tile.getName() + "\" contains players: " + tile.getPlayerNames());
        }
    }

    public void addTile(Tile tile) {
        tiles.add(tile);
    }

    public Tile getTile(int index) {
        return tiles.get(index);
    }

    public void movePlayer(Player player, int steps) { // Move player
        Tile current = player.getCurrentTile();
        int currentIndex = tiles.indexOf(current);
        int targetIndex = (currentIndex + steps) % tiles.size();
        if (targetIndex < 0) targetIndex += tiles.size();
        Tile targetTile = tiles.get(targetIndex);
        current.removePlayer(player);
        targetTile.addPlayer(player);
        player.setCurrentTile(targetTile);
    }

    public void addPlayer(Player player, Tile tile) { // Place player
        tile.addPlayer(player);
        player.setCurrentTile(tile);
    }
}
