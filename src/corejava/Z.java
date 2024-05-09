package corejava;
 class X{
	
		 int a=20;
		 int b=30;
		 public void m1() { 
		 System.out.println("m1 executed");
	 }
	 }
 class Y extends X{
	 int c=40;
	 int d=50;
	 public void m2() {
		 System.out.println("m2 executed");
		 System.out.println("a+b");
	 }
	 }
public class Z extends Y{
	public void m3() {
		System.out.println("m3 executed");
		System.out.println("a+b");
		System.out.println("c-d");
	}
	public static void main(String args[]) {
	Z obj=new Z();
	obj.m1();
	obj.m2();
	obj.m3();
	}
}