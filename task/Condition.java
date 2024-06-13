package task;

import java.util.Scanner;

public class Condition
	{

	public static void main(String[] args) 
		{
				Scanner in=new Scanner(System.in);
				System.out.println("Enter the numbers");
				System.out.println();
				System.out.println("enter value of a");
				int a = in.nextInt();
				System.out.println("enter value of b");
			    int b = in.nextInt();
			    System.out.println("enter value of c");
		        int c = in.nextInt();
		        System.out.println("enter value of d");
		        int d = in.nextInt();
		        in.close();
		        
				int x= a+b;
				int y= c+d;
				
				
				
				
				if (x> y)
				{
					System.out.println("Sum of a and b is greater than sum of c and d");
				}
				else
				{
					System.out.println("Sum of c and d is greater than sum of a and b");
				}
				
				
			}
	}

		

		




