package Task5;

import java.util.Scanner;

public class ReverseOrderString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sudha = new Scanner(System.in); {
	System.out.print("Enter a string: ");
	String userInput = sudha.next();
	String Reversed ="";
	for(int s=userInput.length()-1; s>=0; s--) {
		Reversed = Reversed + userInput.charAt(s);
		System.out.println("Printing the "+s+"th Iteration value " +Reversed);
		
	}
	System.out.println("Reversed string value = " +Reversed);
}
 
	}

}
