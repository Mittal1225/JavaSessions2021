package OOPs_Interface;

public interface USBank {
	
	
	int min_bal = 100;
	
	
	//no method body  - no method declaration - only method prototype
	//in interface we can delcare the variables, variable are static in nature by default
	//variables value will not be chnaged. it will be final/constant in nature
	//no static method in interface
	//no main method in Interface
	//interfaces are abstract in nature
	//we can not create an object of interface
	
	public void credit();
	
	
	public void debit();
	
	public void transferMoney();

}
