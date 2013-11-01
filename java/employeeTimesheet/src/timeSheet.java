import java.util.*;

public class timeSheet {

	public static void main(String[] args) {
		// TODO enter you hours worked, overtime hours, and hourly wages
	   Scanner input = new Scanner(System.in);
       double regHr, overtime, overtimePay, wageRate, pay, total;
       System.out.println("enter regulars hours worked: ");
       regHr = input.nextDouble();
       System.out.println("enter overtime hours: ");
       overtime = input.nextDouble();
       System.out.println("enter wage rate: ");
       wageRate = input.nextDouble(); 
       pay = wageRate * regHr;
       overtimePay = wageRate * overtime * 1.5;
       total = pay + overtimePay;
       
       System.out.println("Your regular pay is: " + pay + " your overtime hour pay is: " + overtimePay + " Your total pay is: " + total);
       
       
       
	}

}
