package Encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		
		
		Employee e1 = new Employee();
		 e1.setName("Hitu");
	     System.out.println(e1.getName());
	     
	    e1.setAge(30);  
	    System.out.println(e1.getAge());
	    
	    
	    e1.setId(1122);
	    System.out.println(e1.getId());
		
		
		e1.getAccontDetails();
	    
	    
		}

}
