package EXCEPTION;
import java.sql.*;
class DbCOnnecion {
	Connection cn = null;
	public Connection getCon() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn=DriverManager.getConnection("Oracle.jdbc");
		}
		catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		
		return cn;
		
	}
}
public class CheckedExceptionDemo {

	public static void main(String[] args) {
		DbCOnnecion db = new DbCOnnecion();
		db.getCon();
	}

}
