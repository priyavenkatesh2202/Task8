package task;

import java.util.Scanner;

public class PrintStringLength {

	public static void main(String[] args) {
		
		

		  System.out.print(" String msg = ");
		  
	      Scanner input = new Scanner(System.in);	// input from user
	      
	      String str = input.nextLine();  //str variable is invoked using object scan
	      
	      int length = str.length();//length var is assigned the stored input in str
	      									//is invoked to get the length using length()
	      
	      System.out.println("\n String msg = " +length);  // to print the value of length
		
		
		// TODO Auto-generated method stub

	}

}
