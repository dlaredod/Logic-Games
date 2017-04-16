
public class SATHandler {

	public static void printSatisfiedVars(int[] model) {
		
		for (int i=0; i<model.length; i++){
			if (i!=0)
				System.out.print(" ");
			System.out.print(model[i]);
			if (i!=model.length-1)
				System.out.print(" ");
		}
		
		System.out.println("");
		
	}

}
