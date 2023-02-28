package date;
import java.util.Scanner;
public class StudentProcedural2 {

	public static void main(String []args) {
		Scanner input = new Scanner (System.in);
		String name;
		String birthDate;
		String typeOfSubject;
		int studentID;
		
		System.out.println("Enter your name");
		name = input.next();
		System.out.println("Enter your ID number");
		studentID = input.nextInt();
		System.out.println("Enter your birth date");
		birthDate = input.next();
		System.out.println("Enter you are graduate student or undergraduate student?");
		typeOfSubject = input.next();
		if (typeOfSubject.equalsIgnoreCase("graduate")) {
			String thesisTitle;
			System.out.println("Enter the thesis title");
			thesisTitle = input.next();
			if (graduateStudents() == true) {
				System.out.println("Student Name is:" + name + "\n StudentID is:" + studentID + "\n Student birth date is:" + birthDate);
				System.out.println(thesisTitle+"is passed");
			}
			else {
				System.out.println("Student Name is:" + name + "\n StudentID is:" + studentID + "\n Student birth date is:" + birthDate);
				System.out.println(thesisTitle+ "is failed");	
			}	
		}	
		else if (typeOfSubject.equalsIgnoreCase("undergraduate")) {
			String projectTitle;
			System.out.println("Enter the project title");
			projectTitle = input.next();
			if (undergraduateStudents() == true) {
				System.out.println("Student Name is:" + name + "\n StudentID is:" + studentID + "\n Student birth date is:" + birthDate);
			}
			else {
				System.out.println("Student Name is:" + name + "\n StudentID is:" + studentID + "\n Student birth date is:" + birthDate);
				System.out.println(projectTitle+ "is failed");
			}
		}
		else 
			System.out.println("Invaild Option!");
		
		input.close();
	}
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
