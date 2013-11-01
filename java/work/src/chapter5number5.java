import java.util.*;

public class chapter5number5 {
	/**
	 * convert 2400 to 12-hrs end at 9999
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hrs, mins;
		String time;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your hours then, Minutes: ");
		hrs = input.nextInt();
		mins = input.nextInt();

		do {
			if (hrs > 12) {
				hrs = (hrs - 12);
				time = "p.m";
			} else {
				time = "a.m";
			}
			if (hrs <= 12) {
				System.out.println(hrs + "" + ":" + mins + " " + time);
			} else {
				System.out.println("Error");
			}
			System.out.println("Enter your hours then, Minutes ; ");
			hrs = input.nextInt();
			mins = input.nextInt();

		} while (hrs != 99);
		while (mins != 99)
			;
	}

}
