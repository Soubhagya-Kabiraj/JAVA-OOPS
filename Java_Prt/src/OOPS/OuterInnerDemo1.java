package OOPS;

class Percel {
	class Destination {
		public String dest;
		public void dest(String dest) {
			System.out.println(dest);
		}
	}
	class Contents {
		public double weight;
		public void cont(double weight) {
			System.out.println(weight);
		}
	}
}
public class OuterInnerDemo1 {

	public static void main(String[] args) {
		
		Percel p = new Percel();
		Percel.Destination d = p.new Destination();
		d.dest("Asansol");
		Percel.Contents c = p.new Contents();
		c.cont(1000.00);
		
	}

}
