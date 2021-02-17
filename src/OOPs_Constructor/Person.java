package OOPs_Constructor;

public class Person {
	
	String name;
	int age;
	int empid;
	double salary;
	boolean isPermanent;
	char gender;
	
    public Person() {
    	System.out.println("default constructor");
    }

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, int age, int empid, double salary, boolean isPermanent, char gender) {
		this.name = name;
		this.age = age;
		this.empid = empid;
		this.salary = salary;
		this.isPermanent = isPermanent;
		this.gender = gender;
	}

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("hitu", 5);
		System.out.println(p2.name + " " + p2.age);
		
		Person p3 = new Person("Sharad", 5 , 1111, 200.00, true, 'M');
		System.out.println(p3.name + " " + p3.age +" " + p3.empid +" " + p3.salary +" " + p3.isPermanent +" " + p3.gender);
	} 
	
	
	
	
   }
