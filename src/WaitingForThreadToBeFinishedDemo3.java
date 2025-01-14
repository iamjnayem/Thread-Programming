import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class WaitingForThreadToBeFinishedDemo3{
	private static boolean doneWorking = false;
	
	public static void main(String[] args){
		Thread willThrowException = new Thread(
			()-> {
				try{
				
				throwRunTimeException();
				}catch(RuntimeException e){
					System.out.println("This is the place you can handle the bad situation");
					return;
			    }
				doneWorking = true; // here the control will not come
			}
		);
		
		willThrowException.start();
		
		
		try{
			TimeUnit.MILLISECONDS.sleep(500);
			if(doneWorking){
				System.out.println("Thread has finished the task gracefully");
			}
			else {
				System.out.println("Thread didn't finish it's task gracefully");
			}
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
			
	}
	
	private static void throwRunTimeException(){
		throw new RuntimeException("somthing bad happened");
	}
}
