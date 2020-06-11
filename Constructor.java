class Constructor
{
	public static void main(String[] args)
	{
		answer a = new answer(10, "MCQ");
	}
}
class answer
{
	answer()
	{
		System.out.println("You got nothing :(");
	}
	answer(int marks, String type)
	{
		this();
		System.out.println("You got "+marks+" for MCQ :)");
	}
}

class Print
{
	public static void main(String[] args)
	{
		String nptel, space, java;
		nptel="NPTEL";
		space=" ";
		java= "JAVA";
		System.out.println(nptel+space+java);
	}
}