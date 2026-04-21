// UC5: Place move on board
public boolean placeMove(int row, int col) {
    if (board[row][col] == '-') {
        board[row][col] = currentPlayer;
        return true;
    } else {
        System.out.println("Invalid move! Cell already occupied.");
        return false;
    }
}