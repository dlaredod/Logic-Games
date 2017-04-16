import java.util.Scanner;
import java.util.Set;


public class BoardHandler {
	
//	public static Set<Pair> getConflicts(){
//		
//	}
	
	public static String[][] getBoard(int rows, int cols){
		
		String[][] board = new String[rows][cols];
		
		for (int i=0; i<rows; i++){
			System.out.print("row "+i+": ");
			board[i] = getRow(cols);
		}
		
		return board;
	}
	
	public static void printBoard(String[][] board) {
		
		if (board==null) return; 
		
		for (int i=0; i<board.length; i++){
			for (int j=0; j<board[0].length; j++){
				if (j!=0)
					System.out.print(" ");
				System.out.print(board[i][j]);
				if (j!=board[i].length-1)
					System.out.print(" ");
			}
			System.out.println("");
		}
	}

	private static String[] getRow() {
		
		Scanner scan = new Scanner(System.in);
		String row = scan.nextLine();
		return row.split(" ");
		
	}

	public static String[][] randomizeBoard(int rows, int cols){
		
		return null;
	}

	public static Set<Conflict> getConflicts(String[][] board) {
		
		Set<Conflict> rowsC = getRowsConflicts(board);
		Set<Conflict> colsC = getColsConflicts(board);
		
		rowsC.addAll(colsC);
		return rowsC;
		
	}

	private static Set<Conflict> getColsConflicts(String[][] board) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Set<Conflict> getRowsConflicts(String[][] board) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
