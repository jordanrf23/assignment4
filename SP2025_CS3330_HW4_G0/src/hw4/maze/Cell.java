package hw4.maze;

import java.util.Objects;

public class Cell {
	
	private CellComponents up;
	private CellComponents down;
	private CellComponents left;
	private CellComponents right;
	
	public Cell(CellComponents up, CellComponents down, CellComponents left, CellComponents right) {
		super();
		this.up = up;
		this.down = down;
		this.left = left;
		this.right = right;
	}

	public CellComponents getUp() {
		return up;
	}

	public void setUp(CellComponents up) {
		if (up != null) {
			this.up = up;
		}
	}

	public CellComponents getDown() {
		return down;
	}

	public void setDown(CellComponents down) {
		if(down != null) {
			this.down = down;
		}
	}

	public CellComponents getLeft() {
		return left;
	}

	public void setLeft(CellComponents left) {
		if(left != null) {
			this.left = left;
		}
	}

	public CellComponents getRight() {
		return right;
	}

	public void setRight(CellComponents right) {
		if(right != null) {	
			this.right = right;
		}
	}

	@Override
	public String toString() {
		return "Cell [up=" + up + ", down=" + down + ", left=" + left + ", right=" + right + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(down, left, right, up);
	}

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
