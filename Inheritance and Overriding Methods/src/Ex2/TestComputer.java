package Ex2;

public class TestComputer {

	public static void main(String[] args) {
		
		Computer c1 = new Computer("AMD", 3.5);
		MultimediaComputer m1 = new MultimediaComputer("Intel", 2.6, 1.4);
		
		System.out.println("Processor: " + c1.getProcessor() + "\nClock Speed: " + c1.getClockSpeed());
		System.out.println();
		System.out.println("Processor: " + m1.getProcessor() + "\nClock Speed: " + m1.getClockSpeed() + "\nGPU Clock Speed: " + m1.gpuClockSpeed);
		
		
		
	}

}
