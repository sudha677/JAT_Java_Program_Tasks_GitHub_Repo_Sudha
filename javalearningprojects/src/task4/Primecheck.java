package task4;

import java.util.Scanner;

public class Primecheck {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get input from the user
	        System.out.print("Enter a number to check if it's prime: ");
	        int number = scanner.nextInt();

	        // Check if number is prime
	        boolean isPrime = true;

	        if (number <= 1) {
	            isPrime = false;
	        } else {
	            for (int i = 2; i <= Math.sqrt(number); i++) {
	                if (number % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }

	        // Output result
	        if (isPrime) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }

	        scanner.close();
	    }
	}
