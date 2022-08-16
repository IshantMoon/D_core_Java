package i_Interface;

public class InterfaceClass implements Interf1,Interf2 {

	public static void main(String[] args) {
		
		InterfaceClass ic = new InterfaceClass();
		ic.hp();
		ic.dell();

	}
	
	public void hp() {
		System.out.println("This is the HP method");
	}
	
	public void dell() {
		System.out.println("This is the DELL method");
	}

}
