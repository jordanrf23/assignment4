package hw4.maze;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Row {
	private ArrayList<Cell> cells;
	
	public Row(ArrayList<Cell> cells) {
		this.cells = cells;
	}

	public ArrayList<Cell> getCells() {
		return cells;
	}

	public void setCells(ArrayList<Cell> cells) {
		this.cells = cells;
	}

	@Override
	public String toString() {
		return "Row [cells=" + cells + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cells);
	}

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
