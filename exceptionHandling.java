//Program to implement concept of exception handling
//Read contents of a file and print its content on console
import java.util.Scanner;
import java.io.*;
class FileRead
{
	public void readContents()throws IOException 
	{
		String fname;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter file name: ");
		fname=sc.nextLine();
		FileReader fr=null;//to open a file
		BufferedReader br=null;//to read contents of a file
		String line=null;//used to store line of information from a file
		try
		{
			fr=new FileReader(fname);
			br=new BufferedReader(fr);
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found Exception caught: "+e.getMessage());
		}
		finally
		{
			if(fr!=null)
			{
				System.out.println("Closing file reader");
				fr.close();
			}
			else
			{
				System.out.println("file reader not opened");
			}
			if(br!=null)
			{
				System.out.println("closing buffer reader");
				br.close();
			}
			else
			{
				System.out.println("buffer reader not opened");
			}
		}
	}
}

class exceptionHandling
{
	public static void main(String[] args)throws IOException 
	{
		FileRead f= new FileRead();
		f.readContents();
	}
}