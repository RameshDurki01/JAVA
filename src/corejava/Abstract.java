package corejava;
abstract class Bank{
	abstract void debit();
	abstract void credit();
}
 class Hdfc extends Bank {
	 public void debit() {
		 System.out.println("hdfc debit");
	 }
public void credit() {
	System.out.println("hdfc credit");
}
 }
 class Icici extends Bank{
	 public void debit() {
		 System.out.println("icici debit");
	 }
	 public void credit() {
		 System.out.println("icici credit"); 
	 }
}
 public class  Abstract{
	 public static  void main(String args[]) {
		 Hdfc hd=new Hdfc();
		 hd.credit();
		 Icici ic=new Icici();
		 ic.credit();
		 ic.debit();
	 }
 }
