package Ex2;

public class MultimediaComputer extends Computer {
	
	double gpuClockSpeed;
	
	public MultimediaComputer() {
	
	}
	
	public MultimediaComputer(String p, double c, double g) {
		
		processor = p;
		clockSpeed = c;
		gpuClockSpeed = g;
		
	}
	
	public void getGpuClockSpeed(double g) {
		
		gpuClockSpeed = g;
		
	}
	
	public double setGpuClockSpeed() {
		
		return gpuClockSpeed;
		
	}

}
