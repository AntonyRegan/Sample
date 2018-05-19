package week2tuesday;

import java.util.Scanner;

public class Palindrome
{
    public static void main(String args[])
    {
        int number, temp, reversecheck = 0,remainder;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter any number:");
        number = obj.nextInt();
        temp = number;
        while(number != 0)
        {
            remainder = number % 10;
            reversecheck = reversecheck * 10 + remainder;
            number = number / 10;
        }
        if(reversecheck == temp)
        {
            System.out.println("Given number "+temp+" is Palindrome");
        }
        else
        {
            System.out.println("Given number "+temp+" is Not Palindrome");
        }
    }
}
