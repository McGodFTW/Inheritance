package Ex1;

public class Cube extends Rectangle {
	
	double depth;
	
	public void setDepth(double d) {
		
		depth = d;
		
	}
	
	public double getDepth() {
		
		return depth;
		
	}
	
	public double computeSurfaceArea() {
		
		surfaceArea = (width * height * depth);
		return surfaceArea;
		
	}

}
