package task4;

		// TODO Auto-generated method stub 
		import java.util.Scanner;

		public class Factorial {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Input from user
		        System.out.print("Enter a number to find its factorial: ");
		        int number = scanner.nextInt();

		        long factorial = 1;

		        // Factorial calculation
		        for (int i = 1; i <= number; i++) {
		            factorial *= i;
		        }

		        // Output
		        System.out.println(number + "! = " + factorial);

		        scanner.close();
		    }
		}

		   