package task;
import java.util.Scanner;
public class Even 
{

	public static void main(String[] args) 
	{
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int number = num.nextInt();
		num.close();
		
		if(number %2 == 0)
		{
			System.out.println(number +" is an even number");
			
		}
		else
		{
			System.out.println(number +" is not an even number");
		}
		
		
		// TODO Auto-generated method stub

	}

}
