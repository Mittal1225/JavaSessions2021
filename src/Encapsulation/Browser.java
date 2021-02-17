package Encapsulation;

public class Browser {
	
	
	public void launchBrowser() {
		System.out.println("launch browser");
		
		checkBrowserVersion();
		checkBrowserOSVersion();
		interactWithOSServices();
		RAMSpace();
	
	}
	
	private void checkBrowserVersion() {
		System.out.println("checkBrowserVesrion..");
	}

	private void checkBrowserOSVersion() {
		System.out.println("checkBrowserOS Version..");
	}
	
	private void interactWithOSServices() {
		System.out.println("checkBrowservesrion..");
	}
	
	private void RAMSpace() {
		System.out.println("check RAm space...");
	}
	
}
