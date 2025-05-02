package Task5;

import java.util.Scanner;

public class PrintThePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ss = new Scanner(System.in);
		int number = 1; 

        for (int row = 1; row <= 4; row++) { 
            for (int col = 1; col <= row; col++) { 
                System.out.print(number + " ");
                number++;
            }
            System.out.println(); 
        }
	}
}
