package corejava;

public class Staticmethod {
	int a=223;
    static Boolean b=true;
	public void ramesh() {
		System.out.println("ramesh is printed");
		System.out.println(a+"instance var");
	}
	public void sanjay() {
	int b=20;
		System.out.println("anjay is printed");
		System.out.println(b+"is local variable");
	}
	public void ramraj() {
		System.out.println("ramraj is printed");
		System.out.println(b+"is static var");
	}
	public static void eee() {
		System.out.println("static method is printed");
 }
	public static void main(String args[]) {
		System.out.println("main method is executed");
		Staticmethod s=new Staticmethod();
		s.ramesh();
		s.sanjay();
		s.ramraj();
		Staticmethod.eee();
		}

}
