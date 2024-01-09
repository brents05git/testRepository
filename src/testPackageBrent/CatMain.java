package testPackageBrent;

public class CatMain {

	public static void main(String[] args) 
	{
		System.out.println(Cat.getCatCount());
		
		Cat myCat = new Cat();
		myCat.meow();
		
		// ||Note|| \\
		// Non-static vars which would be the "myCat" Object can use the meow() method
		// because non-static only applies to individual cat objects and not to the 
		// class itself.
		// whereas if the meow() method was static, the Cat class can do Cat.meow()
		//Cat.meow();
		
		myCat.name = "Stella";
		myCat.age = 8;
		
		// Since these two variables are non-static, each cat variable can have its own 
		// name and age without conflicting with other cat objects.
		
		System.out.println(Cat.getCatCount());
		// System.out.println(myCat.getCatCount()); // technically you can call a static method with a non-static var, but discouraged
		
		// since MAX_LIVES is static and public, we can access it directly through...
		System.out.println(Cat.MAX_LIVES);
		
		
	}

}
