package Task5;

import java.util.Scanner;

public class CalculateLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner ss = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = ss.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = ss.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = ss.nextInt();
        int largest;

        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        System.out.println("The largest number is: " + largest);

        ss.close();
    }
}
