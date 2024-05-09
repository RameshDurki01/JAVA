package corejava;

import isarelation.Parent;

class parent{
	public void m1(int i) {
		System.out.println("parent");
		
}
}

class  Child extends Parent{
public void m1(int i) {
	System.out.println("child");
}

public static void main(String[] args) {
	Child ch=new Child();
     ch.m1();
     ch.m2();
}
}
