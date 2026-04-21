// UC4: Convert slot (1-9) to row and column
public int[] convertSlotToPosition(int slot) {
    slot = slot - 1; // convert to 0-based index

    int row = slot / 3;
    int col = slot % 3;

    return new int[]{row, col};
}