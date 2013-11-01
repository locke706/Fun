import java.util.*;

public class ch5num4 {
	/**
	 * First variable is special it decides how many numbers with be sumed and
	 * averaged
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fnum = 0;
		int counter = 1;
		int total = 0;
		int num, avg;
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter first interger");
		fnum = input.nextInt();
		
		do {
			System.out.println("Enter interger");
			num = input.nextInt();
			total = (num + total);
			counter++;
		} while (counter == fnum);
		
		avg = (total / fnum);
		System.out.println("Average: " + avg + " Total: " + total);
	}

}

