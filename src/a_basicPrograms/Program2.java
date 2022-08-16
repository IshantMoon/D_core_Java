package a_basicPrograms;

public class Program2 
{
	
	// This program is for create the object and call the method by using object 
	

	public static void main(String[] args)    //This is the main method,here we have to only create a object.
	{
		
		Program2 animal=new Program2();
		animal.dog();
		
	}
	
	public void dog()                         // This is method and method name is dog()
	{
		System.out.println("Dog is a pet animal"); 
	}

}
