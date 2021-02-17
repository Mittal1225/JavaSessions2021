package OOPS_Encapsulation;

public class AmazonProductTest {
	

		
		public static void main(String[] args) {
			AmazonProduct a = new AmazonProduct();
			//a.name = "dress";
			//System.out.println(a.name);
			
			
			//you can access variables by public methods
			
			a.setName("blue dress");
			System.out.println(a.getName());
		
			a.setPrice(30);
			System.out.println(a.getPrice());
		
		
			//object created for company class
		    Company c1 = new Company();
		    c1.setName("chase");
		    System.out.println(c1.getName());
		    
		    c1.getPolicyInfo();
	

	
	
		}
	
	
}
