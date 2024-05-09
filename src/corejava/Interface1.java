package corejava;
interface WebDriver{
	public void openApp();
	public void closeApp();
}
class FirefoxDriver implements WebDriver{
	public void openApp() {
		System.out.println("Firefox open");
	}
	public void closeApp() {
		System.out.println("Firefox close");  
	}
}


