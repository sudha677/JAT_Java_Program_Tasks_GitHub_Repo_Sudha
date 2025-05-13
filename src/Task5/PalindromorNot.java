package Task5;
import java.util.Scanner;
public class PalindromorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      	        
			Scanner scanner = new Scanner(System.in);
		       System.out.print("Enter a string: ");
		       String str = scanner.nextLine();
		       
		        
		        
		        boolean isPalindrome = true;		        
		        
		        for (int i = 0; i < str.length() / 2; i++) {
		            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
		                isPalindrome = false;
		                break; 
		            }
		        }
		        
		        
		        if (isPalindrome) {
		            System.out.println("The string is a palindrome.");
		        } else {
		            System.out.println("The string is NOT a palindrome.");
		        }
		        
		        scanner.close();
		    }
		

       

	}

