interface Edible
{
	String howtoEat();// by default all the interface methods are public and abstract
}
class Broccoli implements Edible
{
	public String howtoEat()
	{
		return "Stir-fry it";
	}
}
class Chicken implements Edible 
{
	public String howtoEat()
	{
		return "Fry-it";
	}
}
class Duck implements Edible
{
	public String howtoEat()
	{
		return "roast-it";
	}
}
class Bat implements Edible
{
	public String howtoEat()
	{
		return "Do not eat Bat, it spreads Corona!";
	}
}
class Pig implements Edible
{
	public String howtoEat()
	{
		return "Do not eat Pig, it spreads H1N1";
	}
}

class interfaceEg
{
	public static void main(String[] args)
	{
		Broccoli b=new Broccoli();
		System.out.println("We can eat Broccoli by: "+b.howtoEat());
		Chicken c=new Chicken();
		System.out.println("We can eat Chicken by: "+c.howtoEat());
		Duck d=new Duck();
		System.out.println("We can eat Duck by: "+d.howtoEat());
		Bat bt=new Bat();
		System.out.println(bt.howtoEat());
		Pig p=new Pig();
		System.out.println(p.howtoEat());
	}
}