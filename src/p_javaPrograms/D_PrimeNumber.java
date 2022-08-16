package p_javaPrograms;

public class D_PrimeNumber {
	
	//this program for to  check the number is prime or not
	//The prime number means divided by 1 or itself
	
	public static void main(String[] args) {
		int no=8;
		int temp=0;
		
		for(int i=2; i<=no-1; i++) {
			if(no%i==0) {
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println(no+" is prime nnumber");
		}
		else {
			System.out.println(no+" is not prime number");
		}
	}

}
