package STRING;

public class StringHandlingDemo2 {
	public static void main(String[] args) {
		String s1 = new String("SK");
		String s2 = new String("SK");
		String s3 = "SK";
		String s4 = "SK";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3 == s4);
	}
}
