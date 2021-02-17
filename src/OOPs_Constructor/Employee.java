package OOPs_Constructor;

public class Employee {

	
	//Class variable
	String name;
	int age;
	int empid;
	double salary;
	boolean isPermanent;
	char gender;
	
	//constructor of the class: Consturctor is used to initialize the values
	//looks like a function, but its not a function
	//const... name will be as same as the class name
	//a function may or may not return a value but const.. will never return a value
	//no return and void keywords in cost....
	//can overload the const...
	//const.. will be called when we create the object of the class

	
	public Employee() {
		System.out.println("default constructor");
	}


	public Employee(String name, int age) {
		System.out.println("2 param constructor");
		
	}


	public Employee(String name, int age, int empid, double salary, boolean isPermanent, char gender) {
		System.out.println("6 param constructor");
	}


     public static void main(String[] args) {
    	 System.out.println("Hello");
    	 
    	//const.. will be called when we create the object of the class
		Employee e1 = new Employee();
		Employee e2 = new Employee("Mittal", 10);
		Employee e3 = new Employee("Hitu", 20);
		Employee e4 = new Employee("Hitu", 20, 1111, 20.00, false, 'F');
		
		
		  
     }
	}