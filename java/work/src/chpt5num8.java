import java.util.*;

public class chpt5num8 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int empnum, reg, ovrhr;
		int counter = 0;
		double total = 0;
		double rate, ovrpay;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("Enter employee name: ");
			name = input.nextLine();

			System.out.println("Enter employee number: ");
			empnum = input.nextInt();

			System.out.println("Enter hourly rate: ");
			rate = input.nextDouble();

			System.out.print("Enter regular hours: ");
			reg = input.nextInt();

			System.out.print("Enter Over time hours: ");
			ovrhr = input.nextInt();

			double regpay = (reg * rate);
			ovrpay = (ovrhr * rate * 1.5);
			total = (regpay + ovrpay);

			System.out.println(" Employee name: " + name + " Employee number: "
					+ empnum + " Pay rate: " + rate);
			System.out.println(" Regular hours worked " + reg
					+ " Overtime worked: " + ovrhr);
			System.out.println(" Regular pay: " + regpay + " Overtime Pay: "
					+ ovrpay + " Total pay: " + total);
			counter++;
		} while (counter <= 10);

	}
}
