package P1;

class Tests {
	public int x =25;
	private int y = 30;
	protected int z = 50;
	int d = 60;
	public void show_x() {
		System.out.println("X: "+x);
	}
	private void show_y() {
		System.out.println("Y: "+y);
	}
	protected void show_z() {
		System.out.println("Z: "+z);
	}
	void show_d() {
		System.out.println("D: "+d);
	}
}
public class Samepckg extends Tests {

	public static void main(String[] args) {
		Samepckg s = new Samepckg();
		s.show_x();
		s.show_z();
		s.show_d();
	}

}
