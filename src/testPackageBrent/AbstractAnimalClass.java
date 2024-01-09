package testPackageBrent;

public abstract class AbstractAnimalClass implements AnimalStuff
{
	String name;
	int age;
	
	// note \\
	// by making this method abstract, every class that inherits this parent class must implement this method in its own way
	public abstract void makeNoise();
	
	public void printName()
	{
		System.out.println("Hello, my name is " + name);
	}
	
	// note \\
	// The main difference between abstract and interfaces are that you can implement as many interfaces as you want
	// but you can only extend one parent class
	public void poop()
	{
		System.out.println("AHHHHHHHHHHHHHHHHHHH");
	}
	
}
