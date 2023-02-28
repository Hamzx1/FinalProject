package date;
//This class inherited from the student class and this class special for the undergraduate students.
public class GraduateStudents extends Students{
	private String thesisTitle;
	
	public GraduateStudents() {//Default constructor. 
		thesisTitle = "No Title";
	}
	public GraduateStudents (String thesisTitle, String name, int studentID, double GPA) {//parameterized constructor.
		super(name, studentID, GPA);
		setThesisTitle(thesisTitle);
	}
	//parameterized constructor.
	public GraduateStudents (String thesisTitle, String name, int studentID, double GPA, int day, int month, int year) {
		super(name, studentID, GPA, day, month, year);
		setThesisTitle(thesisTitle);
	}
	// "this" in the lines below to specify that I mean the instance variable in this class.
	void setThesisTitle (String projectTitle) {
		this.thesisTitle = projectTitle;
	}
	public String getThesisTitle () {
		return thesisTitle;
	}
	public boolean isPassed() {
		//Getting the GPA from the sup class (student class);
		if (super.getGPA() >= 70) {
			return true;
		}
		return false;
	}
	//I override the toString method to change the one in the student class (super class). 
	public String toString () {
		return String.format("%s\n%s", super.toString(), getThesisTitle());
	}
}
