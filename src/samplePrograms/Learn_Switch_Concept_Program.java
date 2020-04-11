package samplePrograms;

public class Learn_Switch_Concept_Program {

	public static void main(String[] args) {
		
		String branch ="ECE";
		switch(branch)
		{
		
		
		case "CSE":
			System.out.println("CSE IS GOOD BRANCH");
			break;
		case "ECE":
			System.out.println("ECE IS GOOD BRANCH");
			
					
			default:
			{
			System.out.println("no matching branch");	
			}
			}
	}
}


