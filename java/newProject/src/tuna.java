import java.util.*;

public class tuna {
	public static void simpleMessage(double answer) {
		// this is called by first.java
		if (answer <= 50) {
			System.out.println("your number is fifty or less: " + answer);
		} else {
			System.out.println("your number is one hundred or less: " + answer);
		}

	}

	public void secondMessage() {
		System.out.println("hey thar");
	}

}
