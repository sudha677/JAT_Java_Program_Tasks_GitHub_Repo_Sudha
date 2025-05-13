package task7;

public class OutOfBoundException {

	public OutOfBoundException(String message) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
            int[] numbers = {10, 20, 30};
            System.out.println("Accessing index 5: " + numbers[5]); 
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error: " + e.getMessage());
        }

        // Demonstrate StringIndexOutOfBoundsException
        try {
            String text = "Hello";
            System.out.println("Accessing character at index 10: " + text.charAt(10)); 
            
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String Error: " + e.getMessage());
        }


	}

}
