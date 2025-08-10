package lib;

public class Player {
    private String name;
    private Tile currentTile;

    public Player(String name) {
        this.name = name;
        this.currentTile = null;
    }

    public Player(String name, Tile startTile) { // Start on a tile
        this.name = name;
        this.currentTile = startTile;
        this.currentTile.addPlayer(this);
    }

    public String getName() {
        return name;
    }

    public Tile getCurrentTile() {
        return currentTile;
    }

    public void setCurrentTile(Tile tile) {
        this.currentTile = tile;
    }

    public void moveTo(Tile newTile) { // Move to another tile
        if (currentTile != null) {
            currentTile.removePlayer(this);
        }
        newTile.addPlayer(this);
        currentTile = newTile;
    }
}
