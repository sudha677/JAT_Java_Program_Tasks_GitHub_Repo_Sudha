package task7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File file = new File("data.txt");

        try {
            
            Scanner scanner = new Scanner(file);

            System.out.println("File contents:");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            
            System.out.println("Error: The specified file was not found.");
        }
    }


	}


