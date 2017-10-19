package shape;

public class square extends quadrilateral
{
	double side;
	square(double _side)
	{
		System.out.println("A new square created");
		side = _side;
	}
	
	void area() 
	{
		System.out.println("The area is " + side * side + " square units ");
	}
	
	void printInfo() {
		System.out.println("This is a square");
	}
}