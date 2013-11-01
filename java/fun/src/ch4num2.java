import java.util.*;

public class ch4num2 {
	/**
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		int code;
		Scanner input = new Scanner(System.in);

		System.out.println("enter two numbers: ");
		num1 = input.nextInt();
		num2 = input.nextInt();

		System.out.println("Enter your code: ");
		code = input.nextInt();

		switch (code) {
		case 1:
			System.out.println(num1 + " " + num2 + " " + code + " "
					+ (num1 + num2));
			break;
		case 2:
			System.out.println(num1 + " " + num2 + " " + code + " "
					+ (num1 - num2));
			break;
		case 3:
			System.out.println(num1 + " " + num2 + " " + code + " "
					+ (num1 * num2));
			break;
		case 4:
			if (num2 != 0) {
				System.out.println(num1 + " " + num2 + " " + code + " "
						+ (num1 / num2));
				break;
			} else {
				System.out.println("Error second number is 0");
			}
		default:
			System.out.println("error ");
		}
	}

}
