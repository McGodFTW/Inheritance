package Ex1;

public class Rectangle {
	
	double height, width, surfaceArea;
	
	public Rectangle(double h, double w) {
		
		width = w;
		height = h;
		
	}
	
	public Rectangle() {
		
		height = 200;
		width = 400;
		
	}
	
	public void setHeight(double h) {
		
		height = h;
		
	}
	
	public void setWidth(double w) {
		
		width = w;
		
	}
	
	public double getHeight() {
		
		return height;
		
	}
	
	public double getWidth() {
		
		return width;
		
	}
	
	public double computeSurfaceArea() {
		
		surfaceArea = (width * height);
		return surfaceArea;
		
		
	}

}
