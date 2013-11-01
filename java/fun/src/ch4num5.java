import java.util.*;

public class ch4num5 {
	/**
	 * price and discount
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price;
		String code;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter discount code: ");
		code = input.nextLine();

		System.out.println("Enter price: ");
		price = input.nextDouble();

		if (code.equals("h")) {
			System.out.println("$" + price + " discount is: 50%"
					+ " Discounted price: " + "$" + (price - (price * .50)));
		} else {
			if (code.equals("f")) {
				System.out
						.println("$" + price + " discount is: 40%"
								+ " Discounted price: " + "$"
								+ (price - (price * .40)));
			} else {
				if (code.equals("t")) {
					System.out.println("$" + price + " discount is: 33%"
							+ " Discounted price: " + "$"
							+ (price - (price * .33)));
				} else {
					if (code.equals("q")) {
						System.out.println("$" + price + " discount is: 25%"
								+ " Discounted price: " + "$"
								+ (price - (price * .25)));
					} else {
						if (code.equals("z")) {
							System.out.println("$" + price + " discount is: 0%"
									+ " No discount ");
						} else {
							System.out.println("Invalid pricing code");
						}
					}
				}
			}
		}
	}
}
