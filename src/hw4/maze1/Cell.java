package hw4.maze1;

import java.util.Objects;

public class Cell {
    private CellComponents left, right, up, down;

    public Cell(CellComponents left, CellComponents right, CellComponents up, CellComponents down) {
        this.left = left;
        this.right = right;
        this.up = up;
        this.down = down;
    }

    public CellComponents getLeft() { return left; }
    public CellComponents getRight() { return right; }
    public CellComponents getUp() { return up; }
    public CellComponents getDown() { return down; }

    public void setLeft(CellComponents left) { this.left = left; }
    public void setRight(CellComponents right) { this.right = right; }
    public void setUp(CellComponents up) { this.up = up; }
    public void setDown(CellComponents down) { this.down = down; }

    @Override
    public String toString() {
        return "Cell [left=" + left + ", right=" + right + ", up=" + up + ", down=" + down + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cell other = (Cell) obj;
        return left == other.left && right == other.right && up == other.up && down == other.down;
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right, up, down);
    }
}