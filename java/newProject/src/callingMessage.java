import java.util.*;

public class callingMessage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("enter first number: ");
		fnum = scn.nextDouble();
		System.out.println("enter second number: ");
		snum = scn.nextDouble();
		answer = fnum + snum;
		System.out.println("Your answer is: " + answer);
		if (answer < 10) {
			System.out.println("your answer is less than then: ");

		} else {
			System.out.println("dont know how much your number is: ");
		}

	}

}
