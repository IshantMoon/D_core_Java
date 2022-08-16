package c_Loop;

public class For_loop {

	public static void main(String[] args) {
		for(int i=0; i<=5; i++) {
			System.out.println(i);
		}
		
		For_loop.loofo();
							
		}
	public static void loofo() {
		for(int i=5; i>0; i--) {
			for(int j=0; j<5; j++) {
				System.out.println(i+""+j);
			}
		}
	

	}

}

