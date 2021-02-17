package Encapsulation;

public class Employee {
	
	
	//Data members: non-static class variables and methods
	//Data hiding - Encapsulation
	//Hiding private data members of the class and giving access through public layer(Getters and setters)
	
	private String name;
	private int age;
	private int id;
	private int gender;
	
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.name = "Tom";
		System.out.println(e1.name);
		
	}
	
	//Getter and setter methods
		//Shortcut - Rt click -> Source ->Generate getter and setter
		//setter will always have this keyword
		//getter will always have return type

	    public void setName(String name) {
	    	this.name = name;
	    }
		
	    public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
	    
		//methods
		private void getEMPDetails() {
			System.out.println("get employee details");
		}
		
		public void getAccontDetails() {
			getEMPDetails();
			System.out.println("getAccountdetails");
			
		}
		
		}
		
		
	

	



    
