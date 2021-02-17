package OOPs_InheritanceAndOverriding;

public class TestGrocery {
	
	public static void main(String[] args) {
		
		
		
		/*Static polymorphism - compile time polymorphism*/
		
		//child can access parent methods but parent can not access child methods
		Fruits f = new Fruits();
		f.green();  //Overriden method
		f.fresh();  //inherited from vegetable
		f.dry();
		f.ripe();  //independent method
		
		
		//Parent class can access only their methods. can not access child class methods
		Vegetables v = new Vegetables();
		v.green();
		v.dry();
		//v.ripe();  - child method
		
		
		
		//Top casting                  
		Vegetables v1 = new Fruits();  //Dynamic polymorphisn - Run time polymorphism - child class object can be referred by parent class reference variable - 
		v1.green();  //overriden method will come from fruit
		//v1.ripe();  - reference type check during compile time will fail
		
		
		Fruits f1 = (Fruits) new Vegetables();  //ClassCastException - DOWNCASTING NOT ALLOWED
		
		
		
		 
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
