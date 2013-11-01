import java.util.*;

import java.util.*;

public class calculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double fnum, snum;
	int counter = 0;
	String oprt;
	
	while(counter < 1){
		
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter first number: ");
    fnum = input.nextDouble();
    
  Scanner op = new Scanner(System.in);
    
    System.out.print("enter operator: ");
    oprt = op.nextLine();
    
   
    System.out.print("Enter second number: ");
    snum = input.nextDouble();
    
  
  
    switch (oprt)
    {
        case "+":  
         System.out.println(fnum + snum);
         break;
         
        case "-":
         System.out.println(fnum - snum);
         break;
         
        case "*":
         System.out.println(fnum * snum);
         break;
         
        case "/":
         System.out.println(fnum / snum);
         break;
       
        default: 
         System.out.println("incorrect operator: " + oprt);
         counter++;
   
    }
    }
   }
}
