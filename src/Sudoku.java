import java.awt.Color;

public class Sudoku {

	private int[][] board;
	private int[][] unsolvedBoard;
	public static final int EMPTY = 0;
	public static final int SIZE = 9;

	public Sudoku(int board[][]) {
		this.board = new int[SIZE][SIZE];

		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				this.board[i][j] = board[i][j];
			}
		}
		unsolvedBoard = board.clone();
	}

	public boolean solve() {
		for (int row = 0; row < SIZE; row++) {
			for (int col = 0; col < SIZE; col++) {
				if (board[row][col] == EMPTY) {
					for (int number = 1; number <= SIZE; number++) {
						if (checkNumber(number, row, col)) {
							board[row][col] = number;
							if (solve()) {
								return true;
							} else {
								board[row][col] = EMPTY;
							}
						}
					}					
					return false;
				}
			}
		}	
		return true;
	}

	// Check if a certain value is present in given row
	private boolean inRow(int number, int row) {
		for (int i = 0; i < SIZE; i++) 
			if (board[row][i] == number) 
				return true;
			
		
		return false;
	}

	// Check if a certain value is present in given column
	private boolean inCol(int number, int col) {
		for (int i = 0; i < SIZE; i++) 
			if (board[i][col] == number) 
				return true;
				
		return false;
	}

	
	// Check if a certain value is present in given 3x3 box
	private boolean inBox(int number, int row, int col) {
		int r = row - row % 3;
		int c = col - col % 3;

		for (int i = r; i < r + 3; i++) 
			for (int j = c; j < c + 3; j++) 
				if (board[i][j] == number) 
					return true;
				
		return false;
	}

	// Check if we can add a certain number to given cell
	private boolean checkNumber(int number, int row, int col) {
		return !inRow(number, row) && !inCol(number, col)
				&& !inBox(number, row, col);
	}

	public void display() {
		for (int i = 0; i < SIZE; i++) {
			System.out.print("     ");
			for (int j = 0; j < SIZE; j++) {
				
					System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
