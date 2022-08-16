package f_oops_Polymorphism;

//Program for overloading

public class Overloading {

	public static void main(String[] args) {
		
		Overloading over = new Overloading();
		over.intrest();
		over.intrest(5);
		over.intrest(4, 'i');

	}
	
	public void intrest() {
		System.out.println("Hello");
	}
	
	public void intrest(int a) {
		System.out.println("one parameter"+" "+a);
	}
	public void intrest(int a, char b) {
		
		System.out.println("Two parameter"+" "+a+" "+b);
		
	}

}
