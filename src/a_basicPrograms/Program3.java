package a_basicPrograms;

//This program is for variable

public class Program3
{
	int a=10;                           //This is non-static global variable because it is in inside the class
	
	static int d=20;					//This is static global variable because it is in inside the class
	
	
	public void eat() {
		
		char b='I';						//This is local variable because it is in inside the method
		
		System.out.println(b);
		System.out.println(a);
		System.out.println(d);
	}
	
	
	public static void main(String[] args) {
		
		Program3 variable=new Program3();
		variable.eat();
		
		
		String c="Ishant";              //This is local variable because it is in inside the method
		System.out.println(c);

	}
}
