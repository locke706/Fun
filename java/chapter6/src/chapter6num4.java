import java.util.Scanner;


public class chapter6num4 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
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

			if (gender == "f") {
				if (mstatus == "m") {
					int mw = 0;
					mw++;
				} else {
					int sw = 0;
					sw++;
				}
				if (gender == "m") {
					if (mstatus == "m") {
						int mm = 0;
						mm++;
					} else {
						int sm = 0;
						sm++;
						if (age >= 30) {
							System.out.println("Name: " + name + "age: " + age);
						}
					}
				}
			}

			counter++;
		} while (counter == 1);

	}

}