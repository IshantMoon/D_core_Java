package e_oops_Inheritance;

public class B_InheritChina extends A_InheritIndia{
	
	public void wuhan() {
		
		System.out.println("This is the country where the virus is established");
		
	}

	public static void main(String[] args) {
		
		B_InheritChina chi = new  B_InheritChina();
		
		chi.wuhan();
		chi.maharashtra();
	}

}
