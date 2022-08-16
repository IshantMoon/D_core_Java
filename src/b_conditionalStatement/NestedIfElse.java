package b_conditionalStatement;

public class NestedIfElse {

	public static void main(String[] args) {
		int a=500;
		if(a>600) {
			System.out.println("If block is executed");
		}
		else if(a>200) {
			System.out.println("1st condition executed");
		}
		else if(a>300) {
			System.out.println("2nd condition executed");
		}
		else if(a>400) {
			System.out.println("3rd condition executed");
		}
		else {
			System.out.println("else block is executed");
		}

	}

}
