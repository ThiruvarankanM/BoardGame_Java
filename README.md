
# 🎲 Monopoly-Inspired Board Game (Java OOP)

A simple object-oriented board game implemented in Java, inspired by the classic Monopoly tile-based movement system.  
Players roll dice, move around a linked-list-based board, and the game prints updates for each turn.  
Includes **JUnit 5 unit tests** for all main components.

---

## 📜 Features

- **Object-Oriented Design** — Board, Tile, Player, Dice, and Game are separate, reusable classes.
- **Linked List Board Structure** — Tiles are connected so players can move forward dynamically.
- **Multiple Dice Support** — Add one or more dice for each roll.
- **Unit Testing** — JUnit tests for `Board`, `Dice`, `Die`, `Game`, `Player`, and `Tile`.
- **Easily Extensible** — Can be expanded with properties, money, or chance cards.

---

## 🗂️ Project Structure

```

src/
└── lib/
├── Board.java       # Holds tiles and players, manages movement
├── Tile.java        # Represents a position on the board
├── Player.java      # Stores player name and current tile
├── Die.java         # Single six-sided die
├── Dice.java        # Holds multiple dice, rolls them together
├── Game.java        # Main game logic and turn handling

test/
└── lib/
├── BoardTest.java
├── TileTest.java
├── PlayerTest.java
├── DieTest.java
├── DiceTest.java
├── GameTest.java

````

---

## 🚀 How to Run

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/yourusername/BoardGame.git
cd BoardGame
````

### 2️⃣ Compile and Run

```bash
javac -d bin src/lib/*.java
java -cp bin lib.Game
```

---

## 🧪 Running Tests

This project uses **JUnit 5** for testing.
Make sure JUnit 5 is in your classpath, then run:

```bash
javac -cp "lib/*:src" test/lib/*.java
java -cp "lib/*:src:test" org.junit.platform.console.ConsoleLauncher --scan-classpath
```

Or simply run tests from your IDE’s JUnit runner.

---

## 📷 Test Results

### ✅ All Tests

![All Tests](https://example.com/All_tests.png)

### 🧩 Individual Test Files

| Test File  | Screenshot                                        |
| ---------- | ------------------------------------------------- |
| BoardTest  | ![BoardTest](https://github.com/ThiruvarankanM/BoardGame_Java/blob/b9ef4bd69f46538d891f31ca39412d4dc7d2e541/Test_Results/BoardTest.png)   |
| DiceTest   | ![DiceTest](https://github.com/ThiruvarankanM/BoardGame_Java/blob/b9ef4bd69f46538d891f31ca39412d4dc7d2e541/Test_Results/DiceTest.png)     |
| DieTest    | ![DieTest](https://github.com/ThiruvarankanM/BoardGame_Java/blob/b9ef4bd69f46538d891f31ca39412d4dc7d2e541/Test_Results/DieTest.png)       |
| GameTest   | ![GameTest](https://github.com/ThiruvarankanM/BoardGame_Java/blob/b9ef4bd69f46538d891f31ca39412d4dc7d2e541/Test_Results/GameTest.png)     |
| PlayerTest | ![PlayerTest](https://github.com/ThiruvarankanM/BoardGame_Java/blob/b9ef4bd69f46538d891f31ca39412d4dc7d2e541/Test_Results/PlayerTest.png) |
| TileTest   | ![TileTest](https://github.com/ThiruvarankanM/BoardGame_Java/blob/b9ef4bd69f46538d891f31ca39412d4dc7d2e541/Test_Results/TileTest.png)     |
| AllTests   | ![AllTests](https://github.com/ThiruvarankanM/BoardGame_Java/blob/b9ef4bd69f46538d891f31ca39412d4dc7d2e541/Test_Results/All%20Tests.png)     |

---

## 🖥️ Example Output

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

---

## 📌 Future Improvements
- Game should end right!.. so for that we have to track that and end game perfectly.
- Add properties and rent system to make it more like real Monopoly.
- Implement money tracking for players.
- Add “Chance” and “Community Chest” cards for randomness.
- Multiplayer round tracking with proper turn order.
- Add GUI for better user experience.

---

## 📄 License

This project is licensed under the MIT License — see the [LICENSE](LICENSE) file for details.

---

