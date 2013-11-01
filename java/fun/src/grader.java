import java.util.Scanner;

public class grader {
	// This is simple student grader program ch04 number 3
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numID, score;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter student number: ");
		numID = input.nextInt();

		System.out.println("Enter score: ");
		score = input.nextInt();

		if (score >= 90) {
			System.out.println("Student " + numID + " grade: A");
		} else {
			if (score >= 80) {
				System.out.println("Student " + numID + " grade: B");
			} else {
				if (score >= 70) {
					System.out.println("Student " + numID + " grade: C");
				} else {
					if (score >= 60) {
						System.out.println("Student " + numID + " grade: D");
					} else {
						System.out.println("Student " + numID + " grade: F");
					}
				}
			}
		}
	}

}
