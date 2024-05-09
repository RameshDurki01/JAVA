package corejava;

public class Eh1 {
	public static void main(String args[]) {
		try {
			int a[]= {10,20,30,50,80};
			System.out.println(a[12]);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
