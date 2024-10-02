import java.util.*;

class OddEven extends Thread
{
	String threadName;
	int start;

	OddEven(int start, String s)
	{
		this.threadName = s;
		this.start = start;
	}
	/*public void run()
	{
		for(int i = start; i <= 100; i+=2)
		{
			if(i%2 == 0)
			{
				System.out.println(i + threadName);	
			}
			else
			{
				System.out.println(i + threadName);	
			}
		}
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(threadName + e);
			}
	}*/
    synchronized public void run()
	{
		for(int i = start; i <= 100; i+=2)
		{
			if(i%2 != 0)
			{
				System.out.println(i + threadName);	
			}
        }
        try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(threadName + e);
            }
		for(int i = start; i <= 100; i+=2)
		{
			if(i%2 == 0)
			{
				System.out.println(i + threadName);	
			}
        }
            
    }
}

class Display
{
	public static void main(String [] args)
	{
		Thread o = new Thread(new OddEven(1 , " -Odd"));
		Thread e = new Thread(new OddEven(2 , " -Even"));
		o.start();
		e.start();
		try
		{
			o.join();
			e.join();
		}
		catch(InterruptedException m)
		{
			System.out.println(m);
		}
		System.out.println("Exiting main thread");
	}
}

