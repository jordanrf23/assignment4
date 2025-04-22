package maze;

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
		this.up = up;
	}

	public CellComponents getDown() {
		return down;
	}

	public void setDown(CellComponents down) {
		this.down = down;
	}

	public CellComponents getLeft() {
		return left;
	}

	public void setLeft(CellComponents left) {
		this.left = left;
	}

	public CellComponents getRight() {
		return right;
	}

	public void setRight(CellComponents right) {
		this.right = right;
	}
	

}
