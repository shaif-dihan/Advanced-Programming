package shape;

public class triangle extends shape2D{
	double a,b,c;
	triangle(){
		
	}
	triangle(double _a, double _b, double _c){
		a = _a; b = _b; c = _c;
		System.out.println("A triangle created");
	}
	
	void area() {
		double s = a + b + c;
		s = s / 2;
		
		System.out.println("The area of triangle is " + Math.sqrt(s * (s - a) * (s - b) * (s-c)));
	}
	
	void printInfo() {
		System.out.println("This is a triangle");
	}
}