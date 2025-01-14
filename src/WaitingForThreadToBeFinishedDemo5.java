import java.util.concurrent.TimeUnit;

public class WaitingForThreadToBeFinishedDemo5{
	public static void main(String[] args){
		Thread fibonacciFinderThread = new Thread(
			() -> {
				findTheTop20Fibonacci();
			}
		);
		
		fibonacciFinderThread.start();
		
		try{
			fibonacciFinderThread.join();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("All Thread has finished");
	}
	
	private static void findTheTop20Fibonacci(){
		for(int i = 1; i<= 20; i++){
			System.out.println(fib(i) + " ");
		}
	}
	
	private static int fib(int n){
		if(n == 1 || n == 2){
			return 1;
		}
		 
		return fib(n-2) + fib(n-1);
	}
	
}
	
	
			
