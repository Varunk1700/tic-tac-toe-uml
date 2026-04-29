import java.util.Random;

public class Main {

    // Print board
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
        }
    }

    // UC7: Computer move
    public static void computerMove(char[][] board) {
        Random rand = new Random();

        while (true) {
            int slot = rand.nextInt(9) + 1;

            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;

            if (board[row][col] == ' ') {
                board[row][col] = 'O';
                break;
            }
        }
    }

    public static void main(String[] args) {

        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        // Computer plays
        computerMove(board);

        printBoard(board);
    }
}