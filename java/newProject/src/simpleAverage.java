import java.util.*;

public class simpleAverage {
	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in);
		int total = 0;
		int grade, average;
		int counter = 0;
		
		while(counter < 10){
			System.out.println("enter number: ");
			grade = input.nextInt();
			total = total + grade;
			counter++;
		}
		average = total / 10;
		System.out.println("Your average is: " +average);

	}

}
