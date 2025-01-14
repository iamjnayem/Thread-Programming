import java.util.concurrent.TimeUnit;

class WaitingForThreadToBeFinishedDemo4{
		
	private static boolean doneWorking = false;
	
	public static void main(String[] args){
		Thread fibonacciFinderThread = new Thread(
			()->{
				findTop20FibonacciNumber();
			}
		);
		
		while(fibonacciFinderThread.isAlive()){
			// lame way to wait main thread	
		}
		
		System.out.println("fibonacci finder thread has finshed");
	}
	
	private static void findTop20FibonacciNumber(){
		for(int i = 1; i <= 20; i++){
			System.out.println(fib(i) + " " );
		}
	}
	
	private static int fib(int n){
		if(n == 1 || n == 2){
			return 1;
		}
		return fib(n-2) + fib(n-1);
	}
	
}
			
