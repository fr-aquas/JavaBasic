import java.util.*;
class  ArrayOutOFBoundException
{
	public static void main(String[] args) 
	{
		int a[];
		a=new int[5];
		int i;
		Scanner scan= new Scanner(System.in);
		for (i=0;i<=4 ;i++)
		{
			System.out.println("Enter an element= ");
			a[i]=scan.nextInt();
		}
		System.out.println();
		
		//solution for this is exception handling used to prevent terminating the program
		//we can use try-catch to catch exception
		try{
			for (i=0;i<=5 ;i++)
			{
				System.out.println(a[i]);
			
			}
		}
		catch(ArrayOutOFBoundException e){
			System.out.println("You are excessing the invalid index. There is nothing there :) \n "+e.message());
		}
		//After that program start excuting from here instead of terminating
		/*
		
		Write here any lines of code
		
		
		*/
			
	}
}
