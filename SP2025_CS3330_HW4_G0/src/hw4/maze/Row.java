package hw4.maze;

import java.util.List;
import java.util.Objects;

public class Row {
	private List<Cell> cells;
	
	public Row(List<Cell> cells) {
		this.cells = cells;
	}

	public List<Cell> getCells() {
		return cells;
	}

	public void setCells(List<Cell> cells) {
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
