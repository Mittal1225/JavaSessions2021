package OOPs_Constructor;

import java.util.ArrayList;

public class Constructor {
	
	String name;
	int age;
	double price;
	String color;
    ArrayList<String> sellerList;
	
    
    //can we overload a constructor? - yes
    //constructor will be called automatically as soons as we carete an object
    //tjis keyword is used to initialize the class variable in constructor
    
    public Constructor() {
	System.out.println("no parameters");	
		
	}

    public Constructor(String name, int age) {
         System.out.println("two parameter");
    	this.name = name;
    	this.age = age;
    	
     } 
    
    public Constructor (String name, int age, double price, String color) {
    	System.out.println("4 parameters");
    	this.name = name;
    	this.age = age;
    	this.price = price;
    	this.color = color;
    	
    	
     }
    
    public Constructor (String name, int age, double price, String color, ArrayList<String> sellers) {
    	System.out.println("4 parameters");
    	this.name = name;
    	this.age = age;
    	this.price = price;
    	this.color = color;
    	
     }
     
    public static void main(String[] args) {
    	
    	Constructor p1 = new Constructor("Mittal", 20);
    	//p1.name = "Tom";
    	//p1.age = 30;
    	System.out.println(p1.name + " " + p1.age);		
    	
    	
    	Constructor p2 = new Constructor("Hitu", 5, 44 , "Red");
    	System.out.println(p2.name + " " + p2.age + " " + p2.price + " " + p2.color);
    	
    	Constructor p3 = new Constructor("Sharad", 5, 44 , "Red");
    	System.out.println(p3.name + " " + p3.age + " " + p3.price + " " + p3.color);
    	
    	
    	
    	
    	
    	
    	
    	
    	
		
	}


}