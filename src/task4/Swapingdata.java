package task4;

import java.util.Scanner;

public class Swapingdata {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		        Scanner sc = new Scanner(System.in);

		        
		        System.out.print("Enter the first number: ");
		        int num1 = sc.nextInt();
		        System.out.print("Enter the second number: ");
		        int num2 = sc.nextInt();

		        // Display original values
		        System.out.println("Before swapping:");
		        System.out.println("First number = " + num1);
		        System.out.println("Second number = " + num2);

		        // Swap using a temporary variable
		        int temp = num1;
		        num1 = num2;
		        num2 = temp;

		        // Display swapped values
		        System.out.println("After swapping:");
		        System.out.println("First number = " + num1);
		        System.out.println("Second number = " + num2);

		        sc.close();
		    }
		

	}


