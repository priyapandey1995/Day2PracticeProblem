package demo;

import java.util.Scanner;

public class NaturalNumberUsingForLoop {
	static int sum=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();
		for(int i=1;i<=number;i++) {
			System.out.print( i + "+");
			sum = sum +i;
		}
		System.out.println(" = the sum of natural numbers are"+ " " +sum);
	}

}
