package shape;

public class cube extends shape3D{
	double side;
	cube(double _side){
		side = _side;
		System.out.println("A new Cube created");
	}
	
	void area() {
		System.out.println("Cube surface area: " + Math.pow(side, 2));
	}
}
