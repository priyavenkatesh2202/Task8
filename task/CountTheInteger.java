package task;

import java.util.Scanner;
public class CountTheInteger {
	
	
	

	public static void main(String[] args) 
	{
		System.out.println("Enter the Integer:");
		Scanner integer = new Scanner(System.in);
		long num = integer.nextLong();
		int i =0;
		
		while(num!=0)
		{
			
			num/=10;
			++i;
		}
		
  System.out.println("Number of digits in an integer:"+i);
	}

}
