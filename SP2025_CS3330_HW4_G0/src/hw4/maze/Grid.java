package hw4.maze;

import java.util.ArrayList;
import java.util.Objects;

public class Grid {
	private ArrayList<Row> rows;

	public Grid(ArrayList<Row> rows) {
		this.rows = rows;
	}

	public ArrayList<Row> getRows() {
		return rows;
	}

	public void setRows(ArrayList<Row> rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "Grid [rows=" + rows + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Grid other = (Grid) obj;
		return Objects.equals(rows, other.rows);
	}
}

