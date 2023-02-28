package date;
//This class for all the students in the university and it's include all the common information between them.
public abstract class Students {
	private String name;
	private int studentID;
	private double GPA;
	private MyDate birthDate;
	
	public Students () { //default constructor
		name = "No Name";
		studentID = 0000000;
		GPA = 0;
		birthDate = new MyDate();
	}
	public Students (String name, int studentID, double GPA) {//parameterized constructor
		setName(name);
		setStudentID(studentID);
		setGPA(GPA);
		birthDate = new MyDate();
	}
	public Students (String name, int studentID, double GPA, int day, int month, int year) {//parameterized constructor
		setName(name);
		setStudentID(studentID);
		setGPA(GPA);
		birthDate = new MyDate(day, month, year);
	}
	// "this" in the lines below to specify that I mean the instance variable in this class.
	public void setName (String name) {
		this.name = name;
	}
	public String getName () {
		return name;
	}
	public void setStudentID (int studentID) {
		this.studentID = studentID;
	}
	public int getStudentID () {
		return studentID;
	}
	public void setGPA (double GPA) {
		this.GPA = GPA;
	}
	public double getGPA () {
		return GPA;
	}
	public void setMyDate (int day, int month, int year) {
		birthDate.setDay(day);
		birthDate.setMonth(month);
		birthDate.setYear(year);
	}
	public void setMyDate (MyDate date) {
		birthDate.setDay(date.getDay());
		birthDate.setMonth(date.getMonth());
		birthDate.setYear(date.getYear());
	}
	
	public MyDate getBirthDates() {
		return birthDate;
	}
	public abstract boolean isPassed ();//To force all the inherited class writing a boolean method named isPassed. 
	//I override the toString method to change the one in the object class.
	public String toString () {
		return String.format("The Student name is: %s\nID is: %d\nGPA is: %f\nBirthdate is: %s", getName(),
				getStudentID(), getGPA(), birthDate.toString());//birthDate.toString because the birthDate is an object from MyDate type
	}
}
