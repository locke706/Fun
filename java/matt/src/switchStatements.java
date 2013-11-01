import java.util.*;

public class switchStatements {

	/**
	 missing with switch statements
	 */
	public static void main(String[] args) {
		// with some scanner imput
	 Scanner scn = new Scanner(System.in);
		int fnum;
		System.out.println("how old are you?");
		fnum = scn.nextInt();
		
		switch(fnum)
		{
		case 1: 
			System.out.println("you're one");
			break;
		case 2:
			System.out.println("you're two");
			break;
		case 3:
			System.out.println("you're three");
			break;
		case 4:
			System.out.println("you're four");
			break;
		case 5:
			System.out.println("you're five");
			break;
		case 6:
			System.out.println("you're six");
			break;
		case 7:
			System.out.println("you're seven");
			break;
		case 8:
			System.out.println("you're eight");
			break;
		case 9:
			System.out.println("you're nine");
			break;
		case 10:
			System.out.println("you're ten");
			break;
		default:
			System.out.println("you are " +fnum+ " years old" );
		}

	}

}
