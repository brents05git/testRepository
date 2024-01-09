package testPackageBrent;

public class ShortCutsClass 
{
	private String name;
	private int age;
	private double money;
	
	// ShortCut \\
	// ===================================================================================
	// typically, you would have to make "Getters and Setters" for each of these private 
	// instance variables, but you can right click anywhere in the code
	// go to source and click generate getters and setters and select which ones 
	// you want to do that for. 
	// ===================================================================================
	// you can also just click alt shift s, then r to do the same thing
	
	// ShortCut \\
	// ==========================================================================================================
	// this also works for generating constructors, go to the same menu, the click generate constructors using fields
	
	public ShortCutsClass(String name, int age, double money) 
	{
		super();
		this.name = name;
		this.age = age;
		this.money = money;
	}
	
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public double getMoney() 
	{
		return money;
	}
	public void setMoney(double money) 
	{
		this.money = money;
	}
	
}
