absract class figure
{
	double dim1;
	double dim2;
	figure(double a, double b)
	{
		dim1=a;
		dim2=b;
	}
	abstract double area();
}

class rectangle extends figure
{
	rectangle(double a, double b)
	{
		super(a,b);
	}
	double area()
	{
		System.out.println("Area of rectangle = ");
		return dim1*dim2;
	}
}

class triangle extends figure
{
	triangle(double a, double b)
	{
		super(a,b);
	}
	double area()
	{
		System.out.println("Area of triangle = ");
		return dim1*dim2/2;
	}
}

class Area
{
	public static void main(String args[])
	{
		rectangle r = new rectangle(6,8);
		triangle t = new triangle(4,9);
		figure figref; // no object is created
		figref = r;
		System.out.println(+figref.area());
		figref = t;
		System.out.println(+figref.area());
	}
}