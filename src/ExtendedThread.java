import java.util.concurrent.TimeUnit;
public class ExtendedThread extends Thread
{
	@Override
	public void run()
	{
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Loop " + i + " thread name: " + Thread.currentThread().getName());
			sleepOneSecond();
		}
	}
	
	
	public static void sleepOneSecond()
	{
		try{
			Thread.sleep(TimeUnit.SECONDS.toMillis(1));
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
}
