package p_javaPrograms;

//Palandrome means reverse the number but still get same number(ex. 121 ko humne reverse kiya to 121 hi ayega)


public class E_PalandromeNumber {

	public static void main(String[] args) {
		
		int no=121;
		int temp=no;
		int rev=0;
		int rem;
		
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(no==rev) {
			System.out.println(no+" number is palindrome");
		}
		else
		{
			System.out.println(no+" number is not palindrome");
		}

	}

}
