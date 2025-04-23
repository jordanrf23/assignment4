package hw4.maze;

import java.util.Objects;

public class Cell {
	// variables for the game to use
	private CellComponents up;
	private CellComponents down;
	private CellComponents left;
	private CellComponents right;
	
	/*
	 * assigning the variables to the cell method
	 */
	public Cell(CellComponents up, CellComponents down, CellComponents left, CellComponents right) {
		super();
		this.up = up;
		this.down = down;
		this.left = left;
		this.right = right;
	}

	/*
	 * obtaining the up component
	 */
	public CellComponents getUp() {
		return up;
	}
	
	/*
	 * taking the up movement as long as it is not null
	 */
	public void setUp(CellComponents up) {
		if (up != null) {
			this.up = up;
		}
	}
	
	/*
	 * obtaining the down component
	 */
	public CellComponents getDown() {
		return down;
	}
	
	/*
	 * taking the down movement as long as it is not null
	 */
	public void setDown(CellComponents down) {
		if(down != null) {	
			this.down = down;
		}
	}
	
	/*
	 * obtaining the left component
	 */
	public CellComponents getLeft() {
		return left;
	}
	
	/*
	 * taking the left movement as long as it is not null
	 */
	public void setLeft(CellComponents left) {
		if(left != null) {
			this.left = left;
		}
	}
	
	/*
	 * obtaining the right component
	 */
	public CellComponents getRight() {
		return right;
	}
	
	/*
	 * taking the right movement as long as it is not null
	 */
	public void setRight(CellComponents right) {
		if(right != null) {	
			this.right = right;
		}
	}
	
	/*
	 * relaying the movement to the user
	 */
	@Override
	public String toString() {
		return "Cell [left=" + left + ", right=" + right + ", up=" + up + ", down=" + down + "]";
	}
	
	/*
	 * returning the hash movements
	 */
	@Override
	public int hashCode() {
		return Objects.hash(down, left, right, up);
	}
	
	/*
	 * comparing the movements and returning 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cell other = (Cell) obj;
		return down == other.down && left == other.left && right == other.right && up == other.up;
	}
	
	
	

}
