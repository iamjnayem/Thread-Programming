public class WatchDemo{
	public static void main(String[] args) {
		Thread watchThread = new Thread(new Watch());
		watchThread.start();
		try{
			Thread.sleep(5000);
		}catch (InterruptedException e){
			e.printStackTrace();
		}
		watchThread.interrupt();
		System.out.println("Main thread is closing");
	}
}
