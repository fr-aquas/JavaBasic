import java.util.*;
class  Array3DJagged
{
	public static void main(String[] args) 
	{
		int i,j,k;
		int a[][][];
		a=new int[3][][];
		a[0]=new int[5][];
		a[1]=new int[4][];
		a[2]=new int[3][];
		878
		a[0][0]=new int[3];
		a[0][1]=new int[4];
		a[0][2]=new int[2];
		a[0][3]=new int[1];
		a[0][4]=new int[5];

		a[1][0]=new int[3];
		a[1][1]=new int[2];
		a[1][2]=new int[1];
		a[1][3]=new int[3];
		
		a[2][0]=new int[5];
		a[2][1]=new int[3];
		a[2][2]=new int[2];
		

		
		
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
		System.out.println();
		System.out.println();
		System.out.println();

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


