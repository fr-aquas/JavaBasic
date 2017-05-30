import java.util.*;
class  Array3D
{
	public static void main(String[] args) 
	{
		int i,j,k;
		int a[][][];
		a=new int[3][4][5];
		
		Scanner scan= new Scanner(System.in);

		for (i=0;i<=a.length-1 ;i++)
		{
			for (j=0;j<=a[i].length-1 ;j++)
			{
			
			for (k=0;k<=a[i][j].length-1 ;k++)
		{
			System.out.println("Enter an element for "+i+" th block "+j+" th row "+k+" th column ");
			a[i][j][k]=scan.nextInt();
		}
		}
		}
		for (i=0;i<=a.length-1 ;i++)
		{
			for (j=0;j<=a[i].length-1 ;j++)
			{
			
			for (k=0;k<=a[i][j].length-1 ;k++)
		{
			System.out.print(a[i][j][k]+" ");
			
		}
		}
		
		
		

        System.out.println();
	}
	}
}


