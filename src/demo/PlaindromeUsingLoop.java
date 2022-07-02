package demo;

import java.util.Scanner;

public class PlaindromeUsingLoop {

		static int rev=0;
		static int rem;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();
		for(;number!=0;) {
			rem= number%10;
			rev = (rev*10) + rem;
			number = number/10;
		}
		
		
	
	
		if(rev == number) {
			System.out.println("the given is palindrome");
		}
		else {
			System.out.println("the given number is not plaindrome");
		}
	
	
}}
	

	

	
	
		

	


	



	
	

	
	

