package corejava;
 class A{
 public void test(){
 System.out.println("Hai");	
 System.out.println("parent class");
 }
 }
 public class B extends A{
	 public static void main(String args[]) {
		 B s=new B();//obj created for class B
		 s.test();
	 } 

}
