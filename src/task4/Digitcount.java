package task4;
import java.util.Scanner;
public class Digitcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        // Get the number from the user
		        System.out.print("Enter an integer: ");
		        int number = scanner.nextInt();

		        int count = 0;
		        int originalNumber = Math.abs(number); // Handle negative numbers

		        // Special case for 0
		        if (originalNumber == 0) {
		            count = 1;
		        } else {
		            while (originalNumber > 0) {
		                originalNumber /= 10;
		                count++;
		            }
		        }

		        // Output the result
		        System.out.println("Number of digits in " + number + " is: " + count);

		        scanner.close();
		    }
		}

	


