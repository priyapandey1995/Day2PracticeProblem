package demo;

import java.util.Scanner;

public class DisplayUnits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		if(num == 1) {
			System.out.println("its unit");
		}
		else if(num == 10)
		{
			System.out.println("Tens place");
		}
		else if(num == 100) {
			System.out.println("Hundreds place");
		}
		else if(num == 1000) {
			System.out.println("thousands place");
		}
		else {
			System.out.println("invalid entry");
		}

	}

}
