public class GeometricObject {

	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	public GeometricObject() {
		dateCreated = new java.util.Date();

	}

	public String getColor() {
		return color;

	}

	public void setColor(String color) {
		this.color = color;

	}

	public boolean isFilled() {
		return filled;

	}

	public void setFilled(boolean filled) {
		this.filled = filled;

	}

	public java.util.Date getDateCreated() {
		return dateCreated;

	}

	public String toString() {

		return "created on " + dateCreated + "\ncolor: " + color +
		" and filled: " + filled;
	}
}

class Triangle extends GeometricObject {

	// Three double data fields named side1, side2, and side3

	private double side1;
	private double side2;
	private double side3;

	// No-arg constructor that creates the default triangle with 1.0 sides

	public Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}

	// Constructor that creates a triangle with specified side1, side2, and
	// side3

	public Triangle(double side1, double side2, double side3) {

		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// Create accessor methods for all three data fields

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	// Method that returns area of the triangle

	public double getArea() {
		return (side1 + side2 + side3) / 2;
	}

	// Method that returns the perimeter of the triangle

	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	// Method that returns a string description for the triangle

	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
		" side3 = " + side3;
	}

}

