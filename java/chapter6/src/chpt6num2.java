import java.util.*;

public class chpt6num2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double diam, rad, area, circ;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("Enter Diameter of circle: ");
			diam = input.nextDouble();

			rad = (diam / 2);
			area = (3.14 * rad * rad);
			circ = (3.14 * diam);

			System.out.println("Area: " + area + " Circumference: " + circ);
		} while (diam != 999);
	}

}
