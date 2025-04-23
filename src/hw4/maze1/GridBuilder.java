package hw4.maze1;

import java.util.ArrayList;
import java.util.Random;

public class GridBuilder {

    private static final Random rand = new Random();

    public static Grid buildRandomGrid(int size) {
        ArrayList<Row> rows = new ArrayList<>();

        int exitRow = rand.nextInt(size);

        for (int i = 0; i < size; i++) {
            ArrayList<Cell> cells = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                CellComponents left = randomComponent();
                CellComponents right = randomComponent();
                CellComponents up = randomComponent();
                CellComponents down = randomComponent();

                // Force at least one APERTURE
                if (left != CellComponents.APERTURE &&
                    right != CellComponents.APERTURE &&
                    up != CellComponents.APERTURE &&
                    down != CellComponents.APERTURE) {
                    left = CellComponents.APERTURE;
                }

                // Add EXIT at [exitRow][0]
                if (j == 0 && i == exitRow) {
                    left = CellComponents.EXIT;
                }

                cells.add(new Cell(left, right, up, down));
            }
            rows.add(new Row(cells));
        }
        return new Grid(rows);
    }

    private static CellComponents randomComponent() {
        return rand.nextBoolean() ? CellComponents.WALL : CellComponents.APERTURE;
    }
}