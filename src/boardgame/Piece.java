package boardgame;

public class Piece {
	
	protected Position position; // � private pq esta position � referente a matriz
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

	

}
