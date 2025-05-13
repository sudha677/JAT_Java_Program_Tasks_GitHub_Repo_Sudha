package Task5;

import java.util.Scanner;

public class AutomatedGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the student's mark (0-100): ");
        int mark = sc.nextInt();

        
        if (mark < 0 || mark > 100) {
            System.out.println("Invalid mark! Please enter a value between 0 and 100.");
        } else {
            
            if (mark == 100) {
                System.out.println("Grade: S");
            } else if (mark >= 90) {
                System.out.println("Grade: A");
            } else if (mark >= 80) {
                System.out.println("Grade: B");
            } else if (mark >= 70) {
                System.out.println("Grade: C");
            } else if (mark >= 60) {
                System.out.println("Grade: D");
            } else if (mark >= 50) {
                System.out.println("Grade: E");
            } else {
                System.out.println("Grade: F");
            }
        }

        sc.close();
    }













	}


