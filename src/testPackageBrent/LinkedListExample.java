package testPackageBrent;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) 
	{
		LinkedList<String> namesLinkedList = new LinkedList<>();
		namesLinkedList.add("John");
		namesLinkedList.add("Paul");
		namesLinkedList.add("George");
		namesLinkedList.add("Ringo");
		
		System.out.println(namesLinkedList.get(2));
		// in a linked list, to get to the Nth element, the linked list has to start at the 
		// first element and iterate through until you get to the element you are looking for. 
		
		namesLinkedList.add(1, "Jerry");
		
		// LinkedList are much better at adding and subtracting values
		// where ArrayList are really good at retrieving values
		
		ArrayList<String> namesArrayList = new ArrayList<>();
		namesArrayList.add("John");
		namesArrayList.add("Paul");
		namesArrayList.add("George");
		namesArrayList.add("Ringo");
		
		System.out.println(namesArrayList.get(2));
		
		namesArrayList.add(1, "Jerry");
		
	}

}
