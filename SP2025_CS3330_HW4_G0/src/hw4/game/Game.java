package hw4.game;

import hw4.maze.Grid;
import hw4.player.Player;
import hw4.maze.*;
import hw4.player.Movement;


public class Game {
	
	private Grid grid;
	
	public Game(Grid grid) {
		this.grid = grid;
	}
	
	public Game(int size) {
		this.grid = createRandomGrid(size);
	}
	

	public Grid getGrid() {
		return grid;
	}

	public void setGrid(Grid grid) {
		this.grid = grid;
	}
	
	public boolean play(Movement movement, Player player) {
		if (movement == null || player == null || grid == null)
			return false;

		int rowIndex = grid.currentRow.
		int colIndex = player.getRow().getCells().indexOf(player.getCell());

		switch (movement) {
			case UP:
				if (player.getCell().getUp() == CellComponents.APERTURE && rowIndex > 0) {
					player.setRow(grid.getRows().get(rowIndex - 1));
					player.setCell(player.getRow().getCells().get(colIndex));
					return true;
				}
				break;
			case DOWN:
				if (player.getCell().getDown() == CellComponents.APERTURE && rowIndex < grid.getRows().size() - 1) {
					player.setRow(grid.getRows().get(rowIndex + 1));
					player.setCell(player.getRow().getCells().get(colIndex));
					return true;
				}
				break;
			case LEFT:
				if (player.getCell().getLeft() == CellComponents.APERTURE && colIndex > 0) {
					player.setCell(player.getRow().getCells().get(colIndex - 1));
					return true;
				}
				break;
			case RIGHT:
				if (player.getCell().getRight() == CellComponents.APERTURE && colIndex < player.getRow().getCells().size() - 1) {
					player.setCell(player.getRow().getCells().get(colIndex + 1));
					return true;
				}
				break;
		}
		return false;
	}

	private Grid createRandomGrid(int size) {
		return null;
	}

}
