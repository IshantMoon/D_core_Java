package d_Array;

public class OneDiamentionalArray {

	public static void main(String[] args) {
		int[] a=new int[4];
		a[0]=2;
		a[1]=4;
		a[2]=6;
		a[3]=78;
		
		System.out.println(a[2]);
		
		System.out.println(a.length);//This statement count the length of the array, output  will be 4
		
		
		//Using for loop we can print the all the value of array
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

}
