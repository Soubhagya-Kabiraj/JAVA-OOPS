package Java;

class Company {
	public String name ="TCS";
	public String loc = "KOLKATA";
	public void display() {
		System.out.println("Company Detail :=======");
		System.out.println("Company name :" +name);
		System.out.println("Company location :"+loc);
	}
}
class Job extends Company { 
	public String tech;
	public double exp;
	public String enddt;
	public String city;
	public void offer(String tech,double exp) {
		System.out.println("Offer 1:=========");
		System.out.println("Role :"+tech);
		System.out.println("Experience :"+exp);
	}
	public void offer(String tech, double exp, String city) {
		System.out.println("Offer 2:=========");
		System.out.println("Role :"+tech);
		System.out.println("Experience :"+exp);
		System.out.println("Location :"+city);
	}
	public void offer(String tech, double exp, String city, String enddt) {
		System.out.println("Offer 3:=========");
		System.out.println("Role :"+tech);
		System.out.println("Experience :"+exp);
		System.out.println("Location :"+city);
		System.out.println("End Date :"+enddt);
	}
}
class Candidate extends Job implements Interview {
	public String cname ;
	public String ph;
	public String email;
	public String tech;
	public Candidate(String cname, String ph, String email, String tech) {
		this.cname = cname;
		this.ph = ph;
		this.email = email;
		this.tech = tech;
	}
	public void schedule() { 
		System.out.println("Candidate Detail:============");
		System.out.println("Caandidate name :"+cname);
		System.out.println("Phone no :"+ph);
		System.out.println("Email :"+email);
		System.out.println("Tech :"+tech);
	}
}
public class SumOf2Days {
	public static void main(String[] args) {
		Candidate c = new Candidate("Rahul", "9876543210", "name123@example.com", "Java");
		c.display();            
		c.schedule();          
		c.offer("Java", 3.5);
		c.offer("C++", 4, "Kolkata");
		c.offer("Web Dev", 5, "Asansol", "17/04/2025");
	}
}