package OOPS_Encapsulation;

public class AmazonLoginTest {
	
	
	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		lp.setUsername("cust@gmail.com");
		lp.setPassword("pwd123");
		
		lp.doLogin(lp.getUsername(), lp.getPassword());
		
		lp.setUsername("seller@gmail.com");
		lp.setPassword("seller123");
		
		lp.doLogin(lp.getUsername(), lp.getPassword());
		
	}

}