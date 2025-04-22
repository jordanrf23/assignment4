package hw4.game;

import java.util.ArrayList;

import hw4.maze.*;
import hw4.player.*;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Row> rows = new ArrayList<>();
        
        // Create sample cells for the grid
        Cell cell00 = new Cell(CellComponents.EXIT, CellComponents.APERTURE,
                CellComponents.WALL, CellComponents.APERTURE);
        Cell cell01 = new Cell(CellComponents.APERTURE, CellComponents.WALL,
                CellComponents.WALL, CellComponents.APERTURE);
        Cell cell02 = new Cell(CellComponents.WALL, CellComponents.WALL,
                CellComponents.WALL, CellComponents.APERTURE);
        
        Cell cell10 = new Cell(CellComponents.WALL, CellComponents.WALL,
                CellComponents.APERTURE, CellComponents.APERTURE);
        Cell cell11 = new Cell(CellComponents.WALL, CellComponents.APERTURE,
                CellComponents.APERTURE, CellComponents.APERTURE);
        Cell cell12 = new Cell(CellComponents.APERTURE, CellComponents.WALL,
                CellComponents.APERTURE, CellComponents.APERTURE);
        
        Cell cell20 = new Cell(CellComponents.WALL, CellComponents.WALL,
                CellComponents.APERTURE, CellComponents.WALL);
        Cell cell21 = new Cell(CellComponents.WALL, CellComponents.WALL,
                CellComponents.APERTURE, CellComponents.WALL);
        Cell cell22 = new Cell(CellComponents.WALL, CellComponents.WALL,
                CellComponents.APERTURE, CellComponents.WALL);
        
        // Create rows and add cells to them
        ArrayList<Cell> cells = new ArrayList<>();
        cells.add(cell00);
        cells.add(cell01);
        cells.add(cell02);
        Row row0 = new Row(cells);
        
        cells = new ArrayList<>();
        cells.add(cell10);
        cells.add(cell11);
        cells.add(cell12);
        Row row1 = new Row(cells);
        
        cells = new ArrayList<>();
        cells.add(cell20);
        cells.add(cell21);
        cells.add(cell22);
        Row row2 = new Row(cells);
        
        rows.add(row0);
        rows.add(row1);
        rows.add(row2);
        
        // Step 2: Create the Grid
        Grid grid = new Grid(rows);

        // Step 3: Create the Player
        Player player = new Player(grid.getRows().get(2), grid.getRows().get(2).getCells().get(2));  // Assuming the player starts at the bottom-right corner

        // Step 4: Create the Game
        Game game = new Game(grid);

        // Step 5: Simulate some gameplay
        System.out.println("Initial Game State:");
        System.out.println(game.getGrid().toString());
        
        // Example of moving the player
        game.play(Movement.UP, player);  // Moving up
        System.out.println("Game State after moving up:");
        System.out.println(game.getGrid().toString());

        game.play(Movement.LEFT, player);  // Moving left
        System.out.println("Game State after moving left:");
        System.out.println(game.getGrid().toString());

        game.play(Movement.DOWN, player);  // Moving down
        System.out.println("Game State after moving down:");
        System.out.println(game.getGrid().toString());
	}
}

