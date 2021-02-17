package OOPs_Interface;

public class HSBCBank implements USBank, BrazilBank {   //we are achieving multiple inheritance

	//is a relationship - class and interface relationship
	
	
	
	//if a class is implementing any interface it's mandatory to define/override all the methods of Interface
	public void credit() {
		System.out.println("HSBC - credit");
		
	}

	public void debit() {
		System.out.println("HSBC - debot");
		
	}

	public void transferMoney() {
		System.out.println("HSBC - transferMoney");
		
	}
	
	
	// HSBCBank - own methods
	
	public void educationLoan() {
		System.out.println("HSBC - educationLoan");
	}
	
	public void carLoan() {
		System.out.println("HSBC - carLoan");
	}

	@Override
	//Brazil Bank method
	public void mutualFund() {
		System.out.println("HSBC - mutual  fund");
		
	}

}