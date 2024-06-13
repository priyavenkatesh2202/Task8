package task;
import java.util.Scanner;
public class SwappingTwoNumbers {

	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);// scanner used to get input from the user
		System.out.println("enter the number to be swapped");
		   

		int num1 = sc.nextInt(); //getting num1 from user
	   
		int num2 = sc.nextInt();// getting num2 from user
		
		int temp = num1 ;
		num1 = num2;		// temp variable used to store the value of num1 and num2 in swapping step
		num2 =temp;
		
		System.out.println("after swapping");
		
		System.out.println("num1= "+num1);
		
		System.out.println("num2= "+num2);
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
