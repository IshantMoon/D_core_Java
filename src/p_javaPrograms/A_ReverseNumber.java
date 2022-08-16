package p_javaPrograms;

public class A_ReverseNumber {
	
	//in reverse number we have to declare three variable(ex.int no=5432, 
	                                                       //rem this will for reminder value, 
	                                                       //rev in rev we will do rev=0)

	public static void main(String[] args) {
		
		int no=5432;
		int rem;
		int rev=0;
		
		while(no!=0) {
			
			rem=no%10;
			
			rev=rev*10+rem;
			
			no=no/10;
		}
		System.out.println(rev);
	}

}
