import java.util.Scanner;
class Circle extends Point
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Point p = new Point(); //create a pointer center
		p.x=sc.nextDouble();
		p.y=sc.nextDouble();
		Point c = new Point(); //create a point on circumference
		c.x=sc.nextDouble();
		c.y=sc.nextDouble();
		Circle c1 = new Circle(); //create an object of class circle
		c1.distance(c,p); //calculate radius of the circle
	}
}
class Point
{
	double x;
	double y;
	public static void distance(Point p1, Point p2)
	{
		double d;
		d=Math.sqrt((p2.x-p1.x)*(p2.x-p1.x)+(p2.y-p1.y)*(p2.y-p1.y));
		System.out.println(d);
	}
}