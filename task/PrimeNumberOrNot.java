package task;
import java.util.Scanner;

public class PrimeNumberOrNot {

	
	
	public static void main(String[] args)
	{
		
		
		Scanner number = new Scanner(System.in);
		
		System.out.println("Enter the number"); // getting a number from user
		
		int prime1 = number.nextInt();
		
	
		if (isPrime(prime1)) 					// if condition to check the 
					
														//input number is prime to print the output
		       {  
	           System.out.println(prime1 + " is a prime number");  
	           }
		
		
		else 
		     {  
	           System.out.println(prime1 + " is not a prime number");  
	          
		    }  
	   
		
	 }
	
	  
	   public static boolean isPrime(int prime1) // here the input number is checked to be prime or not
	   {  
	      
		   
		   if (prime1 <= 1)         // as the prime number starts from 2
			   						//0 and 1 are excluded to be prime in this cond.
	           {  
	           return false;  
	           }  
	       
	       
		   
		   for (int i = 2; i < Math.sqrt(prime1); i++)  // from 2 the number is incremented to check whether
			   										 // the number is divisible by 1 and by the number itself
		   
		   { 
	    	   
			   if (prime1 % i == 0) 
	    	      {  
	               return false;  
	              }  
	       }  
	       return true;  
	       }


		

		
	
		// TODO Auto-generated method stub

	}


