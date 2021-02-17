package FinallyConcept;

public class FinalizeMethodConcept {
	
	int age;
	
	public static void main(String[] args) {
		
		String s = new String("Naveen");
		
		//Finalize method is coming from object class - object is a super class of this particular class - By default all the classes are child of object class
		//Finalize method will be called automatically only when you are calling garbage collector
		//finalize method will be called only when you create null obj ref of particular class
		
		
		
		FinalizeMethodConcept obj = new FinalizeMethodConcept();
		//obj = null;
		
		s = null;
		
		System.gc();
		System.out.println("Done");
		
	
		
	}
	
	
	//you can override finalize method bcz it's coming from object class by default
	@Override
	public void finalize() {
		System.out.println("this is my finalize method");
	}

}
