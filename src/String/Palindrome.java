package String;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		for(;;)
			{
			Scanner sc=new Scanner(System.in);
			
		   System.out.println("Enter string");
		   String s=sc.nextLine();
		   String value="";
		   for(int i=s.length()-1;i>=0;i--)
		   {
			value=value+s.charAt(i);
		   }	
			if(value.equalsIgnoreCase(s))
			{
				System.out.println("It is Palindrome");
			}
			else
			{
				System.out.println("It is not a palindrome");
			}
		}
}
}
