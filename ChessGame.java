import javax.swing.*;
import java.awt.*;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class ChessGame {
    private static final int BOARD_SIZE = 8;
    private static final String PIECE_IMAGE_PATH = "resources/";

    public static void main(String[] args) {
        JFrame frame = new JFrame("Chess Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(new GridLayout(BOARD_SIZE, BOARD_SIZE));

        JPanel[][] boardSquares = new JPanel[BOARD_SIZE][BOARD_SIZE];
        boolean isWhite = true;

        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                JPanel square = new JPanel();
                if (isWhite) {
                    square.setBackground(Color.WHITE);
                } else {
                    square.setBackground(Color.GRAY);
                }
                boardSquares[row][col] = square;
                frame.add(square);
                isWhite = !isWhite;

                // Add pieces for the initial setup
                if (row == 1) {
                    addPiece(square, "black_pawn.png");
                } else if (row == 6) {
                    addPiece(square, "white_pawn.png");
                }
            }
            isWhite = !isWhite;
        }

        frame.setVisible(true);
    }

    private static void addPiece(JPanel square, String pieceFileName) {
        try {
            BufferedImage pieceImage = ImageIO.read(new File(PIECE_IMAGE_PATH + pieceFileName));
            JLabel pieceLabel = new JLabel(new ImageIcon(pieceImage));
            square.add(pieceLabel);
        } catch (Exception e) {
            System.out.println("Error loading piece image: " + e.getMessage());
        }
    }
}
