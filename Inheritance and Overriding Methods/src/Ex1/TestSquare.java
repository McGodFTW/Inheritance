package Ex1;

public class TestSquare {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		Cube c1 = new Cube();
		
		c1.setWidth(100);
		c1.setHeight(10);
		c1.setDepth(50);
		
		System.out.println("Surface Area of the Rectangle: " + r1.computeSurfaceArea());
		System.out.println("Surface Area of the Cube: " + c1.computeSurfaceArea());

	}

}
