public class MainThreadExample
{
	public static void main(String[] args)
	{
		Thread currentThread = Thread.currentThread();
		System.out.println("Name of CurrentThread : " + currentThread.getName());
	}
	
}
