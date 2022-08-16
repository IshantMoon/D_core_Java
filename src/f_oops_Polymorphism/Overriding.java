package f_oops_Polymorphism;

//Program for Overriding

public class Overriding extends Overloading{

	public static void main(String[] args) {
		
		Overriding ove=new Overriding();
		ove.intrest();
		ove.intrest(8);
		ove.intrest(10, 'u');

	}
	
	public void intrest() {
		System.out.println("This is the child method");
	}
	
	public void intrest(int a) {
		System.out.println("one parameter"+" "+a);
	}
}
