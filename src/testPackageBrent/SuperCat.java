package testPackageBrent;

public class SuperCat extends SuperAnimal
{
	String catFoodPreference;
	
	public SuperCat(int age, String name, String catFoodPreference)
	{
		//this.age = age;   // this would be code duplication. so we use a super call to the parent class to use that constructor
		//this.name = name;
		super(age, name); 
		this.catFoodPreference = catFoodPreference;
	}
	
	@Override
	public void makeNoise()
	{
		super.makeNoise();
		System.out.println("Meow");
		eat();
		
		//super.privateMethod(); // this can only be done if that method is protected or public
		
	}
	
	
	
	
}
