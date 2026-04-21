import java.util.Random;

public class TicTacToe {

    private char[][] board;
    private char currentPlayer;
    private char player1Symbol;
    private char player2Symbol;

    public TicTacToe() {
        board = new char[3][3];
        initializeBoard();
        tossPlayer(); // UC2 logic
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // UC2: Random toss logic
    private void tossPlayer() {
        Random rand = new Random();
        int result = rand.nextInt(2); // 0 or 1

        if (result == 0) {
            player1Symbol = 'X';
            player2Symbol = 'O';
            currentPlayer = player1Symbol;
            System.out.println("Player 1 starts with X");
        } else {
            player1Symbol = 'O';
            player2Symbol = 'X';
            currentPlayer = player2Symbol;
            System.out.println("Player 2 starts with X");
        }
    }

    public void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.displayBoard();
    }
}