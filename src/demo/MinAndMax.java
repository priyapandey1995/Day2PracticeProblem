package demo;

import java.util.Scanner;

public class MinAndMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for a,b and c");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int R1 = a+b*c;
		int R2 = a%b+c;
		int R3 = c+a/b;
		int R4 = a*b+c;
		
		if ((R1 > R2 ) && ( R1 >= R3 ) && ( R1 >= R4 )) {
				System.out.println("maximum R1" + " " +R1);
		}
		
				else if (( R2 >= R1 ) && ( R2 >= R3 ) && ( R2 >= R4 )){
				System.out.println(" maximum R2" +" " +R2);
				}
				else if (( R3 >= R1 ) && (R3 >= R2 ) && (R3 >= R4 )) {
				System.out.println("maximum R3 "+ "" + " "+ R3);
				}
				else {
				System.out.println("maximum is R4" + " " + R4);
				}
		

				
          if ((R1 <= R2 ) &&( R1 <= R3 ) && (R1 >= R4 ))
			        {
			        System.out.println("minimum is R1" +" "+R1);
			        }
			        else if (( R2 >= R1 ) && (R2 >= R3 )&& (R2 >= R4 )) {
			        System.out.println(" minimum R2 "  +  " " +R2);
			        }
			        else if ((R3 >= R1 ) && (R3 >= R2 ) && ( R3 >= R4 )){
			      
			        System.out.println("minimum R3" + " " +R3);
			        }
			        else {
			        System.out.println("minimum R4"+ " " +R4);
			        
			        }
	}

}
