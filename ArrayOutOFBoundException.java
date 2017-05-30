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
		for (i=0;i<=5 ;i++)
		{
			System.out.println(a[i]);
			
		}

	}
}
