import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IProblem;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.TimeoutException;


public class LogicGamesMini {

	public static void main(String[] args) {
		
		
		String[][] board = BoardHandler.getBoard(5, 5);
		BoardHandler.printBoard(board);
		
		ISolver solver = SolverFactory.newDefault();
		solver.setExpectedNumberOfClauses(5);
		try {
			for (int i=0;i<5;i++) {
				  int [] clause = {1+i,3+2*i,4+3*i+2,2+i};
				  solver.addClause(new VecInt(clause)); // adapt Array to IVecInt
				}
			
			IProblem problem = solver;
			if (problem.isSatisfiable()) {
	            int [] model = problem.model();
	            SATHandler.printSatisfiedVars(model);
			} else {
			 
			}
		} catch (ContradictionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
