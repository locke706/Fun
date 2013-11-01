import java.util.*;

public class ifStatements 
{

	/* if statements */
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
 
	Scanner scn = new Scanner(System.in);
	int one;
	System.out.println("enter first number: ");
	one = scn.nextInt();
	if(one < 1 && one < 50 ) // && and || or
	{
		System.out.println("low");
		
	}else
	 {
	 System.out.println("high enough");	
	 }
	
	}

}
