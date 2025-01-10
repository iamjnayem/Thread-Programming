import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WatchV1 implements Runnable{
	@Override
	public void run(){
		while(true){
			printCurrentTime();
			sleepOneSecond();
		}
	}
	
	private static void sleepOneSecond(){
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	public void printCurrentTime(){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:s a");
		
		String formattedCurrentTime = LocalDateTime.now().format(formatter);
		System.out.println(formattedCurrentTime);
	}
	
	public static void main(String[] args) throws Exception{
		Thread t1 = new Thread(new WatchV1());
		t1.start();
		
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				System.out.println("i am printing");
			}
		}
		
		t1.stop();
	}
}
