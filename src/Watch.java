import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

class Watch implements Runnable {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:s a");

    @Override
    public void run() {
		while(!Thread.currentThread().isInterrupted()){
			printCurrentTime();
			if(!sleepOneSecond()){
                break;
            }
		}
        System.out.println("Thread is interrupted & stopping");
    }

    private static boolean sleepOneSecond() {
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));
            return true;
        } catch (InterruptedException e) {
			System.out.println(e.getMessage());
            return false;
        }
    }

	private void printCurrentTime(){
		String formattedCurrentTime = LocalDateTime.now().format(formatter);
		System.out.println(formattedCurrentTime);
	}
}