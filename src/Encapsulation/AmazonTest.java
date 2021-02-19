package Encapsulation;

public class AmazonTest {
	
	
	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage("mittal@gmail.com", "mittal123");
		
		lp.setUsername("hitu@gmail.com");
		lp.setPassword("hitu123");
		
		lp.doLogin(lp.getUsername(), lp.getPassword());
		
		lp.setUsername("hitu11@gmail.com");
		lp.setPassword("test123");
		
		lp.doLogin(lp.getUsername(), lp.getPassword());
	
		}
	

}
