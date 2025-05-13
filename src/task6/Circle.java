package task6;

public class Circle {
	 private double radius;

	    // No-argument constructor (default radius)
	    public Circle() {
	        this.radius = 2.0;  // default value
	    }

	    // Constructor with one argument
	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    // Method to calculate circumference
	    public double getCircumference() {
	        return 2 * Math.PI * radius;
	    }

	    // Optional: Getter and Setter
	    public double getRadius() {
	        return radius;
	    }

	    public void setRadius(double radius) {
	        this.radius = radius;
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
        System.out.println("Circumference (default): " + c1.getCircumference());

        Circle c2 = new Circle(5.0);
        System.out.println("Circumference (radius = 5): " + c2.getCircumference());
    }


	}


