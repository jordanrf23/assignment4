package hw4.player;

import java.util.Objects;

import hw4.maze.Cell;
import hw4.maze.Row;

public class Player {
	// variables to know where the player currently stays
	private Cell currentCell;
	private Row currentRow;
	
	/*
	 * obtaining the players location
	 */
	public Player(Row currentRow, Cell currentCell) {
		this.currentCell = currentCell;
		this.currentRow = currentRow;
	}
	
	/*
	 * locating the current cell of the player
	 */
	public Cell getCurrentCell() {
		return currentCell;
	}
	
	/*
	 * updating the current cell of the player
	 */
	public void setCurrentCell(Cell currentCell) {
		this.currentCell = currentCell;
	}
	
	/*
	 * locating the current cell of the player
	 */
	public Row getCurrentRow() {
		return currentRow;
	}
	
	/*
	 * updating the current cell of the player
	 */
	public void setCurrentRow(Row currentRow) {
		this.currentRow = currentRow;
	}
	
	/*
	 * relaying the player location to the user
	 */
	@Override
	public String toString() {
		return "Player [currentCell=" + currentCell + ", currentRow=" + currentRow + "]";
	}
	
	/*
	 * returning hash location
	 */
	@Override
	public int hashCode() {
		return Objects.hash(currentCell, currentRow);
	}
	
	/*
	 * returning current cell compared with player
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return Objects.equals(currentCell, other.currentCell) && Objects.equals(currentRow, other.currentRow);
	}
	
	
	
}
