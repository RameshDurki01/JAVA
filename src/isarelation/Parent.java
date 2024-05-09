package isarelation;

public class Parent {
  public void m1() {
	System.out.println("parent"); 
  }
  public void m2() {
	  System.out.println();
  
}
class Child extends Parent{
	public void m3() {
		System.out.println("child");
	}

  public static void main(String[] args) {
	  Child ch= new Child();
	  ch.m1();
	  ch.m2();
	  ch.m3();
}

}