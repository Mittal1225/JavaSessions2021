package OOPS_Encapsulation;

public class AmazonProduct {
	
	/*Data members: non static class variables + methods
	Encapsulation -- Data hiding
	hiding private data members of class and give the access via public getter/setter method
	inorder to achieve encapsulation we need to create getter and setter both -- if you remove getter then variabl needs to be public
	can we remover setter with encapsulation - it will return null as default value if you dont set value for setter
	get will always return , set will always have this keyword
	*/
	
	
	private String name;
	private String size;
	private int price;
	private boolean reusable;
	String color;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isReusable() {
		return reusable;
	}
	public void setReusable(boolean reusable) {
		this.reusable = reusable;
	}

	

		
	}


