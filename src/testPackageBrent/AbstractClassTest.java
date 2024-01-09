package testPackageBrent;

public class AbstractClassTest extends AbstractAnimalClass
{
	// you cannot make objects with abstract classes
	
	// example of using an abstract class
	// if you had an animal parent class with Cat, Dog, etc. child classes, 
	// you don't really want the ability to make an animal object, only cat, dog, etc. 
	
	
	// Abstract methods
	// also an example of an override
	public void makeNoise() 
	{
		System.out.println("Meow");
	}

		
	
}
