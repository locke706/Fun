import java.util.*;

public class ch4num4 {
	/**
	 * receives a parcel's weight and calculates the chargesS
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double weight, charges;
		Scanner input = new Scanner(System.in);

		System.out.println("enter parcel's weight: ");
		weight = input.nextDouble();

		if (weight > 5) {
			charges = (2.45 * weight);
		} else {
			if (weight < 2.5) {
				charges = (3.50 * weight);
			} else {
				charges = (2.85 * weight);
			}
		}
		System.out.println("Your charges are $ " + charges);
	}

}
