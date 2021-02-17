package OOPS_Encapsulation;

public class Company {
	
	
	private String name;
	private int totalEmployee;
	private int price;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalEmployee() {
		return totalEmployee;
	}
	public void setTotalEmployee(int totalEmployee) {
		this.totalEmployee = totalEmployee;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//methods
	
	private void getCompanyPolicy() {
		System.out.println("get company policy");
	}
	
	public void getPolicyInfo() {
		getCompanyPolicy();
	}

}
