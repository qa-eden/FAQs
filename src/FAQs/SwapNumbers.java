package FAQs;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int a = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int b = sc.nextInt();
		
		// Approach 1 - Using a Third Number
		
		System.out.println("The Number before Swapping is: a="+a+" and b="+b);
		int t =a;
		a=b;
		b=t;
		System.out.println("The Number after Swapping is: a="+a+" and b="+b);
		
		// Approach 2 - using + and - Operator
		System.out.println("The Number before Swapping is: a="+a+" and b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The Number after Swapping is: a="+a+" and b="+b);
				
	}

}
