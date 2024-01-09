package testPackageBrent;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample 
{
	// if you wanted to print other data types, you would have to make multiple classes 
	// for no reason really, so generics offer the ability to be flexible for many types.
	
	public static void main(String[] args) 
	{
		// by typing Printer<Integer>, this makes the type of the printer in this instance an integer printer
		//Printer<Integer> integerPrinter = new Printer<>(23); 
		//	integerPrinter.print();
		
		//Printer<Double> doublePrinter = new Printer<>(33.5);
		//	doublePrinter.print();
		
		// one thing to note is that generics do not work with primative types like int, double, etcs.
		
		
		ArrayList<Cat> cats = new ArrayList<>(); // this is an example of a generic. 
		
		// example without the use of generics
		
		ArrayList<Object> cat = new ArrayList<>();
		cat.add(new Cat());
		
		// Cat myCat = cat.get(0); this does not work because java thinks the array list is just objects, not cats
		Cat myCat = (Cat)cat.get(0);
		
		// this second example runs into errors when trying to put other object into the object array list because
		// with this code, each new thing added gets casted as a Cat object which runs into problems. 
		
		
		
		
		shout("John", 74);
		//shout(57);
		//shout(new Cat());
		
		
		List<Integer> intList = new ArrayList<>();
		intList.add(3);
		printList(intList);
		
		List<Cat> catList = new ArrayList<>();
		catList.add(new Cat());
		printList(catList);
		
		
	}
	
	// if you want to return a generic type you would just do 
	// private static <T, V> T shout(T thingToShout, V otherThingToShout)
	
	private static <T, V> T shout(T thingToShout, V otherThingToShout)
	{
		System.out.println(thingToShout + "!!!!!");
		System.out.println(otherThingToShout + "!!!!!");
		
		return thingToShout;
	}
	
	
	// Wildcard generic
	private static void printList(List<?> myList) // can't do List<Object> instead...  do List<?>
	{
		System.out.println();
	}
	

}
