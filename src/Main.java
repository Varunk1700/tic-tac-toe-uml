public class Main {

    // Print board
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
        }
    }

    // UC10: Check draw
    public static boolean isDraw(char[][] board) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false; // still empty space
                }
            }
        }

        return true; // no empty cells → draw
    }

    public static void main(String[] args) {

        char[][] board = {
            {'X', 'O', 'X'},
            {'X', 'O', 'O'},
            {'O', 'X', 'X'}
        };

        printBoard(board);

        if (isDraw(board)) {
            System.out.println("It's a draw!");
        } else {
            System.out.println("Game still in progress");
        }
    }
}