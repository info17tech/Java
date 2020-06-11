//Armstraong number is the sum of its digits raised to the power of the number of digits.
import java.util.Scanner;
class Armstrong
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int result=0;
		int temp=n;
		int c=0,t;
		while(n>0)
		{
			t=n%10;
			n=n/10;
			c=c+(t*t*t);
		}
		if(temp==c)
			result=1;
		else
			result=0;
		System.out.println(result);
	}
}