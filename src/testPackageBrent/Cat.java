package testPackageBrent;

public class Cat 
{
	public static final int MAX_LIVES = 9; // maximum lives for any cat
	private static int catCount = 0; // Static methods and fields are not different for different each Cat objects, universal value essentially
	public String name;
	public int age;
	public int livesRemaining;
	
	public void meow()
	{
		System.out.println("MEOW");
		System.out.println("This is a test");
	}
	
	public Cat()
	{
		catCount++;
		livesRemaining = MAX_LIVES;
	}
	
	
	// making this method static means that you do not have to access the catCount number from an individual catObject first, you can 
	// access catCount through the actual class instead like " Cat.getCatCount(); "
	public static int getCatCount() 
	{
		// we are not allowed to refer to any non-static field within a static method
		return catCount;
	}
	
}
