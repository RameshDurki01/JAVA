package inheritence;


interface browser{
	public void open();
	public void close();
}

class Chrome implements browser{
	public void open() {
		System.out.println("open");
	}
	public void close() {
		System.out.println("close");
	}
}
public class Webdriver1 implements browser {
	public void open() {
		System.out.println("open");
	}
	public void close() {
		System.out.println("close");
	}

	public static void main(String[] args) {
		Chrome ch=new Chrome();
		ch.open();
		ch.close();
		Webdriver1 wb=new Webdriver1();
		wb.open();
		wb.close();
		browser b=new Webdriver1();
		b.open();
		b.close();
		browser b1=new Chrome();
		b1.open();
		b1.close();
	}

}

