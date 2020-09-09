
public class FifytFour {
	public static int[][] SOLVE_ME_HARD = {
		  { 8, 0, 0, 0, 0, 0, 0, 0, 0 },
		  { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
		  { 0, 7, 0, 0, 9, 0, 2, 0, 0 },
		  { 0, 5, 0, 0, 0, 7, 0, 0, 0 },
		  { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
		  { 0, 0, 0, 1, 0, 0, 0, 3, 0 },
		  { 0, 0, 1, 0, 0, 0, 0, 6, 8 },
		  { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
		  { 0, 9, 0, 0, 0, 0, 4, 0, 0 } 
		};
	
	public static int[][] SOLVE_ME_MEDIUM = {
		{9,0,0,1,0,0,0,0,5},
		{0,0,5,0,9,0,2,0,1},
		{8,0,0,0,4,0,0,0,0},
		{0,0,0,0,8,0,0,0,0},
		{0,0,0,7,0,0,0,0,0},
		{0,0,0,0,2,6,0,0,9},
		{2,0,0,3,0,0,0,0,6},
		{0,0,0,2,0,0,9,0,0},
		{0,0,1,9,0,4,5,7,0},
};
	
	public static void main(String[] args){
		Sudoku sudoku = new Sudoku(SOLVE_ME_MEDIUM);		
		
		System.out.println("------ Board to solve ------\n");
		sudoku.display();
		
		if(sudoku.solve()){
			System.out.println("------ Solved Board ------");
			sudoku.display();
		} else {
			System.out.println("\n------ Unsolvable board ------\n");
		}
		
	}
	
}
