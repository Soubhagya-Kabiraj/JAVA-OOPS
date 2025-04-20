package EXCEPTION;

class Account {
	public String acc = "100";
	public void CheckAccount(String acc) throws AccountNotFoundException {
		if (this.acc != acc) {
			AccountNotFoundException an = new AccountNotFoundException();
			throw an;
		}
		else {
			System.out.println("ACCOUNT FOUND");
		}
	}
}
public class CustomException {

	public static void main(String[] args) throws AccountNotFoundException {
		Account ac = new Account();
		ac.CheckAccount("100");
	}

}
