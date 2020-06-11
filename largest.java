import java.util.Scanner;
class largest
{
	public static void main(String[] args)
	{
		int a, b, c;
		System.out.println("Enter the three numbers: ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Number1 = ");
		a=sc.nextInt();
		System.out.println("Number2 = ");
		b=sc.nextInt();
		System.out.println("Number3 = ");
		c=sc.nextInt();
		if((a>b)&&(a>c))
		{
			System.out.println(a+" is the largest number");
		}
		else if((b>c)&&(b>a))
		{
			System.out.println(b+" is the largest number");
		}
		else
		{
			System.out.println(c+" is the largest number");
		}
	}
}