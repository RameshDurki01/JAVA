package inheritence;

interface Mobile {
public void calls();
public void music();
public void capturing();
}
class Nokia implements Mobile{

	
	public void calls() {
	System.out.println("calls");
		
	}


	public void music() {
	System.out.println("music");
		
	}

	
	public void capturing() {
	System.out.println("capturing");
}	
	}
class Samsung implements Mobile{

	
	public void calls() {
	System.out.println("calls");
		
	}


	public void music() {
	System.out.println("music"); 
		
	}

	
	public void capturing() {
		System.out.println("capturing");
		
	}	
	


public static void main(String[] args) {
	Nokia n=new Nokia();
	n.music();
	n.calls();
	n.capturing();
	
	Mobile m=new Nokia();
	m.music();
	m.calls();
	m.capturing();
	
	Samsung s = new Samsung ();
	s.music();
	s.calls();
	s.capturing();
	
	Mobile m1=new Nokia();
	m1.music();
	m1.calls();
	m1.capturing();
	
	Mobile m2=new Samsung();
	m2.music();
	m2.calls();
	m2.capturing();
	
	
}

}
