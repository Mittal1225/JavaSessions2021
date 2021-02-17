package OOPs_Constructor;

public class Student {
	
	int result;

	public static void main(String[] args) {
		
		
		//Diff between constructor and method by Mukesh ottwani
		
		//Student s1 = new Student();  //default constructor is called as soon as we create an object - compile time polymorphism bcz we know during compile time which constructor will be called
		
		Student s2 = new Student(1);
		
		s2.displayResults(); //need to call method explicitly
		
	}


	
	public Student() {
		System.out.println("Hey welcome to school");
	}
	
	public Student(String schoolName) {
		System.out.println("Hey welcome to school");
	}
	
	public Student(int rank) {
		System.out.println("Hey welcome to school ranked" + " " + rank);
	}
	
	public Student(String schoolName, int ranking) {
		System.out.println("Hey welcome to school");
	}
	
	
	//method
	public void displayResults() {
		System.out.println("Total marks are " + result);
	}
	

}
