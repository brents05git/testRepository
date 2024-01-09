package testPackageBrent;

public class RecursionTuturialMain {

	public static void main(String[] args) 
	{
		
		sayHi(3);
		
		

	}
	
	private static void sayHi(int count)
	{
		System.out.println("Hi");
		
		if(count <= 1) // base case: important because the recursive statement needs a base case to not overflow but not guaranteed.
		{
			return;
		}
		sayHi(count - 1);
	}

}
