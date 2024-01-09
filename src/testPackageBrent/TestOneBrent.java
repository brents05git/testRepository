

package testPackageBrent;
import java.util.Scanner;
import java.util.ArrayList;

import java.io.*;
public class TestOneBrent 
{

	public static void main(String[] args) throws Exception
	{
		Scanner input = new Scanner(new File ("numberTestBrent.txt"));
		int num = 0;
		int arr[] = new int[11];
		int count = 0;
		
		while(input.hasNextInt())
		{
			num = input.nextInt();
			System.out.print(num + " "); 
		
			arr[count] = num;
			
			if(count < 10)
				count++;
		}
		
		System.out.println();
		System.out.println();
		
		int temp = 0;
		
		for(int item : arr)
		{
			System.out.println(item);
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			int min = i;
			
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[j] < arr[min])
				{
					min = j;
				}
			}
			
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
					
				
		}
		
		
		
		System.out.println();
		System.out.println();
		
		int sortedArr[] = new int[11];
		sortedArr = arr;
		
		for(int number : sortedArr)
		{
			System.out.print(number + " ");
		}
		
		ArrayList<String> arrList = new ArrayList<String>();
		
		Scanner scan = new Scanner(System.in);
		
		
	}

}
