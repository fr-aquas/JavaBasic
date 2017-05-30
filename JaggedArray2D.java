import java.util.*;
class  JaggedArray2D
{
	public static void main(String[] args) 
	{
		int i,j;
		int a[][];
		a=new int[3][];
		a[0]= new int [5];
		a[1]= new int [4];
		a[2]= new int [3];
		
		Scanner scan= new Scanner(System.in);

		for (i=0;i<=a.length-1 ;i++)
		{
			for (j=0;j<=a[i].length-1 ;j++)
			
		{
			System.out.println("Enter an element for "+i+" th row "+j+" column ");
			a[i][j]=scan.nextInt();
		}
		}
		
		for (i=0;i<=a.length-1 ;i++)
		{
			for (j=0;j<=a[i].length-1 ;j++)
			
		{
			System.out.print(a[i][j]+" ");
			
		}
		
		System.out.println();
	    }
	}
}


