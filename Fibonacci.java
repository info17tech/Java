import java.util.Scanner;
class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n= sc.nextInt();
		System.out.println("Fibonacci Number: "+fib(n));
	}
	static int fib(int n)
	{
		if(n==1)
			return 0;
		else if(n==2)
			return 1;
		return fib(n-1)+fib(n-2);
	}
}