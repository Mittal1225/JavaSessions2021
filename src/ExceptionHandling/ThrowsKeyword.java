package ExceptionHandling;

public class ThrowsKeyword {

	public static void main(String[] args) {
		
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();
		

	}
	
	public void m1() {
		m2();
		System.out.println("m1 method");
	}
	
	public void m2() {
		m3();
		System.out.println("m2 method");
	}
	
	
	public void m3() {
		System.out.println("m3 method");
		
		try {
		int i = 5/0;
		}catch(ArithmeticException e) {
			System.out.println("AEM is coming");
		}
		
		
	}

}
