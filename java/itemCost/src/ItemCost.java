import java.util.Scanner;


public class ItemCost {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inum, qty, oldqty;
		String iname;
		int counter = 0;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("enter item name and item number ");
			iname = input.nextLine();
			inum = input.nextInt();

			System.out.println("Enter quantity sold this year: ");
			qty = input.nextInt();

			System.out.println("Enter quantity sold last year: ");
			oldqty = input.nextInt();

			int ans = (qty - oldqty);
			System.out.println("name: " + iname + " number: " + inum
					+ " quantity sold increase/ decrease: " + ans);
			counter++;
		} while (counter <= 10);

	}
}

