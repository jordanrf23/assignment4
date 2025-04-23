package hw4.game;

import hw4.player.Player;
import hw4.maze.*;

import java.util.ArrayList;
import java.util.Random;

import hw4.player.Movement;


public class Game {
	
	//variable to hold the grid
	private Grid grid;
	
	/*
	 * assigning the grid 
	 */
	public Game(Grid grid) {
		this.grid = grid;
	}
	
	/*
	 * game gets an instance of a random size for the grid
	 */
	public Game(int size) {
		this.grid = createRandomGrid(size);
	}
	
	/*
	 * obtain the grid
	 */
	public Grid getGrid() {
		return grid;
	}
	
	/*
	 * assigns the grid
	 */
	public void setGrid(Grid grid) {
		this.grid = grid;
	}
	
	/*
	 * obtains the player and the movements to move with in the grid 
	 */
	public boolean play(Movement movement, Player player) {
		if (movement == null || player == null || grid == null)
			return false;

		int rowIndex = grid.getRows().indexOf(player.getCurrentRow());
		int colIndex = player.getCurrentRow().getCells().indexOf(player.getCurrentCell());

		switch (movement) {
			case UP:
				if (player.getCurrentCell().getUp() == CellComponents.APERTURE && rowIndex > 0) {
					player.setCurrentRow(grid.getRows().get(rowIndex - 1));
					player.setCurrentCell(player.getCurrentRow().getCells().get(colIndex));
					return true;
				}
				break;
			case DOWN:
				if (player.getCurrentCell().getDown() == CellComponents.APERTURE && rowIndex < grid.getRows().size() - 1) {
					player.setCurrentRow(grid.getRows().get(rowIndex + 1));
					player.setCurrentCell(player.getCurrentRow().getCells().get(colIndex));
					return true;
				}
				break;
			case LEFT:
				if (player.getCurrentCell().getLeft() == CellComponents.APERTURE && colIndex > 0) {
					player.setCurrentCell(player.getCurrentRow().getCells().get(colIndex - 1));
					return true;
				}
				break;
			case RIGHT:
				if (player.getCurrentCell().getRight() == CellComponents.APERTURE && colIndex < player.getCurrentRow().getCells().size() - 1) {
					player.setCurrentCell(player.getCurrentRow().getCells().get(colIndex + 1));
					return true;
				}
				break;
		}
		return false;
	}
	
	/*
	 * creating the random grid given a size 
	 */
	public Grid createRandomGrid(int size) {
		if (size < 3 || size > 7) {
			return null;
		}

		ArrayList<Row> rows = new ArrayList<>();
		Random random = new Random();
		int exitRow = random.nextInt(size);

		for (int i = 0; i < size; i++) {
			ArrayList<Cell> cells = new ArrayList<>();
			for (int j = 0; j < size; j++) {
				CellComponents left = (j == 0 && i == exitRow) ? CellComponents.EXIT : randomComponent();
				CellComponents right = (j == size - 1) ? CellComponents.WALL : randomComponent();
				CellComponents up = (i == 0) ? CellComponents.WALL : randomComponent();
				CellComponents down = (i == size - 1) ? CellComponents.WALL : randomComponent();
				cells.add(new Cell(left, right, up, down));
			}
			rows.add(new Row(cells));
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - 1; j++) {
				// horizontal
				Cell left = rows.get(i).getCells().get(j);
				Cell right = rows.get(i).getCells().get(j + 1);
				right.setLeft(left.getRight());

				// vertical
				if (i < size - 1) {
					Cell top = rows.get(i).getCells().get(j);
					Cell bottom = rows.get(i + 1).getCells().get(j);
					bottom.setUp(top.getDown());
				}
			}
		}

		return new Grid(rows);
	}
	
	/*
	 * creates the random cell components 
	 */
	private CellComponents randomComponent() {
		return Math.random() > 0.5 ? CellComponents.APERTURE : CellComponents.WALL;
	}

	/*
	 * gives the game grid to the user
	 */
	@Override
	public String toString() {
		return "Game [grid=" + grid + "]";
	}

}
