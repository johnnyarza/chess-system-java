package boardgame;

public class Piece {
	
	protected Position position; // é private pq esta position é referente a matriz
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

	

}
