class Fan
{
	String color;
	int noofblades;
	int cost;
}

class LaunchTheFan
{
	public static void main(String[] args) 
	{
		Fan f1=new Fan();
		f1.color="Blue";
		f1.noofblades=3;
		f1.cost=7777;
		System.out.println(f1.color);
		System.out.println(f1.noofblades);
		System.out.println(f1.cost);
		System.out.println();


		Fan f2;
		f2=f1;
		f2.color="Black";
		f2.noofblades=4;
		f2.cost=8888;

		System.out.println(f2.color);
		System.out.println(f2.noofblades);
		System.out.println(f2.cost);

		System.out.println();
		System.out.println(f1.color);
		System.out.println(f1.noofblades);
		System.out.println(f1.cost);
		System.out.println();

		Fan f3;
		f3=f1;
		f3.color="Red";
		f3.noofblades=5;
		f3.cost=9999;
		System.out.println(f3.color);
		System.out.println(f3.noofblades);
		System.out.println(f3.cost);
		System.out.println();

		System.out.println(f1.color);
		System.out.println(f1.noofblades);
		System.out.println(f1.cost);
		System.out.println();

		System.out.println(f2.color);
		System.out.println(f2.noofblades);
		System.out.println(f2.cost);
		System.out.println();




	}
}
