import java.util.*;

public class chpt6num3 {
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
			
		
			counter++;
		} while (counter <= 10);
		
		System.out.println(name + " " + age + " " + mstatus + " " + gender);

	}

}
