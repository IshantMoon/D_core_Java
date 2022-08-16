package p_javaPrograms;


// This program for reverse a string

public class B_ReverseString {

	public static void main(String[] args) {
		
		String name="Ishant";
		
		int leng=name.length();      //length() will tell us, total number of character in string 
	
		String rev=" ";
		
		for(int i=leng-1; i>=0; i--) {
			rev=rev+name.charAt(i);		//charAt() will tell us which character on which position are there.
		}
		System.out.println(rev);
		
	}

}

