package overload;

public class Bowling_Coach {
	public void m1() {
		System.out.println("fast bowling practice");
	}
	public void m2() {
		System.out.println("spin bowling practice");
	}

	public class Battingcoach extends Bowling_Coach{
		public void m3() {
			System.out.println("batting practice");
		}
	
	public static void main(String[] args) {
		
	Battingcoach player=new  Battingcoach ();
		player.m1();
		player.m2();
		player.m3();
		
		
	}
	}
	
}
	



