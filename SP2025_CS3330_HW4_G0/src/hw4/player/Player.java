package hw4.player;

import java.util.Objects;

import hw4.maze.Cell;
import hw4.maze.Row;

public class Player {
	private Cell currentCell;
	private Row currentRow;
	
	public Player(Row currentRow, Cell currentCell) {
		this.currentCell = currentCell;
		this.currentRow = currentRow;
	}
	
	public Cell getCurrentCell() {
		return currentCell;
	}
	public void setCurrentCell(Cell currentCell) {
		this.currentCell = currentCell;
	}
	public Row getCurrentRow() {
		return currentRow;
	}
	public void setCurrentRow(Row currentRow) {
		this.currentRow = currentRow;
	}

	@Override
	public String toString() {
		return "Player [currentCell=" + currentCell + ", currentRow=" + currentRow + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(currentCell, currentRow);
	}

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
