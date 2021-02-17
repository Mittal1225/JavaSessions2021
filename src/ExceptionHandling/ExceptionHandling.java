package ExceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		System.out.println("This is mittal");
		System.out.println("This is mittal");
		System.out.println("This is mittal");
		
		//int k = 10/0;
		
		try {
			int i = 3/0;
	}  catch(ArithmeticException e) {
		
		System.out.println("some exception");
		
		e.printStackTrace(); //it will show what excaption and where line is having issue

		System.out.println(e.getMessage()); //this will not show whhat and which line has exception

}

	    System.out.println("testing");
	

	
}
	
}