package shape;

public class calculate {
	static void doSomething(shape T) {
		System.out.print("You have passed a: ");
		try {
			if(T instanceof square) {
				System.out.println("Square");
			}
			else if(T instanceof rectangle) {
				System.out.println("Rectangle");
			}
			else if(T instanceof righttriangle) {
				System.out.println("Right Triangle");
			}
			else if(T instanceof quadrilateral) {
				System.out.println("Quadrilateral");
			}
			else if(T instanceof triangle) {
				System.out.println("Triangle");
			}
			else if(T instanceof sphere) {
				System.out.println("Sphere");
			}
			else if(T instanceof cube) {
				System.out.println("cube");
			}
			else if(T instanceof shape2D) {
				System.out.println("2D Shape");
			}
			else if(T instanceof shape3D) {
				System.out.println("3D Shape");
			}
			else if(T instanceof shape) {
				System.out.println("Shape");
			}
			else{
				throw new Throwable();
			}
		}
		catch(Throwable t) {
			System.out.println("No Shape");
		}
	}
	
	void func(shape ... s) {
		for(shape a : s) {
			doSomething(a);
		}
	}
	public static void main(String args[]) {
		shape noShape = new shape();
		cube cube = new cube(7);
		shape s = new cube(8);
		doSomething(cube);
	}
	
}