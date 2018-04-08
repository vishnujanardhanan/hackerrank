import java.util.Arrays;
import java.util.stream.IntStream;

class Student extends Person {
	
	Student(String firstName, String lastName, int identification) {
		super(firstName, lastName, identification);
		// TODO Auto-generated constructor stub
	}

	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
	Student(String firstName, String lastName, int identification, int[] testScores) {
		super(firstName, lastName, identification);
		// TODO Auto-generated constructor stub
		this.testScores = testScores;
	}

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
	String calculate() {
		String grade = "";
		int average = IntStream.of(this.testScores).sum()/this.testScores.length;
		
		if(average>=90) {
			grade="O";
		}
		else if(average >= 80 && average < 90) {
			grade = "E";
		}
		else if(average >= 70 && average < 80) {
			grade = "A";
		}
		else if(average >= 55 && average < 70) {
			grade = "P";
		}
		else if(average >= 40 && average < 55) {
			grade = "D";
		}
		else {
			grade = "T";
		}
		return grade;
	}
}