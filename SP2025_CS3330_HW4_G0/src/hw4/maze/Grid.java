package hw4.maze;

import java.util.ArrayList;
import java.util.Objects;

public class Grid {
	//variable to contain the rows in an array list
	private ArrayList<Row> rows;

	/*
	 * assigning the rows to the list
	 */
	public Grid(ArrayList<Row> rows) {
		this.rows = rows;
	}
	
	/*
	 * obtaining the rows
	 */
	public ArrayList<Row> getRows() {
		return rows;
	}
	
	/*
	 * setting the rows to the list after retrieving them
	 */
	public void setRows(ArrayList<Row> rows) {
		this.rows = rows;
	}
	
	/*
	 * relaying the rows to the user
	 */
	@Override
	public String toString() {
		return "Grid [rows=" + rows + "]";
	}
	
	/*
	 * comparing rows and returning 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Grid other = (Grid) obj;
		return Objects.equals(rows, other.rows);
	}
}

