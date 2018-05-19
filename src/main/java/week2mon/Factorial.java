package week2mon;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long  fact=1;
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number to find factorial of that number:");
		long number=obj.nextInt();
		
		for(long i=1;i<=number;i++)
		{
			fact=fact*i;
		}
         System.out.println("Factorial of " +number+ " is " +fact );
         obj.close();	
	}
	
}
