package shape;

public class sphere extends shape3D{
	double radius;
	sphere(double r){
		System.out.println("A Sphere Created");
		radius = r;
	}
	
	void area() {
		System.out.println("The surface area of Sphere is " + 4 * Math.PI * Math.pow(radius, 3) + "square units");
	}
}