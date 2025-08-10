package lib;

public class Game {
    private Board board;
    private Dice dice;

    public Game(Board board, Dice dice) {
        this.board = board;
        this.dice = dice;
    }

    public void addPlayer(Player player) { // Add player to start tile
        Tile startTile = board.getStartTile();
        board.addPlayer(player, startTile);
    }

    public void playTurn(Player player) { // Player turn logic
        int rollValue = dice.roll();
        board.movePlayer(player, rollValue);
        Tile newTile = player.getCurrentTile();
        System.out.println(player.getName() + " rolled a " + rollValue);
        System.out.println(player.getName() + " is now on Tile " + newTile.getName());
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Monopoly Game!");

        Board board = new Board();
        System.out.println("Tiles Created!");
        board.printBoard();

        Player playerA = new Player("A");
        Player playerB = new Player("B");

        // Place players on start tile
        board.getStartTile().addPlayer(playerA);
        playerA.setCurrentTile(board.getStartTile());
        board.getStartTile().addPlayer(playerB);
        playerB.setCurrentTile(board.getStartTile());

        System.out.println("\nPlayers Created!");
        board.printBoard();

        Dice dice = new Dice();
        dice.addDie(new Die());
        dice.addDie(new Die());

        System.out.println("\nGame Starts!\n");

        Game game = new Game(board, dice);
        System.out.println("--- Round 1 ---");
        game.playTurn(playerA);
        game.playTurn(playerB);
        board.printBoard();
    }
}
