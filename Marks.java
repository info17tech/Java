import java.util.Scanner;
class Marks
{
	public static void main(String[] args)
	{
		int result;
		double avg;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of subjects: ");
		int s= sc.nextInt();
		int ar[]= new int[s];
		for(i=0; i<s; i++)
		{
			System.out.println("Enter the marks secured in the subjects: ");
			ar[i]=sc.nextInt();
		}
		int max=ar[0]; //initialize max element as first element
		double sum=ar[0];
		for(i=1; i<s; i++)
		{
			sum+=ar[i];
			if(ar[i]>max)
				max=ar[i];
		}
		result=max;
		avg= sum/s;
		System.out.println("Highest mark secured = "+result);
		System.out.println("Average marks = "+avg);
	}
}