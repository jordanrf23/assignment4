package maze;

public class Row {
	
	private int row;
	private int col;
	
	public Row(int row, int col) {
		this.row = row;
		this.col = col;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}
	
	public void setPosition(int row, int col) {
		this.row = row;
		this.col = col;
	}

}
