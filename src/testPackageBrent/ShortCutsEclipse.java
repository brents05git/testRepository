package testPackageBrent;

import java.util.Random;
import java.util.Scanner;

public class ShortCutsEclipse 
{
	// ShortCut \\
	// ==========================================================================================================
	// if you want to write out the "main" method, you can just write main ctrl space and click the first option
	// ==========================================================================================================
	public static void main(String[] args) 
	{
		// ShortCut \\
		// ==========================================================================================================
		// to import something you are not using yet, just hover over it and click import, or...
		// do ctrl shift o which will import for you
		
		Scanner scan = new Scanner(System.in);
		
		Random rand = new Random();
		
		
		
		// ShortCut \\
		// ==========================================================================================================
		// to comment out multiple lines at once, highlight then just click ctrl /
		// and to undo that, do the same thing
		// ShortCut \\
		// ==========================================================================================================
		// if you want to make a multi line comment, just do ctrl shift /
		
		String str = "Hello, my name is Brent";
		// ShortCut \\
		// ==========================================================================================================
		// to make string all upper case, highlight the text and do ctrl shift x
		// and to lower case is ctrl shift y
		
		System.out.println();   //sysout ctrl space
		
		// ShortCut \\
		// ==========================================================================================================
		// for "for" loops, you can simply type 'for' then ctrl space to give you options of what you want to do
		// same applies for while loops and do while loops
		// also if statements etc etc. 
		for (int i = 0; i < args.length; i++) 
		{
			
		}
		// ShortCut \\
		// ==========================================================================================================
		// if you want to surround your code in a " try catch " block
		// do alt shift z and select try catch
		
		try {
			System.out.println("Hi");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		// ShortCut \\
		// ==========================================================================================================
		// If your code or someone else's code is formated terribly, you hightlight the area you want formated
		// and the you click ctrl shift f
		
		
		// before
		int num = 0;
									System.out.println("this is bad code format");
		
												if(num < 10)
													{
																System.out.println("hello");
		}
		// after
		int number = 0;
		System.out.println("this is bad code format");

		if (number < 10) {
			System.out.println("hello");
		}
		
		
		
		
		// ShortCut \\
		// ==========================================================================================================
		// if you want to rename a variable but you don't really want to change each individual use of that variable
		// you can select the var you want to change and hit alt shift r and then chnage the name to whatever you want
		
		
		int newShortCut = 10;
		
		for (int i = 0; i < newShortCut; i++) 
		{
			newShortCut--;
		}
		
		
		// ShortCut \\
		// ==========================================================================================================
		// When navigating code, you can simply click ctrl L to select a line of code you want to go to.
		
		// ShortCut \\
		// ==========================================================================================================
		// to find a specific method, you can click ctrl o and then select the method you want. 
		
		// ShortCut \\
		// ==========================================================================================================
		// if a section of code turns of that it should be a method, you can highlight the code you want, 
		// then click alt shift m
		
		// ShortCut \\
		// ==========================================================================================================
		// ctrl d deletes the line of code you have your cursor near
		
		// ShortCut \\
		// ==========================================================================================================
		// when looking at methods, if you want to see what methods call that exact methods, etc, you can click
		// ctrl alt h to look at the view call hierarchy.
		
		// ShortCut \\
		// ==========================================================================================================
		// to look at a parent class hierarchy, highlight that specific class and then click F4
		
		// ShortCut \\
		// ==========================================================================================================
		// When looking at a larger method/piece of code, you can click near the beginning brace and then click
		// ctrl shift p to immediately jump to the end of that brace.
		
		// ShortCut \\
		// ==========================================================================================================
		// ctrl + and ctrl - is for font size
		
		// ShortCut \\
		// ==========================================================================================================
		// when looking at a method call in a main class for example, you can select that method call and hit F3
		// or ctrl click to go right to the spot of that method, same works for variables. 
		
		// ShortCut \\
		// ==========================================================================================================
		// to look for files on the left side of eclipse, you can click ctrl shift r to search for a specific file
		
		// ShortCut \\
		// ==========================================================================================================
		// if editing multiple files at once trying to find your spot when going back to each one, you can click
		// alt left arrow or alt right arrow to go back to the spot you were just at
		
		// ShortCut \\
		// ==========================================================================================================
		// ctrl Fll can be the run fuction of the program
		
		System.out.println("This is a test of the ctrl F11 run function");
		// does not work
		
		// ShortCut \\
		// ==========================================================================================================
		// ctrl shift L gives the entire list of eclipse shortcuts
		
	}

}
