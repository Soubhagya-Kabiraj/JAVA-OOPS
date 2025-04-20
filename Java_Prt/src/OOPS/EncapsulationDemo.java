package OOPS;

class Furniture {
	
	private double length = 100.00;
	private double width = 200.00; //Instance variable
	private double height = 300.00;
	public void volume() {
		double vol; //Local variable
		vol=length*width*height;
		System.out.println("Volume "+vol);
		
	}
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Furniture chair = new Furniture();
		chair.volume();
	}

}
