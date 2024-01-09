package testPackageBrent;

import java.io.Serializable;

// generics can also be <T extends Animal> this is called a bounded generic
// this would make it where you can print a Cat object and also use any method from the Animal class
// in the areas where you want it to go.
// if you wanted to have an interface in the generic <T extends Serializable>
// you can also have multiple bounds like...

public class Printer <T, V> // generic printer for any type
{
	T thingToPrint;
	V otherThing;
	
	public Printer(T thingToPrint)
	{
		this.thingToPrint = thingToPrint;
	}
	
	public void print()
	{
		//thingToPrint.eat();
		System.out.println(thingToPrint);
	}
	
}
