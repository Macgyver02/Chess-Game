# Chess-Game

# Chess Game in Java


This project is a simple chess game implemented in Java using Swing for the graphical user interface (GUI). It features an 8x8 chessboard with standard chess pieces and allows two players to play a game of chess against each other.

## Features
- 8x8 chessboard with alternating colors.
- Standard chess rules, including:
  - Movement of all piece types (King, Queen, Rook, Bishop, Knight, and Pawn).
  - Special moves: castling, en passant, and pawn promotion.
- Graphical user interface using Java Swing.
- Click-and-drag functionality for moving pieces.
- Basic move validation to ensure legal moves.
- Ability to reset the game.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher.
- Any Java-compatible IDE (e.g., IntelliJ IDEA, Eclipse, NetBeans) or a text editor.

### Installation
1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourusername/chess-game-java.git
   cd chess-game-java
   ```

2. **Compile and run the program:**
   If you are using the command line:
   ```bash
   javac ChessGame.java
   java ChessGame
   ```
   Alternatively, you can open the project in an IDE and run the `ChessGame` class.

### Running the Game
- The game will open a new window with an 8x8 chessboard.
- The initial setup places all pieces in their standard starting positions.
- Click on a piece to select it and then click on a valid square to move it.
- If a move is invalid, the piece will remain in its original position.

## Folder Structure
```
chess-game-java/
├── src/
│   └── ChessGame.java
├── resources/
│   ├── black_pawn.png
│   ├── black_rook.png
│   ├── ... (other piece images)
│   └── white_king.png
├── README.md
└── .gitignore
```

## Customizing the Game
- **Piece Images**: You can replace the existing images in the `resources` folder with your own.
- **Game Rules**: The game logic can be modified to add more features such as AI or network play.

## Known Issues
- The game currently lacks a checkmate and stalemate detection system.
- There is no timer functionality for timed games.

## Future Enhancements
- Add AI to allow playing against the computer.
- Implement online multiplayer functionality.
- Improve the GUI with better graphics and animations.
- Add sound effects for piece movements and game events.

## Contributing
Contributions are welcome! If you have any suggestions for improving the game, feel free to submit a pull request.

## License
This project is open-source and available under the [MIT License](LICENSE).

## Acknowledgements
- Chess piece images were obtained from [source website].
- The game is built using Java Swing for the graphical interface.
```

You can adjust the repository URL and additional details as needed, especially if you plan to share the project on GitHub. Make sure the images and other resources are properly linked and included in the folder structure.
