class NewThread implements Runnable
{
	Thread t;
	NewThread()
	{
		//t= new Thread(this, "Demo Thread");
		Thread t= new Thread(this);
		System.out.println("Child Thread:"+t);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=5; i>0; i--)
			{
				System.out.println("Child Thread: "+i);
				Thread.sleep(500);
			}
		}
			catch(InterruptedException e)
			{
				System.out.println("Child interrupted!!");
			}
			System.out.println("Exiting child thread:)");
		}
}

class ThreadDemo1
{
	public static void main(String[] args)
	{
		new NewThread();
		try
		{
			for(int i=5; i>0; i--)
			{
				System.out.println("Main Thread: "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread interrupted!!");
		}
		System.out.println("Main Thread exiting:)");
	}
}