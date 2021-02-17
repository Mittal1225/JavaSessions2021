package AssignmentsByNaveen;

public class ArrayConceptPractice {
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		// Array limitations:
		// 1. size of the static array is fixed.
		// 2. you can store only same type of data
		
		
//		lowest array index is 0
//		highest index is lenght - 1
		
		
		
		
		int i[] = new int[4];
		
		i[0] = 100;
		i[1] = 200;
		i[2] = 300;
		i[3] = 400;
		//i[4] = 500; Array index out of bound exception
		
		System.out.println(i[2]);
		
		//WAP to print all the values of array
		
		for ( int k = 0; k < i.length ; k++) {
			System.out.println(i[k]);
		}
		
		for (Integer h : i) {
			System.out.println(h);
		}
		
		//create an array to print all the name of the students in class
		
		System.out.println("XXXXXXXXXXXXXXXXXX");
		
		String student[] = new String[5];
		
		student[0] = "Tom";
		student[1] = "Jack";
		student[2] = "Mary";
		student[3] = "Hitu";
		student[4] = "Sharad";
	
		
		int s = student.length;
		
		
		for (int m = 0; m < s; m++) {
			System.out.println(student[m]);
		}
		
		
		System.out.println("XXXXXXXXXXXXXXXXXX");
		
		int b = 0;
		while(b<student.length) {
			System.out.println(student[b]);
			b++;
		}
		
		System.out.println("XXXXXXXXXXXXXXXXXX");
		
		int n = 0;
		
		do {
			System.out.println(student[n]);
			 n++;
		}
		
		while(n < student.length);
		
			
		
		//object array can store different tyrpes of data
		Object ob[] = new Object[3];
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
