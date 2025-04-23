package hw4.maze1;

import java.util.ArrayList;

public class Grid {
    private ArrayList<Row> rows;

    public Grid(ArrayList<Row> rows) {
        this.rows = rows;
    }

    public ArrayList<Row> getRows() {
        return rows;
    }

    public void setRows(ArrayList<Row> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "Grid [rows=" + rows + "]";
    }

    public void printGrid(Cell playerCell) {
        for (int i = 0; i < rows.size(); i++) {
            Row row = rows.get(i);
            for (int j = 0; j < row.getCells().size(); j++) {
                Cell cell = row.getCells().get(j);
                if (cell.equals(playerCell)) {
                    System.out.print("A ");
                } else if (cell.getLeft() == CellComponents.EXIT) {
                    System.out.print("E ");
                } else {
                    System.out.print("S ");
                }
            }
            System.out.println();
        }
    }
}
