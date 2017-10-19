package shape;

public class rectangle extends quadrilateral{
	double length,height;
	
	
	rectangle(double _length, double _height){
		System.out.println("A new Rectangle Created");
		length = _length;
		height = _height;
	}
	
	void area() {
		System.out.println("The area of rectangle is " + length * height + "square unites");
	}
	
	void printInfo() {
		System.out.println("This is a rectangle");
	}
	
}