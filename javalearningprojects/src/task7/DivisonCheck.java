package task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DivisonCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            // Create BufferedReader to read input from the console
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            // Read the first integer
            System.out.print("Enter the first integer: ");
            int num1 = Integer.parseInt(reader.readLine());

            // Read the second integer
            System.out.print("Enter the second integer: ");
            int num2 = Integer.parseInt(reader.readLine());

            // Perform division and display result
            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        } catch (IOException e) {
            System.out.println("Error reading input.");
        }
    }
}