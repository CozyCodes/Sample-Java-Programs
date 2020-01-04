package Main;

/*
 * 
 * 
 * 
 *  
 *  
 O 90 <= Score  >=100
E 80 <= Score  <90  
A 70 <= Score  <80 
P 55 <= Score  <70 
D 40 <= Score  <55 
T Score < 40

Input Format

The locked stub code in your editor calls your Student class constructor and passes it the necessary arguments. It also calls the calculate method (which takes no arguments).

You are not responsible for reading the following input from stdin:
The first line contains , , and , respectively. The second line contains the number of test scores. The third line of space-separated integers describes .

Constraints

Output Format

This is handled by the locked stub code in your editor. Your output will be correct if your Student class constructor and calculate() method are properly implemented.

Sample Input

Heraldo Memelli 8135627
2
100 80
Sample Output

 Name: Memelli, Heraldo
 ID: 8135627
 Grade: O*/



import java.util.Scanner;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

public class Student extends Person {
	


	private int[] testScores;
	
	Student(String firstName, String lastName, int identification,int[] scores) {
		super(firstName, lastName, identification);
		// TODO Auto-generated constructor stub
		testScores =scores;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
	
	String calculate() {
		String grade="";
		int temp=0;
		int avg;
		for(int i=0;i<testScores.length;i++) {
			temp += testScores[i];
			
		}
		avg = temp/testScores.length;
		if(avg >= 90 && avg < 100) {
			grade = "O";
		}else if(avg >= 80 && avg < 90) {
			grade = "E";
		}
		else if(avg >= 70 && avg < 80) {
			grade = "A";
		}else if(avg >= 55 && avg < 70) {
			grade = "P";
		}
		else if(avg >= 40 && avg < 55) {
			grade = "D";
		}else if(avg <40) {
			grade = "T";
		}
		return grade;
		
	}
	

}
