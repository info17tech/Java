import java.util.Scanner;
class sum
{
	public static void main(String[] args)
	{
		int num; 
		int res=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Num= ");
		num=sc.nextInt();
		for(int i=0; i<=num; i++)
		{
			if(i%2==0)
			{
				if(i%3==0)
				{
					res+=i;
				}
			}
		}
		System.out.println("Sum= " +res);
	}
}