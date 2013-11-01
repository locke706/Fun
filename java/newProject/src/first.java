import java.util.*;

public class first {
	/*
	 * hey there what what are you doing
	 */
	public static void main(String[] args) {
		// this is just me fooling aroung
		Scanner input = new Scanner(System.in);
		tuna tunaObject = new tuna();
		robin robinObject = new robin();
		double fnum, snum, answer;

		System.out.println("Enter first number: ");
		fnum = input.nextDouble();
		System.out.println("Enter second number: ");
		snum = input.nextDouble();
		answer = fnum + snum;

		tunaObject.secondMessage();
		tunaObject.simpleMessage(answer);
		robinObject.helpMessage(answer);
	}

}
