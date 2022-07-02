package demo;

import java.util.Scanner;

public class SingleDigit {
	int num;
	public void singleDigit()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		num=sc.nextInt();
		if(num == 1)
		{
			System.out.println("The number entered is one");
		}
		else if(num == 2)
		{
			System.out.println("The number entered is two");
		}
		else if(num == 3)
		{
			System.out.println("The number entered is three");
		}
		else if(num == 4)
		{
			System.out.println("The number entered is four" );
		}
		else if(num == 5)
		{
			System.out.println("The number entered is five" );
		}
		else if(num == 6)
		{
			System.out.println("The number entered is six" );
		}
		else if(num == 7)
		{
			System.out.println("The number entered is Seven" );
		}
		else if(num == 8)
		{
			System.out.println("The number entered is Eight" );
		}
		else if(num == 9)
		{
			System.out.println("The number entered is nine" );
		}
		else {
			System.out.println("the number entered is invalid");
		}
	}
	
}
