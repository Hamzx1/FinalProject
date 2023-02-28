package date;
import java.util.Scanner; 
// This class for the students to get there information (common information)
public class StudentsProcedural {
	static final boolean DEBUG = true;
	
	public static void main(String []args) {
		Scanner input = new Scanner (System.in); //For getting inputs from the user.
		String name;
		String birthDate;
		String typeOfSubject; // To check if the student is undergraduate or graduate student.
		int studentID;
		
		System.out.println("Enter your name");
		name = input.next(); //for taking a string value from the user.
		System.out.println("Enter your ID number");
		studentID = input.nextInt(); //for taking a integer value from the user.
		System.out.println("Enter your birth date");
		birthDate = input.next(); //for taking a string value from the user.
		System.out.println("Enter you are graduate student or undergraduate student?");
		typeOfSubject = input.next(); //for taking a string value from the user.
		if (typeOfSubject.equalsIgnoreCase("graduate")) { // checking if the user wrote graduate or something else
			debug("Graduate part entered");
			String thesisTitle;
			System.out.println("Enter the thesis title");
			thesisTitle = input.next(); //for taking a string value from the user.
			if (graduateStudents() == true) {
				debug("Calling the graduate method and chekcing if its true is working");
				System.out.println("Student Name is:" + name + "\n StudentID is:" + studentID + "\n Student birth date is:" + birthDate);
				System.out.println(thesisTitle+"is passed");
			}
			else {
				System.out.println("Student Name is:" + name + "\n StudentID is:" + studentID + "\n Student birth date is:" + birthDate);
				System.out.println(thesisTitle+ "is failed");	
			}	
		}	
		else if (typeOfSubject.equalsIgnoreCase("undergraduate")) { // checking if the user wrote undergraduate or something else
			debug("Undergraduate part entered");
			String projectTitle;
			System.out.println("Enter the project title");
			projectTitle = input.next();
			if (undergraduateStudents() == true) {
				debug("Calling the undergraduate method and chekcing if its true is working");
				System.out.println("Student Name is:" + name + "\n StudentID is:" + studentID + "\n Student birth date is:" + birthDate);
			}
			else {
				System.out.println("Student Name is:" + name + "\n StudentID is:" + studentID + "\n Student birth date is:" + birthDate);
				System.out.println(projectTitle+ "is failed");
			}
		}
		else 
			System.out.println("Invaild Option!");
		
		input.close(); // To close the input object for security reasons.
	}
	
	//
	static void debug(String msg) {
		if(DEBUG) {
			System.out.println(msg);
		}
	}
	//This method for the undergraduate student to check if they passed the project or not.
	static boolean undergraduateStudents() {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter your project GPA");
		double GPA;
		
		GPA = input.nextInt();
		input.close();
		if (GPA >= 50) {
			return true;
		}
		return false;
	}
	//This method for the graduate student to check if they passed the thesis or not.
	static boolean graduateStudents() {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter your thesis GPA");
		double GPA;
		GPA = input.nextInt();
		input.close();
		if (GPA >= 70) {
			return true;
		}
		return false;
	}
}
