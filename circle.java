import java.util.Scanner;
class Circle
{
	public static void main(String[] args)
	{
		double r, area, peri;
		System.out.print("Enter the radius of the circle: ");
		Scanner sc=new Scanner(System.in);
		r = sc.nextDouble();
		area= Math.PI*r*r;
		peri= 2*Math.PI*r;
		if((r==0)||(r<=0))
		{
			System.out.println("Please enter non-zero positive number");
		}
		else
		{
			System.out.println("Area of the circle = "+area);
			System.out.println("Perimeter of the circle = "+peri);
		}
	}
}