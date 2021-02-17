package OOPs_Constructor;

public class Marks {
	
	
	int result;

	public static void main(String[] args) {
		
		Marks m = new Marks(100);
		m.displayResults();
		
	}
	
	public Marks(int marks) {
		
		result = marks;
		
	}

	
	//method
	public void displayResults() {
		System.out.println("Total marks are " + result);
	}
	

}



