package finalAssignment;
public class Team{
	//Declaring five instant variables. 
	private String rank;
	private int teamID;
	private String teamName;
	private int solvedQuestion;
	private int elapsedTime;
	// From lines 10 - 39, create a setter and getter method for all instant variables to access instant variables by using them.
	// "this" in the lines below to specify that I mean the instance variable in this class.
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getRank() {
		return rank;
	}
	public void setTeamID(int teamID) {
		this.teamID =teamID;
	}
	public int getTeamID() {
		return teamID;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setSolvedQuestion(int solvedQuestion) {
		this.solvedQuestion= solvedQuestion;
	}
	public int getSolvedQuestion() {
		return solvedQuestion;
	}
	public void setElapsedTimeD(int elapsedTime) {
		this.elapsedTime = elapsedTime;
	}
	public int getElapsedTime() {
		return elapsedTime;
	}
	//Creating a method that prints the values of the instant variables. 
	public void printDetails() {
		System.out.println("#\t"+rank+"\t#\t"+teamID+"\t#\t"+teamName+"\t#\t\t"+solvedQuestion+"/10"+"\t#\t\t"+elapsedTime+"\t#");
	}
}