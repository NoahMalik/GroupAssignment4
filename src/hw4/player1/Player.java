package hw4.player1;

import hw4.maze1.Cell;
import hw4.maze1.Row;

public class Player {
    private Row currentRow;
    private Cell currentCell;

    public Player(Row currentRow, Cell currentCell) {
        this.currentRow = currentRow;
        this.currentCell = currentCell;
    }

    public Row getCurrentRow() {
        return currentRow;
    }

    public Cell getCurrentCell() {
        return currentCell;
    }

    public void setCurrentCell(Cell currentCell) {
        this.currentCell = currentCell;
    }

    public void setCurrentRow(Row currentRow) {
        this.currentRow = currentRow;
    }

    @Override
    public String toString() {
        return "Player [currentCell=" + currentCell + ", currentRow=" + currentRow + "]";
    }
}