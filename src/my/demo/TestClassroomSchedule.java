package my.demo;

import java.util.HashMap;
import java.util.Map;

import org.chocosolver.solver.Model;
import org.chocosolver.solver.Solution;
import org.chocosolver.solver.variables.IntVar;

/**
 * 
 * @author Shamsul Bahrin
 * This is a demo program for class scheduling using Constraint Programming with Choco-Solver.
 */

public class TestClassroomSchedule {
	 
	public static void main(String[] args) {
		
		/*
		 * In this simple demo, we defined time slots as integer
		 * We have 10 time slots, so we give an integer number each as 1, 2, 3 until 10.
		 */
		
		//Lets define 5 class activities as C1, C2 ... C5
		String[] classes = new String[] {"C1", "C2", "C3", "C4", "C5" };
		
		//create the model
		Model model = new Model("Test Classroom Scheduler");
		
		/*
		 * The purpose of this model is to find the time slot for each activities.
		 * We defined these time slots as integers between 1 to 10.
		 * Therefore, here we shall create an unknown of type IntVar for each activities in which the solver
		 * shall search for the value (which is the time slot for the activity)
		 */
		
		//create the timeslot variables for each activities
		
		/*
		 * Here we can give possible time slot values for each activities,
		 * for example: class1 shall only be put into slot1 and slot10
		 */
		IntVar[] classVars = new IntVar[5];
		
		//activity1 can be put into slot 1 to 10
		classVars[0] = model.intVar(classes[0], 1, 10);
		//activity2 can be put into slot 5 to 7, and slot 10
		classVars[1] = model.intVar(classes[1], new int[] {5, 6, 7, 10 });
		//activity3 can only be put into slot 3 to 8
		classVars[2] = model.intVar(classes[2], 3, 8);
		//activity4 can only be put into slot 1, 3, 5, 7 and 9
		classVars[3] = model.intVar(classes[3], new int[] {1, 3, 5, 7, 9 });
		//activity5 can only be put into slot 1 to 8
		classVars[4] = model.intVar(classes[4], 1, 8);
		
		
		/*
		 * Now let's defined the teachers for each activities
		 * Here we have 3 teachers, which we called as T1, T2 and T3.
		 * Let's put the teachers into the activites on which they are assigned to
		 */
		Map<String, String[]> classTeacher = new HashMap<String, String[]>();
		//Class C1 is assigned to two teachers, T1 and T2
		classTeacher.put(classes[0], new String[]{"T1", "T2"});
		//Teacher T2 is also assigned to class C2
		classTeacher.put(classes[1], new String[]{"T2"});
		//Teacher T3 is assigned to class C3
		classTeacher.put(classes[2], new String[]{"T3"});
		//Teacher T3 and also T2 are both assigned to class C4
		classTeacher.put(classes[3], new String[]{"T3", "T2"});
		//And class C5 is assigned to Teacher T1
		classTeacher.put(classes[4], new String[]{"T1"});
		
		/*
		 * Now let's do the constraints.
		 * The constraint is: A teacher cannot be in the same slot.
		 */
		
		for ( int i=0; i < classes.length; i++ ) {
			String[] teachers1 = classTeacher.get(classes[i]);
			for ( int j=i+1; j < classes.length; j++ ) {
				System.out.println(classes[i] + " compare with " + classes[j]);
				String[] teachers2 = classTeacher.get(classes[j]);
				for ( String teacher1 : teachers1 ) {
					for ( String teacher2 : teachers2 ) {
						if ( teacher1.equals(teacher2)) {
							System.out.println("Found teacher conflict between " + classes[i] + " and " + classes[j]);
							model.arithm(classVars[i], "!=", classVars[j]).post();
							break;
						}
					}
				}
			}
			
		}
		
		/*
		 * Now lets the solver find the solution, and then just print it out.
		 */
		
		Solution solution = model.getSolver().findSolution();
		if(solution != null){
		    System.out.println(solution.toString());
		}
		
		
	}
	

}
