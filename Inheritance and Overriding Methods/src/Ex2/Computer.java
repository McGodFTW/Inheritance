package Ex2;

public class Computer {
	
	String processor;
	double clockSpeed;
	
	public Computer() {
		
		
		
	}
	
	public Computer(String p, double c) {
		
		processor = p;
		clockSpeed = c;
		
	}
	
	public void setProcessor(String p) {
		
		processor = p;
		
	}
	
	public void setClockSpeed(double c) {
		
		clockSpeed = c;
		
	}
	
 	public String getProcessor() {
 		
 		return processor;
 		
 	}
 	
 	public double getClockSpeed() {
 		
 		return clockSpeed;
 		
 	}
	

}
