package hw4.maze;

import java.util.ArrayList;
import java.util.Objects;

public class Row {
	//variable to contain the cell in an array list
	private ArrayList<Cell> cells;
	
	/*
	 * assigning the cells to the list 
	 */
	public Row(ArrayList<Cell> cells) {
		this.cells = cells;
	}
	
	/*
	 * obtaining cell
	 */
	public ArrayList<Cell> getCells() {
		return cells;
	}
	
	/*
	 * setting the cells to the list after retrieving them
	 */
	public void setCells(ArrayList<Cell> cells) {
		this.cells = cells;
	}

	/*
	 * relaying the cell to the user
	 */
	@Override
	public String toString() {
		return "Row [cells=" + cells + "]";
	}
	
	/*
	 * return the hash location for the cell
	 */
	@Override
	public int hashCode() {
		return Objects.hash(cells);
	}
	
	/*
	 * comparing current cell with other cells
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Row other = (Row) obj;
		return Objects.equals(cells, other.cells);
	}
	

}
