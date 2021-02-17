package OOPs_Constructor;

import java.util.ArrayList;

public class Product {
	
	String name;
	int price;
	String color;
	ArrayList<String> sellerList;
	
	
	public Product() {
		System.out.println();
	}


	public Product(String name, int price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
		
	}


	public Product(String name, int price, String color, ArrayList<String> sellerList) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.sellerList = sellerList;
	}
	
	public static void main(String[] args) {
		Product p1 = new Product("NikeShoes", 50, "white");
		System.out.println(p1.name + " " + p1.price + " " + p1.color);
		
	    ArrayList<String> adidasSellerList = new ArrayList<String>();
	    adidasSellerList.add("Amazon");
	    adidasSellerList.add("DSW");
	    adidasSellerList.add("Walmart");
	    
	    Product p2 = new Product("Bagpack", 50, "Black", adidasSellerList );
	    System.out.println(p2.name + " " + p2.price + " " + p2.color + " " + p2.sellerList);
	    System.out.println(p2.sellerList.get(2));
	    
	    for(String e : p2.sellerList) {
	    	System.out.println(e);
	    }
	
	}
	
	
	
	
}
