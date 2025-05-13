package task7;

public class AgeValidator {
	
	public void validateAge(int age) throws InvalidAgeException {
		
		 if (age < 18) {
	            throw new InvalidAgeException("Age must be 18 or older. You entered: " + age);
	        } else {
	            System.out.println("Age is valid: " + age);
	        }
	}
	
	public static void main(String[] args) {
		
        try {
            
           int age = 15;
                       
            
            AgeValidator ag = new AgeValidator();
            ag.validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
   
      
	}
	
}


