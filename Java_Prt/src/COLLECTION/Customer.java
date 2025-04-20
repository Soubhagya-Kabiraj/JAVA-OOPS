package COLLECTION;

public class Customer {
	private String id;
	private String name;
	private String ph;
	public Customer(String id, String name, String ph) {
		super();
		this.id = id;
		this.name = name;
		this.ph = ph;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", ph=" + ph + "]";
	}
	
}
