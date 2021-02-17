package OOPS_Encapsulation;

public class Browser {
	
	
	//Give practical example of encapsulation in interview
	
	
	
	public void launchBrowser() {
		System.out.println("launching browser");
		checkBrowser();
		checkBrowserOs();
		openWindow();
		
		System.out.println("chrome browser launched");
		
	}
	
	private void checkBrowser() {
		System.out.println("check browser");
		
	}
	
	private void checkBrowserOs() {
		System.out.println("check browser OS version");
		
	}
	
	private void openWindow() {
		System.out.println("Open new window");
	}
	

}
