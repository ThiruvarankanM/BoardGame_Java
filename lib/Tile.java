package lib;

import java.util.ArrayList;

public class Tile {
    private String name;
    private int number;
    private ArrayList<Player> players;
    private Tile next; // Next tile reference

    public Tile(String name, int number) {
        this.name = name;
        this.number = number;
        this.players = new ArrayList<>();
        this.next = null;
    }

    public Tile(int number) {
        this("Tile " + number, number);
    }

    public Tile(String name) {
        this.name = name;
        this.number = -1;
        this.players = new ArrayList<>();
        this.next = null;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public String getPlayerNames() { // Return player names
        if (players.isEmpty()) return "none";
        StringBuilder sb = new StringBuilder();
        for (Player p : players) {
            sb.append(p.getName()).append(" ");
        }
        return sb.toString().trim();
    }

    public void setNext(Tile next) {
        this.next = next;
    }

    public Tile getNext() {
        return next;
    }
}
