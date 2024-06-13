package task;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = sc.nextInt();
		sc.close();
		int i;
		
		int fact =1;
		 //It is the number to calculate factorial    
		  for(i=1;i<=a;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+a+" is: "+fact);

	}

}
