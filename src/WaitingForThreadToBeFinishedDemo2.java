import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class WaitingForThreadToBeFinishedDemo2{
	private static boolean doneWorking = false;
	
	public static void main(String[] args){
		Thread t1 = new Thread(() -> {
			findTheTop20FibonacciNumber(); // 300ms 
			doneWorking = true;
		});
		
		t1.start();
		
		try{
			TimeUnit.MILLISECONDS.sleep(500); // if t1 takes less than 500ms then it will say it has finished. but let say t1 takes more than 500ms then it will say it has not finished.
			
			if(doneWorking){
				System.out.println("t1 has finished");
			}
			else {
				System.out.println("t1 has not finished yet");
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	private static void findTheTop20FibonacciNumber(){
		for(int value = 1; value <= 60; value++){
			System.out.println(fib(value) + " ");
		}
	}
	
	private static int fib(int n){
		if(n == 1 || n == 2){
			return 1;
		}
		return fib(n-2) + fib(n-1);
	}
}


	
				
				
