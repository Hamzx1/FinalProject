package date;
//This class for the birth date of the student in the university.
public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate() {//default constructor.
		day = 1;
		month = 1;
		year = 1939;
	}
	public MyDate(int day, int month, int year) {//parameterized constructor.
		setDay(day);
		setMonth(month);
		setYear(year);
	}
	// "this" in the lines below to specify that I mean the instance variable in this class.
	public void setDay (int day) {
		if ( day >= 1 && day <= 31) {
			this.day = day;
		}
		else {
			this.day = 1;
		}
		if (month == 2) {
			if (day >= 1 && day <= 28) {
				this.day = day;
			}
		}
	}
	public int getDay() {
		return day;
	}
	public void setMonth (int month) {
		if (month >= 1 && month <= 12) {
			this.month = month; 
		}
	}
	public int getMonth() {
		return month;
	}
	public void setYear (int year) {
		if (year >= 1000 && year <= 9999) {
			this.year = year;
		}	
	}
	public int getYear () {
		return year;
	}
	//I override the toString method to change the one in the object class.
	public String toString () {
		return String.format ("%d/%d/%d", day, month, year);
	}
}
