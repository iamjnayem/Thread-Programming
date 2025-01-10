import java.util.concurrent.TimeUnit;

public class ExtendedThreadDemo
{
	public static void main(String[] args)
	{
		ExtendedThread extendedThread = new ExtendedThread();
		extendedThread.setName("My Extended Thread");
		extendedThread.start();
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Loop " + i + " current Thread : " + Thread.currentThread().getName());
			sleepOneSecond();
		}
		
	}
	
	private static void sleepOneSecond()
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
