package finalAssignment;
import java.util.Random;
public class ExecutableFinalProject {
	
	public static void main(String[] args) {
		//Declaring three arrays one for the team names, second for the team id, and third for the rank.
		String[] teamNames = {"Knights-PUST", "Coders-HTU", "Syntax-JU", "Fast-JUST", "Eagles-UP", "Blooders-MU", "Pro-BAU	", "Guards-ASPU", "Thinkers-UM", "Greaters-YU"};
		int [] teamID = {122, 101, 490, 555, 778, 929, 325, 872, 435, 232};
		String [] rank = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth", "Tenth"};
		//Instantiate an objective from a class named Random.
		Random randomGenerator = new Random();
		//Instantiate an objective from a class named Team.
		Team array[] = new Team[10];
		/*Using for loop to fill the array[] and I filled the array[] by calling the methods setters from Team class 
		and giving this setters methods arguments based on what it needs.*/
		for (int i = 0; i < 10; i++) {
			array[i] = new Team();
			array[i].setRank(rank[i]);
			array[i].setSolvedQuestion(randomGenerator.nextInt(10) + 0);
			array[i].setElapsedTimeD(randomGenerator.nextInt(300) + 0);
			array[i].setTeamID(teamID[i]);
			array[i].setTeamName(teamNames[i]);
		}
		//Calling the Sorting method.
		sorting(array);
		System.out.println("#########################################################################################################");
		System.out.println("#\tRank\t#"+"\tTeamID\t#"+"\tTeam Name\t#"+"\tSolved Question\t#"+"\tElapsed Time\t#");
		System.out.println("#########################################################################################################");
		/*Printing the array contents by calling the method printDetails in line 53 and line 52 
		we called method setters and gave it arguments from the array rank to print what it contains.*/
		for (int i = 0; i < array.length;i++) {
			array[i].setRank(rank[i]); 
			array[i].printDetails();
		}	
		System.out.println("#########################################################################################################");
	}
	//Creating a method that sorting (the used method for the sorting is a bubble algorithm)the teams based on their solved question and elapsed time.
		public static void sorting(Team array[]) {
			//Loop to go through all the array indexes.
			 for (int i = 0; i < array.length; i++) {
				//For loop to sort array based on the solved question and elapsed time.
	             for (int j = 0; j < array.length - 1; j++) {  
	            //Used if conditions to check if the index on the left is smaller than the right index based on the solved question. 
					if (array[j].getSolvedQuestion() < array[j + 1].getSolvedQuestion()) {
	                	 Team swap = array[j];
	                     array[j] = array[j + 1];
	                     array[j + 1] = swap;                
					}
				//Used if condition to check if the solved question time are equal if they are it will enter the code.
					else if (array[j].getSolvedQuestion() == array[j + 1].getSolvedQuestion()) {
				//Used if conditions to check if the index on the left is bigger than the right index based on the elapsed time.
						if (array[j].getElapsedTime() > array[j + 1].getElapsedTime()) {
		                	 Team swap = array[j];
		                     array[j] = array[j + 1];
		                     array[j + 1] = swap;         
						}
					}
	             }
			}	
		}		
}