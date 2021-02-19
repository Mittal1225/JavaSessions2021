package Assignments;

public class DataTypesAndStringConcatenation {
	
	
	public static void main(String[] args) {
		
	//1. byte - range: -128 to 127 size: 1 byte = 8bits	
	/* e.g. no of students, no of class, no of course we can use byte
	 */
	
		byte b = 127;
		
		//we can not store duplicate variable bcz java memory will not allowned it
	   // byte b = 128;
		
		b = 100;
		
		
	//2. short - range: -32768 to 32767 size: 2 bytes = 16 bits
		
		short s = 10;
		
    //3. int - range: -2147483648 to 2147483647 size: 4 bytes = 32 bits
	/*e.g. no of population in india
	 */
		
		int i = 1000;
		int total = 2000;
			
			
	//4 long - size : 8  bytes - 16bits range : very high
	/* e.g. phone no, credit card, no of population in the world, distance from moon to earth
	 */
		
		
	//float - 4 bytes = 32 bits
	//you can store integer and float value 
		
		float f = 12.33f;  //12.33 - it wont print f
		
		System.out.println(f);
		
		float g = (float) 12.33;
		float h = (float) 9/0;
		
		System.out.println(h);	// Infinity
		
	
		int x = 2;
		int y = x++; 
		
		System.out.println(x); // 3
		System.out.println(y); // 2
			
			
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		
		//String manipulation - it will start counting letter from 0
		
		String m = "This snow is amazing";
		
		System.out.println(m.length()); //20 
		System.out.println(m.charAt(0));//T
		System.out.println(m.charAt(4)); // first letter will start from 0
		System.out.println(m.charAt(6));
		System.out.println(m.charAt(11));
		//System.out.println(m.charAt(100)); //StringIndexOutOfBoundsException
		
		System.out.println(m.indexOf("w")); //8
		System.out.println(m.indexOf("a")); //13 - 1st occurance of a
		System.out.println(m.indexOf("a",m.indexOf("a") + 1)); //2nd occurance of a
		
		System.out.println(m.indexOf("is")); //2
		System.out.println(m.indexOf("is",m.indexOf("is")+1)); //10
		System.out.println(m.indexOf("amazing"));	//13
		System.out.println(m.indexOf("Mittal"));	//-1
		System.out.println(m.indexOf("Hitu"));  //-1
		
		
		String messg = "Hello how are you?";
		
		if(messg.indexOf("how") == 6) {
			System.out.println("correct message");
		}else {
			System.out.println("incorrect message");
		
			
		}
		
		String str = "  Hello World  ";
		
		System.out.println(str.trim());  //Hello World
		
		System.out.println(str.trim().replace(" ", ""));
		
		String s1 = "This is my java code";
		
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.toLowerCase());
		
		String s3 = "Your browser is chrome";
		System.out.println(s3.contains("chrome"));  //true
		
		String browser = "chrome";
		if (browser.contains("chrome")) {
			System.out.println("launch chrome browser");
		}
		
		System.out.println(browser.equals("chrome"));   //true
		System.out.println(browser.equalsIgnoreCase("chrome"));   //true
		
			
		String lang = "java;Ryby;Python;C++";
		
		String language[] = lang.split(";");
		
		System.out.println(language.length); //4
		System.out.println(language[0]); //  java
		
		for(String ele : language) {
			System.out.println(ele);
		}
		
		System.out.println("+++++++===============");
		
		for(int d = 0; d < language.length; d++) {
			System.out.println(d);
		}
			
		String test = "xXtestingxXXSeleniumXxXCucumber";
		String tester[] = test.split("xX");
		System.out.println("0th--->" + tester[0]);	// blank		
		System.out.println("1st--->" + tester[1]);  //testing
		System.out.println("2nd--->" + tester[2]);  //XSelenium
		System.out.println("3rd--->" + tester[3]);	//Cucumber
			
		//Data Conversion
		
	    String o = "200";
	    
	    int l = Integer.parseInt(o);
		
		System.out.println(l+ 500);
		
		}
	
	
	    
	    
	
	
	
	}


