public static void main(String[] args) {
    TicTacToe game = new TicTacToe();

    // Step 1: Show initial board (UC1)
    game.displayBoard();

    // Step 2: Take input (UC3)
    int slot = game.getPlayerInput();

    // Step 3: Convert slot → row, col (UC4)
    int[] pos = game.convertSlotToPosition(slot);

    // Step 4: Place move (UC5)
    boolean success = game.placeMove(pos[0], pos[1]);

    // Step 5: Show updated board
    if (success) {
        game.displayBoard();
    }
}