package date;
import java.util.Scanner;
//This class for creating objects from graduate and undergraduate classes. 
public class Demo {
	
	public static void main(String []args) {
		//Instantiate a object from Scanner class which will help us to get inputs from the user. 
		Scanner input = new Scanner(System.in);
		//Instantiate a object from UndergraduateStudents and GraduateStudents classes.
		UndergraduateStudents test1 =  new UndergraduateStudents ("Project1", "Hamza", 2121006, 60, 26, 5, 2003); 
		GraduateStudents test2 =  new GraduateStudents ();
		
		//From line 15 to 28 for getting for getting to fill the test2 object. 
		System.out.println("Please enter the name of the students:");
		test2.setName(input.next());
		
		System.out.println("Please enter the id of the students:");
		test2.setStudentID(input.nextInt());
		
		System.out.println("Please enter the GPA of the students:");
		test2.setGPA(input.nextDouble());
		
		System.out.println("Please enter the thesis title of the students:");
		test2.setThesisTitle(input.next());
		
		System.out.println("Please enter the birth date of the students:");
		test2.setMyDate(input.nextInt(), input.nextInt(), input.nextInt());
		//From line 30 - 33printing the value of each object.
		System.out.println("Undergraduate student");
		System.out.println(test1);
		System.out.println("Graduate student");
		System.out.println(test2);
		
		//From line 36 -39 checking if the user passed or not by calling isPassed method for each object.
		System.out.println("Is the Undergraduate student passed?");
		System.out.println(test1.isPassed());
		System.out.println("Is the Graduate student passed?");
		System.out.println(test2.isPassed());
		
		input.close(); //Closing the scanner for security reasons. 	
	}

}
