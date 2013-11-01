import java.util.*;

public class chpt6num1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age, yrs, mnths;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("Enter your aga in years and then months: ");
			yrs = input.nextInt();
			mnths = input.nextInt();

			age = ((yrs * 12) + mnths);

			if (age > 500) {
				System.out.println("Your age in monts is: " + age + "***");
			} else {
				System.out.println("Your age in monts is: " + age);
			}
		} while (yrs < 99 && mnths < 99);
	}

}
