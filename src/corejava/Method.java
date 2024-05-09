package corejava;

public class Method {
		public void m1() {
			System.out.println("m1 is printed");
			}
		public void m2() {
			System.out.println("m2 is printed");
		}
		public void m3() {
			System.out.println("m3 is printed");
		}
		public static void main(String args[]) {
			System.out.println("main method is executed");
			Method m=new Method();
			m.m1();
			m.m3();
			m.m2();
		}

}
