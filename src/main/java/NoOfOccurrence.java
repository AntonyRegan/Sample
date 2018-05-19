

import java.util.Scanner;

public class NoOfOccurrence {

	public static void main(String[] args) {
		//Testing github
		//String txt1 = "testleaf";
		System.out.println("Enter a String and a character");
		Scanner scan = new Scanner(System.in);
		String input1 = scan.nextLine();
		
		//System.out.println("Enter any character : ");
		String input2 = scan.nextLine();
		char inputCharacter = input2.charAt(0);
		
		char[] charArray = input1.toCharArray();
		
		int occurrence = 0;
		for (char c : charArray) {
			if(c == inputCharacter)
				occurrence+=1;
		}
		System.out.println("No of occurrence of "+inputCharacter+" is "+occurrence);
		scan.close();
	}

}
