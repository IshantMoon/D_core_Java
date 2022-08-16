package d_Array;

public class TwoDiamentionalArray {

	public static void main(String[] args) {
		int[][] a=new int[2][3];
		a[0][0]=6;
		a[0][1]=4;
		a[0][2]=9;
		
		a[1][0]=7;
		a[1][1]=5;
		a[1][2]=34;
		
		System.out.println(a[0][2]); //it will give the output 9
		
		System.out.println(a.length); //it will shows the how many rows are available
		
		System.out.println(a[0].length);//it will shows the how many column are available
		
		
		//it will print all the value of array
		for(int row=0; row<a.length; row++)
		{
			for(int column=0; column<a[0].length; column++) {
				System.out.println(a[row][column]);
			}
		}
		

	}

}
