//Continue statement is mostly used inside loops. Whenever it is encountered inside a loop, control directly jumps to the beginning of the loop for next iteration, skipping the execution of statements inside loop’s body for the current iteration. This is particularly useful when you want to continue the loop but do not want the rest of the statements(after continue statement) in loop body to execute for that particular iteration.

package samplePrograms;

public class Learn_continue_concept_program {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++)
		{
			  if (i == 4)
			  {
				 
			    break;
			  
			   
			  }
			  System.out.println(i);
			}	
	
}
}