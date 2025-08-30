# 🎲 Monopoly-Inspired Board Game (Java OOP)

A simple object-oriented board game implemented in Java, inspired by the classic Monopoly tile-based movement system. Players roll dice, move around a linked-list-based board, with comprehensive JUnit 5 unit testing for all components.

## Features

- Object-oriented design with separate Board, Tile, Player, Dice, and Game classes
- Linked list board structure for dynamic player movement
- Multiple dice support for customizable gameplay
- Comprehensive JUnit 5 test coverage
- Extensible architecture for future enhancements

## Project Structure

```
src/lib/
├── Board.java       # Board management and player movement
├── Tile.java        # Individual board positions
├── Player.java      # Player data and current position
├── Die.java         # Single six-sided die implementation
├── Dice.java        # Multiple dice container and rolling logic
└── Game.java        # Main game logic and turn handling

test/lib/
├── BoardTest.java   # Board functionality tests
├── TileTest.java    # Tile behavior tests
├── PlayerTest.java  # Player state tests
├── DieTest.java     # Single die tests
├── DiceTest.java    # Multiple dice tests
└── GameTest.java    # Game logic tests
```

## Quick Start

### Compile and Run
```bash
# Compile source files
javac -d bin src/lib/*.java

# Run the game
java -cp bin lib.Game
```

### Run Tests
```bash
# Compile tests (JUnit 5 required in classpath)
javac -cp "lib/*:src" test/lib/*.java

# Execute tests
java -cp "lib/*:src:test" org.junit.platform.console.ConsoleLauncher --scan-classpath
```

## Test Results

| Test File | Result |
|-----------|--------|
| BoardTest | ![BoardTest](https://github.com/ThiruvarankanM/BoardGame_Java/blob/b9ef4bd69f46538d891f31ca39412d4dc7d2e541/Test_Results/BoardTest.png) |
| DiceTest | ![DiceTest](https://github.com/ThiruvarankanM/BoardGame_Java/blob/b9ef4bd69f46538d891f31ca39412d4dc7d2e541/Test_Results/DiceTest.png) |
| DieTest | ![DieTest](https://github.com/ThiruvarankanM/BoardGame_Java/blob/b9ef4bd69f46538d891f31ca39412d4dc7d2e541/Test_Results/DieTest.png) |
| GameTest | ![GameTest](https://github.com/ThiruvarankanM/BoardGame_Java/blob/b9ef4bd69f46538d891f31ca39412d4dc7d2e541/Test_Results/GameTest.png) |
| PlayerTest | ![PlayerTest](https://github.com/ThiruvarankanM/BoardGame_Java/blob/b9ef4bd69f46538d891f31ca39412d4dc7d2e541/Test_Results/PlayerTest.png) |
| TileTest | ![TileTest](https://github.com/ThiruvarankanM/BoardGame_Java/blob/b9ef4bd69f46538d891f31ca39412d4dc7d2e541/Test_Results/TileTest.png) |
| All Tests | ![AllTests](https://github.com/ThiruvarankanM/BoardGame_Java/blob/b9ef4bd69f46538d891f31ca39412d4dc7d2e541/Test_Results/All%20Tests.png) |

## Example Output

```
Welcome to Monopoly Game!
Tiles Created!
Tile 1 -> Tile 2 -> Tile 3 -> ...
Players Created!
Game Starts!
--- Round 1 ---
A rolled a 6
A is now on Tile 7
B rolled a 3
B is now on Tile 4
```

## Requirements

- Java 8 or higher
- JUnit 5 (for running tests)

## Future Enhancements

- Proper game end conditions and win tracking
- Property ownership and rent system
- Player money management
- Chance and Community Chest cards
- GUI implementation
- Multiplayer turn order management

## License

MIT License
