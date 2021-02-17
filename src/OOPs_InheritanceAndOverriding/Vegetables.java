package OOPs_InheritanceAndOverriding;

public class Vegetables extends Grocery {
	
	
	/*
	 * HAS a relationship
	 * 
	 * 
	 * Grocery is super class or parent class
	 * Method Overriding : is a run time polymorphism 
	 * Method Overloading is a compile time polymorphism
	 * when you have a method in
	 * parent class with the same name and same number of params also available in
	 * child class/sub class -- is called method overriding Static method can not be overriden
	 */
	
	//when same method is present in parent class as well as in child class with
	//the same name and same number of param it's called method overriding
	
	@Override
	public String fresh() {
		System.out.println("veg - fresh");
		return "fresh vegetables";
	}
	
	
	public void green() {
		System.out.println("veg - green");
	}
	
	public void dry() {
		System.out.println("veg - dry");
	}
	
	
	
	public static void Raw() {
		System.out.println("raw vegetables");
	}
	

}
