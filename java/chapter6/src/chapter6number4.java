import java.util.Scanner;

public class chapter6number4 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		int mm, sm, mw, sw;
		int counter = 0;
		String gender, mstatus, name;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("Enter name: ");
			name = input.nextLine();

			System.out.println("Enter gender: ");
			gender = input.nextLine();

			System.out.println("Enter marital status: ");
			mstatus = input.nextLine();

			System.out.println("Enter age: ");
			age = input.nextInt();

			if (gender == "m") {
				if (mstatus == "m") {
					mm = 0;
					mm++;
				} else {
					sm = 0;
					sm++;
				}
				if (gender == "f") {
					if (mstatus == "m") {
						mw = 0;
						mw++;
					} else {
						sw = 0;
						sw++;
					}
				}
			}

			counter++;
		} while (counter <= 10);
	
	}

}