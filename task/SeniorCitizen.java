package task;
import java.util.Scanner;
public class SeniorCitizen {

	public static void main(String[] args) 
	 {
		System.out.println("Enter the age:");
		
		Scanner age = new Scanner(System.in);
		int i = age.nextInt();
		
		
		if (i>60)
		{
			System.out.println("The person is a Senior Citizen");
			
		}
		else
		{
			System.out.println("The person is not a Senior Citizen");
		}
		
	


	}

}
