package corejava;

public class Animal {
public void makesound() {
	System.out.println("Generic animal sound");
	
}
}
class Cat extends Animal{
public void makesound() {
	System.out.println("meom");
	
}

void purr() {
	System.out.println("purr");
}

 
	public static void main(String[] args) {
		Animal genericAnimal=new Animal();
		Cat mycat=new Cat();
		genericAnimal.makesound();
		mycat.makesound();
		mycat.purr();
	}
}
