class LaunchTheDog 
{
	public static void main(String[] args) 
	{
		Dog d1= new Dog();
		d1.name="Tuffy";
		d1.color="white";
		d1.cost=1000.5f;
		System.out.println(d1.name);
		System.out.println(d1.color);
		System.out.println(d1.cost);
		System.out.println();


		Dog d2=new Dog();
		d2.name="Tommy";
		d2.color="Brown";
		d2.cost=20000.5f;
		System.out.println(d2.name);
		System.out.println(d2.color);
		System.out.println(d2.cost);
	}
}

class Dog
{
	String name;
	String color;
	float cost;
}