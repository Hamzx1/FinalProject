package date;
//This class inherited from the student class and this class special for the undergraduate students.
public class UndergraduateStudents extends Students {

	private String projectTitle;
	
	public UndergraduateStudents() {//Default constructor. 
		projectTitle = "No Title";
	}
	public UndergraduateStudents (String projectTitle, String name, int studentID, double GPA) {//parameterized constructor.
		super(name, studentID, GPA);
		setProjectTitle(projectTitle);
	}
	//parameterized constructor.
	public UndergraduateStudents (String projectTitle, String name, int studentID, double GPA, int day, int month, int year) {
		super(name, studentID, GPA, day, month, year);
		setProjectTitle(projectTitle);
	}
	// "this" in the lines below to specify that I mean the instance variable in this class.
	void setProjectTitle (String projectTittle) {
		this.projectTitle = projectTittle;
	}
	public String getProjectTitle () {
		return projectTitle;
	}
	public boolean isPassed() {
		//Getting the GPA from the sup class (student class);
		if (super.getGPA() >= 50) {
			return true;
		}
		return false;
	}
	//I override the toString method to change the one in the student class (super class). 
	public String toString () {
		return String.format("%s\n%s", super.toString(), getProjectTitle());
	}
}
