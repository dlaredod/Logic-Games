import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;


public class Conflict{

	private ArrayList<BoardPair> items;
	
	public Conflict(List<BoardPair> c){
		items= new ArrayList<BoardPair>();
		items.addAll(c);
		
	}
	
	public int[] asIntArray(){
		int[] asArray = new int[items.size()];
		for (int i=0; i<items.size(); i++){
			asArray[i]=items.get(i).;
		}
	}
	
}
