import java.util.*;

public class helloWorld {

	/**
	 * @param args
	 */
	public class helloWorld {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			double fnum, snum;
			String  sym;
			Scanner input = new Scanner(System.in);
			// calculator
			System.out.println("Enter first number: ");
			fnum = input.nextDouble();

			System.out.println("enter symbol: ");
			sym = input.nextLine();
			
			System.out.println("Enter symbol: ");
			
			System.out.println("enter second number: ");
			snum = input.nextDouble();
			
			switch (sym){
				case "+" : System.out.println("your answer is" + (fnum + snum));
					break;
				case "-" : System.out.println("your answer is" + (fnum - snum));
					break;
				case "*" : System.out.println("your answer is" + (fnum * snum));
					break;
				case "/" : System.out.println("your answer is" + (fnum / snum));
				 	break;
				default : System.out.println("error");
			}
		}

	}
