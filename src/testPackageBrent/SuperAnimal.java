package testPackageBrent;

public class SuperAnimal 
{
	int age;
	String name;
	
	public SuperAnimal()
	{
		
	}
	
	public SuperAnimal(int age, String name)
	{
		this.age = age;
		this.name = name;
		
	}
	
	public void makeNoise()
	{
		System.out.println("Hello");
	}
	
	public void eat()
	{
		System.out.println("Nom nom nom");
	}
	
	public void privateMethod()
	{
		System.out.println("Private testing with super");
	}
}
