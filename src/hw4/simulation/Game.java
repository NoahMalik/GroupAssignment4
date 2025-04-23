package hw4.simulation;

import hw4.maze1.*;
import hw4.player1.Player;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Grid grid = GridBuilder.buildRandomGrid(5);

        Player player = new Player(
                grid.getRows().get(0),
                grid.getRows().get(0).getCells().get(0)
        );

        Scanner scanner = new Scanner(System.in);

        while (true) {
            grid.printGrid(player.getCurrentCell());
            System.out.print("Enter move (WASD or Q to quit): ");
            String input = scanner.nextLine().toUpperCase();
            if (input.equals("Q")) break;
            movePlayer(input, player, grid);
        }
    }

    private static void movePlayer(String input, Player player, Grid grid) {
        int rowIdx = grid.getRows().indexOf(player.getCurrentRow());
        int colIdx = player.getCurrentRow().getCells().indexOf(player.getCurrentCell());

        switch (input) {
            case "W":
                if (rowIdx > 0)
                    player.setCurrentRow(grid.getRows().get(rowIdx - 1));
                break;
            case "S":
                if (rowIdx < grid.getRows().size() - 1)
                    player.setCurrentRow(grid.getRows().get(rowIdx + 1));
                break;
            case "A":
                if (colIdx > 0)
                    player.setCurrentCell(player.getCurrentRow().getCells().get(colIdx - 1));
                break;
            case "D":
                if (colIdx < player.getCurrentRow().getCells().size() - 1)
                    player.setCurrentCell(player.getCurrentRow().getCells().get(colIdx + 1));
                break;
        }
    }
}
