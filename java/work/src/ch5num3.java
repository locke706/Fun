import java.util.*;


public class ch5num3 {
	/**
	 * ch5num3 : payroll: recive total and print it after 999 is reached
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pay;
		int total = 0;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("enter your pay: ");
			pay = input.nextInt();
			total = (total + pay);
		} while (total <= 999);

		System.out.println("Total payroll: $" + total);
	}

}
