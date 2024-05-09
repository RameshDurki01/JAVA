package corejava;

public class Nestedif {
	public static void main(String args[]) {
		int a=40;
		int b=50;
		if(a==50)//con1
		{
	     if(b==50)//con2
		{
				System.out.println("a value is 30&b value is 40");
		}
	     else {
	    	 System.out.println("else stmt of 2nd cond");
	     }
		}
		else {
			System.out.println("else stmt of 1st cond");
		}
	}
    }
	
	


