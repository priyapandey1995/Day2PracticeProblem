package demo;

import java.util.Scanner;

public class ToReverseNumber {
	static int rev=0;
	static int rem;
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		while(num>0) {
			rem = num % 10;
			rev = rev*10 + rem;
			num = num/10;
		}
		System.out.println("The reverse of a given number is"   +  rev);
	}

}
