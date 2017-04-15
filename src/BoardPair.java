
public class BoardPair {
	
	private int row;
	private int col;
	private int id;


	public BoardPair(int i, int j, int id){
		
		this.row = i;
		this.col = i;
		this.id = id;
		
	}
	
	public int getRow() {
		return row;
	}
	
	public int getCol() {
		return col;
	}
	
	public int getLiteral() {
		return id;
	}
	
	public int getNotLiteral() {
		return -id;
	}
	
	


}
