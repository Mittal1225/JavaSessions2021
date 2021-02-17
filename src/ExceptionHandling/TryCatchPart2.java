package ExceptionHandling;

public class TryCatchPart2 {

	public static void main(String[] args) {
		
		String name = "Tom";
	
		
		System.out.println("Hello Testing");
		
		TryCatchPart2  obj = new TryCatchPart2();
		
		obj = null;
		
		try {
			int i = 2/0;
			System.out.println("obj.name");
			
		} catch(NullPointerException e) {
			System.out.println("NPE is coming");
		
		}catch(ArithmeticException e) {
			System.out.println("AME is coming");
			e.printStackTrace();
		}
		
          System.out.println("Bye");
		
	}

}
