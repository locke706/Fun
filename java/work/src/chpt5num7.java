import java.util.*;

public class chpt5num7 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int accnum, obal, cheque;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter acount number: ");
		accnum = input.nextInt();

		System.out.println("Enter opening balance: ");
		obal = input.nextInt();

		System.out.println("Enter Cheque amount: ");
		cheque = input.nextInt();

		int rbal = obal;

		do {
			rbal = (rbal - cheque);
			System.out.println("Cheque amount: $" + cheque
					+ " Running balance: $" + rbal);
			System.out.println("Enter Cheque amount: ");
			cheque = input.nextInt();

		} while (cheque != 0);

		int cbal = rbal;
		System.out.println("Closing balance: $" + cbal);
	}

}
